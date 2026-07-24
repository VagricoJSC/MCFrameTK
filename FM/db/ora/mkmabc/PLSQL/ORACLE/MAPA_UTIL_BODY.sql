CREATE OR REPLACE PACKAGE BODY MAPA_UTIL
IS
	FUNCTION F_GET_DEF_GD_CD 
	RETURN MAPA_META.STK_GD_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		デフォルト格付ＣＤの取得
	<REMARKS>
		格付マスタからデフォルトの格付ＣＤを取得する
	<ARGUMENTS>
	<RETURN VALUE>
		格付ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_GD_CD		MAPA_META.STK_GD_CD%TYPE ;
	BEGIN
		L_GD_CD := NULL ;
		FOR x IN (
			SELECT	m.GD_CD
			FROM	MAM_STK_GD m
			WHERE	0=0
				AND m.DEL_FLG = '0' -- このユーティリティは検索処理からも呼ばれる場合があるため、論理削除ＦＬＧを条件に加える
			ORDER BY m.SORT_SEQ, m.GD_CD
			)
		LOOP
			L_GD_CD := x.GD_CD ;
			EXIT ;
		END LOOP ;

		IF L_GD_CD IS NULL THEN
			FCPA_ERR.RAISE_APP_ERR('MAUCD0019') ;
		END IF ;

		RETURN L_GD_CD ;

	END F_GET_DEF_GD_CD ;

	FUNCTION F_GET_DEF_TRD_CD (
		I_TRD_PTN_TYP IN MAPA_META.TRD_PTN_TYP%TYPE
	)
	RETURN MAPA_META.TRD_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		取引パタン区分に対するデフォルト取引ＣＤの取得
	<REMARKS>
		取引パタン区分に対して自動時採用ＦＬＧが
		設定されている取引ＣＤを取得する
	<ARGUMENTS>
	<IN>	I_TRD_PTN_TYP
			取引パタン区分
	<RETURN VALUE>
		格付ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_MSG		FCPA_ERR.MSG_BINDER ;
		L_TRD_CD	MAPA_META.TRD_CD%TYPE ;
	BEGIN
		L_TRD_CD := NULL ;
		FOR x IN (
			SELECT	m.TRD_CD
			FROM	MAM_TRD m
			WHERE	0=0
			AND m.TRD_PTN_TYP = I_TRD_PTN_TYP
			AND	m.AUTO_ADOPT_FLG = '1'
			AND	m.DEL_FLG = '0' -- このユーティリティは検索処理からも呼ばれる場合があるため、論理削除ＦＬＧを条件に加える
			ORDER BY m.TRD_CD
			)
		LOOP
			L_TRD_CD := x.TRD_CD ;
			EXIT ;
		END LOOP ;

		IF L_TRD_CD IS NULL THEN
			L_MSG := FCPA_ERR.MSG_BINDER(I_TRD_PTN_TYP) ;
			FCPA_ERR.RAISE_APP_ERR('MAUCD0020', L_MSG) ;
		END IF ;

		RETURN L_TRD_CD ;

	END F_GET_DEF_TRD_CD ;

	FUNCTION F_GET_SLO_XPNS_PURC_RSN_CD
	RETURN MAPA_META.BIZ_RSN_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		受注紐付の経費購買で使用する業務理由ＣＤの取得
	<REMARKS>
		受注紐付経費購買ＦＬＧが設定されている業務理由ＣＤを取得する
	<ARGUMENTS>
	<RETURN VALUE>
		業務理由ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_BIZ_RSN_CD		MAPA_META.BIZ_RSN_CD%TYPE ;
	BEGIN
		L_BIZ_RSN_CD := NULL ;
		FOR x IN (
			SELECT	m.BIZ_RSN_CD
			FROM	MAM_BIZ_RSN m
			WHERE	0=0
			AND	m.SLO_XPNS_PURC_FLG = '1'
			ORDER BY m.BIZ_RSN_CD
			)
		LOOP
			L_BIZ_RSN_CD := x.BIZ_RSN_CD ;
			EXIT ;
		END LOOP ;

		RETURN L_BIZ_RSN_CD ;

	END F_GET_SLO_XPNS_PURC_RSN_CD ;

	FUNCTION F_GET_FXD_LOSS_RSN_CD
	RETURN MAPA_META.BIZ_RSN_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		固定ロスで使用する業務理由ＣＤの取得
	<REMARKS>
		固定ロスＦＬＧが設定されている業務理由ＣＤを取得する
	<ARGUMENTS>
	<RETURN VALUE>
		業務理由ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_BIZ_RSN_CD		MAPA_META.BIZ_RSN_CD%TYPE ;
	BEGIN
		L_BIZ_RSN_CD := NULL ;
		FOR x IN (
			SELECT	m.BIZ_RSN_CD
			FROM	MAM_BIZ_RSN m
			WHERE	0=0
			AND	m.FXD_LOSS_FLG = '1'
			ORDER BY m.BIZ_RSN_CD
			)
		LOOP
			L_BIZ_RSN_CD := x.BIZ_RSN_CD ;
			EXIT ;
		END LOOP ;

		IF L_BIZ_RSN_CD IS NULL THEN
			FCPA_ERR.RAISE_APP_ERR('MAUCD0021') ;
		END IF ;

		RETURN L_BIZ_RSN_CD ;

	END F_GET_FXD_LOSS_RSN_CD ;

END MAPA_UTIL ;
/
