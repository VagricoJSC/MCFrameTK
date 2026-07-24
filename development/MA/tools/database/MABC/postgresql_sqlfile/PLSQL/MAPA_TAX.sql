\encoding UTF-8

CREATE OR REPLACE FUNCTION mapa_tax$cursor_new_sls_tax(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TABLE (
	tax_cd VARCHAR,
	st_dt TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN 
		SELECT	p.tax_cd,
			p.st_dt
		FROM	(
			SELECT	m2.sls_tax_cd AS tax_cd,
				m2.st_dt,
				CASE m1.sls_tax_cd_prio_flg WHEN '0' THEN 20 ELSE 1 END AS prio
			FROM	mam_bp AS m1
				LEFT OUTER JOIN mam_bp_sub m2
					ON (m1.bp_cd = m2.bp_cd
					AND i_base_dt <= m2.st_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.bp_cd = i_bp_cd
			AND	m2.sls_tax_cd IS NOT NULL
			UNION ALL
			SELECT	m2.sls_tax_cd	AS tax_cd,
				m2.st_dt,
				10		AS prio
			FROM	mam_itm AS m1
				LEFT OUTER JOIN mam_itm_sub m2
					ON (m1.itm_cd = m2.itm_cd
					AND m1.itm_sub1 = m2.itm_sub1
					AND m1.itm_sub2 = m2.itm_sub2
					AND m1.itm_sub3 = m2.itm_sub3
					AND i_base_dt <= m2.st_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.itm_cd = i_itm_cd
			AND	m1.itm_sub1 = i_itm_sub1
			AND	m1.itm_sub2 = i_itm_sub2
			AND	m1.itm_sub3 = i_itm_sub3
			AND	m2.sls_tax_cd IS NOT NULL
			UNION ALL
			SELECT	m1.sls_tax_cd	AS tax_cd,
				m1.st_dt,
				99		AS prio
			FROM	mam_co_sub AS m1
			WHERE	0=0
			AND	i_base_dt <= m1.st_dt
			AND	m1.sls_tax_cd IS NOT NULL
			) p
		WHERE	0=0
		ORDER BY p.PRIO, p.ST_DT
	LOOP
		tax_cd := x.tax_cd ;
		st_dt := x.st_dt ;

		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_tax$cursor_new_purc_tax(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TABLE (
	tax_cd	VARCHAR,
	st_dt	TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN 
		SELECT	p.tax_cd,
			p.st_dt
		FROM	(
			SELECT	m2.purc_tax_cd AS tax_cd,
				m2.st_dt,
				CASE m1.purc_tax_cd_prio_flg WHEN '0' THEN 20 ELSE 1 END AS prio
			FROM	mam_bp m1
				LEFT OUTER JOIN mam_bp_sub m2
					ON (m1.bp_cd = m2.bp_cd
					AND i_base_dt <= m2.st_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.bp_cd = i_bp_cd
			AND	m2.purc_tax_cd IS NOT NULL
			UNION ALL
			SELECT	m2.purc_tax_cd	AS tax_cd,
				m2.st_dt,
				10		AS prio
			FROM	mam_itm m1
				LEFT OUTER JOIN mam_itm_sub m2
					ON (m1.itm_cd = m2.itm_cd
					AND m1.itm_sub1 = m2.itm_sub1
					AND m1.itm_sub2 = m2.itm_sub2
					AND m1.itm_sub3 = m2.itm_sub3 
					AND i_base_dt <= m2.st_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.itm_cd = i_itm_cd
			AND	m1.itm_sub1 = i_itm_sub1
			AND	m1.itm_sub2 = i_itm_sub2
			AND	m1.itm_sub3 = i_itm_sub3
			AND	m2.purc_tax_cd IS NOT NULL
			UNION ALL
			SELECT	m1.purc_tax_cd	AS tax_cd,
				m1.st_dt,
				99		AS prio
			FROM	mam_co_sub m1
			WHERE	0=0
			AND	i_base_dt <= m1.st_dt
			AND	m1.purc_tax_cd IS NOT NULL
			) p
		WHERE	0=0
		ORDER BY p.PRIO, p.ST_DT
	LOOP
		tax_cd := x.tax_cd ;
		st_dt := x.st_dt ;

		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_tax$cursor_new_prov_tax(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TABLE (
	tax_cd	VARCHAR,
	st_dt	TIMESTAMP WITHOUT TIME ZONE
)
AS
$BODY$
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN 
		SELECT	p.tax_cd,
			p.st_dt
		FROM	(
			SELECT	m2.prov_tax_cd AS tax_cd,
				m2.st_dt,
				CASE m1.prov_tax_cd_prio_flg WHEN '0' THEN 20 ELSE 1 END AS prio
			FROM	mam_bp m1
				LEFT OUTER JOIN mam_bp_sub m2
					ON (m1.bp_cd = m2.bp_cd
					AND i_base_dt <= m2.st_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.bp_cd = i_bp_cd
			AND	m2.prov_tax_cd IS NOT NULL
			UNION ALL
			SELECT	m2.prov_tax_cd	AS tax_cd,
				m2.st_dt,
				10		AS prio
			FROM	mam_itm m1
				LEFT OUTER JOIN mam_itm_sub m2
					ON (m1.itm_cd = m2.itm_cd
					AND m1.itm_sub1 = m2.itm_sub1
					AND m1.itm_sub2 = m2.itm_sub2
					AND m1.itm_sub3 = m2.itm_sub3
					AND i_base_dt <= m2.st_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.itm_cd = i_itm_cd
			AND	m1.itm_sub1 = i_itm_sub1
			AND	m1.itm_sub2 = i_itm_sub2
			AND	m1.itm_sub3 = i_itm_sub3
			AND	m2.prov_tax_cd IS NOT NULL
			UNION ALL
			SELECT	m1.prov_tax_cd	AS tax_cd,
				m1.st_dt,
				99		AS prio
			FROM	mam_co_sub m1
			WHERE	0=0
			AND	i_base_dt <= m1.st_dt
			AND	m1.prov_tax_cd IS NOT NULL
			) p
		WHERE	0=0
		ORDER BY p.PRIO, p.ST_DT
	LOOP
		tax_cd := x.tax_cd ;
		st_dt := x.st_dt ;

		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_tax$f_get_sls_tax_cd(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する売上税コードを返す
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	売上税ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_tax_cd mam_tax.tax_cd%TYPE;
	x RECORD;
BEGIN
	l_tax_cd := NULL;
	FOR x IN (
		SELECT	p.tax_cd
		FROM	(
			SELECT	COALESCE(m2.sls_tax_cd, m1.sls_tax_cd) AS tax_cd,
				CASE m1.sls_tax_cd_prio_flg WHEN '0' THEN 20 ELSE 1 END AS prio
			FROM	mam_bp m1
				LEFT OUTER JOIN mam_bp_sub m2
					ON (m1.bp_cd = m2.bp_cd
						AND m2.st_dt <= i_base_dt
						AND m2.end_dt >= i_base_dt
						AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.bp_cd = i_bp_cd
			UNION ALL
			SELECT	COALESCE(m2.sls_tax_cd, m1.sls_tax_cd) AS tax_cd,
				10 AS prio
			FROM	mam_itm m1
				LEFT OUTER JOIN mam_itm_sub m2
					ON (m1.itm_cd = m2.itm_cd
					AND m1.itm_sub1 = m2.itm_sub1
					AND m1.itm_sub2 = m2.itm_sub2
					AND m1.itm_sub3 = m2.itm_sub3
					AND m2.st_dt <= i_base_dt
					AND m2.end_dt >= i_base_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.itm_cd = i_itm_cd
			AND	m1.itm_sub1 = i_itm_sub1
			AND	m1.itm_sub2 = i_itm_sub2
			AND	m1.itm_sub3 = i_itm_sub3
			UNION ALL
			SELECT	m1.sls_tax_cd	AS tax_cd,
				99		AS prio
			FROM	mam_co_sub m1
			WHERE	0=0
			AND	m1.st_dt <= i_base_dt
			AND	m1.end_dt >= i_base_dt
			) p
		WHERE	0=0
		ORDER BY p.prio
		)
	LOOP
		IF x.tax_cd IS NOT NULL THEN
			l_tax_cd := x.tax_cd;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_tax_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_tax$f_get_purc_tax_cd(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する仕入税コードを返す
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	仕入税ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_tax_cd mam_tax.tax_cd%TYPE;
	x RECORD;
BEGIN
	l_tax_cd := NULL;
	FOR x IN (
		SELECT	p.tax_cd
		FROM	(
			SELECT	COALESCE(m2.purc_tax_cd, m1.purc_tax_cd) AS tax_cd,
				CASE m1.purc_tax_cd_prio_flg WHEN '0' THEN 20 ELSE 1 END AS prio
			FROM	mam_bp m1
				LEFT OUTER JOIN mam_bp_sub m2
					ON (m1.bp_cd = m2.bp_cd
						AND m2.st_dt <= i_base_dt
						AND m2.end_dt >= i_base_dt
						AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.bp_cd = i_bp_cd
			UNION ALL
			SELECT	COALESCE(m2.purc_tax_cd, m1.purc_tax_cd) AS tax_cd,
				10 AS prio
			FROM	mam_itm m1
				LEFT OUTER JOIN mam_itm_sub m2
					ON (m1.itm_cd = m2.itm_cd
					AND m1.itm_sub1 = m2.itm_sub1
					AND m1.itm_sub2 = m2.itm_sub2
					AND m1.itm_sub3 = m2.itm_sub3
					AND m2.st_dt <= i_base_dt
					AND m2.end_dt >= i_base_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.itm_cd = i_itm_cd
			AND	m1.itm_sub1 = i_itm_sub1
			AND	m1.itm_sub2 = i_itm_sub2
			AND	m1.itm_sub3 = i_itm_sub3
			UNION ALL
			SELECT	m1.purc_tax_cd	AS tax_cd,
				99		AS prio
			FROM	mam_co_sub m1
			WHERE	0=0
			AND	m1.st_dt <= i_base_dt
			AND	m1.end_dt >= i_base_dt
			) p
		WHERE	0=0
		ORDER BY p.prio
	)
	LOOP
		IF x.tax_cd IS NOT NULL THEN
			l_tax_cd := x.tax_cd;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_tax_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_tax$f_get_prov_tax_cd(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する（有償）支給税コードを返す
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	支給税ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_tax_cd mam_tax.tax_cd%TYPE;
	x RECORD;
BEGIN
	l_tax_cd := NULL;

	FOR x IN (
		SELECT	p.tax_cd
		FROM	(
			SELECT	COALESCE(m2.prov_tax_cd, m1.prov_tax_cd) AS tax_cd,
				CASE m1.prov_tax_cd_prio_flg WHEN '0' THEN 20 ELSE 1 END AS prio
			FROM	mam_bp m1
				LEFT OUTER JOIN mam_bp_sub m2
					ON (m1.bp_cd = m2.bp_cd
						AND m2.st_dt <= i_base_dt
						AND m2.end_dt >= i_base_dt
						AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.bp_cd = i_bp_cd
			UNION ALL
			SELECT	COALESCE(m2.prov_tax_cd, m1.prov_tax_cd) AS tax_cd,
				10 AS prio
			FROM	mam_itm m1
				LEFT OUTER JOIN mam_itm_sub m2
					ON (m1.itm_cd = m2.itm_cd
					AND m1.itm_sub1 = m2.itm_sub1
					AND m1.itm_sub2 = m2.itm_sub2
					AND m1.itm_sub3 = m2.itm_sub3
					AND m2.st_dt <= i_base_dt
					AND m2.end_dt >= i_base_dt
					AND m2.del_flg = '0')
			WHERE	0=0
			AND	m1.itm_cd = i_itm_cd
			AND	m1.itm_sub1 = i_itm_sub1
			AND	m1.itm_sub2 = i_itm_sub2
			AND	m1.itm_sub3 = i_itm_sub3
			UNION ALL
			SELECT	m1.prov_tax_cd	AS tax_cd,
				99		AS prio
			FROM	mam_co_sub m1
			WHERE	0=0
			AND	m1.st_dt <= i_base_dt
			AND	m1.end_dt >= i_base_dt
			) p
		WHERE	0=0
		ORDER BY p.prio
	)
	LOOP
		IF x.tax_cd IS NOT NULL THEN
			l_tax_cd := x.tax_cd;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_tax_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_tax$f_get_wtax_rate(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS NUMERIC
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目に対する源泉徴収税率を返す
<REMARKS>
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	源泉徴収税率
<HISTORY>
**********************************************************/
DECLARE
	l_tax_rate mam_tax.tax_rate%TYPE;
BEGIN
	SELECT	MAX(COALESCE(m2.wtax_rate, m1.wtax_rate))
	INTO	STRICT l_tax_rate
	FROM	mam_itm m1
		LEFT OUTER JOIN mam_itm_sub m2
			ON (m1.itm_cd = m2.itm_cd
			AND m1.itm_sub1 = m2.itm_sub1
			AND m1.itm_sub2 = m2.itm_sub2
			AND m1.itm_sub3 = m2.itm_sub3
			AND m2.st_dt <= i_base_dt
			AND m2.end_dt >= i_base_dt
			AND m2.del_flg = '0')
	WHERE	0=0
	AND	m1.itm_cd = i_itm_cd
	AND	m1.itm_sub1 = i_itm_sub1
	AND	m1.itm_sub2 = i_itm_sub2
	AND	m1.itm_sub3 = i_itm_sub3
	;

	RETURN l_tax_rate;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_tax$f_get_new_sls_tax_cd(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する新売上税コードを返す
<REMARKS>
	基準日から最も近い日で変更される売上税コードを返す
	最も近い日の売上税コードが取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	売上税ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_tax_cd mam_tax.tax_cd%TYPE;
	x RECORD;
BEGIN
	l_tax_cd := NULL;
	FOR x IN
		SELECT	w.*
		FROM	mapa_tax$cursor_new_sls_tax(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_bp_cd, i_base_dt) w
	LOOP
		IF x.tax_cd IS NOT NULL THEN
			l_tax_cd := x.tax_cd;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_tax_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_tax$f_get_new_sls_tax_dt(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する新売上税コードが適用される日付を返す
<REMARKS>
	基準日から最も近い日で変更される売上税コードに対する適用開始日を返す
	最も近い日の売上税コードが取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	適用開始日
<HISTORY>
**********************************************************/
DECLARE
	l_dt mam_bp_sub.st_dt%TYPE;
	x RECORD;
BEGIN
	l_dt := NULL;
	FOR x IN
		SELECT	w.*
		FROM	mapa_tax$cursor_new_sls_tax(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_bp_cd, i_base_dt) w
	LOOP
		IF x.st_dt IS NOT NULL THEN
			l_dt := x.st_dt;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_dt;

END;
$BODY$
LANGUAGE plpgsql
;



CREATE OR REPLACE FUNCTION mapa_tax$f_get_new_purc_tax_cd(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する新仕入税コードを返す
<REMARKS>
	基準日から最も近い日で変更される仕入税コードを返す
	最も近い日の仕入税コードが取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	仕入税ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_tax_cd mam_tax.tax_cd%TYPE;
	x RECORD;
BEGIN
	l_tax_cd := NULL;
	FOR x IN
		SELECT	w.*
		FROM	mapa_tax$cursor_new_purc_tax(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_bp_cd, i_base_dt) w
	LOOP
		IF x.tax_cd IS NOT NULL THEN
			l_tax_cd := x.tax_cd;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_tax_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_tax$f_get_new_purc_tax_dt(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する新仕入税コードが適用される日付を返す
<REMARKS>
	基準日から最も近い日で変更される仕入税コードに対する適用開始日を返す
	最も近い日の仕入税コードが取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	適用開始日
<HISTORY>
**********************************************************/
DECLARE
	l_dt mam_bp_sub.st_dt%TYPE;
	x RECORD;
BEGIN
	l_dt := NULL;

	FOR x IN
		SELECT	w.*
		FROM	mapa_tax$cursor_new_purc_tax(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_bp_cd, i_base_dt) w
	LOOP
		IF x.st_dt IS NOT NULL THEN
			l_dt := x.st_dt;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_dt;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_tax$f_get_new_prov_tax_cd(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する新（有償）支給税コードを返す
<REMARKS>
	基準日から最も近い日で変更される（有償）支給税コードを返す
	最も近い日の（有償）支給税コードが取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	（有償）支給税ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_tax_cd mam_tax.tax_cd%TYPE;
	x RECORD;
BEGIN
	l_tax_cd := NULL;
	FOR x IN
		SELECT	w.*
		FROM	mapa_tax$cursor_new_prov_tax(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_bp_cd, i_base_dt) w
	LOOP
		IF x.tax_cd IS NOT NULL THEN
			l_tax_cd := x.tax_cd;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_tax_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_tax$f_get_new_prov_tax_dt(
	 IN i_itm_cd VARCHAR,
	 IN i_itm_sub1 VARCHAR,
	 IN i_itm_sub2 VARCHAR,
	 IN i_itm_sub3 VARCHAR,
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TIMESTAMP WITHOUT TIME ZONE
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目・取引先に対する新（有償）支給税コードが適用される日付を返す
<REMARKS>
	基準日から最も近い日で変更される（有償）支給税コードに対する適用開始日を返す
	最も近い日の（有償）支給税コードが取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_itm_cd
		品目ＣＤ
<IN>	i_itm_sub1
		枝番１
<IN>	i_itm_sub2
		枝番２
<IN>	i_itm_sub3
		枝番３
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	適用開始日
<HISTORY>
**********************************************************/
DECLARE
	l_dt mam_bp_sub.st_dt%TYPE;
	x RECORD;
BEGIN
	l_dt := NULL;
	FOR x IN
		SELECT	w.*
		FROM	mapa_tax$cursor_new_prov_tax(i_itm_cd, i_itm_sub1, i_itm_sub2, i_itm_sub3, i_bp_cd, i_base_dt) w
	LOOP
		IF x.st_dt IS NOT NULL THEN
			l_dt := x.st_dt;
			EXIT;
		END IF;
	END LOOP;

	RETURN l_dt;

END;
$BODY$
LANGUAGE plpgsql
;

