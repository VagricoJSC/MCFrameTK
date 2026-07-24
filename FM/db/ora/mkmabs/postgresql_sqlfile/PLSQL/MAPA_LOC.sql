\encoding UTF-8

CREATE OR REPLACE FUNCTION  mapa_loc$cursor_loc_dpt (
	IN i_loc_cd	VARCHAR,
	IN i_dt	TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TABLE (
	asst_dpt_cd	VARCHAR,
	sls_dpt_cd	VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所マスタもしくは場所補助マスタのレコードを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_dt
		マスタ適用
<RETURN VALUE>
	場所マスタもしくは場所補助マスタのレコード
<HISTORY>
**********************************************************/
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN
		SELECT	p.asst_dpt_cd,
			p.sls_dpt_cd
		FROM	(
			SELECT	m.asst_dpt_cd,
				m.sls_dpt_cd,
				99	prio
			FROM 	mam_loc m
			WHERE	0=0
			AND	m.loc_cd = i_loc_cd
			UNION ALL
			SELECT	m.asst_dpt_cd,
				m.sls_dpt_cd,
				1	prio
			FROM	mam_loc_sub m
			WHERE	0=0
			AND	m.loc_cd = i_loc_cd
			AND	m.st_dt <= i_dt
			AND	m.end_dt >= i_dt
			AND	m.del_flg = '0'
			) p
		WHERE	0=0
		ORDER BY p.PRIO
	LOOP
		asst_dpt_cd := x.asst_dpt_cd ;
		sls_dpt_cd := x.sls_dpt_cd ;

		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION  mapa_loc$cursor_loc_addr (
	IN i_loc_cd	VARCHAR,
	IN i_lcl_cd	VARCHAR
)
RETURNS TABLE (
	sppl_cd	VARCHAR,
	addr_flg	CHARACTER,
	zip_cd	VARCHAR,
	addr1	VARCHAR,
	addr2	VARCHAR,
	addr3	VARCHAR,
	addr4	VARCHAR,
	tel	VARCHAR,
	fax	VARCHAR,
	site_zip_cd	VARCHAR,
	site_addr1	VARCHAR,
	site_addr2	VARCHAR,
	site_addr3	VARCHAR,
	site_addr4	VARCHAR,
	site_tel	VARCHAR,
	site_fax	VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所マスタならびに工場・物流倉庫マスタまたは
	場所マスタ（ロケール別情報）、工場・物流倉庫マスタ（ロケール別情報）のレコードを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_lcl_cd
		ロケールＣＤ
<RETURN VALUE>
	場所マスタ、工場・物流倉庫マスタまたは
	場所マスタ、場所マスタ（ロケール別情報）、工場・物流倉庫マスタ（ロケール別情報）のレコード
<HISTORY>
**********************************************************/
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN
		SELECT	m1.sppl_cd,
			m1.addr_flg,
			m1.zip_cd,
			m1.addr1,
			m1.addr2,
			m1.addr3,
			m1.addr4,
			m1.tel,
			m1.fax,
			m2.zip_cd	site_zip_cd,
			m2.addr1	site_addr1,
			m2.addr2	site_addr2,
			m2.addr3	site_addr3,
			m2.addr4	site_addr4,
			m2.tel		site_tel,
			m2.fax		site_fax
		FROM	mam_loc m1
			LEFT OUTER JOIN mam_site m2 ON m1.site_cd = m2.site_cd
		WHERE	0=0
		AND	m1.loc_cd = i_loc_cd
		AND	i_lcl_cd IS NULL
		UNION ALL
		SELECT	m1.sppl_cd,
			m1.addr_flg,
			m2.zip_cd,
			m2.addr1,
			m2.addr2,
			m2.addr3,
			m2.addr4,
			m2.tel,
			m2.fax,
			m3.zip_cd	site_zip_cd,
			m3.addr1	site_addr1,
			m3.addr2	site_addr2,
			m3.addr3	site_addr3,
			m3.addr4	site_addr4,
			m3.tel		site_tel,
			m3.fax		site_fax
		FROM	mam_loc m1
			LEFT OUTER JOIN mam_loc_lcl m2 ON m1.loc_cd = m2.loc_cd AND m2.lcl_cd = i_lcl_cd
			LEFT OUTER JOIN mam_site_lcl m3 ON m1.site_cd = m3.site_cd AND m3.lcl_cd = i_lcl_cd
		WHERE	0=0
		AND	m1.loc_cd = i_loc_cd
		AND	i_lcl_cd IS NOT NULL
	LOOP
		sppl_cd := x.sppl_cd ;
		addr_flg := x.addr_flg ;
		zip_cd := x.zip_cd ;
		addr1 := x.addr1 ;
		addr2 := x.addr2 ;
		addr3 := x.addr3 ;
		addr4 := x.addr4 ;
		tel := x.tel ;
		fax := x.fax ;
		site_zip_cd := x.site_zip_cd ;
		site_addr1 := x.site_addr1 ;
		site_addr2 := x.site_addr2 ;
		site_addr3 := x.site_addr3 ;
		site_addr4 := x.site_addr4 ;
		site_tel := x.site_tel ;
		site_fax := x.site_fax ;

		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_loc$f_get_in_loc (
	 IN i_itm_cd	VARCHAR,
	 IN i_itm_sub1	VARCHAR,
	 IN i_itm_sub2	VARCHAR,
	 IN i_itm_sub3	VARCHAR,
	 IN i_loc_cd	VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目ＣＤ、製造場所ＣＤより投入指定場所を取得する。
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
<IN>	i_loc_cd
		製造場所ＣＤ
<RETURNVALUE>
	VARCHAR2
	品目ＣＤ、製造場所ＣＤより取得した投入指定場所ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_loc_cd	mam_loc.loc_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_loc_cd := i_loc_cd ;

	FOR x IN
		SELECT	t.fr_loc_cd,
			t.itm_cd,
			t.itm_sub1,
			t.itm_sub2,
			t.itm_sub3,
			t.prio,
			t.in_loc_flg
		FROM	mam_alloc_ctl t
		WHERE	0=0
		AND	t.to_loc_cd = i_loc_cd
		AND	(
			t.itm_cd = i_itm_cd AND t.itm_sub1 = i_itm_sub1 AND t.itm_sub2 = i_itm_sub2 AND t.itm_sub3 = i_itm_sub3
			OR
			t.itm_cd IS NULL AND t.fr_loc_cd NOT IN (
				SELECT
				fr_loc_cd
				FROM mam_alloc_ctl s1_t
				WHERE
				s1_t.itm_cd = i_itm_cd AND itm_sub1 = i_itm_sub1 AND s1_t.itm_sub2 = i_itm_sub2 AND s1_t.itm_sub3 = i_itm_sub3
				AND s1_t.prio < 0 AND s1_t.to_loc_cd = i_loc_cd AND s1_t.del_flg = '0'
				)
			)
		AND t.prio >= 0
		AND	t.del_flg = '0'
		ORDER BY t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.prio, t.fr_loc_cd
	LOOP
		IF x.in_loc_flg = '1' THEN
			l_loc_cd := x.fr_loc_cd ;
		END IF ;

		EXIT ;
	END LOOP ;

	RETURN l_loc_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_loc$f_get_asst_dpt_cd_ne (
	 IN i_loc_cd	VARCHAR,
	 IN i_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_no_chk_flg	CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所マスタと場所補助マスタから資産管理部門ＣＤを取得する(Not Exception版)
<REMARKS>
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_dt
		マスタ適用日
<IN>	i_no_chk_flg
		部門有効確認不要ＦＬＧ
<RETURNVALUE>
	VARCHAR2
	場所ＣＤ、マスタ適用日から取得した資産管理部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_dpt_cd	mam_dpt.dpt_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_dpt_cd := NULL ;
	IF i_loc_cd IS NULL OR i_dt IS NULL THEN
		RETURN l_dpt_cd ;
	END IF ;

	FOR x IN 
		SELECT	w.*
		FROM	mapa_loc$cursor_loc_dpt(i_loc_cd, i_dt) w
	LOOP
		l_dpt_cd := x.asst_dpt_cd ;
		EXIT ;
	END LOOP;

	IF i_no_chk_flg = '1' THEN
		RETURN l_dpt_cd ;
	END IF ;

	RETURN mapa_dpt$f_check_dpt_cd(l_dpt_cd, i_dt) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_loc$f_get_asst_dpt_cd (
	 IN i_loc_cd	VARCHAR,
	 IN i_dt	TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所マスタと場所補助マスタから資産管理部門ＣＤを取得する
<REMARKS>
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_dt
		マスタ適用日
<RETURNVALUE>
	VARCHAR2
	場所ＣＤ、マスタ適用日から取得した資産管理部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_dpt_cd	mam_dpt.dpt_cd%TYPE ;
	l_bind	VARCHAR[] ;
BEGIN
	l_dpt_cd := NULL ;
	IF i_loc_cd IS NULL OR i_dt IS NULL THEN
		RETURN l_dpt_cd ;
	END IF ;

	l_dpt_cd := mapa_loc$f_get_asst_dpt_cd_ne(i_loc_cd, i_dt, '1') ;

	IF l_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_loc_cd, fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0003', l_bind) ;
	ELSE
		l_bind := fcpa_err$msg_binder(i_loc_cd, l_dpt_cd, fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md())) ;
		l_dpt_cd := mapa_dpt$f_check_dpt_cd(l_dpt_cd, i_dt) ;
		IF l_dpt_cd IS NULL THEN
			CALL fcpa_err$raise_app_err('MABSD0002', l_bind) ;
		END IF ;
	END IF ;

	RETURN l_dpt_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_loc$f_get_sls_dpt_cd_ne (
	 IN i_loc_cd	VARCHAR,
	 IN i_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_no_chk_flg	CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所マスタと場所補助マスタから売上部門ＣＤを取得する(Not Exception版)
<REMARKS>
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_dt
		マスタ適用日
<IN>	i_chk_flg
		部門有効確認ＦＬＧ
<RETURNVALUE>
	VARCHAR2
	場所ＣＤ、マスタ適用日から取得した売上部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_dpt_cd	mam_dpt.dpt_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_dpt_cd := NULL ;
	IF i_loc_cd IS NULL OR i_dt IS NULL THEN
		RETURN l_dpt_cd ;
	END IF ;

	FOR x IN 
		SELECT	w.*
		FROM	mapa_loc$cursor_loc_dpt(i_loc_cd, i_dt) w
	LOOP
		l_dpt_cd := x.sls_dpt_cd ;
		EXIT ;
	END LOOP;

	IF i_no_chk_flg = '1' THEN
		RETURN l_dpt_cd ;
	END IF ;

	RETURN mapa_dpt$f_check_dpt_cd(l_dpt_cd, i_dt) ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_loc$f_get_sls_dpt_cd (
	 IN i_loc_cd	VARCHAR,
	 IN i_dt	TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所マスタと場所補助マスタから売上部門ＣＤを取得する
<REMARKS>
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_dt
		マスタ適用日
<RETURNVALUE>
	VARCHAR2
	場所ＣＤ、マスタ適用日から取得した売上部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_dpt_cd	mam_dpt.dpt_cd%TYPE ;
	l_bind	VARCHAR[] ;
BEGIN
	l_dpt_cd := NULL ;

	IF i_loc_cd IS NULL OR i_dt IS NULL THEN
		RETURN l_dpt_cd ;
	END IF ;
	l_dpt_cd := mapa_loc$f_get_sls_dpt_cd_ne(i_loc_cd, i_dt, '1') ;

	IF l_dpt_cd IS NULL THEN
			l_bind := fcpa_err$msg_binder(i_loc_cd, fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md())) ;
			CALL fcpa_err$raise_app_err('MABSD0004', l_bind) ;
	ELSE
		l_dpt_cd := mapa_dpt$f_check_dpt_cd(l_dpt_cd, i_dt) ;

		IF l_dpt_cd IS NULL THEN
			l_bind := fcpa_err$msg_binder(i_loc_cd, l_dpt_cd, fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md())) ;
			l_dpt_cd := mapa_dpt$f_check_dpt_cd(l_dpt_cd, i_dt) ;
			IF l_dpt_cd IS NULL THEN
				CALL fcpa_err$raise_app_err('MABSD0002', l_bind) ;
			END IF ;
		END IF ;
	END IF ;

	RETURN l_dpt_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_loc$f_get_sls_dpt_loc_cd_ne (
	 IN i_dpt_cd	VARCHAR,
	 IN i_dt	TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所マスタと場所補助マスタから売上部門ＣＤに対する
	場所ＣＤを取得する(Not Exception版)
<REMARKS>
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_dpt_cd
		部門ＣＤ
<IN>	i_dt
		マスタ適用日
<RETURNVALUE>
	部門ＣＤ、マスタ適用日から取得した場所ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_loc_cd	mam_loc.loc_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_loc_cd := NULL ;

	IF i_dpt_cd IS NULL OR i_dt IS NULL THEN
		RETURN l_loc_cd ;
	END IF ;

	FOR x IN
		SELECT	p.loc_cd
		FROM	(
			SELECT	m.loc_cd,
				99 AS prio
			FROM	mam_loc m
			WHERE	0=0
			AND	m.sls_dpt_cd = i_dpt_cd
			UNION ALL
			SELECT	m.loc_cd,
				1 AS prio
			FROM	mam_loc_sub m
			WHERE	0=0
			AND	m.sls_dpt_cd = i_dpt_cd
			AND	m.st_dt <= i_dt
			AND	m.end_dt >= i_dt
			AND	m.del_flg = '0'
			) p
		WHERE	0=0
		ORDER BY p.prio, p.loc_cd
	LOOP
		l_loc_cd := x.loc_cd ;
		EXIT ;
	END LOOP ;

	RETURN l_loc_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_loc$f_get_sls_dpt_loc_cd (
	 IN i_dpt_cd	VARCHAR,
	 IN i_dt	TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所マスタと場所補助マスタから売上部門ＣＤに対する
	場所ＣＤを取得する
<REMARKS>
	場所が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	i_dpt_cd
		部門ＣＤ
<IN>	i_dt
		マスタ適用日
<RETURNVALUE>
	部門ＣＤ、マスタ適用日から取得した場所ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_loc_cd	mam_loc.loc_cd%TYPE ;
	l_bind	VARCHAR[] ;
BEGIN
	l_loc_cd := NULL ;
	IF i_dpt_cd IS NULL OR i_dt IS NULL THEN
		RETURN l_loc_cd ;
	END IF ;

	l_loc_cd := mapa_loc$f_get_sls_dpt_loc_cd_ne(i_dpt_cd, i_dt) ;

	IF l_loc_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_dpt_cd, fcpa_date_util$f_to_char(i_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0011', l_bind) ;
	END IF ;
	RETURN l_loc_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_loc$f_get_loc_addr (
	 IN i_loc_cd	VARCHAR,
	 IN i_base_dt	TIMESTAMP WITHOUT TIME ZONE,
	 IN i_loc_addr_typ	VARCHAR,
	 IN i_lcl_cd	VARCHAR DEFAULT NULL
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	場所に対する住所などを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_loc_cd
		場所ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_loc_addr_typ
		場所宛先区分
<IN>	i_lcl_cd
		ロケールＣＤ
<ReturnValue>
	場所宛先区分に対応した値
**********************************************************/
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN 
		SELECT	w.*
		FROM	mapa_loc$cursor_loc_addr(i_loc_cd, i_lcl_cd) w
	LOOP
		CASE i_loc_addr_typ
		WHEN fcpa_const$get_const_val('MAC_LOC_ADDR_TYP','ZIP_CD') THEN
			IF x.addr_flg = '0' AND x.sppl_cd IS NULL THEN
				RETURN x.site_zip_cd ;
			ELSIF x.addr_flg = '0' AND x.sppl_cd IS NOT NULL THEN
				RETURN mapa_bp$f_get_bp_addr(x.sppl_cd, i_base_dt, fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ZIP_CD')) ;
			ELSE
				RETURN x.zip_cd ;
			END IF ;
		WHEN fcpa_const$get_const_val('MAC_LOC_ADDR_TYP','ADDR1') THEN
			IF x.addr_flg = '0' AND x.sppl_cd IS NULL THEN
				RETURN x.site_addr1 ;
			ELSIF x.addr_flg = '0' AND x.sppl_cd IS NOT NULL THEN
				RETURN mapa_bp$f_get_bp_addr(x.sppl_cd, i_base_dt, fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ADDR1')) ;
			ELSE
				RETURN x.addr1 ;
			END IF ;
		WHEN fcpa_const$get_const_val('MAC_LOC_ADDR_TYP','ADDR2') THEN
			IF x.addr_flg = '0' AND x.sppl_cd IS NULL THEN
				RETURN x.site_addr2 ;
			ELSIF x.addr_flg = '0' AND x.sppl_cd IS NOT NULL THEN
				RETURN mapa_bp$f_get_bp_addr(x.sppl_cd, i_base_dt, fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ADDR2')) ;
			ELSE
				RETURN x.addr2 ;
			END IF ;
		WHEN fcpa_const$get_const_val('MAC_LOC_ADDR_TYP','ADDR3') THEN
			IF x.addr_flg = '0' AND x.sppl_cd IS NULL THEN
				RETURN x.site_addr3 ;
			ELSIF x.addr_flg = '0' AND x.sppl_cd IS NOT NULL THEN
				RETURN mapa_bp$f_get_bp_addr(x.sppl_cd, i_base_dt, fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ADDR3')) ;
			ELSE
				RETURN x.addr3 ;
			END IF ;
		WHEN fcpa_const$get_const_val('MAC_LOC_ADDR_TYP','ADDR4') THEN
			IF x.addr_flg = '0' AND x.sppl_cd IS NULL THEN
				RETURN x.site_addr4 ;
			ELSIF x.addr_flg = '0' AND x.sppl_cd IS NOT NULL THEN
				RETURN mapa_bp$f_get_bp_addr(x.sppl_cd, i_base_dt, fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ADDR4')) ;
			ELSE
				RETURN x.addr4 ;
			END IF ;
		WHEN fcpa_const$get_const_val('MAC_LOC_ADDR_TYP','TEL') THEN
			IF x.addr_flg = '0' AND x.sppl_cd IS NULL THEN
				RETURN x.site_tel ;
			ELSIF x.addr_flg = '0' AND x.sppl_cd IS NOT NULL THEN
				RETURN mapa_bp$f_get_bp_addr(x.sppl_cd, i_base_dt, fcpa_const$get_const_val('MAC_BP_ADDR_TYP','TEL')) ;
			ELSE
				RETURN x.tel ;
			END IF ;
		WHEN fcpa_const$get_const_val('MAC_LOC_ADDR_TYP','FAX') THEN
			IF x.addr_flg = '0' AND x.sppl_cd IS NULL THEN
				RETURN x.site_fax ;
			ELSIF x.addr_flg = '0' AND x.sppl_cd IS NOT NULL THEN
				RETURN mapa_bp$f_get_bp_addr(x.sppl_cd, i_base_dt, fcpa_const$get_const_val('MAC_BP_ADDR_TYP','FAX')) ;
			ELSE
				RETURN x.fax ;
			END IF ;
		ELSE RETURN NULL ;
		END CASE ;

		EXIT ;
	END LOOP;

	RETURN NULL ;

END ;
$BODY$
LANGUAGE plpgsql
;

