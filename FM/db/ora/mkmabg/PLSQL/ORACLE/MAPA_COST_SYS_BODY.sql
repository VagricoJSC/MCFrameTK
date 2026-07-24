CREATE OR REPLACE PACKAGE BODY MAPA_COST_SYS
IS
	PROCEDURE P_INIT_CALC_PARM (
		I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		原価計算パラメータの初期化
	<REMARKS>
		MGT_PARM_ALL、MGT_PARM_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_SQL	CONSTANT VARCHAR2(10000) := 
					'
					INSERT INTO MGT_PARM_ALL (
						CALC_GRP_CD,
						PARM_KEY,
						CO_CD,
						PARM_VAL
					) SELECT
						:CALC_GRP_CD,
						m.PARM_KEY,
						:CO_CD,
						m.PARM_VAL
					FROM
						MGT_PARM_DEF m
					' ;
	BEGIN
		P_DEL_CALC_PARM(I_CALC_GRP_CD, I_CO_CD) ;

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	(t.TABLE_NAME = 'MGT_PARM_ALL' OR t.TABLE_NAME = 'MGT_PARM_DEF')
		;

		IF L_CNT = 2 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CALC_GRP_CD, I_CO_CD ;
		END IF ;

	END P_INIT_CALC_PARM ;

	PROCEDURE P_DEL_CALC_PARM (
		I_CALC_GRP_CD	IN	MAPA_META.CALC_GRP_CD%TYPE,
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		原価計算パラメータの削除
	<REMARKS>
		MGT_PARM_ALLが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CALC_GRP_CD
			計算グループＣＤ
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_SQL	CONSTANT VARCHAR2(10000) := 
					'
					DELETE FROM MGT_PARM_ALL t
					WHERE	0=0
					AND	t.CALC_GRP_CD = :CALC_GRP_CD
					AND	t.CO_CD = :CO_CD
					' ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	t.TABLE_NAME = 'MGT_PARM_ALL'
		;

		IF L_CNT = 1 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CALC_GRP_CD, I_CO_CD ;
		END IF ;
	END P_DEL_CALC_PARM ;

	PROCEDURE P_INIT_NON_MOV_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		滞留制御情報を初期化する。
	<REMARKS>
		MGC_NON_MOV_CTL_ALL、MGC_NON_MOV_CTL_DEFが存在しない場合は
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
					INSERT INTO MGC_NON_MOV_CTL_ALL (
						IO_ACT_TYP,
						CO_CD,
						MEMO1,
						MEMO2,
						MEMO3
					) SELECT
						m.IO_ACT_TYP,
						:CO_CD,
						m.MEMO1,
						m.MEMO2,
						m.MEMO3
					FROM
						MGC_NON_MOV_CTL_DEF m
					' ;
	BEGIN
		P_DEL_NON_MOV_CTL(I_CO_CD) ;

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	(t.TABLE_NAME = 'MGC_NON_MOV_CTL_ALL' OR t.TABLE_NAME = 'MGC_NON_MOV_CTL_DEF')
		;

		IF L_CNT = 2 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD ;
		END IF ;

	END P_INIT_NON_MOV_CTL ;

	PROCEDURE P_DEL_NON_MOV_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		滞留制御情報を削除する。
	<REMARKS>
		MGC_NON_MOV_CTL_ALLが存在しない場合は
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
					DELETE FROM MGC_NON_MOV_CTL_ALL t
					WHERE	0=0
					AND	t.CO_CD = :CO_CD
					' ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	t.TABLE_NAME = 'MGC_NON_MOV_CTL_ALL'
		;

		IF L_CNT = 1 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD ;
		END IF ;
	END P_DEL_NON_MOV_CTL ;
	PROCEDURE P_INS_NON_MOV_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MGC_NON_MOV_CTL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MGC_NON_MOV_CTL_ALL、MGC_NON_MOV_CTL_DEFが存在しない場合は
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
					INSERT INTO MGC_NON_MOV_CTL_ALL (
						IO_ACT_TYP,
						CO_CD,
						MEMO1,
						MEMO2,
						MEMO3
					) SELECT
						m.IO_ACT_TYP,
						:CO_CD1,
						m.MEMO1,
						m.MEMO2,
						m.MEMO3
					FROM
						MGC_NON_MOV_CTL_DEF m
					WHERE	0=0
					AND	NOT EXISTS (
							SELECT	m.IO_ACT_TYP
							FROM	MGC_NON_MOV_CTL_ALL x
							WHERE	0=0
							AND	x.IO_ACT_TYP = m.IO_ACT_TYP
							AND	x.CO_CD = :CO_CD2
						)
					' ;
	BEGIN
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM 	USER_TABLES t
		WHERE	0=0
		AND	(t.TABLE_NAME = 'MGC_NON_MOV_CTL_ALL' OR t.TABLE_NAME = 'MGC_NON_MOV_CTL_DEF')
		;

		IF L_CNT = 2 THEN
			EXECUTE IMMEDIATE L_SQL USING IN I_CO_CD, I_CO_CD ;
		END IF ;

	END P_INS_NON_MOV_CTL ;
END MAPA_COST_SYS ;
/
