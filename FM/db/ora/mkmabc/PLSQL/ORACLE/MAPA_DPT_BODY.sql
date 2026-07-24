CREATE OR REPLACE PACKAGE BODY MAPA_DPT
IS
	G_BIND FCPA_ERR.MSG_BINDER ;

	CURSOR DPT_CD (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.DPT_CD
		FROM	(
			SELECT	m.DPT_CD,
				1	PRIO
			FROM 	MAM_DPT m
			WHERE	0=0
			AND	m.DPT_CD = I_DPT_CD
			AND	m.ST_DT  <= I_DT
			AND  	m.END_DT >= I_DT
			UNION ALL
			SELECT	m.NEW_DPT_CD	DPT_CD,
				99	PRIO
			FROM	MAM_DPT_MAP m
			WHERE	0=0
			AND	m.OLD_DPT_CD = I_DPT_CD
			AND	m.ST_DT  <= I_DT
			AND  	m.END_DT >= I_DT
			) p
		WHERE	0=0
		ORDER BY p.PRIO
	;

	FUNCTION F_GET_DPT_CD_NE (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		日付に対して有効な部門ＣＤを返す(Not Exception版)
		※組織変更により新部門ＣＤが取得できる場合は新部門ＣＤを返す
	<REMARKS>
		無効な部門ＣＤの場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			日付
	<RETURN VALUE>
		部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_DPT_CD := NULL ;
		IF I_DPT_CD IS NULL OR I_DT IS NULL THEN
			RETURN L_DPT_CD ;
		END IF ;
		FOR x IN DPT_CD(I_DPT_CD, I_DT) LOOP
			L_DPT_CD := x.DPT_CD ;
			EXIT ;
		END LOOP ;

		RETURN L_DPT_CD ;

	END F_GET_DPT_CD_NE ;

	FUNCTION F_GET_DPT_CD (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		日付に対して有効な部門ＣＤを返す
		※組織変更により新部門ＣＤが取得できる場合は新部門ＣＤを返す
	<REMARKS>
		無効な部門ＣＤの場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			日付
	<RETURN VALUE>
		部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_DPT_CD := NULL ;
		IF I_DPT_CD IS NULL OR I_DT IS NULL THEN
			RETURN L_DPT_CD ;
		END IF ;

		L_DPT_CD := F_GET_DPT_CD_NE(I_DPT_CD, I_DT) ;
		IF L_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABCD0002', G_BIND) ;
		END IF ;

		RETURN L_DPT_CD ;

	END F_GET_DPT_CD ;

	FUNCTION F_CHECK_DPT_CD (
		I_DPT_CD IN MAPA_META.DPT_CD%TYPE,
		I_DT IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		日付に対して入力された部門が有効かどうか確認する
		有効な場合は入力された部門を返す
		無効な場合はＮＵＬＬを返す
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DPT_CD
			部門ＣＤ
	<IN>	I_DT
			日付
	<RETURN VALUE>
		部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	INTEGER ;
	BEGIN
		IF I_DPT_CD IS NULL OR I_DT IS NULL THEN
			RETURN NULL ;
		END IF ;

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_DPT m
		WHERE	0=0
		AND	m.DPT_CD = I_DPT_CD
		AND	m.ST_DT  <= I_DT
		AND  	m.END_DT >= I_DT
		;

		IF L_CNT > 0 THEN
			RETURN I_DPT_CD ;
		END IF ;

		RETURN NULL ;

	END F_CHECK_DPT_CD ;

END MAPA_DPT ;
/
