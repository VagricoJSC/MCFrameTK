SET SQLBLANKLINES ON

CREATE OR REPLACE PACKAGE MAPA_LOC
/*********************************************************
<SYNOPSIS>
		場所関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	FUNCTION F_GET_IN_LOC (
		I_ITM_CD IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1 IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2 IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3 IN MAPA_META.ITM_SUB3%TYPE,
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE
	) RETURN MAPA_META.LOC_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			投入指定場所ＣＤを取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOC_CD
			製造場所ＣＤ
	<RETURNVALUE>
		品目ＣＤ、枝番１～３、製造場所ＣＤより取得した投入指定場所ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_ASST_DPT_CD_NE (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから資産管理部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<IN>	I_NO_CHK_FLG
			部門有効確認不要ＦＬＧ
	<RETURNVALUE>
		場所ＣＤ、マスタ適用日から取得した資産管理部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_ASST_DPT_CD (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから資産管理部門ＣＤを取得する
	<REMARKS>
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		場所ＣＤ、マスタ適用日から取得した資産管理部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_DPT_CD_NE (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<IN>	I_NO_CHK_FLG
			部門有効確認不要ＦＬＧ
	<RETURNVALUE>
		場所ＣＤ、マスタ適用日から取得した売上部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_DPT_CD (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤを取得する
	<REMARKS>
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		場所ＣＤ、マスタ適用日から取得した売上部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_DPT_LOC_CD_NE (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.LOC_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤに対する
		場所ＣＤを取得する(Not Exception版)
	<REMARKS>
		場所が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		部門ＣＤ、マスタ適用日から取得した場所ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_DPT_LOC_CD (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.LOC_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤに対する
		場所ＣＤを取得する
	<REMARKS>
		場所が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		部門ＣＤ、マスタ適用日から取得した場所ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_LOC_ADDR (
		I_LOC_CD	IN	MAPA_META.LOC_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE,
		I_LOC_ADDR_TYP	IN	MAPA_META.LOC_ADDR_TYP%TYPE
		,I_LCL_CD	IN	MAPA_META.LCL_CD%TYPE DEFAULT NULL
	)
	RETURN VARCHAR2 ;
	/*********************************************************
	<SYNOPSIS>
		場所に対する住所などを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_LOC_ADDR_TYP
			場所宛先区分
	<IN>	I_LCL_CD
			ロケールＣＤ
	<ReturnValue>
		場所宛先区分に対応した値
	**********************************************************/

END MAPA_LOC ;

