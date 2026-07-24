CREATE OR REPLACE PACKAGE BODY MAPA_TAX
IS
	CURSOR SLS_TAX_CD (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.TAX_CD
		FROM	(
			SELECT	NVL(m2.SLS_TAX_CD, m1.SLS_TAX_CD) TAX_CD,
				DECODE(m1.SLS_TAX_CD_PRIO_FLG, '0', 20, 1) PRIO
			FROM	MAM_BP m1
				LEFT OUTER JOIN MAM_BP_SUB m2
					ON (m1.BP_CD = m2.BP_CD
					AND m2.ST_DT <= I_BASE_DT
					AND m2.END_DT >= I_BASE_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.BP_CD = I_BP_CD
			UNION ALL
			SELECT	NVL(m2.SLS_TAX_CD, m1.SLS_TAX_CD) TAX_CD,
				10		PRIO
			FROM	MAM_ITM m1
				LEFT OUTER JOIN MAM_ITM_SUB m2
					ON (m1.ITM_CD = m2.ITM_CD
					AND m1.ITM_SUB1 = m2.ITM_SUB1
					AND m1.ITM_SUB2 = m2.ITM_SUB2
					AND m1.ITM_SUB3 = m2.ITM_SUB3
					AND m2.ST_DT <= I_BASE_DT
					AND m2.END_DT >= I_BASE_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.ITM_CD = I_ITM_CD
			AND	m1.ITM_SUB1 = I_ITM_SUB1
			AND	m1.ITM_SUB2 = I_ITM_SUB2
			AND	m1.ITM_SUB3 = I_ITM_SUB3
			UNION ALL
			SELECT	m1.SLS_TAX_CD	TAX_CD,
				99		PRIO
			FROM	MAM_CO_SUB m1
			WHERE	0=0
			AND	m1.ST_DT  <= I_BASE_DT
			AND  	m1.END_DT >= I_BASE_DT
			) p
		WHERE	0=0
		ORDER BY p.PRIO
	;

	CURSOR PURC_TAX_CD (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.TAX_CD
		FROM	(
			SELECT	NVL(m2.PURC_TAX_CD, m1.PURC_TAX_CD) TAX_CD,
				DECODE(m1.PURC_TAX_CD_PRIO_FLG, '0', 20, 1) PRIO
			FROM	MAM_BP m1
				LEFT OUTER JOIN MAM_BP_SUB m2
					ON (m1.BP_CD = m2.BP_CD
					AND m2.ST_DT <= I_BASE_DT
					AND m2.END_DT >= I_BASE_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.BP_CD = I_BP_CD
			UNION ALL
			SELECT	NVL(m2.PURC_TAX_CD, m1.PURC_TAX_CD) TAX_CD,
				10		PRIO
			FROM	MAM_ITM m1
				LEFT OUTER JOIN MAM_ITM_SUB m2
					ON (m1.ITM_CD = m2.ITM_CD
					AND m1.ITM_SUB1 = m2.ITM_SUB1
					AND m1.ITM_SUB2 = m2.ITM_SUB2
					AND m1.ITM_SUB3 = m2.ITM_SUB3
					AND m2.ST_DT <= I_BASE_DT
					AND m2.END_DT >= I_BASE_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.ITM_CD = I_ITM_CD
			AND	m1.ITM_SUB1 = I_ITM_SUB1
			AND	m1.ITM_SUB2 = I_ITM_SUB2
			AND	m1.ITM_SUB3 = I_ITM_SUB3
			UNION ALL
			SELECT	m1.PURC_TAX_CD	TAX_CD,
				99		PRIO
			FROM	MAM_CO_SUB m1
			WHERE	0=0
			AND	m1.ST_DT  <= I_BASE_DT
			AND  	m1.END_DT >= I_BASE_DT
			) p
		WHERE	0=0
		ORDER BY p.PRIO
	;

	CURSOR PROV_TAX_CD (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.TAX_CD
		FROM	(
			SELECT	NVL(m2.PROV_TAX_CD, m1.PROV_TAX_CD) TAX_CD,
				DECODE(m1.PROV_TAX_CD_PRIO_FLG, '0', 20, 1) PRIO
			FROM	MAM_BP m1
				LEFT OUTER JOIN MAM_BP_SUB m2
					ON (m1.BP_CD = m2.BP_CD
					AND m2.ST_DT <= I_BASE_DT
					AND m2.END_DT >= I_BASE_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.BP_CD = I_BP_CD
			UNION ALL
			SELECT	NVL(m2.PROV_TAX_CD, m1.PROV_TAX_CD) TAX_CD,
				10		PRIO
			FROM	MAM_ITM m1
				LEFT OUTER JOIN MAM_ITM_SUB m2
					ON (m1.ITM_CD = m2.ITM_CD
					AND m1.ITM_SUB1 = m2.ITM_SUB1
					AND m1.ITM_SUB2 = m2.ITM_SUB2
					AND m1.ITM_SUB3 = m2.ITM_SUB3
					AND m2.ST_DT <= I_BASE_DT
					AND m2.END_DT >= I_BASE_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.ITM_CD = I_ITM_CD
			AND	m1.ITM_SUB1 = I_ITM_SUB1
			AND	m1.ITM_SUB2 = I_ITM_SUB2
			AND	m1.ITM_SUB3 = I_ITM_SUB3
			UNION ALL
			SELECT	m1.PROV_TAX_CD	TAX_CD,
				99		PRIO
			FROM	MAM_CO_SUB m1
			WHERE	0=0
			AND	m1.ST_DT  <= I_BASE_DT
			AND  	m1.END_DT >= I_BASE_DT
			) p
		WHERE	0=0
		ORDER BY p.PRIO
	;
	CURSOR NEW_SLS_TAX (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.TAX_CD,
			p.ST_DT
		FROM	(
			SELECT	m2.SLS_TAX_CD	TAX_CD,
				m2.ST_DT,
				DECODE(m1.SLS_TAX_CD_PRIO_FLG, '0', 20, 1) PRIO
			FROM	MAM_BP m1
				LEFT OUTER JOIN MAM_BP_SUB m2
					ON (m1.BP_CD = m2.BP_CD
					AND I_BASE_DT <= m2.ST_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.BP_CD = I_BP_CD
			AND	m2.SLS_TAX_CD IS NOT NULL
			UNION ALL
			SELECT	m2.SLS_TAX_CD	TAX_CD,
				m2.ST_DT,
				10		PRIO
			FROM	MAM_ITM m1
				LEFT OUTER JOIN MAM_ITM_SUB m2
					ON (m1.ITM_CD = m2.ITM_CD
					AND m1.ITM_SUB1 = m2.ITM_SUB1
					AND m1.ITM_SUB2 = m2.ITM_SUB2
					AND m1.ITM_SUB3 = m2.ITM_SUB3
					AND I_BASE_DT <= m2.ST_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.ITM_CD = I_ITM_CD
			AND	m1.ITM_SUB1 = I_ITM_SUB1
			AND	m1.ITM_SUB2 = I_ITM_SUB2
			AND	m1.ITM_SUB3 = I_ITM_SUB3
			AND	m2.SLS_TAX_CD IS NOT NULL
			UNION ALL
			SELECT	m1.SLS_TAX_CD	TAX_CD,
				m1.ST_DT,
				99		PRIO
			FROM	MAM_CO_SUB m1
			WHERE	0=0
			AND	I_BASE_DT <= m1.ST_DT
			AND	m1.SLS_TAX_CD IS NOT NULL
			) p
		WHERE	0=0
		ORDER BY p.PRIO, p.ST_DT
	;

	CURSOR NEW_PURC_TAX (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.TAX_CD,
			p.ST_DT
		FROM	(
			SELECT	m2.PURC_TAX_CD	TAX_CD,
				m2.ST_DT,
				DECODE(m1.PURC_TAX_CD_PRIO_FLG, '0', 20, 1) PRIO
			FROM	MAM_BP m1
				LEFT OUTER JOIN MAM_BP_SUB m2
					ON (m1.BP_CD = m2.BP_CD
					AND I_BASE_DT <= m2.ST_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.BP_CD = I_BP_CD
			AND	m2.PURC_TAX_CD IS NOT NULL
			UNION ALL
			SELECT	m2.PURC_TAX_CD	TAX_CD,
				m2.ST_DT,
				10		PRIO
			FROM	MAM_ITM m1
				LEFT OUTER JOIN MAM_ITM_SUB m2
					ON (m1.ITM_CD = m2.ITM_CD
					AND m1.ITM_SUB1 = m2.ITM_SUB1
					AND m1.ITM_SUB2 = m2.ITM_SUB2
					AND m1.ITM_SUB3 = m2.ITM_SUB3
					AND I_BASE_DT <= m2.ST_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.ITM_CD = I_ITM_CD
			AND	m1.ITM_SUB1 = I_ITM_SUB1
			AND	m1.ITM_SUB2 = I_ITM_SUB2
			AND	m1.ITM_SUB3 = I_ITM_SUB3
			AND	m2.PURC_TAX_CD IS NOT NULL
			UNION ALL
			SELECT	m1.PURC_TAX_CD	TAX_CD,
				m1.ST_DT,
				99		PRIO
			FROM	MAM_CO_SUB m1
			WHERE	0=0
			AND	I_BASE_DT <= m1.ST_DT
			AND	m1.PURC_TAX_CD IS NOT NULL
			) p
		WHERE	0=0
		ORDER BY p.PRIO, p.ST_DT
	;

	CURSOR NEW_PROV_TAX (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.TAX_CD,
			p.ST_DT
		FROM	(
			SELECT	m2.PROV_TAX_CD	TAX_CD,
				m2.ST_DT,
				DECODE(m1.PROV_TAX_CD_PRIO_FLG, '0', 20, 1) PRIO
			FROM	MAM_BP m1
				LEFT OUTER JOIN MAM_BP_SUB m2
					ON (m1.BP_CD = m2.BP_CD
					AND I_BASE_DT <= m2.ST_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.BP_CD = I_BP_CD
			AND	m2.PROV_TAX_CD IS NOT NULL
			UNION ALL
			SELECT	m2.PROV_TAX_CD	TAX_CD,
				m2.ST_DT,
				10		PRIO
			FROM	MAM_ITM m1
				LEFT OUTER JOIN MAM_ITM_SUB m2
					ON (m1.ITM_CD = m2.ITM_CD
					AND m1.ITM_SUB1 = m2.ITM_SUB1
					AND m1.ITM_SUB2 = m2.ITM_SUB2
					AND m1.ITM_SUB3 = m2.ITM_SUB3
					AND I_BASE_DT <= m2.ST_DT
					AND m2.DEL_FLG = '0')
			WHERE	0=0
			AND	m1.ITM_CD = I_ITM_CD
			AND	m1.ITM_SUB1 = I_ITM_SUB1
			AND	m1.ITM_SUB2 = I_ITM_SUB2
			AND	m1.ITM_SUB3 = I_ITM_SUB3
			AND	m2.PROV_TAX_CD IS NOT NULL
			UNION ALL
			SELECT	m1.PROV_TAX_CD	TAX_CD,
				m1.ST_DT,
				99		PRIO
			FROM	MAM_CO_SUB m1
			WHERE	0=0
			AND	I_BASE_DT <= m1.ST_DT
			AND	m1.PROV_TAX_CD IS NOT NULL
			) p
		WHERE	0=0
		ORDER BY p.PRIO, p.ST_DT
	;

	FUNCTION F_GET_SLS_TAX_CD (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する売上税コードを返す
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
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		売上税ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_TAX_CD MAPA_META.TAX_CD%TYPE ;
	BEGIN
		L_TAX_CD := NULL ;
		FOR x IN SLS_TAX_CD(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.TAX_CD IS NOT NULL THEN
				L_TAX_CD := x.TAX_CD ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_TAX_CD ;

	END F_GET_SLS_TAX_CD ;

	FUNCTION F_GET_PURC_TAX_CD (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する仕入税コードを返す
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
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		仕入税ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_TAX_CD MAPA_META.TAX_CD%TYPE ;
	BEGIN
		L_TAX_CD := NULL ;
		FOR x IN PURC_TAX_CD(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.TAX_CD IS NOT NULL THEN
				L_TAX_CD := x.TAX_CD ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_TAX_CD ;

	END F_GET_PURC_TAX_CD ;

	FUNCTION F_GET_PROV_TAX_CD (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する（有償）支給税コードを返す
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
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		支給税ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_TAX_CD MAPA_META.TAX_CD%TYPE ;
	BEGIN
		L_TAX_CD := NULL ;
		FOR x IN PROV_TAX_CD(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.TAX_CD IS NOT NULL THEN
				L_TAX_CD := x.TAX_CD ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_TAX_CD ;

	END F_GET_PROV_TAX_CD ;

	FUNCTION F_GET_WTAX_RATE (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_RATE%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目に対する源泉徴収税率を返す
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
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		源泉徴収税率
	<HISTORY>
	**********************************************************/
	IS
		L_TAX_RATE MAPA_META.TAX_RATE%TYPE ;
	BEGIN
		SELECT	MAX(NVL(m2.WTAX_RATE, m1.WTAX_RATE))
		INTO	L_TAX_RATE
		FROM	MAM_ITM m1
			LEFT OUTER JOIN MAM_ITM_SUB m2
				ON (m1.ITM_CD = m2.ITM_CD
				AND m1.ITM_SUB1 = m2.ITM_SUB1
				AND m1.ITM_SUB2 = m2.ITM_SUB2
				AND m1.ITM_SUB3 = m2.ITM_SUB3
				AND m2.ST_DT <= I_BASE_DT
				AND m2.END_DT >= I_BASE_DT
				AND m2.DEL_FLG = '0')
		WHERE	0=0
		AND	m1.ITM_CD = I_ITM_CD
		AND	m1.ITM_SUB1 = I_ITM_SUB1
		AND	m1.ITM_SUB2 = I_ITM_SUB2
		AND	m1.ITM_SUB3 = I_ITM_SUB3
		;

		RETURN L_TAX_RATE ;

	END F_GET_WTAX_RATE ;
	FUNCTION F_GET_NEW_SLS_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新売上税コードを返す
	<REMARKS>
		基準日から最も近い日で変更される売上税コードを返す
		最も近い日の売上税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		売上税ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_TAX_CD MAPA_META.TAX_CD%TYPE ;
	BEGIN
		L_TAX_CD := NULL ;
		FOR x IN NEW_SLS_TAX(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.TAX_CD IS NOT NULL THEN
				L_TAX_CD := x.TAX_CD ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_TAX_CD ;

	END F_GET_NEW_SLS_TAX_CD ;

	FUNCTION F_GET_NEW_SLS_TAX_DT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新売上税コードが適用される日付を返す
	<REMARKS>
		基準日から最も近い日で変更される売上税コードに対する適用開始日を返す
		最も近い日の売上税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		適用開始日
	<HISTORY>
	**********************************************************/
	IS
		L_DT MAPA_META.DT%TYPE ;
	BEGIN
		L_DT := NULL ;
		FOR x IN NEW_SLS_TAX(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.ST_DT IS NOT NULL THEN
				L_DT := x.ST_DT ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_DT ;

	END F_GET_NEW_SLS_TAX_DT ;

	FUNCTION F_GET_NEW_PURC_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新仕入税コードを返す
	<REMARKS>
		基準日から最も近い日で変更される仕入税コードを返す
		最も近い日の仕入税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		仕入税ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_TAX_CD MAPA_META.TAX_CD%TYPE ;
	BEGIN
		L_TAX_CD := NULL ;
		FOR x IN NEW_PURC_TAX(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.TAX_CD IS NOT NULL THEN
				L_TAX_CD := x.TAX_CD ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_TAX_CD ;

	END F_GET_NEW_PURC_TAX_CD ;

	FUNCTION F_GET_NEW_PURC_TAX_DT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新仕入税コードが適用される日付を返す
	<REMARKS>
		基準日から最も近い日で変更される仕入税コードに対する適用開始日を返す
		最も近い日の仕入税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		適用開始日
	<HISTORY>
	**********************************************************/
	IS
		L_DT MAPA_META.DT%TYPE ;
	BEGIN
		L_DT := NULL ;
		FOR x IN NEW_PURC_TAX(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.ST_DT IS NOT NULL THEN
				L_DT := x.ST_DT ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_DT ;

	END F_GET_NEW_PURC_TAX_DT ;

	FUNCTION F_GET_NEW_PROV_TAX_CD (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.TAX_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新（有償）支給税コードを返す
	<REMARKS>
		基準日から最も近い日で変更される（有償）支給税コードを返す
		最も近い日の（有償）支給税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		（有償）支給税ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_TAX_CD MAPA_META.TAX_CD%TYPE ;
	BEGIN
		L_TAX_CD := NULL ;
		FOR x IN NEW_PROV_TAX(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.TAX_CD IS NOT NULL THEN
				L_TAX_CD := x.TAX_CD ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_TAX_CD ;

	END F_GET_NEW_PROV_TAX_CD ;

	FUNCTION F_GET_NEW_PROV_TAX_DT (
		I_ITM_CD	IN	MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN	MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN	MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN	MAPA_META.ITM_SUB3%TYPE,
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.DT%TYPE
	/*********************************************************
	<SYNOPSIS>
		品目・取引先に対する新（有償）支給税コードが適用される日付を返す
	<REMARKS>
		基準日から最も近い日で変更される（有償）支給税コードに対する適用開始日を返す
		最も近い日の（有償）支給税コードが取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		適用開始日
	<HISTORY>
	**********************************************************/
	IS
		L_DT MAPA_META.DT%TYPE ;
	BEGIN
		L_DT := NULL ;
		FOR x IN NEW_PROV_TAX(I_ITM_CD, I_ITM_SUB1, I_ITM_SUB2, I_ITM_SUB3, I_BP_CD, I_BASE_DT) LOOP
			IF x.ST_DT IS NOT NULL THEN
				L_DT := x.ST_DT ;
				EXIT ;
			END IF ;
		END LOOP ;

		RETURN L_DT ;

	END F_GET_NEW_PROV_TAX_DT ;

END MAPA_TAX ;
/
