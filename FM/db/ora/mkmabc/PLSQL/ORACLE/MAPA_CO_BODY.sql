CREATE OR REPLACE PACKAGE BODY MAPA_CO
IS
	FUNCTION F_GET_CO_REC
	RETURN MAM_CO%ROWTYPE
	/*********************************************************
	<SYNOPSIS>
		会社マスタのレコードを返す
	<REMARKS>
	<ARGUMENTS>
	<RETURN VALUE>
		会社マスタのレコード
	<HISTORY>
	**********************************************************/
	IS
		L_CO MAM_CO%ROWTYPE ;
	BEGIN
		BEGIN 
			SELECT	m.*
			INTO	L_CO
			FROM	MAM_CO m
			WHERE	0=0
			;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				FCPA_ERR.RAISE_APP_ERR('MAUCD0016') ;
		END ;

		RETURN L_CO ;

	END F_GET_CO_REC ;

	PROCEDURE P_DEL_SYS_PARM (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MAM_SYS_PARM_ALLから引数の会社ＣＤに対応するデータを削除する。
	<REMARKS>
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		DELETE FROM MAM_SYS_PARM_ALL m WHERE m.CO_CD = I_CO_CD ;

	END P_DEL_SYS_PARM ;

	PROCEDURE P_INIT_SYS_PARM (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MAM_SYS_PARM_ALLに引数の会社ＣＤの初期データを作成する。
	<REMARKS>
		MAM_SYS_PARM_DEFをもとに作成する
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		P_DEL_SYS_PARM(I_CO_CD) ;
		INSERT INTO MAM_SYS_PARM_ALL (
			PARM_KEY,
			PARM_VAL,
			MEMO1,
			MEMO2,
			MEMO3,
			DEL_FLG,
			CO_CD
			)
		SELECT	m.PARM_KEY,
			m.PARM_VAL,
			m.MEMO1,
			m.MEMO2,
			m.MEMO3,
			m.DEL_FLG,
			I_CO_CD
		FROM	MAM_SYS_PARM_DEF m
		WHERE	0=0
		;

	END P_INIT_SYS_PARM ;

	PROCEDURE P_DEL_GP_BATCH_GRP (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		FCM_GP_BATCH_GRP_ALL、FCM_GP_BATCH_GRP_LCL_ALLから引数の会社ＣＤに対応するデータを削除する。
	<REMARKS>
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		DELETE FROM FCM_GP_BATCH_GRP_ALL m WHERE m.CO_CD = I_CO_CD ;
		DELETE FROM FCM_GP_BATCH_GRP_LCL_ALL m WHERE m.CO_CD = I_CO_CD ;

	END P_DEL_GP_BATCH_GRP ;

	PROCEDURE P_INIT_GP_BATCH_GRP (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		FCM_GP_BATCH_GRP_ALL、FCM_GP_BATCH_GRP_LCL_ALLに引数の会社ＣＤの初期データを作成する。
	<REMARKS>
		MAM_GP_BATCH_GRP_DEFをもとに作成する
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		P_DEL_GP_BATCH_GRP(I_CO_CD) ;
		INSERT INTO FCM_GP_BATCH_GRP_ALL (
			GP_BATCH_GRP_CD,
			GP_BATCH_GRP_NM,
			CO_CD
			)
		SELECT	m.GP_BATCH_GRP_CD,
			m.GP_BATCH_GRP_NM,
			I_CO_CD
		FROM	MAM_GP_BATCH_GRP_DEF m
		WHERE	0=0
		AND	m.DEL_FLG = '0'
		AND	m.LCL_CD = (SELECT NVL(MIN(w.DEF_LOCALE_CD), 'ja_JP') FROM FCM_CO_ALL w WHERE w.CO_CD = I_CO_CD)
		;

		INSERT INTO FCM_GP_BATCH_GRP_LCL_ALL (
			GP_BATCH_GRP_CD,
			GP_BATCH_GRP_NM,
			LCL_CD,
			CO_CD
			)
		SELECT	m.GP_BATCH_GRP_CD,
			m.GP_BATCH_GRP_NM,
			m.LCL_CD,
			I_CO_CD
		FROM	MAM_GP_BATCH_GRP_DEF m
		WHERE	0=0
		AND	m.DEL_FLG = '0'
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	FCM_GP_BATCH_GRP_LCL_ALL x
				WHERE	0=0
				AND	x.GP_BATCH_GRP_CD = m.GP_BATCH_GRP_CD
				AND	x.LCL_CD = m.LCL_CD
				AND	x.CO_CD = I_CO_CD
			)
		;

	END P_INIT_GP_BATCH_GRP ;
	PROCEDURE P_INS_SYS_PARM (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MAM_SYS_PARM_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MAM_SYS_PARM_DEFをもとに作成する
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		INSERT INTO MAM_SYS_PARM_ALL (
			PARM_KEY,
			PARM_VAL,
			MEMO1,
			MEMO2,
			MEMO3,
			DEL_FLG,
			CO_CD
			)
		SELECT	m.PARM_KEY,
			m.PARM_VAL,
			m.MEMO1,
			m.MEMO2,
			m.MEMO3,
			m.DEL_FLG,
			I_CO_CD
		FROM	MAM_SYS_PARM_DEF m
		WHERE	0=0
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MAM_SYS_PARM_ALL x
				WHERE	0=0
				AND	x.PARM_KEY = m.PARM_KEY
				AND	x.CO_CD = I_CO_CD
			)
		;

	END P_INS_SYS_PARM ;

	PROCEDURE P_INS_GP_BATCH_GRP (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		FCM_GP_BATCH_GRP_ALL、FCM_GP_BATCH_GRP_LCL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MAM_GP_BATCH_GRP_DEFをもとに作成する
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		INSERT INTO FCM_GP_BATCH_GRP_ALL (
			GP_BATCH_GRP_CD,
			GP_BATCH_GRP_NM,
			CO_CD
			)
		SELECT	m.GP_BATCH_GRP_CD,
			m.GP_BATCH_GRP_NM,
			I_CO_CD
		FROM	MAM_GP_BATCH_GRP_DEF m
		WHERE	0=0
		AND	m.DEL_FLG = '0'
		AND	m.LCL_CD = (SELECT NVL(MIN(w.DEF_LOCALE_CD), 'ja_JP') FROM FCM_CO_ALL w WHERE w.CO_CD = I_CO_CD)
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	FCM_GP_BATCH_GRP_ALL x
				WHERE	0=0
				AND	x.GP_BATCH_GRP_CD = m.GP_BATCH_GRP_CD
				AND	x.CO_CD = I_CO_CD
			)
		;

		INSERT INTO FCM_GP_BATCH_GRP_LCL_ALL (
			GP_BATCH_GRP_CD,
			GP_BATCH_GRP_NM,
			LCL_CD,
			CO_CD
			)
		SELECT	m.GP_BATCH_GRP_CD,
			m.GP_BATCH_GRP_NM,
			m.LCL_CD,
			I_CO_CD
		FROM	MAM_GP_BATCH_GRP_DEF m
		WHERE	0=0
		AND	m.DEL_FLG = '0'
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	FCM_GP_BATCH_GRP_LCL_ALL x
				WHERE	0=0
				AND	x.GP_BATCH_GRP_CD = m.GP_BATCH_GRP_CD
				AND	x.LCL_CD = m.LCL_CD
				AND	x.CO_CD = I_CO_CD
			)
		;

	END P_INS_GP_BATCH_GRP ;

	PROCEDURE P_INS_DEF_ALL
	/*********************************************************
	<SYNOPSIS>
		すべての会社にバッチ処理グループ、システムパラメータ、滞留制御情報、発番パタン、在庫分析制御情報、滞留予定制御情報の差分追加を行う。
	<REMARKS>
		以下の処理を実行する
		MAPA_CO.P_INS_SYS_PARM
		MAPA_CO.P_INS_GP_BATCH_GRP
		MAPA_COST_SYS.P_INS_NON_MOV_CTL
		MAPA_NUM.P_INS_NUM_PTN
		MAPA_CO.P_INS_STK_ANLY_CTL
		MAPA_CO.P_INS_NON_MOV_SCHD_CTL
	<ARGUMENTS>
	<ITEM>
	<HISTORY>
	**********************************************************/
	IS
		L_SQL1 CONSTANT VARCHAR2(10000) := 
				'
				BEGIN MAPA_CO.P_INS_SYS_PARM(:CO_CD) ; END;
				' ;
		L_SQL2 CONSTANT VARCHAR2(10000) := 
				'
				BEGIN MAPA_CO.P_INS_GP_BATCH_GRP(:CO_CD) ; END;
				' ;
		L_SQL3 CONSTANT VARCHAR2(10000) := 
				'
				BEGIN MAPA_COST_SYS.P_INS_NON_MOV_CTL(:CO_CD) ; END;
				' ;
		L_SQL4 CONSTANT VARCHAR2(10000) := 
				'
				BEGIN MAPA_NUM.P_INS_NUM_PTN(:CO_CD) ; END;
				' ;
		L_SQL5 CONSTANT VARCHAR2(10000) := 
				'
				BEGIN MAPA_CO.P_INS_STK_ANLY_CTL(:CO_CD) ; END;
				' ;
		L_SQL6 CONSTANT VARCHAR2(10000) := 
				'
				BEGIN MAPA_CO.P_INS_NON_MOV_SCHD_CTL(:CO_CD) ; END;
				' ;
	BEGIN
		FOR x IN (
			SELECT	m.CO_CD
			FROM	MAM_CO_ALL m
			WHERE	0=0
			)
		LOOP
			FCPA_CONTEXT.SET_CO_CD(x.CO_CD) ;
			EXECUTE IMMEDIATE L_SQL1 USING IN x.CO_CD ;
			EXECUTE IMMEDIATE L_SQL2 USING IN x.CO_CD ;
			EXECUTE IMMEDIATE L_SQL3 USING IN x.CO_CD ;
			EXECUTE IMMEDIATE L_SQL4 USING IN x.CO_CD ;
			EXECUTE IMMEDIATE L_SQL5 USING IN x.CO_CD ;
			EXECUTE IMMEDIATE L_SQL6 USING IN x.CO_CD ;
		END LOOP ;

	END P_INS_DEF_ALL ;
	PROCEDURE P_CLEAR_PUSH_NTC (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE DEFAULT NULL,
		I_TS	IN	MAPA_META.SYS_TS%TYPE DEFAULT NULL
	)
	/*********************************************************
	<SYNOPSIS>
		プッシュ通知関連のデータを削除する。
		会社を指定しない場合はすべての会社のデータを削除する。
		日時を指定した場合は指定した日時以前に登録されたデータを削除する。
		日時を指定しない場合はすべての日時のデータを削除する。
	<REMARKS>
		以下のテーブルを削除する
		MAT_PUSH_NTC_H_ALL
		MAT_PUSH_NTC_MSG_ALL
		MAT_PUSH_NTC_TRANS_ALL
		MAT_PUSH_NTC_USR_ALL
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<ITEM>	I_TS
			日時
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		DELETE	MAT_PUSH_NTC_H_ALL t 
		WHERE	0=0
		AND	(I_CO_CD IS NULL OR t.CO_CD = I_CO_CD)
		AND	(I_TS IS NULL OR t.INS_TS <= I_TS)
		;

		DELETE	MAT_PUSH_NTC_MSG_ALL t 
		WHERE	0=0
		AND	(I_CO_CD IS NULL OR t.CO_CD = I_CO_CD)
		AND	(I_TS IS NULL OR t.INS_TS <= I_TS)
		;

		DELETE	MAT_PUSH_NTC_TRANS_ALL t 
		WHERE	0=0
		AND	(I_CO_CD IS NULL OR t.CO_CD = I_CO_CD)
		AND	(I_TS IS NULL OR t.INS_TS <= I_TS)
		;

		DELETE	MAT_PUSH_NTC_USR_ALL t 
		WHERE	0=0
		AND	(I_CO_CD IS NULL OR t.CO_CD = I_CO_CD)
		AND	(I_TS IS NULL OR t.INS_TS <= I_TS)
		;
	END P_CLEAR_PUSH_NTC ;

	PROCEDURE P_INIT_STK_ANLY_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		在庫分析制御情報を初期化する。
	<REMARKS>
		MSC_STK_ANLY_CTL_ALL、MSC_STK_ANLY_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_SQL	CONSTANT VARCHAR2(10000) := 
					'
					INSERT INTO MSC_STK_ANLY_CTL_ALL (
						IO_ACT_TYP,
						CTL_TGT_TYP,
						CO_CD,
						MEMO1,
						MEMO2,
						MEMO3
					) SELECT
						m.IO_ACT_TYP,
						m.CTL_TGT_TYP,
						:CO_CD,
						m.MEMO1,
						m.MEMO2,
						m.MEMO3
					FROM
						MSC_STK_ANLY_CTL_DEF m
					' ;
	BEGIN
		P_DEL_STK_ANLY_CTL(I_CO_CD) ;

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	(t.TABLE_NAME = 'MSC_STK_ANLY_CTL_ALL' OR t.TABLE_NAME = 'MSC_STK_ANLY_CTL_DEF')
		;

		IF L_CNT = 2 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD ;
		END IF ;

	END P_INIT_STK_ANLY_CTL ;

	PROCEDURE P_DEL_STK_ANLY_CTL (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		在庫分析制御情報を削除する。
	<REMARKS>
		MSC_STK_ANLY_CTL_ALLが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_SQL	CONSTANT VARCHAR2(10000) := 
					'
					DELETE FROM MSC_STK_ANLY_CTL_ALL t
					WHERE	0=0
					AND	t.CO_CD = :CO_CD
					' ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	t.TABLE_NAME = 'MSC_STK_ANLY_CTL_ALL'
		;

		IF L_CNT = 1 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD ;
		END IF ;
	END P_DEL_STK_ANLY_CTL ;

	PROCEDURE P_INS_STK_ANLY_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MSC_STK_ANLY_CTL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MSC_STK_ANLY_CTL_ALL、MSC_STK_ANLY_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_SQL	CONSTANT VARCHAR2(10000) := 
					'
					INSERT INTO MSC_STK_ANLY_CTL_ALL (
						IO_ACT_TYP,
						CTL_TGT_TYP,
						CO_CD,
						MEMO1,
						MEMO2,
						MEMO3
					) SELECT
						m.IO_ACT_TYP,
						m.CTL_TGT_TYP,
						:CO_CD1,
						m.MEMO1,
						m.MEMO2,
						m.MEMO3
					FROM
						MSC_STK_ANLY_CTL_DEF m
					WHERE	0=0
					AND	NOT EXISTS (
							SELECT	m.IO_ACT_TYP,
									m.CTL_TGT_TYP
							FROM	MSC_STK_ANLY_CTL_ALL x
							WHERE	0=0
							AND	x.IO_ACT_TYP = m.IO_ACT_TYP
							AND	x.CTL_TGT_TYP = m.CTL_TGT_TYP
							AND	x.CO_CD = :CO_CD2
						)
					' ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	(t.TABLE_NAME = 'MSC_STK_ANLY_CTL_ALL' OR t.TABLE_NAME = 'MSC_STK_ANLY_CTL_DEF')
		;

		IF L_CNT = 2 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD, I_CO_CD ;
		END IF ;

	END P_INS_STK_ANLY_CTL ;

	PROCEDURE P_INIT_NON_MOV_SCHD_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		滞留予定制御情報を初期化する。
	<REMARKS>
		MSC_NON_MOV_SCHD_CTL_ALL、MSC_NON_MOV_SCHD_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_SQL	CONSTANT VARCHAR2(10000) := 
					'
					INSERT INTO MSC_NON_MOV_SCHD_CTL_ALL (
						IO_SCHD_TYP,
						CO_CD,
						MEMO1,
						MEMO2,
						MEMO3
					) SELECT
						m.IO_SCHD_TYP,
						:CO_CD,
						m.MEMO1,
						m.MEMO2,
						m.MEMO3
					FROM
						MSC_NON_MOV_SCHD_CTL_DEF m
					' ;
	BEGIN
		P_DEL_NON_MOV_SCHD_CTL(I_CO_CD) ;

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	(t.TABLE_NAME = 'MSC_NON_MOV_SCHD_CTL_ALL' OR t.TABLE_NAME = 'MSC_NON_MOV_SCHD_CTL_DEF')
		;

		IF L_CNT = 2 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD ;
		END IF ;

	END P_INIT_NON_MOV_SCHD_CTL ;

	PROCEDURE P_DEL_NON_MOV_SCHD_CTL (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		滞留予定情報を削除する。
	<REMARKS>
		MSC_NON_MOV_SCHD_CTL_ALLが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_SQL	CONSTANT VARCHAR2(10000) := 
					'
					DELETE FROM MSC_NON_MOV_SCHD_CTL_ALL t
					WHERE	0=0
					AND	t.CO_CD = :CO_CD
					' ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	t.TABLE_NAME = 'MSC_NON_MOV_SCHD_CTL_ALL'
		;

		IF L_CNT = 1 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD ;
		END IF ;
	END P_DEL_NON_MOV_SCHD_CTL ;

	PROCEDURE P_INS_NON_MOV_SCHD_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MSC_NON_MOV_SCHD_CTL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MSC_NON_MOV_SCHD_CTL_ALL、MSC_NON_MOV_SCHD_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_SQL	CONSTANT VARCHAR2(10000) := 
					'
					INSERT INTO MSC_NON_MOV_SCHD_CTL_ALL (
						IO_SCHD_TYP,
						CO_CD,
						MEMO1,
						MEMO2,
						MEMO3
					) SELECT
						m.IO_SCHD_TYP,
						:CO_CD1,
						m.MEMO1,
						m.MEMO2,
						m.MEMO3
					FROM
						MSC_NON_MOV_SCHD_CTL_DEF m
					WHERE	0=0
					AND	NOT EXISTS (
							SELECT	m.IO_SCHD_TYP
							FROM	MSC_NON_MOV_SCHD_CTL_ALL x
							WHERE	0=0
							AND	x.IO_SCHD_TYP = m.IO_SCHD_TYP
							AND	x.CO_CD = :CO_CD2
						)
					' ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	(t.TABLE_NAME = 'MSC_NON_MOV_SCHD_CTL_ALL' OR t.TABLE_NAME = 'MSC_NON_MOV_SCHD_CTL_DEF')
		;

		IF L_CNT = 2 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD, I_CO_CD ;
		END IF ;

	END P_INS_NON_MOV_SCHD_CTL ;

END MAPA_CO ;
/