/
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_LOC
IS
	G_BIND FCPA_ERR.MSG_BINDER ;

	CURSOR LOC_DPT (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.ASST_DPT_CD,
			p.SLS_DPT_CD
		FROM	(
			SELECT	m.ASST_DPT_CD,
				m.SLS_DPT_CD,
				99	PRIO
			FROM 	MAM_LOC m
			WHERE	0=0
			AND	m.LOC_CD = I_LOC_CD
			UNION ALL
			SELECT	m.ASST_DPT_CD,
				m.SLS_DPT_CD,
				1	PRIO
			FROM	MAM_LOC_SUB m
			WHERE	0=0
			AND	m.LOC_CD = I_LOC_CD
			AND	m.ST_DT  <= I_DT
			AND	m.END_DT >= I_DT
			AND	m.DEL_FLG = '0'
			) p
		WHERE	0=0
		ORDER BY p.PRIO
	;

	CURSOR LOC_ADDR (
		I_LOC_CD	IN MAPA_META.LOC_CD%TYPE
		)
	IS
		SELECT	m1.SPPL_CD,
			m1.ADDR_FLG,
			m1.ZIP_CD,
			m1.ADDR1,
			m1.ADDR2,
			m1.ADDR3,
			m1.ADDR4,
			m1.TEL,
			m1.FAX,
			m2.ZIP_CD	SITE_ZIP_CD,
			m2.ADDR1	SITE_ADDR1,
			m2.ADDR2	SITE_ADDR2,
			m2.ADDR3	SITE_ADDR3,
			m2.ADDR4	SITE_ADDR4,
			m2.TEL		SITE_TEL,
			m2.FAX		SITE_FAX
		FROM	MAM_LOC m1
			LEFT OUTER JOIN MAM_SITE m2 ON m1.SITE_CD = m2.SITE_CD
		WHERE	0=0
		AND	m1.LOC_CD = I_LOC_CD
	;
	CURSOR LOC_ADDR_LCL (
		I_LOC_CD	IN MAPA_META.LOC_CD%TYPE,
		I_LCL_CD	IN MAPA_META.LCL_CD%TYPE
		)
	IS
		SELECT	m1.SPPL_CD,
			m1.ADDR_FLG,
			m2.ZIP_CD,
			m2.ADDR1,
			m2.ADDR2,
			m2.ADDR3,
			m2.ADDR4,
			m2.TEL,
			m2.FAX,
			m3.ZIP_CD	SITE_ZIP_CD,
			m3.ADDR1	SITE_ADDR1,
			m3.ADDR2	SITE_ADDR2,
			m3.ADDR3	SITE_ADDR3,
			m3.ADDR4	SITE_ADDR4,
			m3.TEL		SITE_TEL,
			m3.FAX		SITE_FAX
		FROM	MAM_LOC m1
			LEFT OUTER JOIN MAM_LOC_LCL m2 ON m1.LOC_CD = m2.LOC_CD AND m2.LCL_CD = I_LCL_CD
			LEFT OUTER JOIN MAM_SITE_LCL m3 ON m1.SITE_CD = m3.SITE_CD AND m3.LCL_CD = I_LCL_CD
		WHERE	0=0
		AND	m1.LOC_CD = I_LOC_CD
	;
	FUNCTION F_GET_IN_LOC
	(
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_LOC_CD	IN MAPA_META.LOC_CD%TYPE
	)
	RETURN MAPA_META.LOC_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目ＣＤ、製造場所ＣＤより投入指定場所を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOC_CD
			製造場所ＣＤ
	<RETURNVALUE>
		VARCHAR2
		品目ＣＤ、製造場所ＣＤより取得した投入指定場所ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_LOC_CD	MAPA_META.LOC_CD%TYPE ;
	BEGIN
		L_LOC_CD := I_LOC_CD ;
		FOR x IN (
			SELECT	t.FR_LOC_CD,
				t.ITM_CD, 
				t.ITM_SUB1,
				t.ITM_SUB2,
				t.ITM_SUB3,
				t.PRIO,
				t.IN_LOC_FLG
			FROM	MAM_ALLOC_CTL t
			WHERE	0=0
			AND	t.TO_LOC_CD = I_LOC_CD
			AND	(
				t.ITM_CD = I_ITM_CD AND t.ITM_SUB1 = I_ITM_SUB1 AND t.ITM_SUB2 = I_ITM_SUB2 AND t.ITM_SUB3 = I_ITM_SUB3
				OR
				t.ITM_CD IS NULL AND t.FR_LOC_CD NOT IN (
					SELECT
					FR_LOC_CD
					FROM MAM_ALLOC_CTL s1_t
					WHERE
					s1_t.ITM_CD = I_ITM_CD AND ITM_SUB1 = I_ITM_SUB1 AND s1_t.ITM_SUB2 = I_ITM_SUB2 AND s1_t.ITM_SUB3 = I_ITM_SUB3
					AND s1_t.PRIO < 0 AND s1_t.TO_LOC_CD = I_LOC_CD AND s1_t.DEL_FLG = '0'
					)
				)
			AND t.PRIO >= 0
			AND	t.DEL_FLG = '0'
			ORDER BY t.ITM_CD, t.ITM_SUB1, t.ITM_SUB2, t.ITM_SUB3, t.PRIO, t.FR_LOC_CD
			)
		LOOP
			IF x.IN_LOC_FLG = '1' THEN
				L_LOC_CD := x.FR_LOC_CD ;
			END IF ;

			EXIT ;
		END LOOP ;

		RETURN L_LOC_CD ;
	END F_GET_IN_LOC ;

	FUNCTION F_GET_ASST_DPT_CD_NE (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから資産管理部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<IN>	I_NO_CHK_FLG
			部門有効確認不要ＦＬＧ
	<RETURNVALUE>
		VARCHAR2
		場所ＣＤ、マスタ適用日から取得した資産管理部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_DPT_CD := NULL ;
		IF I_LOC_CD IS NULL OR I_DT IS NULL THEN
			RETURN L_DPT_CD ;
		END IF ;

		FOR x IN LOC_DPT(I_LOC_CD, I_DT) LOOP
			L_DPT_CD := x.ASST_DPT_CD ;
			EXIT ;
		END LOOP ;

		IF I_NO_CHK_FLG = '1' THEN
			RETURN L_DPT_CD ;
		END IF ;

		RETURN MAPA_DPT.F_CHECK_DPT_CD(L_DPT_CD, I_DT)  ;
	END F_GET_ASST_DPT_CD_NE ;

	FUNCTION F_GET_ASST_DPT_CD (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから資産管理部門ＣＤを取得する
	<REMARKS>
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		VARCHAR2
		場所ＣＤ、マスタ適用日から取得した資産管理部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_DPT_CD := NULL ;
		IF I_LOC_CD IS NULL OR I_DT IS NULL THEN
			RETURN L_DPT_CD ;
		END IF ;

		L_DPT_CD := F_GET_ASST_DPT_CD_NE(I_LOC_CD, I_DT, '1') ;

		IF L_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_LOC_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0003', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_LOC_CD, L_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_DPT_CD, I_DT) ;
			IF L_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0002', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_DPT_CD ;
	END F_GET_ASST_DPT_CD ;

	FUNCTION F_GET_SLS_DPT_CD_NE (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<IN>	I_CHK_FLG
			部門有効確認ＦＬＧ
	<RETURNVALUE>
		VARCHAR2
		場所ＣＤ、マスタ適用日から取得した売上部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_DPT_CD := NULL ;
		IF I_LOC_CD IS NULL OR I_DT IS NULL THEN
			RETURN L_DPT_CD ;
		END IF ;

		FOR x IN LOC_DPT(I_LOC_CD, I_DT) LOOP
			L_DPT_CD := x.SLS_DPT_CD ;
			EXIT ;
		END LOOP ;

		IF I_NO_CHK_FLG = '1' THEN
			RETURN L_DPT_CD ;
		END IF ;

		RETURN MAPA_DPT.F_CHECK_DPT_CD(L_DPT_CD, I_DT) ;
	END F_GET_SLS_DPT_CD_NE ;

	FUNCTION F_GET_SLS_DPT_CD (
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤを取得する
	<REMARKS>
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		VARCHAR2
		場所ＣＤ、マスタ適用日から取得した売上部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_DPT_CD := NULL ;
		IF I_LOC_CD IS NULL OR I_DT IS NULL THEN
			RETURN L_DPT_CD ;
		END IF ;

		L_DPT_CD := F_GET_SLS_DPT_CD_NE(I_LOC_CD, I_DT, '1') ;

		IF L_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_LOC_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0004', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_LOC_CD, L_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_DPT_CD, I_DT) ;
			IF L_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0002', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_DPT_CD ;
	END F_GET_SLS_DPT_CD ;

	FUNCTION F_GET_SLS_DPT_LOC_CD_NE (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.LOC_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤに対する
		場所ＣＤを取得する(Not Exception版)
	<REMARKS>
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		部門ＣＤ、マスタ適用日から取得した場所ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_LOC_CD	MAPA_META.LOC_CD%TYPE ;
	BEGIN
		L_LOC_CD := NULL ;
		IF I_DPT_CD IS NULL OR I_DT IS NULL THEN
			RETURN L_LOC_CD ;
		END IF ;

		FOR x IN (
			SELECT	p.LOC_CD
			FROM	(
				SELECT	m.LOC_CD,
					99	PRIO
				FROM 	MAM_LOC m
				WHERE	0=0
				AND	m.SLS_DPT_CD = I_DPT_CD
				UNION ALL
				SELECT	m.LOC_CD,
					1	PRIO
				FROM	MAM_LOC_SUB m
				WHERE	0=0
				AND	m.SLS_DPT_CD = I_DPT_CD
				AND	m.ST_DT  <= I_DT
				AND	m.END_DT >= I_DT
				AND	m.DEL_FLG = '0'
				) p
			WHERE	0=0
			ORDER BY p.PRIO, p.LOC_CD
			)
		LOOP
			L_LOC_CD := x.LOC_CD ;
			EXIT ;
		END LOOP ;

		RETURN L_LOC_CD ;

	END F_GET_SLS_DPT_LOC_CD_NE ;

	FUNCTION F_GET_SLS_DPT_LOC_CD (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT	 IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.LOC_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		場所マスタと場所補助マスタから売上部門ＣＤに対する
		場所ＣＤを取得する
	<REMARKS>
		場所が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			マスタ適用日
	<RETURNVALUE>
		部門ＣＤ、マスタ適用日から取得した場所ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_LOC_CD	MAPA_META.LOC_CD%TYPE ;
	BEGIN
		L_LOC_CD := NULL ;
		IF I_DPT_CD IS NULL OR I_DT IS NULL THEN
			RETURN L_LOC_CD ;
		END IF ;

		L_LOC_CD := F_GET_SLS_DPT_LOC_CD_NE(I_DPT_CD, I_DT) ;

		IF L_LOC_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0011', G_BIND) ;
		END IF ;

		RETURN L_LOC_CD ;
	END F_GET_SLS_DPT_LOC_CD ;

	FUNCTION F_GET_LOC_ADDR (
		I_LOC_CD	IN	MAPA_META.LOC_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE,
		I_LOC_ADDR_TYP	IN	MAPA_META.LOC_ADDR_TYP%TYPE
		,I_LCL_CD	IN	MAPA_META.LCL_CD%TYPE DEFAULT NULL
	)
	RETURN VARCHAR2
	/*********************************************************
	<SYNOPSIS>
		場所に対する住所などを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_LOC_ADDR_TYP
			場所宛先区分
	<IN>	I_LCL_CD
			ロケールＣＤ
	<ReturnValue>
		場所宛先区分に対応した値
	**********************************************************/
	IS
		TYPE TAB_LOC_ADDR IS TABLE OF LOC_ADDR%ROWTYPE INDEX BY MAM_LOC.LOC_CD%TYPE ;
		LIST_LOC_ADDR	TAB_LOC_ADDR ;
		x		LOC_ADDR%ROWTYPE ;
	BEGIN
		LIST_LOC_ADDR.DELETE ;
		IF I_LCL_CD IS NULL THEN
			FOR x1 IN LOC_ADDR(I_LOC_CD) LOOP
				LIST_LOC_ADDR(I_LOC_CD) := x1 ;
				EXIT ;
			END LOOP ;
		ELSE
			FOR x2 IN LOC_ADDR_LCL(I_LOC_CD, I_LCL_CD) LOOP
				LIST_LOC_ADDR(I_LOC_CD) := x2 ;
				EXIT ;
			END LOOP ;
		END IF ;

		IF LIST_LOC_ADDR.COUNT = 0 THEN
			RETURN NULL ;
		END IF ;

		WHILE(LIST_LOC_ADDR.EXISTS(I_LOC_CD)) LOOP
			x := LIST_LOC_ADDR(I_LOC_CD) ;
			CASE I_LOC_ADDR_TYP
			WHEN MAC_LOC_ADDR_TYP.ZIP_CD THEN
				IF x.ADDR_FLG = '0' AND x.SPPL_CD IS NULL THEN
					RETURN x.SITE_ZIP_CD ;
				ELSIF x.ADDR_FLG = '0' AND x.SPPL_CD IS NOT NULL THEN
					RETURN MAPA_BP.F_GET_BP_ADDR(x.SPPL_CD, I_BASE_DT, MAC_BP_ADDR_TYP.ZIP_CD) ;
				ELSE
					RETURN x.ZIP_CD ;
				END IF ;
			WHEN MAC_LOC_ADDR_TYP.ADDR1 THEN
				IF x.ADDR_FLG = '0' AND x.SPPL_CD IS NULL THEN
					RETURN x.SITE_ADDR1 ;
				ELSIF x.ADDR_FLG = '0' AND x.SPPL_CD IS NOT NULL THEN
					RETURN MAPA_BP.F_GET_BP_ADDR(x.SPPL_CD, I_BASE_DT, MAC_BP_ADDR_TYP.ADDR1) ;
				ELSE
					RETURN x.ADDR1 ;
				END IF ;
			WHEN MAC_LOC_ADDR_TYP.ADDR2 THEN
				IF x.ADDR_FLG = '0' AND x.SPPL_CD IS NULL THEN
					RETURN x.SITE_ADDR2 ;
				ELSIF x.ADDR_FLG = '0' AND x.SPPL_CD IS NOT NULL THEN
					RETURN MAPA_BP.F_GET_BP_ADDR(x.SPPL_CD, I_BASE_DT, MAC_BP_ADDR_TYP.ADDR2) ;
				ELSE
					RETURN x.ADDR2 ;
				END IF ;
			WHEN MAC_LOC_ADDR_TYP.ADDR3 THEN
				IF x.ADDR_FLG = '0' AND x.SPPL_CD IS NULL THEN
					RETURN x.SITE_ADDR3 ;
				ELSIF x.ADDR_FLG = '0' AND x.SPPL_CD IS NOT NULL THEN
					RETURN MAPA_BP.F_GET_BP_ADDR(x.SPPL_CD, I_BASE_DT, MAC_BP_ADDR_TYP.ADDR3) ;
				ELSE
					RETURN x.ADDR3 ;
				END IF ;
			WHEN MAC_LOC_ADDR_TYP.ADDR4 THEN
				IF x.ADDR_FLG = '0' AND x.SPPL_CD IS NULL THEN
					RETURN x.SITE_ADDR4 ;
				ELSIF x.ADDR_FLG = '0' AND x.SPPL_CD IS NOT NULL THEN
					RETURN MAPA_BP.F_GET_BP_ADDR(x.SPPL_CD, I_BASE_DT, MAC_BP_ADDR_TYP.ADDR4) ;
				ELSE
					RETURN x.ADDR4 ;
				END IF ;
			WHEN MAC_LOC_ADDR_TYP.TEL THEN 
				IF x.ADDR_FLG = '0' AND x.SPPL_CD IS NULL THEN
					RETURN x.SITE_TEL ;
				ELSIF x.ADDR_FLG = '0' AND x.SPPL_CD IS NOT NULL THEN
					RETURN MAPA_BP.F_GET_BP_ADDR(x.SPPL_CD, I_BASE_DT, MAC_BP_ADDR_TYP.TEL) ;
				ELSE
					RETURN x.TEL ;
				END IF ;
			WHEN MAC_LOC_ADDR_TYP.FAX THEN
				IF x.ADDR_FLG = '0' AND x.SPPL_CD IS NULL THEN
					RETURN x.SITE_FAX ;
				ELSIF x.ADDR_FLG = '0' AND x.SPPL_CD IS NOT NULL THEN
					RETURN MAPA_BP.F_GET_BP_ADDR(x.SPPL_CD, I_BASE_DT, MAC_BP_ADDR_TYP.FAX) ;
				ELSE
					RETURN x.FAX ;
				END IF ;
			ELSE RETURN NULL ;
			END CASE ;

			EXIT ;
		END LOOP ;

		RETURN NULL ;

	END F_GET_LOC_ADDR ;

END MAPA_LOC ;

/
show errors;


