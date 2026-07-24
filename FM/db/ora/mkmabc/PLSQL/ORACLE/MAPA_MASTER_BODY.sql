CREATE OR REPLACE PACKAGE BODY MAPA_MASTER
IS
	G_MST_PRE	CONSTANT VARCHAR2(4) := 'MAM_' ;
	G_VIEW_DEF	CONSTANT VARCHAR2(50) := 'CREATE OR REPLACE VIEW ' ;
	G_ALL		CONSTANT VARCHAR2(4) := '_ALL' ;
	G_CMN		CONSTANT VARCHAR2(4) := '_CMN' ;
	G_LCL		CONSTANT VARCHAR2(4) := '_LCL' ;
	G_LCL_ON	CONSTANT VARCHAR2(4) := 'LCL.' ;
	G_LCL_OFF	CONSTANT VARCHAR2(15) := 'ORG./*LCL*/' ;

	G_FROM_LCL_OFF		CONSTANT VARCHAR2(50) := '--,/*FROM LCL*/' ;
	G_WHERE_CO_ALL		CONSTANT VARCHAR2(50) := 'AND ORG.CO_CD' ;
	G_WHERE_CO_CMN		CONSTANT VARCHAR2(50) := '--AND --ORG.CO_CD' ;
	G_WHERE_LCL_ON		CONSTANT VARCHAR2(50) := 'AND FCPA_CONTEXT.F_GET_LOCALE' ;
	G_WHERE_LCL_OFF		CONSTANT VARCHAR2(50) := '--AND --FCPA_CONTEXT.F_GET_LOCALE' ;
	G_WHERE_LCL_COL_ON	CONSTANT VARCHAR2(10) := '= LCL.' ;
	G_WHERE_LCL_COL_OFF	CONSTANT VARCHAR2(30) := 'IS NOT NULL/*LCL*/--' ;

	G_WHERE_BP_COM_ALL	CONSTANT VARCHAR2(30) := '--AND --/*BP_COM*/' ;
	G_WHERE_BP_COM_CMN	CONSTANT VARCHAR2(30) := 'AND /*BP_COM*/' ;
	G_PRNT_LCL_ALL	CONSTANT VARCHAR2(30) := 'ORG.PRNT_LCL_CD' ;
	G_PRNT_LCL_CMN	CONSTANT VARCHAR2(100) := 'NVL(ORG./*DEF*/PRNT_LCL_CD, FCPA_CONTEXT.F_GET_DEF_LOCALE_CD) PRNT_LCL_CD' ;
	G_BIN_SEQ		CONSTANT VARCHAR2(50) := 'FCS_BINARY_ID' ;
	G_BIN_SEQ_TMP		CONSTANT VARCHAR2(50) := 'FCS_BINARY_ID_XXX' ;

	FUNCTION F_GET_COL (
		I_VIEW_NM	IN MAPA_META.ORA_OBJ_NM%TYPE
	) RETURN VARCHAR2
	/*********************************************************
	<SYNOPSIS>
		指定されたビューに対するカラム情報を返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_VIEW_NM
			ビュー名
	<RETURN VALUE>
		カラム情報
	<HISTORY>
	**********************************************************/
	IS
		L_TMP	LONG ;
	BEGIN
		L_TMP := '(' ;
		FOR x IN (
			SELECT	t.COLUMN_NAME
			FROM	USER_TAB_COLUMNS t
			WHERE	0=0
			AND	t.TABLE_NAME = I_VIEW_NM
			ORDER BY t.COLUMN_ID
			)
		LOOP
			L_TMP := L_TMP || x.COLUMN_NAME || ',' ;
		END LOOP ;
		L_TMP := L_TMP || ')' ;
		L_TMP := REPLACE(L_TMP, ',)', ')') ;

		RETURN L_TMP ;
	END ;

	FUNCTION F_GET_BODY (
		I_VIEW_NM	IN MAPA_META.ORA_OBJ_NM%TYPE
	) RETURN VARCHAR2
	/*********************************************************
	<SYNOPSIS>
		指定されたビューに対する定義情報を返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_VIEW_NM
			ビュー名
	<RETURN VALUE>
		ビューの定義情報
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	INTEGER ;
		L_TMP	LONG ;
	BEGIN

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	USER_VIEWS t
		WHERE	0=0
		AND	t.VIEW_NAME = I_VIEW_NM
		;

		IF L_CNT = 0 THEN
			RETURN NULL;
		END IF;

		SELECT	t.TEXT
		INTO	L_TMP
		FROM	USER_VIEWS t
		WHERE	0=0
		AND	t.VIEW_NAME = I_VIEW_NM
		;

		RETURN L_TMP ;
	END ;

	PROCEDURE P_REGEXP_REP (
		IO_VIEW_BODY IN OUT LONG,
		I_BEFORE IN VARCHAR2,
		I_AFTER IN VARCHAR2
	)
	/*********************************************************
	<SYNOPSIS>
		文字列置換処理
	<REMARKS>
	<ARGUMENTS>
	<IN OUT>	IO_VIEW_BODY
			ビュー定義
	<IN>	I_BEFORE
			変更前
	<IN>	I_AFTER
			変更後
	<HISTORY>
	**********************************************************/
	IS
		L_BEFORE VARCHAR2(100);
	BEGIN
		L_BEFORE := REPLACE(I_BEFORE,'.','\.');
		L_BEFORE := REPLACE(L_BEFORE,'(','\(');
		L_BEFORE := REPLACE(L_BEFORE,')','\)');
		L_BEFORE := REPLACE(L_BEFORE,'*','\*');
		L_BEFORE := REPLACE(L_BEFORE,'1 SPACE 1','\s*');
		--DBMS_OUTPUT.PUT_LINE('BEFORE:' || L_BEFORE);
		--DBMS_OUTPUT.PUT_LINE('AFTER :' || I_AFTER);
		IO_VIEW_BODY := REGEXP_REPLACE(IO_VIEW_BODY, L_BEFORE, I_AFTER, 1, 0, 'i');
		--DBMS_OUTPUT.PUT_LINE(IO_VIEW_BODY);
	END;

	PROCEDURE P_REP_ALL_CMN_REF_TBL (
		IO_VIEW_BODY	IN OUT LONG,
		I_MST	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_DB_LINK_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_LCL_STR	IN VARCHAR2
	)
	/*********************************************************
	<SYNOPSIS>
		マスタ設定区分に応じて、参照先テーブルを置換する
	<REMARKS>
		FROM句のうち、I_LCL_STRで指定したもののみを置換する
		例）MAM_BP[I_LCL_STR]_ALL
	<ARGUMENTS>
	<IN OUT>	IO_VIEW_BODY
			ビュー定義
	<IN>	I_MST
			マスタ名(MAM_XXX)
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名(@[DBLINK_NAME])
	<IN>	I_LCL_STR
			マスタ名に追加する文字列（'' または '_LCL'）
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM THEN
			--共通マスタを参照
			P_REGEXP_REP(IO_VIEW_BODY, I_MST || I_LCL_STR || G_ALL, I_MST || I_LCL_STR || G_CMN || I_DB_LINK_NM) ;  -- ***_ALL → ***_CMN@DBLINK
			P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_CO_ALL, G_WHERE_CO_CMN) ;
		ELSIF I_MST_SET_TYP = MAC_MST_SET_TYP.COM THEN
			--会社マスタを参照
			P_REGEXP_REP(IO_VIEW_BODY, I_MST || I_LCL_STR || G_CMN, I_MST || I_LCL_STR || G_ALL) ;  -- ***_CMN → ***_ALL
			P_REGEXP_REP(IO_VIEW_BODY, I_DB_LINK_NM, NULL) ; -- @DBLINK → NULL
			P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_CO_CMN, G_WHERE_CO_ALL) ;
		END IF ;
	END;

	PROCEDURE P_REP_ALL_CMN (
		IO_VIEW_BODY	IN OUT LONG,
		I_MST	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_DB_LINK_NM	IN MAPA_META.ORA_OBJ_NM%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		マスタ設定区分に応じて、参照先テーブル（参照先テーブルのLCLテーブルを含む）を切り替える
	<REMARKS>
	<ARGUMENTS>
	<IN OUT>	IO_VIEW_BODY
			ビュー定義
	<IN>	I_MST
			マスタ名(MAM_XXX)
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名(@[DBLINK_NAME])
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM THEN
			--共通マスタを参照
			P_REGEXP_REP(IO_VIEW_BODY, I_MST || G_LCL || G_ALL, I_MST || G_LCL || G_CMN || I_DB_LINK_NM) ; -- ***_LCL_ALL → ***_LCL_CMN@DBLINK
			P_REP_ALL_CMN_REF_TBL(IO_VIEW_BODY, I_MST, I_MST_SET_TYP, I_DB_LINK_NM, '');

		ELSIF I_MST_SET_TYP = MAC_MST_SET_TYP.COM THEN
			--会社マスタを参照
			P_REGEXP_REP(IO_VIEW_BODY, I_MST || G_LCL || G_CMN, I_MST || G_LCL || G_ALL) ; -- ***_LCL_CMN → ***_LCL_ALL
			P_REP_ALL_CMN_REF_TBL(IO_VIEW_BODY, I_MST, I_MST_SET_TYP, I_DB_LINK_NM, '');

		END IF ;
	END;

	PROCEDURE P_REP_ALL_CMN_BP (
		IO_VIEW_BODY IN OUT LONG,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		取引先マスタ専用のマスタ設定区分に応じた切り替え処理
	<REMARKS>
	<ARGUMENTS>
	<IN OUT>	IO_VIEW_BODY
			ビュー定義
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM THEN
			P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_BP_COM_ALL, G_WHERE_BP_COM_CMN) ;
		ELSE
			P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_BP_COM_CMN, G_WHERE_BP_COM_ALL) ;
		END IF ;
	END ;

	PROCEDURE P_REP_MAM_BP_COM_ALL (
		IO_VIEW_BODY	IN OUT LONG,
		I_MST	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_DB_LINK_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_CO_VIEW_NM	IN	MAPA_META.ORA_OBJ_NM%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		取引先マスタの参照先テーブル（参照先テーブルのLCLテーブルを含む）を切り替える
	<REMARKS>
	<ARGUMENTS>
	<IN OUT>	IO_VIEW_BODY
			ビュー定義
	<IN>	I_MST
			マスタ名(MAM_XXX)
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名(@[DBLINK_NAME])
	<IN>	I_CO_VIEW_NM
			ビュー名
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM_COM THEN
			IF I_CO_VIEW_NM = 'MAVM_BP'THEN
				-- 参照テーブルの切替
				P_REGEXP_REP(IO_VIEW_BODY, I_MST || G_CMN, 'MAVM_BP_CMN_SRCH' || I_DB_LINK_NM) ;
				P_REGEXP_REP(IO_VIEW_BODY, I_MST || G_ALL, 'MAVM_BP_CMN_SRCH' || I_DB_LINK_NM) ;
				-- ロケールの切替
				P_REGEXP_REP(IO_VIEW_BODY, I_MST || G_LCL || G_ALL, I_MST || G_LCL || G_CMN || I_DB_LINK_NM) ; -- ***_LCL_ALL → ***_LCL_CMN@DBLINK
				P_REGEXP_REP(IO_VIEW_BODY, G_PRNT_LCL_ALL, G_PRNT_LCL_CMN) ;
				P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_CO_ALL, G_WHERE_CO_CMN) ;
			ELSE
				-- 参照テーブルの切替
				P_REGEXP_REP(IO_VIEW_BODY, I_MST || G_CMN, 'MAVM_BP_CMN' || I_DB_LINK_NM) ;
				P_REGEXP_REP(IO_VIEW_BODY, I_MST || G_ALL, 'MAVM_BP_CMN' || I_DB_LINK_NM) ;
				-- ロケールの切替
				P_REGEXP_REP(IO_VIEW_BODY, I_MST || G_LCL || G_ALL, I_MST || G_LCL || G_CMN || I_DB_LINK_NM) ; -- ***_LCL_ALL → ***_LCL_CMN@DBLINK
				P_REGEXP_REP(IO_VIEW_BODY, G_PRNT_LCL_ALL, G_PRNT_LCL_CMN) ;
				P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_CO_ALL, G_WHERE_CO_CMN) ;
			END IF;
		ELSIF I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM THEN
			IF I_CO_VIEW_NM = 'MAVM_BP'THEN
				P_REGEXP_REP(IO_VIEW_BODY, 'MAVM_BP_CMN_SRCH', I_MST || G_CMN || I_DB_LINK_NM) ;
			ELSE
				P_REGEXP_REP(IO_VIEW_BODY, 'MAVM_BP_CMN', I_MST || G_CMN || I_DB_LINK_NM) ;
			END IF;
		ELSE
			IF I_CO_VIEW_NM = 'MAVM_BP'THEN
				P_REGEXP_REP(IO_VIEW_BODY, 'MAVM_BP_CMN_SRCH', I_MST || G_ALL) ; 
			ELSE
				P_REGEXP_REP(IO_VIEW_BODY, 'MAVM_BP_CMN', I_MST || G_ALL) ; 
			END IF;
		END IF;
	END;

	PROCEDURE P_REP_ALL_CMN_PRNT_LCL(
		IO_VIEW_BODY IN OUT LONG,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		マスタ設定区分に応じてPRNT_LCL_CDの参照方法を切り替える
	<REMARKS>
	<ARGUMENTS>
	<IN OUT>	IO_VIEW_BODY
			ビュー定義
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM THEN
			P_REGEXP_REP(IO_VIEW_BODY, G_PRNT_LCL_ALL, G_PRNT_LCL_CMN) ;
		ELSE
			P_REGEXP_REP(IO_VIEW_BODY, G_PRNT_LCL_CMN, G_PRNT_LCL_ALL) ;
		END IF ;
	END;

	PROCEDURE P_REP_REF_LCL(
		IO_VIEW_BODY IN OUT LONG,
		I_MST	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_LCL_FLG	IN MAPA_META.FLG%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		LCL_FLGに応じて、LCLテーブルを利用するかどうかを切り替える
	<REMARKS>
	<ARGUMENTS>
	<IN OUT>	IO_VIEW_BODY
			ビュー定義
	<IN>	I_MST
			マスタ名(MAM_XXX)
	<IN>	I_LCL_FLG
			ロケール管理ＦＬＧ
	<HISTORY>
	**********************************************************/
	IS
		L_NO_LCL_JOIN	LONG ;
	BEGIN
		L_NO_LCL_JOIN := G_FROM_LCL_OFF || I_MST || G_LCL;

		IF I_LCL_FLG = '1' THEN
			P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_LCL_COL_OFF, G_WHERE_LCL_COL_ON) ;
			P_REGEXP_REP(IO_VIEW_BODY, L_NO_LCL_JOIN, ',' || CHR(10) || CHR(9) || I_MST || G_LCL);
			P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_LCL_OFF, G_WHERE_LCL_ON) ;
			P_REGEXP_REP(IO_VIEW_BODY, G_LCL_OFF, G_LCL_ON) ; --最後
		ELSE
			P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_LCL_COL_ON, G_WHERE_LCL_COL_OFF) ;
			P_REGEXP_REP(IO_VIEW_BODY, ',1 SPACE 1' || I_MST || G_LCL , L_NO_LCL_JOIN);
			P_REGEXP_REP(IO_VIEW_BODY, G_WHERE_LCL_ON, G_WHERE_LCL_OFF) ;
			P_REGEXP_REP(IO_VIEW_BODY, G_LCL_ON, G_LCL_OFF) ; --最後
		END IF ;
	END;

	PROCEDURE P_REP_REF_LCL_MAVM_BP_NM(
		IO_VIEW_BODY IN OUT LONG,
		I_LCL_FLG	IN MAPA_META.FLG%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		LCL_FLGに応じて、LCLテーブルを利用するかどうかを切り替える(MAVM_BP_NM用)
	<REMARKS>
	<ARGUMENTS>
	<IN OUT>	IO_VIEW_BODY
			ビュー定義
	<IN>	I_LCL_FLG
			ロケール管理ＦＬＧ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN

		IF I_LCL_FLG = '1' THEN
			P_REGEXP_REP(IO_VIEW_BODY, 'MAM_BP/*LCL*/', 'MAM_BP_LCL') ;
			P_REGEXP_REP(IO_VIEW_BODY, '0=0--FCPA_CONTEXT.--F_GET_LOCALE', 'FCPA_CONTEXT.F_GET_LOCALE') ;
		ELSE
			P_REGEXP_REP(IO_VIEW_BODY, 'MAM_BP_LCL', 'MAM_BP/*LCL*/') ;
			P_REGEXP_REP(IO_VIEW_BODY, 'FCPA_CONTEXT.F_GET_LOCALE', '0=0--FCPA_CONTEXT.--F_GET_LOCALE') ;
		END IF ;
	END;

	PROCEDURE P_MST_CTL_MAVM_BP_NM (
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_LCL_FLG	IN MAPA_META.FLG%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MAVM_BP_NMのビューを再定義する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_LCL_FLG
			ロケール管理ＦＬＧ
	<HISTORY>
	**********************************************************/
	IS
		L_VIEW_COL	LONG ;
		L_VIEW_BODY	LONG ;
		L_CO_VIEW_NM	MAPA_META.ORA_OBJ_NM%TYPE ;

	BEGIN
		L_CO_VIEW_NM := 'MAVM_BP_NM' ;

		--カラム情報とビュー本体の取得
		L_VIEW_COL := F_GET_COL(L_CO_VIEW_NM) ;
		L_VIEW_BODY := F_GET_BODY(L_CO_VIEW_NM) ;

		-- 置換処理
		P_REP_REF_LCL_MAVM_BP_NM(L_VIEW_BODY, I_LCL_FLG);

		--ビュー情報の定義
		DBMS_UTILITY.EXEC_DDL_STATEMENT(G_VIEW_DEF || L_CO_VIEW_NM || L_VIEW_COL || ' AS ' || L_VIEW_BODY) ;
	END;

	PROCEDURE P_MST_CTL_REF_TBL (
		I_CO_VIEW_BASE_NM	IN	MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_LCL_FLG	IN MAPA_META.FLG%TYPE,
		I_DB_LINK_NM	IN VARCHAR2,
		I_LCL_STR	IN VARCHAR2
	)
	/*********************************************************
	<SYNOPSIS>
		インプット情報に従ってマスタのビューを再定義する
	<REMARKS>
		FROM句のうち、I_LCL_STRで指定したもののみを切り替える
		例）MAM_BP[I_LCL_STR]_ALL
	<ARGUMENTS>
	<IN>	I_CO_VIEW_BASE_NM
			ビュー名
	<IN>	I_MST
			マスタ名(MAM_XXX)
	<IN>	I_MST_NM
			マスタ名(XXX)
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_LCL_FLG
			ロケール管理ＦＬＧ
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名（@[DBLINK_NAME]）
	<IN>	I_LCL_STR
			マスタ名に追加する文字列（'' または '_LCL'）
	<HISTORY>
	**********************************************************/
	IS
		L_VIEW_COL	LONG ;
		L_VIEW_BODY	LONG ;
	BEGIN

		IF MAC_MST_NM.IS_COM(I_MST_NM) = '0' THEN
			RETURN ;
		END IF ;

		--カラム情報とビュー本体の取得
		L_VIEW_COL := F_GET_COL(I_CO_VIEW_BASE_NM) ;
		L_VIEW_BODY := F_GET_BODY(I_CO_VIEW_BASE_NM) ;

		IF L_VIEW_BODY IS NULL THEN
			RETURN;
		END IF;

		-- 置換処理
		P_REP_ALL_CMN_REF_TBL(L_VIEW_BODY, I_MST_NM, I_MST_SET_TYP, I_DB_LINK_NM, I_LCL_STR);

		--ビュー情報の定義
		DBMS_UTILITY.EXEC_DDL_STATEMENT(G_VIEW_DEF || I_CO_VIEW_BASE_NM || L_VIEW_COL || ' AS ' || L_VIEW_BODY) ;

	END;

	PROCEDURE P_MST_CTL_REF_ALL (
		I_CO_VIEW_NM	IN	MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_LCL_FLG	IN MAPA_META.FLG%TYPE,
		I_DB_LINK_NM	IN VARCHAR2
	)
	/*********************************************************
	<SYNOPSIS>
		インプット情報に従ってマスタのビューを再定義する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CO_VIEW_NM
			ビュー名
	<IN>	I_MST
			マスタ名(MAM_XXX)
	<IN>	I_MST_NM
			マスタ名(XXX)
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_LCL_FLG
			ロケール管理ＦＬＧ
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名（@[DBLINK_NAME]）
	<HISTORY>
	**********************************************************/
	IS
		L_VIEW_COL	LONG ;
		L_VIEW_BODY	LONG ;
	BEGIN

	/***CO_VIEW***/
		--カラム情報とビュー本体の取得
		L_VIEW_COL := F_GET_COL(I_CO_VIEW_NM) ;
		L_VIEW_BODY := F_GET_BODY(I_CO_VIEW_NM) ;

		IF L_VIEW_BODY IS NULL THEN
			RETURN;
		END IF;

		IF MAC_MST_NM.IS_COM(I_MST_NM) = '0' THEN
			GOTO SKIP_CO_VIEW_CO ;
		END IF ;

		-- 共通/会社別の切り替え
		IF I_MST_NM = MAC_MST_NM.MAM_BP THEN
			P_REP_MAM_BP_COM_ALL(L_VIEW_BODY, I_MST, I_MST_SET_TYP, I_DB_LINK_NM, I_CO_VIEW_NM);
		END IF;
		P_REP_ALL_CMN(L_VIEW_BODY, I_MST, I_MST_SET_TYP, I_DB_LINK_NM);

		-- 共通/会社別の切り替え：取引先、場所専用
		IF I_MST_NM = MAC_MST_NM.MAM_BP THEN
			IF I_CO_VIEW_NM != 'MAVM_BP' THEN
				P_REP_ALL_CMN_BP(L_VIEW_BODY, I_MST_SET_TYP) ;
			END IF ;
			IF I_MST_SET_TYP != MAC_MST_SET_TYP.ALL_COM_COM THEN
				P_REP_ALL_CMN_PRNT_LCL(L_VIEW_BODY, I_MST_SET_TYP) ;
			END IF;
		END IF ;
		IF I_MST_NM = MAC_MST_NM.MAM_LOC THEN
			P_REP_ALL_CMN_PRNT_LCL(L_VIEW_BODY, I_MST_SET_TYP) ;
		END IF ;

		<<SKIP_CO_VIEW_CO>>
			NULL ;

		IF MAC_MST_NM.IS_LCL(I_MST_NM) = '0' THEN
			GOTO SKIP_LCL ;
		END IF ;

		-- LCLテーブル利用の切り替え
		P_REP_REF_LCL(L_VIEW_BODY, I_MST, I_LCL_FLG);

		-- LCLテーブル利用の切り替え：取引先専用
		IF I_MST_NM = MAC_MST_NM.MAM_BP AND I_CO_VIEW_NM != 'MAVM_BP' THEN
			P_MST_CTL_MAVM_BP_NM(I_MST_SET_TYP, I_LCL_FLG) ;
		END IF;

		<<SKIP_LCL>>
			NULL ;

		--ビュー情報の定義
		DBMS_UTILITY.EXEC_DDL_STATEMENT(G_VIEW_DEF || I_CO_VIEW_NM || L_VIEW_COL || ' AS ' || L_VIEW_BODY) ;

	END;

	PROCEDURE P_REP_ALL_CMN_BIN_SEQ (
		I_MST_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_DB_LINK_NM	IN VARCHAR2
	)
	/*********************************************************
	<SYNOPSIS>
		マスタ設定区分に応じて、バイナリID用シーケンスの参照を切り替える
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_MST_NM
			マスタ名(XXX)
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_DB_LINK_NM
			ＤＢＬＩＮＫ（@[LINK_NAME]）
	<HISTORY>
	**********************************************************/
	IS
		L_CNT		INTEGER ;
	BEGIN
		IF I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM THEN
			IF I_DB_LINK_NM IS NOT NULL THEN
				SELECT	COUNT(*)
				INTO	L_CNT
				FROM	USER_SEQUENCES t
				WHERE	0=0
				AND	t.SEQUENCE_NAME = G_BIN_SEQ
				;

				IF L_CNT = 1 THEN
					DBMS_UTILITY.EXEC_DDL_STATEMENT('RENAME ' || G_BIN_SEQ || ' TO ' || G_BIN_SEQ_TMP) ;
					DBMS_UTILITY.EXEC_DDL_STATEMENT('CREATE SYNONYM ' || G_BIN_SEQ || ' FOR ' || G_BIN_SEQ || I_DB_LINK_NM) ;
				END IF ;
			END IF ;
		ELSE
			SELECT	COUNT(*)
			INTO	L_CNT
			FROM	USER_SYNONYMS t
			WHERE	0=0
			AND	t.SYNONYM_NAME = G_BIN_SEQ
			;

			IF L_CNT = 1 THEN
				L_CNT := 0 ;
				IF I_MST_NM = MAC_MST_NM.MAM_USR THEN
					SELECT	COUNT(*)
					INTO	L_CNT
					FROM	MAM_MST_CTL m
					WHERE	0=0
					AND	m.MST_NM = MAC_MST_NM.MAM_ITM
					AND	m.MST_SET_TYP = MAC_MST_SET_TYP.COM
					;
				ELSE
					SELECT	COUNT(*)
					INTO	L_CNT
					FROM	MAM_MST_CTL m
					WHERE	0=0
					AND	m.MST_NM = MAC_MST_NM.MAM_USR
					AND	m.MST_SET_TYP = MAC_MST_SET_TYP.COM
					;
				END IF ;

				IF L_CNT = 1 THEN
					DBMS_UTILITY.EXEC_DDL_STATEMENT('DROP SYNONYM ' || G_BIN_SEQ) ;
					DBMS_UTILITY.EXEC_DDL_STATEMENT('RENAME ' || G_BIN_SEQ_TMP || ' TO ' || G_BIN_SEQ) ;
				END IF ;
			END IF ;
		END IF ;
	END;

	PROCEDURE P_UPD_MST_CTL (
		I_MST_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_LCL_FLG	IN MAPA_META.FLG%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MAM_MST_CTL を更新する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_MST_NM
			マスタ名(XXX)
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_LCL_FLG
			ロケール管理ＦＬＧ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		IF MAC_MST_NM.IS_COM(I_MST_NM) = '0' AND I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM THEN
			UPDATE	MAM_MST_CTL m
			SET	m.MST_SET_TYP = MAC_MST_SET_TYP.COM
			WHERE	0=0
			AND	m.MST_NM = I_MST_NM
			;
		END IF ;

		IF MAC_MST_NM.IS_LCL(I_MST_NM) = '0' AND I_LCL_FLG = '1' THEN
			UPDATE	MAM_MST_CTL m
			SET	m.LCL_FLG = '0'
			WHERE	0=0
			AND	m.MST_NM = I_MST_NM
			;
		END IF ;
	END;

	PROCEDURE P_MST_CTL (
		I_MST_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_LCL_FLG	IN MAPA_META.FLG%TYPE,
		I_DB_LINK_NM	IN MAPA_META.ORA_OBJ_NM%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		インプット情報に従ってマスタのビューを再定義する
	<REMARKS>
		品目マスタの対応
		CO_VIEW：MAM_ITM_CMN_
		CO_VIEW_BASE：MAM_ITM_CMN_UPD
		取引先マスタの対応
		マスタ制御：共通・会社別の場合
		CO_VIEW_BASE：MAM_BP_CMN_
	<ARGUMENTS>
	<IN>	I_MST_NM
			マスタ名
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_LCL_FLG
			ロケール管理ＦＬＧ
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名
	<HISTORY>
	**********************************************************/
	IS
		L_VIEW_COL	LONG ;
		L_VIEW_BODY	LONG ;

		L_DBLINK	VARCHAR2(100) ;

		L_CO_VIEW_BASE_NM	MAPA_META.ORA_OBJ_NM%TYPE ;
		L_CO_VIEW_NM		MAPA_META.ORA_OBJ_NM%TYPE ;
		L_CO_VIEW_S_NM		MAPA_META.ORA_OBJ_NM%TYPE ;
		L_CO_VIEW_U_NM		MAPA_META.ORA_OBJ_NM%TYPE ;
		L_CO_VIEW_LCL_NM	MAPA_META.ORA_OBJ_NM%TYPE ;
		L_CO_VIEW_LCL_S_NM	MAPA_META.ORA_OBJ_NM%TYPE ;
		L_CO_VIEW_LCL_U_NM	MAPA_META.ORA_OBJ_NM%TYPE ;
		L_MST			MAPA_META.ORA_OBJ_NM%TYPE ;

		L_CNT		INTEGER ;
	BEGIN
		-- 処理対象
		L_MST := G_MST_PRE || I_MST_NM ;
		IF I_MST_NM = MAC_MST_NM.MAM_ITM THEN
			L_CO_VIEW_NM := 'MAM_ITM_CMN_' ;
			L_CO_VIEW_S_NM := NULL ;
			L_CO_VIEW_U_NM := NULL ;
			L_CO_VIEW_BASE_NM := 'MAM_ITM_CMN_UPD' ;
		ELSIF I_MST_NM = MAC_MST_NM.MAM_BP AND I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM_COM THEN
			L_CO_VIEW_NM := L_MST ;
			L_CO_VIEW_S_NM := L_MST || '_$S' ;
			L_CO_VIEW_U_NM := L_MST || '_$U' ;
			L_CO_VIEW_BASE_NM := 'MAVM_BP_CMN' ;
		ELSE
			L_CO_VIEW_NM := L_MST ;
			L_CO_VIEW_S_NM := L_MST || '_$S' ;
			L_CO_VIEW_U_NM := L_MST || '_$U' ;
			L_CO_VIEW_BASE_NM := L_MST || '_' ;
		END IF ;
		L_CO_VIEW_LCL_NM := L_MST || G_LCL ;
		L_CO_VIEW_LCL_S_NM := L_MST || G_LCL || '_$S' ;
		L_CO_VIEW_LCL_U_NM := L_MST || G_LCL || '_$U' ;

		-- @[DBLINK_NAME]
		IF I_DB_LINK_NM IS NOT NULL THEN
			L_DBLINK := '@' || I_DB_LINK_NM ;
		ELSE
			L_DBLINK := NULL ;
		END IF ;

		-- CO_VIEW_BASE
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	USER_VIEWS t
		WHERE	0=0
		AND	t.VIEW_NAME = L_CO_VIEW_BASE_NM
		;

		IF L_CNT = 0 OR MAC_MST_NM.IS_COM(I_MST_NM) = '0' OR (I_MST_NM = MAC_MST_NM.MAM_BP AND 
			I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM_COM) THEN
			GOTO SKIP_CO_VIEW_BASE_CO ;
		END IF ;

		P_MST_CTL_REF_TBL(L_CO_VIEW_BASE_NM, L_MST, I_MST_NM, I_MST_SET_TYP, I_LCL_FLG, L_DBLINK, '');

		<<SKIP_CO_VIEW_BASE_CO>>
			NULL ;

		-- CO_VIEW
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	USER_VIEWS t
		WHERE	0=0
		AND	t.VIEW_NAME = L_CO_VIEW_NM
		;

		IF L_CNT = 0 OR MAC_MST_NM.IS_COM(I_MST_NM) = '0' AND MAC_MST_NM.IS_LCL(I_MST_NM) = '0' THEN
			GOTO PROC_END ;
		END IF ;

		P_MST_CTL_REF_ALL(L_CO_VIEW_NM, L_MST, I_MST_NM, I_MST_SET_TYP, I_LCL_FLG, L_DBLINK);
		P_MST_CTL_REF_ALL(L_CO_VIEW_S_NM, L_MST, I_MST_NM, I_MST_SET_TYP, I_LCL_FLG, L_DBLINK);
		IF I_MST_NM = MAC_MST_NM.MAM_BP AND I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM_COM THEN
			--  取引先マスタが「共通・会社別」の場合は、取引先マスタの更新Viewを会社別の定義にする
			P_MST_CTL_REF_TBL(L_CO_VIEW_U_NM, L_MST, I_MST_NM, MAC_MST_SET_TYP.COM, I_LCL_FLG, L_DBLINK, '');
		ELSE
			P_MST_CTL_REF_TBL(L_CO_VIEW_U_NM, L_MST, I_MST_NM, I_MST_SET_TYP, I_LCL_FLG, L_DBLINK, '');
		END IF;

		IF MAC_MST_NM.IS_COM(I_MST_NM) = '0' OR MAC_MST_NM.IS_LCL(I_MST_NM) = '0' THEN
			GOTO SKIP_LCL_CO ;
		END IF ;

		IF MAC_MST_NM.IS_MAM_BP(I_MST_NM) = '1' AND I_MST_SET_TYP = MAC_MST_SET_TYP.ALL_COM_COM THEN
			-- 取引先マスタが「共通・会社別」の場合は、ロケールテーブルを共通の定義にする
			P_MST_CTL_REF_TBL(L_CO_VIEW_LCL_NM, L_MST, I_MST_NM, MAC_MST_SET_TYP.ALL_COM, I_LCL_FLG, L_DBLINK,G_LCL);
			P_MST_CTL_REF_TBL(L_CO_VIEW_LCL_S_NM, L_MST, I_MST_NM, MAC_MST_SET_TYP.ALL_COM, I_LCL_FLG, L_DBLINK,G_LCL);
			P_MST_CTL_REF_TBL(L_CO_VIEW_LCL_U_NM, L_MST, I_MST_NM, MAC_MST_SET_TYP.ALL_COM, I_LCL_FLG, L_DBLINK,G_LCL);
		ELSE
			P_MST_CTL_REF_TBL(L_CO_VIEW_LCL_NM, L_MST, I_MST_NM, I_MST_SET_TYP, I_LCL_FLG, L_DBLINK,G_LCL);
			P_MST_CTL_REF_TBL(L_CO_VIEW_LCL_S_NM, L_MST, I_MST_NM, I_MST_SET_TYP, I_LCL_FLG, L_DBLINK,G_LCL);
			P_MST_CTL_REF_TBL(L_CO_VIEW_LCL_U_NM, L_MST, I_MST_NM, I_MST_SET_TYP, I_LCL_FLG, L_DBLINK,G_LCL);
		END IF;
		<<SKIP_LCL_CO>>
			NULL ;

		-- バイナリシーケンスの参照切り替え
		IF I_MST_NM = MAC_MST_NM.MAM_USR
		OR I_MST_NM = MAC_MST_NM.MAM_ITM
		THEN
			P_REP_ALL_CMN_BIN_SEQ(I_MST_NM, I_MST_SET_TYP, L_DBLINK);
		END IF ;

		<<PROC_END>>
			NULL ;

		-- MAM_MST_CTL の更新
		P_UPD_MST_CTL(I_MST_NM, I_MST_SET_TYP, I_LCL_FLG);

		-- 部門の場合の追加処理
		IF I_MST_NM = MAC_MST_NM.MAM_DPT THEN
			P_MST_CTL(MAC_MST_NM.MAM_DPT_HIS, I_MST_SET_TYP, '0', I_DB_LINK_NM) ;
			P_MST_CTL(MAC_MST_NM.MAM_DPT_MAP, I_MST_SET_TYP, '0', I_DB_LINK_NM) ;
		END IF ;

		-- 取引先の場合の追加処理
		IF I_MST_NM = MAC_MST_NM.MAM_BP THEN
			L_CO_VIEW_BASE_NM := 'MAVM_BP' ;
			P_MST_CTL_REF_ALL(L_CO_VIEW_BASE_NM, L_MST, I_MST_NM, I_MST_SET_TYP, I_LCL_FLG, L_DBLINK);
		END IF ;

	END P_MST_CTL ;

	PROCEDURE P_MST_CTL_CHECK (
		I_DB_LINK_NM	IN MAPA_META.ORA_OBJ_NM%TYPE
		)
	/*********************************************************
	<SYNOPSIS>
		マスタ間の整合性を保つための処理を行なう
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名
	<HISTORY>
	**********************************************************/
	IS
		TYPE LIST_TYPE IS TABLE OF MAPA_META.ORA_OBJ_NM%TYPE INDEX BY BINARY_INTEGER ;
		L_LIST_MST_MAIN	LIST_TYPE ;
		L_LIST_MST_SUB	LIST_TYPE ;

		cnt	BINARY_INTEGER ;

		PROCEDURE P_MST_CHK (
			I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE
			)
		IS
			L_MST_SET_TYP	MAPA_META.MST_SET_TYP%TYPE ;
			L_TMP_TS	MAPA_META.SYS_TS%TYPE ;
			L_MAX_TS	MAPA_META.SYS_TS%TYPE ;
			L_CHK		INTEGER ;
		BEGIN

			IF L_LIST_MST_MAIN.COUNT = 0 THEN
				RETURN ;
			END IF ;

			L_CHK := 0 ;
			L_MST_SET_TYP := NULL ;
			L_MAX_TS := NULL ;

			FOR i IN 1..L_LIST_MST_MAIN.COUNT LOOP
				FOR x IN (
					SELECT	m.MST_SET_TYP,
						m.UPD_TS
					FROM	MAM_MST_CTL m
					WHERE	0=0
					AND	m.MST_NM = L_LIST_MST_MAIN(i)
					)
				LOOP
					IF L_MAX_TS IS NULL OR L_MAX_TS < x.UPD_TS THEN
						L_MAX_TS := x.UPD_TS ;
						L_MST_SET_TYP := x.MST_SET_TYP ;
					END IF ;
				END LOOP ;
			END LOOP ;

			IF I_MST_SET_TYP IS NOT NULL AND I_MST_SET_TYP != L_MST_SET_TYP THEN
				RETURN ;
			END IF ;

			FOR i IN 1..L_LIST_MST_SUB.COUNT LOOP
				SELECT	COUNT(*)
				INTO	L_CHK
				FROM	MAM_MST_CTL m
				WHERE	0=0
				AND	m.MST_NM = L_LIST_MST_SUB(i)
				AND	m.MST_SET_TYP != L_MST_SET_TYP
				AND	ROWNUM=1
				;

				IF L_CHK > 0 THEN
					EXIT ;
				END IF ;
			END LOOP ;

			IF L_CHK = 0 THEN
				RETURN ;
			END IF ;

			FOR i IN 1..L_LIST_MST_SUB.COUNT LOOP
				FOR x IN (
					SELECT	m.MST_NM,
						m.MST_SET_TYP,
						m.LCL_FLG
					FROM	MAM_MST_CTL m
					WHERE	0=0
					AND	m.MST_NM = L_LIST_MST_SUB(i)
					AND	m.MST_SET_TYP != L_MST_SET_TYP
					)
				LOOP
					P_MST_CTL(x.MST_NM, L_MST_SET_TYP, x.LCL_FLG, I_DB_LINK_NM) ;

					UPDATE	MAM_MST_CTL m
					SET	m.MST_SET_TYP = L_MST_SET_TYP
					WHERE	0=0
					AND	m.MST_NM = x.MST_NM
					;
				END LOOP ;
			END LOOP ;
		END ;

		PROCEDURE P_MST_CHK_BP_CMN_ALL (
			I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE
			)
		IS
			L_MST_SET_TYP	MAPA_META.MST_SET_TYP%TYPE ;
			L_TMP_TS	MAPA_META.SYS_TS%TYPE ;
			L_MAX_TS	MAPA_META.SYS_TS%TYPE ;
			L_CHK		INTEGER ;
		BEGIN

			IF L_LIST_MST_MAIN.COUNT = 0 THEN
				RETURN ;
			END IF ;

			L_CHK := 0 ;
			L_MST_SET_TYP := NULL ;
			L_MAX_TS := NULL ;

			FOR i IN 1..L_LIST_MST_MAIN.COUNT LOOP
				FOR x IN (
					SELECT	m.MST_SET_TYP,
						m.UPD_TS
					FROM	MAM_MST_CTL m
					WHERE	0=0
					AND	m.MST_NM = L_LIST_MST_MAIN(i)
					)
				LOOP
					IF L_MAX_TS IS NULL OR L_MAX_TS < x.UPD_TS THEN
						L_MAX_TS := x.UPD_TS ;
						L_MST_SET_TYP := x.MST_SET_TYP ;
					END IF ;
				END LOOP ;
			END LOOP ;

			IF I_MST_SET_TYP IS NOT NULL AND L_MST_SET_TYP != MAC_MST_SET_TYP.ALL_COM_COM THEN
				RETURN ;
			END IF ;

			FOR i IN 1..L_LIST_MST_SUB.COUNT LOOP
				SELECT	COUNT(*)
				INTO	L_CHK
				FROM	MAM_MST_CTL m
				WHERE	0=0
				AND	m.MST_NM = L_LIST_MST_SUB(i)
				AND	m.MST_SET_TYP != I_MST_SET_TYP
				AND	ROWNUM=1
				;

				IF L_CHK > 0 THEN
					EXIT ;
				END IF ;
			END LOOP ;

			IF L_CHK = 0 THEN
				RETURN ;
			END IF ;

			FOR i IN 1..L_LIST_MST_SUB.COUNT LOOP
				FOR x IN (
					SELECT	m.MST_NM,
						m.MST_SET_TYP,
						m.LCL_FLG
					FROM	MAM_MST_CTL m
					WHERE	0=0
					AND	m.MST_NM = L_LIST_MST_SUB(i)
					AND	m.MST_SET_TYP != I_MST_SET_TYP
					)
				LOOP
					P_MST_CTL(x.MST_NM, I_MST_SET_TYP, x.LCL_FLG, I_DB_LINK_NM) ;

					UPDATE	MAM_MST_CTL m
					SET	m.MST_SET_TYP = I_MST_SET_TYP
					WHERE	0=0
					AND	m.MST_NM = x.MST_NM
					;
				END LOOP ;
			END LOOP ;
		END ;

	BEGIN

	/*常に連動するマスタ*/
		-- 勘定科目マスタ、補助勘定科目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;
		P_MST_CHK(NULL) ;

		-- 銀行マスタ、銀行支店マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BANK ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BANK_BRANCH ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BANK ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BANK_BRANCH ;
		P_MST_CHK(NULL) ;

		-- 自動仕訳マスタ、自動仕訳パタンマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_AUTO_JNL ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_JNL_PTN ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AUTO_JNL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_PTN ;
		P_MST_CHK(NULL) ;

		-- カレンダ基本マスタ、カレンダマスタ、臨時カレンダマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_CAL_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_CAL ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_CAL_EXT ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL_EXT ;
		P_MST_CHK(NULL) ;

		-- ＨＳ分類マスタ、ＨＳマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_HS_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_HS ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_HS_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_HS ;
		P_MST_CHK(NULL) ;

		-- 仕様マスタ、仕様項目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_SPEC ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_SPEC_DESC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SPEC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SPEC_DESC ;
		P_MST_CHK(NULL) ;

		-- 原価費目グループマスタ、原価費目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_EXPNS_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_EXPNS ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXPNS_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXPNS ;
		P_MST_CHK(NULL) ;

		-- 原価メニューマスタ、原価メニュー構成マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_MENU ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_MENU_CONFIG ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_COST_MENU ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_MENU_CONFIG ;
		P_MST_CHK(NULL) ;

		-- 配賦科目グループマスタ、配賦科目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ALC_AC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ALC_AC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALC_AC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALC_AC ;
		P_MST_CHK(NULL) ;

		-- 原価個別受払表マスタ、原価個別受払表構成マスタ、原価個別受払表項目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_IO ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_IO_CONF ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_IO_COL ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_IO ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_IO_CONF ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_IO_COL ;
		P_MST_CHK(NULL) ;

		-- 原価レポートパタンマスタ、原価レポート構成マスタ、原価レポート行集計マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_RPT_PTN ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_RPT_CONF ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_RPT_ROW_SML ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_RPT_PTN ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_RPT_CONF ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_RPT_ROW_SML ;
		P_MST_CHK(NULL) ;

		-- 外部システムマスタ、ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_EXT_SYS ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_IF_PROTOCOL ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_IF_ADAPTER ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_HTTP_HEADER ;
		cnt := cnt + 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_EXT_SYS_USR ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXT_SYS ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_PROTOCOL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_ADAPTER ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_HTTP_HEADER ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXT_SYS_USR ;
		P_MST_CHK(NULL) ;

	/*主が会社・共通管理の場合は、従を会社管理もしくは共通管理にできない*/
		-- （主）取引先マスタ
		-- （従）（共通管理）国マスタ、地域マスタ、通貨マスタ、取引先分類マスタ
		--       （会社管理）取引先補助マスタ、取引先禁止マスタ、与信限度額マスタ、場所マスタ、自動仕訳パタンマスタ、ＩＦコードルールマスタ、ＩＦコード変換マスタ、
		--        品目仕訳科目設定マスタ、口座科目設定マスタ、会計理由科目設定マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BP ;
		-- 共通管理するマスタの制御
		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CNTRY ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AREA ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CUR ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BP_GRP ;
		P_MST_CHK_BP_CMN_ALL(MAC_MST_SET_TYP.ALL_COM) ;

		-- 会社管理するマスタの制御
		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BP_SUB ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BP_STOP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CRED_CTRL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LOC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_PTN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_CD_RULE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_X ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_AC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BAC_AC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_RSN_AC ;
		P_MST_CHK_BP_CMN_ALL(MAC_MST_SET_TYP.COM) ;

	/*主が会社管理の場合は、従を共通管理にできない*/
		-- （主）取引先マスタ
		-- （従）取引先補助マスタ、取引先禁止マスタ、与信限度額マスタ、場所マスタ、自動仕訳パタンマスタ、ＩＦコードルールマスタ、ＩＦコード変換マスタ、
		-- 　　　品目仕訳科目設定マスタ、口座科目設定マスタ、会計理由科目設定マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BP ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BP_SUB ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BP_STOP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CRED_CTRL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LOC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_PTN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_CD_RULE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_X ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_AC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BAC_AC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_RSN_AC ;
		P_MST_CHK(MAC_MST_SET_TYP.COM) ;

		-- （主）品目マスタ
		-- （従）品目補助マスタ、品目単位マスタ、品目付加情報マスタ、品目禁止マスタ、原価品群構成マスタ、
		-- 　　　自動仕訳パタンマスタ、ＩＦコード変換マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ITM ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_SUB ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_UNIT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ATTACH_INFO ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_STOP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CTG_CONFIG ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_PTN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_X ;
		P_MST_CHK(MAC_MST_SET_TYP.COM) ;

		-- （主）場所マスタ
		-- （従）場所補助マスタ、棚・ラインマスタ、データアクセス制御マスタ、原価部門構成マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_LOC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LOC_SUB ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_STR_LN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DA_CTL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT_CONFIG ;
		P_MST_CHK(MAC_MST_SET_TYP.COM) ;

	/*主が共通管理の場合は、従を会社管理にできない*/
		-- （主）品目マスタ
		-- （従）品目分類マスタ、単位マスタ、ＨＳマスタ、販売品目体系マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ITM ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_UNIT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_HS ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SLS_ITM_GRP ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）取引先マスタ
		-- （従）国マスタ、地域マスタ、通貨マスタ、取引先分類マスタ、部門マスタ、伝票帳票マスタ、税マスタ、取引条件マスタ、
		-- 　　　販売分析マスタ、カレンダ基本マスタ、相殺グループマスタ、注文書表示マスタ、口座マスタ、物流グループマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BP ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CNTRY ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AREA ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CUR ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BP_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SLIP_FORM ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_TAX ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_TTERM ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SLS_ANLY ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SETOFF_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_PO_PRINT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BANK_AC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LG_GRP ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）場所マスタ
		-- （従）棚・ラインマスタ、部門マスタ、ワーキンググループマスタ、工場・物流倉庫マスタ、物流グループマスタ、製造場所グループマスタ、総量引当場所グループマスタ、
		-- 　　　カレンダ基本マスタ、国マスタ、資源マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_LOC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_STR_LN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_WG ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SITE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LG_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LOC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALLOC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CNTRY ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_RSRC ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）品目補助マスタ
		-- （従）税マスタ、販売品目体系マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ITM_SUB ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_TAX ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SLS_ITM_GRP ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）取引先補助マスタ
		-- （従）部門マスタ、税マスタ、販売分析マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BP_SUB ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_TAX ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SLS_ANLY ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）場所補助マスタ
		-- （従）部門マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_LOC_SUB ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）承認情報マスタ
		-- （従）承認ルートマスタ、部門基本マスタ、通貨マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_APRV ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_APRV_RT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CUR ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）承認ルートマスタ
		-- （従）承認役割マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_APRV_RT ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_APRV_ROLE ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）データアクセス制御マスタ
		-- （従）データアクセス基本マスタ、ワーキンググループマスタ、部門マスタ、物流グループマスタ、総量引当グループマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_DA_CTL ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DA ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_WG ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LG_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALLOC_GRP ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）自動仕訳パタンマスタ
		-- （従）自動仕訳パタン基本マスタ、会計部門マスタ、仕訳グループマスタ、勘定科目マスタ、補助勘定科目マスタ、会計税マスタ、品目仕訳マスタ、会計理由マスタ、通貨マスタ、自動仕訳マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_JNL_PTN ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_PTN_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_DPT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_TAX ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_JNL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_RSN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CUR ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AUTO_JNL ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）品目仕訳科目設定マスタ
		-- （従）品目仕訳マスタ、仕訳グループマスタ、勘定科目マスタ、補助勘定科目マスタ、会計税マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_JNL_AC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_JNL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_TAX ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）口座科目設定マスタ
		-- （従）口座マスタ、仕訳グループマスタ、勘定科目マスタ、補助勘定科目マスタ、会計税マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BAC_AC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BANK_AC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_TAX ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）会計理由科目設定マスタ
		-- （従）会計理由マスタ、仕訳グループマスタ、勘定科目マスタ、補助勘定科目マスタ、会計税マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_RSN_AC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_RSN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_TAX ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）品目区分詳細マスタ
		-- （従）品目仕訳マスタ、会計品目分類マスタ、品目仕様分類マスタ、販売単価分類マスタ、品目出荷グループマスタ、
		-- 　　　出荷有効期限グループマスタ、出荷条件マスタ、承認役割マスタ、計算パタンマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ITM_TYP_D ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_JNL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_ITM_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_SPEC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SLS_UPRI_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_SHIP_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SHIP_VALID ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SHIP_TERM ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_APRV_ROLE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CALC_PTN ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）部門マスタ
		-- （従）部門基本マスタ、部門変更対応マスタ、ワーキンググループマスタ、原価部門マスタ、会計部門マスタ、口座マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_DPT ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT_LVL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_WG ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_COST_DPT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_DPT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BANK_AC ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）担当者マスタ
		-- （従）工数管理マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_USR ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_WK_COST ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）口座マスタ
		-- （従）銀行マスタ、銀行支店マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BANK_AC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BANK ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BANK_BRANCH ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）銀行マスタ
		-- （従）カレンダ基本マスタ、銀行支店マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BANK ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_BANK_BRANCH ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）為替レートマスタ
		-- （従）為替レート基本マスタ、通貨マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_CUR_XRATE ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_XRATE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CUR ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）単位換算マスタ
		-- （従）単位マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_UNIT_CONV ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_UNIT ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）輸出規制マスタ
		-- （従）ＨＳマスタ、国マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_EX_CTRL ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_HS ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CNTRY ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）業務理由マスタ
		-- （従）会計理由マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_BIZ_RSN ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_RSN ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）港マスタ
		-- （従）国マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_EXIM_PORT ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CNTRY ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）取引マスタ
		-- （従）会計理由マスタ、伝票帳票マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_TRD ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_RSN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SLIP_FORM ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）ＩＦコードルールマスタ
		-- （従）外部システムマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_IF_CD_RULE ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXT_SYS ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）ＩＦコード変換マスタ
		-- （従）外部システムマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_IF_X ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXT_SYS ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）計算パタンマスタ
		-- （従）費目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_CALC_PTN ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXPNS ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）原価個別受払表マスタ
		-- （従）品目仕訳マスタ、品目分類マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_IO ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_JNL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_GRP ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）原価個別受払表項目マスタ
		-- （従）会計理由マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_IO_COL ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_RSN ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）原価レポート構成マスタ
		-- （従）配賦科目グループマスタ、配賦科目マスタ、会計理由マスタ、品目仕訳マスタ、品目分類マスタ、費目グループマスタ、費目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_RPT_CONF ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALC_AC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALC_AC ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_RSN ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_JNL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXPNS_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXPNS ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）配賦科目マスタ
		-- （従）配賦パタンマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ALC_AC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALC_PTN ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）原価品群マスタ
		-- （従）原価品群グループマスタ、品目仕訳マスタ、品目分類マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_CTG ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CTG_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_JNL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_GRP ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）原価品群構成マスタ
		-- （従）対象期間マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_CTG_CONFIG ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_TERM ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）原価部門マスタ
		-- （従）対象期間マスタ、部門階層マスタ、物流グループマスタ、製造場所グループマスタ、ワーキンググループマスタ、工場・物流倉庫マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_DPT ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_TERM ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_DPT_LVL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LG_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LOC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_WG ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SITE ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）原価部門構成マスタ
		-- （従）工程マスタ、対象期間マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_DPT_CONFIG ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_OPER ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_TERM ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）会計税対応マスタ
		-- （従）会計税マスタ、税マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_AC_TAX_MAP ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_TAX ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_TAX ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）会計税マスタ
		-- （従）勘定科目マスタ、補助勘定科目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_AC_TAX ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）自動仕訳マスタ
		-- （従）自動仕訳キーマスタ、自動仕訳パタン基本マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_AUTO_JNL ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AUTO_JNL_KEY ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_PTN_BASE ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）手形理由マスタ
		-- （従）勘定科目マスタ、補助勘定科目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_NOTE_RSN ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ACCOUNT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）会計伝票区分仕訳マスタ
		-- （従）仕訳実行マスタ、自動仕訳キーマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_SLIP_JNL ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_JNL_ACT ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AUTO_JNL_KEY ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）勘定科目マスタ
		-- （従）会計税マスタ、予備科目区分マスタ、補助勘定科目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ACCOUNT ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_TAX ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_SUBTYPEM ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SUB_ACCOUNT ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）与信限度額マスタ
		-- （従）通貨マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_CRED_CTRL ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CUR ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）工場・物流倉庫マスタ
		-- （従）製造場所グループマスタ、総量引当場所グループマスタ、物流グループマスタ、カレンダ基本マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_SITE ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LOC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALLOC_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_LG_GRP ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL_BASE ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）製造場所グループマスタ
		-- （従）ワーキンググループマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_LOC_GRP ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_WG ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）物流グループマスタ
		-- （従）ワーキンググループマスタ、カレンダ基本マスタ、倉庫事業者マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_LG_GRP ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_WG ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL_BASE ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SITE_CO ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）品目付加情報マスタ
		-- （従）ワーキンググループマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ATTACH_INFO ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_WG ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）販売計画品目マスタ
		-- （従）品目分類マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_SPLN_ITM ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ITM_GRP ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）決済方法マスタ
		-- （従）会計理由マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_STTL ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_AC_RSN ;
		P_MST_CHK(MAC_MST_SET_TYP.ALL_COM) ;

		-- （主）カレンダ基本マスタ、
		-- （従）カレンダマスタ、臨時カレンダマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_CAL_BASE ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_CAL_EXT ;
		P_MST_CHK(NULL) ;

		-- （主）ＨＳマスタ
		-- （従）ＨＳ分類マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_HS ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_HS_GRP ;
		P_MST_CHK(NULL) ;

		-- （主）仕様マスタ
		-- （従）仕様項目マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_SPEC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_SPEC_DESC ;
		P_MST_CHK(NULL) ;

		-- （主）原価費目マスタ
		-- （従）原価費目グループマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_EXPNS ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXPNS_GRP ;
		P_MST_CHK(NULL) ;

		-- （主）原価メニューマスタ
		-- （従）原価メニュー構成マスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_COST_MENU ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_MENU_CONFIG ;
		P_MST_CHK(NULL) ;

		-- （主）配賦科目マスタ
		-- （従）配賦科目グループマスタ、
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_ALC_AC ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_ALC_AC_GRP ;
		P_MST_CHK(NULL) ;

		-- （主）外部システムマスタ
		-- （従）ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタ
		L_LIST_MST_MAIN.DELETE ;
		cnt := 1 ;
		L_LIST_MST_MAIN(cnt) := MAC_MST_NM.MAM_EXT_SYS ;

		L_LIST_MST_SUB.DELETE ;
		cnt := 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_PROTOCOL ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_IF_ADAPTER ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_HTTP_HEADER ;
		cnt := cnt + 1 ;
		L_LIST_MST_SUB(cnt) := MAC_MST_NM.MAM_EXT_SYS_USR ;
		P_MST_CHK(NULL) ;


		L_LIST_MST_MAIN.DELETE ;
		L_LIST_MST_SUB.DELETE ;

	END P_MST_CTL_CHECK ;

	PROCEDURE P_MST_CTL_BATCH
	/*********************************************************
	<SYNOPSIS>
		マスタ制御情報に従ってマスタのビューを再定義する
	<REMARKS>
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_DBLINK_NM	MAPA_META.ORA_OBJ_NM%TYPE ;
	BEGIN
		SELECT	MIN(m.DBLINK_NM)
		INTO	L_DBLINK_NM
		FROM	MAM_MST_DBLINK m
		WHERE	0=0
		;

		FOR x IN (
			SELECT	m.MST_NM,
				m.MST_SET_TYP,
				m.LCL_FLG
			FROM	MAM_MST_CTL m
			)
		LOOP
			P_MST_CTL(x.MST_NM, x.MST_SET_TYP, x.LCL_FLG, L_DBLINK_NM) ;
		END LOOP ;

	END P_MST_CTL_BATCH ;
	PROCEDURE P_INS_BINARY (
		I_BIN	IN MAPA_META.BIN%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		バイナリデータを同期する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BIN
			バイナリＩＤ
	<HISTORY>
	**********************************************************/
	IS
		L_DBLINK_NM	MAPA_META.ORA_OBJ_NM%TYPE ;
		L_SQL_INS_BIN	VARCHAR2(10000) ;
		L_CNT		NUMBER ;
	BEGIN
		IF I_BIN IS NULL THEN
			RETURN ;
		END IF ;

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	USER_SYNONYMS t
		WHERE	0=0
		AND	t.SYNONYM_NAME = G_BIN_SEQ
		;

		IF L_CNT = 0 THEN
			RETURN ;
		END IF ;

		SELECT	MIN(m.DBLINK_NM)
		INTO	L_DBLINK_NM
		FROM	MAM_MST_DBLINK m
		WHERE	0=0
		;

		IF L_DBLINK_NM IS NULL THEN
			RETURN ;
		END IF ;

		L_SQL_INS_BIN := 'INSERT INTO FCT_BINARY@' || L_DBLINK_NM || ' SELECT * FROM FCT_BINARY t WHERE t.BID = :BID AND NOT EXISTS (SELECT 0 FROM FCT_BINARY@' || L_DBLINK_NM || ' x WHERE x.BID = t.BID)' ;
		EXECUTE IMMEDIATE L_SQL_INS_BIN USING IN I_BIN ;

	EXCEPTION
	WHEN OTHERS THEN
		NULL ;
	END P_INS_BINARY ;

	PROCEDURE P_GET_BINARY
	/*********************************************************
	<SYNOPSIS>
		バイナリデータを取得する
	<REMARKS>
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	IS
		L_DBLINK_NM	MAPA_META.ORA_OBJ_NM%TYPE ;
		L_SQL_GET_BIN	VARCHAR2(10000) ;
		L_CNT		NUMBER ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	USER_SYNONYMS t
		WHERE	0=0
		AND	t.SYNONYM_NAME = G_BIN_SEQ
		;

		IF L_CNT = 0 THEN
			RETURN ;
		END IF ;

		SELECT	MIN(m.DBLINK_NM)
		INTO	L_DBLINK_NM
		FROM	MAM_MST_DBLINK m
		WHERE	0=0
		;

		IF L_DBLINK_NM IS NULL THEN
			RETURN ;
		END IF ;

		L_SQL_GET_BIN := 'INSERT INTO FCT_BINARY SELECT * FROM FCT_BINARY@' || L_DBLINK_NM || ' t WHERE EXISTS (SELECT 0 FROM MAM_ITM_CMN_ m1 WHERE m1.TH_IMAGE = t.BID UNION ALL SELECT 0 FROM MAM_USR m2 WHERE m2.TH_IMAGE = t.BID) AND NOT EXISTS (SELECT 0 FROM FCT_BINARY x WHERE x.BID = t.BID)' ;
		EXECUTE IMMEDIATE L_SQL_GET_BIN ;

	EXCEPTION
	WHEN OTHERS THEN
		NULL ;
	END P_GET_BINARY ;

END MAPA_MASTER ;
/
