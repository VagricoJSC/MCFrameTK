CREATE OR REPLACE PACKAGE BODY MBPA_BULK_IMP
IS
	PROCEDURE P_DEL_BULK_IMP (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MBC_BULK_IMP_CTG_ALL、MBC_BULK_IMP_CTL_ALL、
		MBC_BULK_IMP_CTG_LCL_ALL、MBC_BULK_IMP_CTL_LCL_ALLから引数の会社ＣＤに対応するデータを削除する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		DELETE FROM MBC_BULK_IMP_CTL_ALL m WHERE m.CO_CD = I_CO_CD ;
		DELETE FROM MBC_BULK_IMP_CTG_ALL m WHERE m.CO_CD = I_CO_CD ;
		DELETE FROM MBC_BULK_IMP_CTL_LCL_ALL m WHERE m.CO_CD = I_CO_CD ;
		DELETE FROM MBC_BULK_IMP_CTG_LCL_ALL m WHERE m.CO_CD = I_CO_CD ;

	END P_DEL_BULK_IMP ;

	PROCEDURE P_INIT_BULK_IMP (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MBC_BULK_IMP_CTG_ALL、MBC_BULK_IMP_CTL_ALL、
		MBC_BULK_IMP_CTG_LCL_ALL、MBC_BULK_IMP_CTL_LCL_ALLに引数の会社ＣＤの初期データを作成する。
	<REMARKS>
		MBC_BULK_IMP_CTG_DEF、MBC_BULK_IMP_CTL_DEF、
		MBC_BULK_IMP_CTG_LCL_DEF、MBC_BULK_IMP_CTL_LCL_DEFをもとに作成する
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		P_DEL_BULK_IMP(I_CO_CD) ;

		INSERT INTO MBC_BULK_IMP_CTG_ALL (
			TABLE_CTG,
			TABLE_CTG_NM,
			TABLE_CTG_SEQ,
			CO_CD
			)
		SELECT	m.TABLE_CTG,
			m.TABLE_CTG_NM,
			m.TABLE_CTG_SEQ,
			I_CO_CD
		FROM	MBC_BULK_IMP_CTG_DEF m
		WHERE	0=0
		;

		INSERT INTO MBC_BULK_IMP_CTL_ALL (
			TABLE_ID,
			TABLE_NM,
			TABLE_CTG,
			DB_CLASS_PATH,
			CHK_OPE,
			UPD_OPE,
			TABLE_SEQ,
			CO_CD
			)
		SELECT	m.TABLE_ID,
			m.TABLE_NM,
			m.TABLE_CTG,
			m.DB_CLASS_PATH,
			m.CHK_OPE,
			m.UPD_OPE,
			m.TABLE_SEQ,
			I_CO_CD
		FROM	MBC_BULK_IMP_CTL_DEF m
		WHERE	0=0
		;

		--上記のinsertではロケール別テーブルに常にja_JPの名称が設定されることを想定している
		--FCM_CO_ALLの標準ロケールにen_USが設定されているとロケール別テーブルのLCL_CDにen_USが設定される
		IF FCPA_CONTEXT.F_GET_DEF_LOCALE_CD <> 'ja_JP' THEN
			UPDATE	MBC_BULK_IMP_CTG_LCL_ALL m
			SET	m.LCL_CD = 'ja_JP'
			WHERE	0=0
			AND	m.LCL_CD = FCPA_CONTEXT.F_GET_DEF_LOCALE_CD
			AND	m.CO_CD = I_CO_CD
			;

			UPDATE	MBC_BULK_IMP_CTL_LCL_ALL m
			SET	m.LCL_CD = 'ja_JP'
			WHERE	0=0
			AND	m.LCL_CD = FCPA_CONTEXT.F_GET_DEF_LOCALE_CD
			AND	m.CO_CD = I_CO_CD
			;
		END IF;

		INSERT INTO MBC_BULK_IMP_CTG_LCL_ALL (
			TABLE_CTG,
			TABLE_CTG_NM,
			LCL_CD,
			CO_CD
			)
		SELECT	m.TABLE_CTG,
			m.TABLE_CTG_NM,
			m.LCL_CD,
			I_CO_CD
		FROM	MBC_BULK_IMP_CTG_LCL_DEF m
		WHERE	0=0
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MBC_BULK_IMP_CTG_LCL_ALL x
				WHERE	0=0
				AND	x.TABLE_CTG = m.TABLE_CTG
				AND	x.LCL_CD = m.LCL_CD
				AND	x.CO_CD = I_CO_CD
			)
		;

		INSERT INTO MBC_BULK_IMP_CTL_LCL_ALL (
			TABLE_ID,
			TABLE_NM,
			LCL_CD,
			CO_CD
			)
		SELECT	m.TABLE_ID,
			m.TABLE_NM,
			m.LCL_CD,
			I_CO_CD
		FROM	MBC_BULK_IMP_CTL_LCL_DEF m
		WHERE	0=0
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MBC_BULK_IMP_CTL_LCL_ALL x
				WHERE	0=0
				AND	x.TABLE_ID = m.TABLE_ID
				AND	x.LCL_CD = m.LCL_CD
				AND	x.CO_CD = I_CO_CD
			)
		;

	END P_INIT_BULK_IMP ;

	PROCEDURE P_INS_BULK_IMP (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	)
	/*********************************************************
	<SYNOPSIS>
		MBC_BULK_IMP_CTG_ALL、MBC_BULK_IMP_CTL_ALL、
		MBC_BULK_IMP_CTG_LCL_ALL、MBC_BULK_IMP_CTL_LCL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MBC_BULK_IMP_CTG_DEF、MBC_BULK_IMP_CTL_DEF、
		MBC_BULK_IMP_CTG_LCL_DEF、MBC_BULK_IMP_CTL_LCL_DEFをもとに作成する
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	IS
	BEGIN
		INSERT INTO MBC_BULK_IMP_CTG_ALL (
			TABLE_CTG,
			TABLE_CTG_NM,
			TABLE_CTG_SEQ,
			CO_CD
			)
		SELECT	m.TABLE_CTG,
			m.TABLE_CTG_NM,
			m.TABLE_CTG_SEQ,
			I_CO_CD
		FROM	MBC_BULK_IMP_CTG_DEF m
		WHERE	0=0
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MBC_BULK_IMP_CTG_ALL x
				WHERE	0=0
				AND	x.TABLE_CTG = m.TABLE_CTG
				AND	x.CO_CD = I_CO_CD
			)
		;

		INSERT INTO MBC_BULK_IMP_CTL_ALL (
			TABLE_ID,
			TABLE_NM,
			TABLE_CTG,
			DB_CLASS_PATH,
			CHK_OPE,
			UPD_OPE,
			TABLE_SEQ,
			CO_CD
			)
		SELECT	m.TABLE_ID,
			m.TABLE_NM,
			m.TABLE_CTG,
			m.DB_CLASS_PATH,
			m.CHK_OPE,
			m.UPD_OPE,
			m.TABLE_SEQ,
			I_CO_CD
		FROM	MBC_BULK_IMP_CTL_DEF m
		WHERE	0=0
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MBC_BULK_IMP_CTL_ALL x
				WHERE	0=0
				AND	x.TABLE_ID = m.TABLE_ID
				AND	x.CO_CD = I_CO_CD
			)
		;

		--上記のinsertではロケール別テーブルに常にja_JPの名称が設定されることを想定している
		--FCM_CO_ALLの標準ロケールにen_USが設定されているとロケール別テーブルのLCL_CDにen_USが設定される
		IF FCPA_CONTEXT.F_GET_DEF_LOCALE_CD <> 'ja_JP' THEN
			UPDATE	MBC_BULK_IMP_CTG_LCL_ALL m
			SET	m.LCL_CD = 'ja_JP'
			WHERE	0=0
			AND	m.LCL_CD = FCPA_CONTEXT.F_GET_DEF_LOCALE_CD
			AND	m.CO_CD = I_CO_CD
			AND	1 = (
					SELECT	COUNT(*)
					FROM	MBC_BULK_IMP_CTG_LCL_ALL x
					WHERE	0=0
					AND	x.TABLE_CTG = m.TABLE_CTG
					AND	x.LCL_CD = m.LCL_CD
					AND	x.CO_CD = I_CO_CD
				)
			;

			UPDATE	MBC_BULK_IMP_CTL_LCL_ALL m
			SET	m.LCL_CD = 'ja_JP'
			WHERE	0=0
			AND	m.LCL_CD = FCPA_CONTEXT.F_GET_DEF_LOCALE_CD
			AND	m.CO_CD = I_CO_CD
			AND	1 = (
					SELECT	COUNT(*)
					FROM	MBC_BULK_IMP_CTL_LCL_ALL x
					WHERE	0=0
					AND	x.TABLE_ID = m.TABLE_ID
					AND	x.LCL_CD = m.LCL_CD
					AND	x.CO_CD = I_CO_CD
				)
			;
		END IF;

		INSERT INTO MBC_BULK_IMP_CTG_LCL_ALL (
			TABLE_CTG,
			TABLE_CTG_NM,
			LCL_CD,
			CO_CD
			)
		SELECT	m.TABLE_CTG,
			m.TABLE_CTG_NM,
			m.LCL_CD,
			I_CO_CD
		FROM	MBC_BULK_IMP_CTG_LCL_DEF m
		WHERE	0=0
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MBC_BULK_IMP_CTG_LCL_ALL x
				WHERE	0=0
				AND	x.TABLE_CTG = m.TABLE_CTG
				AND	x.LCL_CD = m.LCL_CD
				AND	x.CO_CD = I_CO_CD
			)
		;

		INSERT INTO MBC_BULK_IMP_CTL_LCL_ALL (
			TABLE_ID,
			TABLE_NM,
			LCL_CD,
			CO_CD
			)
		SELECT	m.TABLE_ID,
			m.TABLE_NM,
			m.LCL_CD,
			I_CO_CD
		FROM	MBC_BULK_IMP_CTL_LCL_DEF m
		WHERE	0=0
		AND	NOT EXISTS (
				SELECT	'X'
				FROM	MBC_BULK_IMP_CTL_LCL_ALL x
				WHERE	0=0
				AND	x.TABLE_ID = m.TABLE_ID
				AND	x.LCL_CD = m.LCL_CD
				AND	x.CO_CD = I_CO_CD
			)
		;

	END P_INS_BULK_IMP ;

END MBPA_BULK_IMP ;
/
