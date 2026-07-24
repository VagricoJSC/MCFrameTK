CREATE OR REPLACE FUNCTION mapa_bp$cursor_bp_sub (
	IN i_bp_cd VARCHAR,
	IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS TABLE (
	zip_cd	VARCHAR,
	addr1	VARCHAR,
	addr2	VARCHAR,
	addr3	VARCHAR,
	addr4	VARCHAR,
	tel	VARCHAR,
	fax	VARCHAR,
	cst_cntct_dpt	VARCHAR,
	cst_cntct_psn	VARCHAR,
	cst_cntct_psn_title	VARCHAR,
	sppl_cntct_dpt	VARCHAR,
	sppl_cntct_psn	VARCHAR,
	sppl_cntct_psn_title	VARCHAR,
	dlv_cntct_dpt	VARCHAR,
	dlv_cntct_psn	VARCHAR,
	dlv_cntct_psn_title	VARCHAR,
	bill_zip_cd	VARCHAR,
	bill_addr1	VARCHAR,
	bill_addr2	VARCHAR,
	bill_addr3	VARCHAR,
	bill_addr4	VARCHAR,
	bill_tel	VARCHAR,
	bill_bcst_nm	VARCHAR,
	bill_bcst_dpt	VARCHAR,
	bill_bcst_psn	VARCHAR,
	bill_bcst_psn_title	VARCHAR,
	ar_dpt_cd	VARCHAR,
	sls_tax_cd	VARCHAR,
	sls_anly_cd1	VARCHAR,
	sls_anly_cd2	VARCHAR,
	sls_anly_cd3	VARCHAR,
	bcst_dpt_cd	VARCHAR,
	vmi_purc_dpt_cd	VARCHAR,
	purc_tax_cd	VARCHAR,
	prov_tax_cd	VARCHAR,
	ap_dpt_cd	VARCHAR,
	bsppl_dpt_cd	VARCHAR,
	pay_dpt_cd	VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先マスタもしくは取引先補助マスタのレコードを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	取引先マスタもしくは取引先補助マスタのレコード
<HISTORY>
**********************************************************/
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN 
		SELECT	p.zip_cd,
			p.addr1, p.addr2,
			p.addr3, p.addr4,
			p.tel, p.fax,
			p.cst_cntct_dpt, p.cst_cntct_psn, p.cst_cntct_psn_title,
			p.sppl_cntct_dpt, p.sppl_cntct_psn, p.sppl_cntct_psn_title,
			p.dlv_cntct_dpt, p.dlv_cntct_psn, p.dlv_cntct_psn_title,
			p.bill_zip_cd,
			p.bill_addr1, p.bill_addr2,
			p.bill_addr3, p.bill_addr4,
			p.bill_tel,
			p.bill_bcst_nm,
			p.bill_bcst_dpt, p.bill_bcst_psn, p.bill_bcst_psn_title,
			p.ar_dpt_cd, p.sls_tax_cd, p.sls_anly_cd1, p.sls_anly_cd2, p.sls_anly_cd3,
			p.bcst_dpt_cd,
			p.vmi_purc_dpt_cd, p.purc_tax_cd, p.prov_tax_cd,
			p.ap_dpt_cd, p.bsppl_dpt_cd
			,p.pay_dpt_cd
		FROM	(
			SELECT	m.zip_cd,
				m.addr1, m.addr2,
				m.addr3, m.addr4,
				m.tel, m.fax,
				m.cst_cntct_dpt, m.cst_cntct_psn, m.cst_cntct_psn_title,
				m.sppl_cntct_dpt, m.sppl_cntct_psn, m.sppl_cntct_psn_title,
				m.dlv_cntct_dpt, m.dlv_cntct_psn, m.dlv_cntct_psn_title,
				m.bill_zip_cd,
				m.bill_addr1, m.bill_addr2,
				m.bill_addr3, m.bill_addr4,
				m.bill_tel,
				m.bill_bcst_nm,
				m.bill_bcst_dpt, m.bill_bcst_psn, m.bill_bcst_psn_title,
				m.ar_dpt_cd, m.sls_tax_cd, m.sls_anly_cd1, m.sls_anly_cd2, m.sls_anly_cd3,
				m.bcst_dpt_cd,
				m.vmi_purc_dpt_cd, m.purc_tax_cd, m.prov_tax_cd,
				m.ap_dpt_cd, m.bsppl_dpt_cd,
				m.pay_dpt_cd,
				99 AS prio
			FROM	mam_bp m
			WHERE	0=0
			AND	m.bp_cd = i_bp_cd
			UNION ALL
			SELECT	m.zip_cd,
				m.addr1, m.addr2,
				m.addr3, m.addr4,
				m.tel, m.fax,
				m.cst_cntct_dpt, m.cst_cntct_psn, m.cst_cntct_psn_title,
				m.sppl_cntct_dpt, m.sppl_cntct_psn, m.sppl_cntct_psn_title,
				m.dlv_cntct_dpt, m.dlv_cntct_psn, m.dlv_cntct_psn_title,
				m.bill_zip_cd,
				m.bill_addr1, m.bill_addr2,
				m.bill_addr3, m.bill_addr4,
				m.bill_tel,
				m.bill_bcst_nm,
				m.bill_bcst_dpt, m.bill_bcst_psn, m.bill_bcst_psn_title,
				m.ar_dpt_cd, m.sls_tax_cd, m.sls_anly_cd1, m.sls_anly_cd2, m.sls_anly_cd3,
				m.bcst_dpt_cd, 
				m.vmi_purc_dpt_cd, m.purc_tax_cd, m.prov_tax_cd,
				m.ap_dpt_cd, m.bsppl_dpt_cd,
				m.pay_dpt_cd,
				1 AS prio
			FROM	mam_bp_sub m
			WHERE	0=0
			AND	m.bp_cd = i_bp_cd
			AND	m.st_dt <= i_base_dt
			AND	m.end_dt >= i_base_dt
			AND	m.del_flg = '0'
			) p
		WHERE	0=0
		ORDER BY p.prio
	LOOP
		zip_cd := x.zip_cd ;
		addr1 := x.addr1 ;
		addr2 := x.addr2 ;
		addr3 := x.addr3 ;
		addr4 := x.addr4 ;
		tel := x.tel ;
		fax := x.fax ;
		cst_cntct_dpt := x.cst_cntct_dpt ;
		cst_cntct_psn := x.cst_cntct_psn ;
		cst_cntct_psn_title := x.cst_cntct_psn_title ;
		sppl_cntct_dpt := x.sppl_cntct_dpt ;
		sppl_cntct_psn := x.sppl_cntct_psn ;
		sppl_cntct_psn_title := x.sppl_cntct_psn_title ;
		dlv_cntct_dpt := x.dlv_cntct_dpt ;
		dlv_cntct_psn := x.dlv_cntct_psn ;
		dlv_cntct_psn_title := x.dlv_cntct_psn_title ;
		bill_zip_cd := x.bill_zip_cd ;
		bill_addr1 := x.bill_addr1 ;
		bill_addr2 := x.bill_addr2 ;
		bill_addr3 := x.bill_addr3 ;
		bill_addr4 := x.bill_addr4 ;
		bill_tel := x.bill_tel ;
		bill_bcst_nm := x.bill_bcst_nm ;
		bill_bcst_dpt := x.bill_bcst_dpt ;
		bill_bcst_psn := x.bill_bcst_psn ;
		bill_bcst_psn_title := x.bill_bcst_psn_title ;
		ar_dpt_cd := x.ar_dpt_cd ;
		sls_tax_cd := x.sls_tax_cd ;
		sls_anly_cd1 := x.sls_anly_cd1 ;
		sls_anly_cd2 := x.sls_anly_cd2 ;
		sls_anly_cd3 := x.sls_anly_cd3 ;
		bcst_dpt_cd := x.bcst_dpt_cd ;
		vmi_purc_dpt_cd := x.vmi_purc_dpt_cd ;
		purc_tax_cd := x.purc_tax_cd ;
		prov_tax_cd := x.prov_tax_cd ;
		ap_dpt_cd := x.ap_dpt_cd ;
		bsppl_dpt_cd := x.bsppl_dpt_cd ;
		pay_dpt_cd := x.pay_dpt_cd ;

		RETURN NEXT ;
	END LOOP ;

	RETURN ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_bp$f_is_slo_stop(
	 IN i_bp_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先が受注禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<RETURN VALUE>
	1: 受注禁止 / 0: 受注可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	/* 取引先禁止マスタ取得（受注禁止日） */
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_bp_stop m
	WHERE	0=0
	AND	m.bp_cd = i_bp_cd
	AND	m.slo_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0' ;
	ELSE
		RETURN '1' ;
	END IF ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_is_po_stop(
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先が発注禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURN VALUE>
	1: 発注禁止 / 0: 発注可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	/* 取引先禁止マスタ取得（発注禁止日） */
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_bp_stop m
	WHERE	0=0
	AND	m.bp_cd = i_bp_cd
	AND	m.po_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0' ;
	ELSE
		RETURN '1' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_is_sls_stop(
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先が売上・出荷禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURN VALUE>
	1: 売上・出荷禁止 / 0: 売上・出荷可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	/* 取引先禁止マスタ取得（売上・出荷禁止日） */
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_bp_stop m
	WHERE	0=0
	AND	m.bp_cd = i_bp_cd
	AND	m.sls_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0' ;
	ELSE
		RETURN '1' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_is_purc_stop(
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先が仕入・入荷禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURN VALUE>
	1: 仕入・入荷禁止 / 0: 仕入・入荷可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	/* 取引先禁止マスタ取得（仕入・入荷禁止日） */
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_bp_stop m
	WHERE	0=0
	AND	m.bp_cd = i_bp_cd
	AND	m.purc_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0' ;
	ELSE
		RETURN '1' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_is_order_stop(
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先が所要・オーダ禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURN VALUE>
	1: 所要・オーダ禁止 / 0: 所要・オーダ可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	/* 取引先禁止マスタ取得（所要・オーダ禁止日） */
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_bp_stop m
	WHERE	0=0
	AND	m.bp_cd = i_bp_cd
	AND	m.order_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0' ;
	ELSE
		RETURN '1' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_is_mfg_inst_stop(
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先が製造指図禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURN VALUE>
	1: 製造指図禁止 / 0: 製造指図可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	/* 取引先禁止マスタ取得（製造指図禁止日） */
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_bp_stop m
	WHERE	0=0
	AND	m.bp_cd = i_bp_cd
	AND	m.mfg_inst_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0' ;
	ELSE
		RETURN '1' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_is_ship_inst_stop(
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先が出荷指図禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURN VALUE>
	1: 出荷指図禁止 / 0: 出荷指図可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	/* 取引先禁止マスタ取得（出荷指図禁止日） */
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_bp_stop m
	WHERE	0=0
	AND	m.bp_cd = i_bp_cd
	AND	m.ship_inst_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0' ;
	ELSE
		RETURN '1' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_is_xfr_stop(
	 IN i_bp_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS CHARACTER
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先が移送・移動禁止かどうかを判定する。
<REMARKS>
<ARGUMENTS>
<IN>	I_BP_CD
		取引先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURN VALUE>
	1: 移送・移動禁止 / 0: 移送・移動可能
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC ;
BEGIN
	/* 取引先禁止マスタ取得（移送・移動禁止日） */
	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_bp_stop m
	WHERE	0=0
	AND	m.bp_cd = i_bp_cd
	AND	m.xfr_stop_dt <= i_base_dt
	AND	m.del_flg = '0'
	;

	IF l_cnt = 0 THEN
		RETURN '0' ;
	ELSE
		RETURN '1' ;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_cred_of_cst(
	 IN i_cst_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	得意先から与信管理先を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_cst_cd
		得意先ＣＤ
<ReturnValue>
	与信管理先ＣＤ
**********************************************************/
DECLARE
	l_cred_cd mam_bp.bp_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_cred_cd := NULL ;
	FOR x IN
		/* 売掛先の取得 */
		SELECT	m.acst_cd
		FROM	mam_bp m
		WHERE	0=0
		AND	m.bp_cd = i_cst_cd
		AND	m.cst_flg = '1'
		AND	m.acst_cd IS NOT NULL
	LOOP
		l_cred_cd := mapa_bp$f_get_cred_of_acst(x.ACST_CD) ;
		EXIT ;
	END LOOP ;

	RETURN l_cred_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_cred_of_acst(
	 IN i_acst_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	売掛先から与信管理先を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_acst_cd
		売掛先ＣＤ
<ReturnValue>
	与信管理先ＣＤ
**********************************************************/
DECLARE
	l_cred_cd mam_bp.bp_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_cred_cd := NULL;

	FOR x IN
		/* 請求先の取得 */
		SELECT	m.bcst_cd
		FROM	mam_bp m
		WHERE	0=0
		AND	m.bp_cd = i_acst_cd
		AND	m.acst_flg = '1'
		AND	m.bcst_cd IS NOT NULL
	LOOP
		l_cred_cd := mapa_bp$f_get_cred_of_bcst(x.BCST_CD) ;
		EXIT ;
	END LOOP ;

	RETURN l_cred_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_cred_of_bcst(
	 IN i_bcst_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	請求先から与信管理先を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<ReturnValue>
	与信管理先ＣＤ
**********************************************************/
DECLARE
	l_cred_cd mam_bp.bp_cd%TYPE ;
BEGIN
	/* 与信管理先の取得 */
	SELECT	MIN(m.ar_cred_cd)
	INTO	STRICT l_cred_cd
	FROM	mam_bp m
	WHERE	0=0
	AND	m.bp_cd = i_bcst_cd
	AND	m.bcst_flg = '1'
	AND	m.ar_cred_cd IS NOT NULL
	;

	RETURN l_cred_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_bp_addr (
	 IN i_bp_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE, 
	 IN i_bp_addr_typ VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先に対する住所などを取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bp_cd
		取引先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_bp_addr_typ
		取引先宛先区分
<ReturnValue>
	取引先宛先区分に対応した値
**********************************************************/
DECLARE
	x	RECORD ;
BEGIN
	FOR x IN 
		SELECT	w.*
		FROM	mapa_bp$cursor_bp_sub(i_bp_cd, i_base_dt) w
	LOOP
		CASE i_bp_addr_typ
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ZIP_CD') THEN RETURN x.ZIP_CD ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ADDR1') THEN RETURN x.ADDR1 ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ADDR2') THEN RETURN x.ADDR2 ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ADDR3') THEN RETURN x.ADDR3 ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','ADDR4') THEN RETURN x.ADDR4 ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','TEL') THEN RETURN x.TEL ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','FAX') THEN RETURN x.FAX ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','CST_CNTCT_DPT') THEN RETURN x.CST_CNTCT_DPT ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','CST_CNTCT_PSN') THEN RETURN x.CST_CNTCT_PSN ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','CST_CNTCT_PSN_TITLE') THEN RETURN x.CST_CNTCT_PSN_TITLE ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','SPPL_CNTCT_DPT') THEN RETURN x.SPPL_CNTCT_DPT ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','SPPL_CNTCT_PSN') THEN RETURN x.SPPL_CNTCT_PSN ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','SPPL_CNTCT_PSN_TITLE') THEN RETURN x.SPPL_CNTCT_PSN_TITLE ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','DLV_CNTCT_DPT') THEN RETURN x.DLV_CNTCT_DPT ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','DLV_CNTCT_PSN') THEN RETURN x.DLV_CNTCT_PSN ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','DLV_CNTCT_PSN_TITLE') THEN RETURN x.DLV_CNTCT_PSN_TITLE ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_ZIP_CD') THEN RETURN x.BILL_ZIP_CD ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_ADDR1') THEN RETURN x.BILL_ADDR1 ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_ADDR2') THEN RETURN x.BILL_ADDR2 ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_ADDR3') THEN RETURN x.BILL_ADDR3 ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_ADDR4') THEN RETURN x.BILL_ADDR4 ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_TEL') THEN RETURN x.BILL_TEL ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_BCST_NM') THEN RETURN x.BILL_BCST_NM ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_BCST_DPT') THEN RETURN x.BILL_BCST_DPT ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_BCST_PSN') THEN RETURN x.BILL_BCST_PSN ;
		WHEN fcpa_const$get_const_val('MAC_BP_ADDR_TYP','BILL_BCST_PSN_TITLE') THEN RETURN x.BILL_BCST_PSN_TITLE ;
		ELSE RETURN NULL ;
		END CASE ;

		EXIT ;
	END LOOP;

	RETURN NULL ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_ar_dpt_cd_ne(
	 IN i_cst_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE, 
	 IN i_no_chk_flg CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（得意先）に対する債権部門ＣＤを取得する(Not Exception版)
<REMARKS>
	債権部門区分に2（債権部門）が設定されている得意先を入力値とする
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_cst_cd
		得意先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_no_chk_flg
		部門有効確認対象外ＦＬＧ
<RETURNVALUE>
	得意先ＣＤ、基準日から取得した債権部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_ar_dpt_cd mam_dpt.dpt_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_ar_dpt_cd := NULL ;
	IF i_cst_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_ar_dpt_cd ;
	END IF ;
	
	FOR x IN
		SELECT	w.*
		FROM	mapa_bp$cursor_bp_sub(i_cst_cd, i_base_dt) w
	LOOP
		l_ar_dpt_cd := x.ar_dpt_cd ;
		EXIT ;
	END LOOP ;

	IF i_no_chk_flg = '1' THEN
		RETURN l_ar_dpt_cd ;
	END IF ;

	RETURN mapa_dpt$f_check_dpt_cd(l_ar_dpt_cd, i_base_dt) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_ar_dpt_cd(
	 IN i_cst_cd VARCHAR,
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（得意先）に対する債権部門ＣＤを取得する
<REMARKS>
	債権部門区分に2（債権部門）が設定されている得意先を入力値とする
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	I_CST_CD
		得意先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURNVALUE>
	得意先ＣＤ、基準日から取得した債権部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bind VARCHAR[] ;
	l_ar_dpt_cd mam_dpt.dpt_cd%TYPE ;
BEGIN
	l_ar_dpt_cd := NULL ;
	IF i_cst_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_ar_dpt_cd ;
	END IF ;

	l_ar_dpt_cd := mapa_bp$f_get_ar_dpt_cd_ne(i_cst_cd, i_base_dt, '1') ;

	IF l_ar_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_cst_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0006', l_bind) ;
	ELSE
		l_bind := fcpa_err$msg_binder(i_cst_cd, l_ar_dpt_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		l_ar_dpt_cd := mapa_dpt$f_check_dpt_cd(l_ar_dpt_cd, i_base_dt) ;
		IF l_ar_dpt_cd IS NULL THEN
			CALL fcpa_err$raise_app_err('MABSD0005', l_bind) ;
		END IF ;
	END IF ;

	RETURN l_ar_dpt_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_bcst_dpt_cd_ne(
	 IN i_bcst_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE, 
	 IN i_no_chk_flg CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（請求先）に対する請求先担当部門ＣＤを取得する(Not Exception版)
<REMARKS>
	債権部門区分に3（請求部門）が設定されている請求先を入力値とする
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_no_chk_flg
		部門有効確認対象外ＦＬＧ
<RETURNVALUE>
	請求先ＣＤ、基準日から取得した請求先担当部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bcst_dpt_cd mam_dpt.dpt_cd%TYPE;
	x	RECORD ;
BEGIN
	l_bcst_dpt_cd := NULL;
	IF i_bcst_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_bcst_dpt_cd ;
	END IF ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_bp$cursor_bp_sub(i_bcst_cd, i_base_dt) w
	LOOP
		l_bcst_dpt_cd := x.bcst_dpt_cd ;
		EXIT ;
	END LOOP ;

	IF i_no_chk_flg = '1' THEN
		RETURN l_bcst_dpt_cd ;
	END IF ;

	RETURN mapa_dpt$f_check_dpt_cd(l_bcst_dpt_cd, i_base_dt) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_bcst_dpt_cd(
	 IN i_bcst_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（請求先）に対する請求先担当部門ＣＤを取得する
<REMARKS>
	債権部門区分に3（請求部門）が設定されている請求先を入力値とする
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	i_bcst_cd
		請求先ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	請求先ＣＤ、基準日から取得した請求先担当部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bind VARCHAR[] ;
	l_bcst_dpt_cd mam_dpt.dpt_cd%TYPE ;
BEGIN
	l_bcst_dpt_cd := NULL ;
	IF i_bcst_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_bcst_dpt_cd ;
	END IF ;

	l_bcst_dpt_cd := mapa_bp$f_get_bcst_dpt_cd_ne(i_bcst_cd, i_base_dt, '1') ;

	IF l_bcst_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_bcst_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0007', l_bind) ;
	ELSE
		l_bind := fcpa_err$msg_binder(i_bcst_cd, l_bcst_dpt_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		l_bcst_dpt_cd := mapa_dpt$f_check_dpt_cd(l_bcst_dpt_cd, i_base_dt) ;
		IF l_bcst_dpt_cd IS NULL THEN
			CALL fcpa_err$raise_app_err('MABSD0005', l_bind) ;
		END IF ;
	END IF ;

	RETURN l_bcst_dpt_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_vmi_purc_dpt_cd_ne(
	 IN i_sppl_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE, 
	 IN i_no_chk_flg CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（発注先）に対するＶＭＩ購買部門ＣＤを取得する(Not Exception版)
<REMARKS>
	発注先を入力値とする
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_sppl_cd
		発注先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_no_chk_flg
		部門有効確認対象外ＦＬＧ
<RETURNVALUE>
	発注先ＣＤ、基準日から取得したＶＭＩ購買部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_vmi_purc_dpt_cd mam_dpt.dpt_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_vmi_purc_dpt_cd := NULL ;
	IF i_sppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_vmi_purc_dpt_cd ;
	END IF ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_bp$cursor_bp_sub(i_sppl_cd, i_base_dt) w
	LOOP
		l_vmi_purc_dpt_cd := x.vmi_purc_dpt_cd ;
		EXIT ;
	END LOOP ;

	IF i_no_chk_flg = '1' THEN
		RETURN l_vmi_purc_dpt_cd ;
	END IF ;

	RETURN mapa_dpt$f_check_dpt_cd(l_vmi_purc_dpt_cd, i_base_dt) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_vmi_purc_dpt_cd(
	 IN i_sppl_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（発注先）に対するＶＭＩ購買部門ＣＤを取得する
<REMARKS>
	発注先を入力値とする
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	i_sppl_cd
		発注先ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	発注先ＣＤ、基準日から取得したＶＭＩ購買部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bind VARCHAR[] ;
	l_vmi_purc_dpt_cd mam_dpt.dpt_cd%TYPE ;
BEGIN
	l_vmi_purc_dpt_cd := NULL;
	IF i_sppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_vmi_purc_dpt_cd;
	END IF ;

	l_vmi_purc_dpt_cd := mapa_bp$f_get_vmi_purc_dpt_cd_ne(i_sppl_cd, i_base_dt, '1');

	IF l_vmi_purc_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_sppl_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0008', l_bind) ;
	ELSE
		l_bind := fcpa_err$msg_binder(i_sppl_cd, l_vmi_purc_dpt_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		l_vmi_purc_dpt_cd := mapa_dpt$f_check_dpt_cd(l_vmi_purc_dpt_cd, i_base_dt);
		IF l_vmi_purc_dpt_cd IS NULL THEN
			CALL fcpa_err$raise_app_err('MABSD0005', l_bind) ;
		END IF ;
	END IF ;

	RETURN l_vmi_purc_dpt_cd;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_ap_dpt_cd_ne(
	 IN i_asppl_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE, 
	 IN i_no_chk_flg CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（買掛先）に対する債務部門ＣＤを取得する(Not Exception版)
<REMARKS>
	買掛先を入力値とする
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_asppl_cd
		買掛先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_no_chk_flg
		部門有効確認対象外ＦＬＧ
<RETURNVALUE>
	買掛先ＣＤ、基準日から取得した債務部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_ap_dpt_cd mam_dpt.dpt_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_ap_dpt_cd := NULL;
	IF i_asppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_ap_dpt_cd ;
	END IF ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_bp$cursor_bp_sub(i_asppl_cd, i_base_dt) w
	LOOP
		l_ap_dpt_cd := x.ap_dpt_cd ;
		EXIT;
	END LOOP;

	IF i_no_chk_flg = '1' THEN
		RETURN l_ap_dpt_cd ;
	END IF ;

	RETURN mapa_dpt$f_check_dpt_cd(l_ap_dpt_cd, i_base_dt) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_ap_dpt_cd(
	 IN i_asppl_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（買掛先）に対する債務部門ＣＤを取得する
<REMARKS>
	買掛先を入力値とする
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	i_asppl_cd
		買掛先ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	買掛先ＣＤ、基準日から取得した債務部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bind VARCHAR[] ;
	l_ap_dpt_cd mam_dpt.dpt_cd%TYPE ;
BEGIN
	l_ap_dpt_cd := NULL ;
	IF i_asppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_ap_dpt_cd ;
	END IF ;

	l_ap_dpt_cd := mapa_bp$f_get_ap_dpt_cd_ne(i_asppl_cd, i_base_dt, '1') ;

	IF l_ap_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_asppl_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0009', l_bind) ;
	ELSE
		l_bind := fcpa_err$msg_binder(i_asppl_cd, l_ap_dpt_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		l_ap_dpt_cd := mapa_dpt$f_check_dpt_cd(l_ap_dpt_cd, i_base_dt) ;
		IF l_ap_dpt_cd IS NULL THEN
			CALL fcpa_err$raise_app_err('MABSD0005', l_bind) ;
		END IF ;
	END IF ;

	RETURN l_ap_dpt_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_bp$f_get_ap_dpt_cd_ne2 (
	IN i_sppl_cd VARCHAR, 
	IN i_asppl_cd VARCHAR, 
	IN i_base_dt TIMESTAMP WITHOUT TIME ZONE, 
	IN i_no_chk_flg CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（買掛先）に対する債務部門ＣＤを取得する(Not Exception版)
	取引先補助.債務部門 > 取引先.債務部門 > 発注先担当.購買部門(債務部門オン)　の優先順位で取得する
<REMARKS>
	買掛先を入力値とする
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_sppl_cd
		発注先ＣＤ
<IN>	i_asppl_cd
		買掛先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_no_chk_flg
		部門有効確認対象外ＦＬＧ
<RETURNVALUE>
	買掛先ＣＤ、基準日から取得した債務部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_ap_dpt_cd mam_dpt.dpt_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_ap_dpt_cd := NULL ;
	IF i_sppl_cd IS Null OR i_asppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_ap_dpt_cd ;
	END IF ;

	l_ap_dpt_cd := mapa_bp$f_get_ap_dpt_cd_ne(i_asppl_cd, i_base_dt, i_no_chk_flg) ;

	IF l_ap_dpt_cd IS NOT NULL THEN
		RETURN l_ap_dpt_cd ;
	END IF;

	BEGIN
		SELECT 
			m.purc_dpt_cd
		INTO
			l_ap_dpt_cd
		FROM 
			mam_sppl_usr m
		WHERE 0 = 0
		AND i_base_dt BETWEEN m.st_dt AND m.end_dt
		AND m.sppl_cd = i_sppl_cd;
	EXCEPTION 
		WHEN NO_DATA_FOUND THEN
			RETURN NULL;
	END;

	BEGIN
		SELECT 
			m.dpt_cd
		INTO
			l_ap_dpt_cd
		FROM 
			MAM_DPT m
		WHERE 0 = 0
		AND i_base_dt BETWEEN m.st_dt AND m.end_dt
		AND m.ap_dpt_flg = '1'
		AND m.dpt_cd = l_ap_dpt_cd;
	EXCEPTION 
		WHEN NO_DATA_FOUND THEN
			RETURN NULL;
	END;

	RETURN l_ap_dpt_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_bp$f_get_ap_dpt_cd2 (
	IN i_sppl_cd VARCHAR, 
	IN i_asppl_cd VARCHAR, 
	IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（買掛先）に対する債務部門ＣＤを取得する
	取引先補助.債務部門 > 取引先.債務部門 > 発注先担当.購買部門(債務部門オン)　の優先順位で取得する
<REMARKS>
	買掛先を入力値とする
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	I_SPPL_CD
		発注先ＣＤ
<IN>	I_ASPPL_CD
		買掛先ＣＤ
<IN>	I_BASE_DT
		基準日
<RETURNVALUE>
	買掛先ＣＤ、基準日から取得した債務部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bind VARCHAR[] ;
	l_ap_dpt_cd mam_dpt.dpt_cd%TYPE ;
BEGIN
	l_ap_dpt_cd := NULL ;
	IF i_sppl_cd IS Null OR i_asppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_ap_dpt_cd ;
	END IF ;

	l_ap_dpt_cd := mapa_bp$f_get_ap_dpt_cd_ne2(i_sppl_cd, i_asppl_cd, i_base_dt, '1') ;

	IF l_ap_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_asppl_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0009', l_bind) ;
	ELSE
		l_bind := fcpa_err$msg_binder(i_asppl_cd, l_ap_dpt_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		l_ap_dpt_cd := mapa_dpt$f_check_dpt_cd(l_ap_dpt_cd, i_base_dt) ;
		IF l_ap_dpt_cd IS NULL THEN
			CALL fcpa_err$raise_app_err('MABSD0005', l_bind) ;
		END IF ;
	END IF ;

	RETURN l_ap_dpt_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_bp$f_get_bsppl_dpt_cd_ne(
	 IN i_bsppl_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE, 
	 IN i_no_chk_flg CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（支払予定管理先）に対する支払予定管理先担当部門ＣＤを取得する(Not Exception版)
<REMARKS>
	支払予定管理先を入力値とする
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_bsppl_cd
		支払予定管理先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_no_chk_flg
		部門有効確認対象外ＦＬＧ
<RETURNVALUE>
	支払予定管理先ＣＤ、基準日から取得した支払予定管理先担当部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bsppl_dpt_cd mam_dpt.dpt_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_bsppl_dpt_cd := NULL ;

	IF i_bsppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_bsppl_dpt_cd ;
	END IF ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_bp$cursor_bp_sub(i_bsppl_cd, i_base_dt) w
	LOOP
		l_bsppl_dpt_cd := x.bsppl_dpt_cd ;
		EXIT ;
	END LOOP;

	IF i_no_chk_flg = '1' THEN
		RETURN l_bsppl_dpt_cd ;
	END IF ;

	RETURN mapa_dpt$f_check_dpt_cd(l_bsppl_dpt_cd, i_base_dt) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_bsppl_dpt_cd(
	 IN i_bsppl_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（支払予定管理先）に対する支払予定管理先担当部門ＣＤを取得する
<REMARKS>
	支払予定管理先を入力値とする
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	i_bsppl_cd
		支払予定管理先ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	支払予定管理先ＣＤ、基準日から取得した支払予定管理先担当部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bind VARCHAR[] ;
	l_bsppl_dpt_cd mam_dpt.dpt_cd%TYPE ;
BEGIN
	l_bsppl_dpt_cd := NULL ;
	IF i_bsppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_bsppl_dpt_cd ;
	END IF ;

	l_bsppl_dpt_cd := mapa_bp$f_get_bsppl_dpt_cd_ne(i_bsppl_cd, i_base_dt, '1') ;

	IF l_bsppl_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_bsppl_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0010', l_bind) ;
	ELSE
		l_bind := fcpa_err$msg_binder(i_bsppl_cd, l_bsppl_dpt_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		l_bsppl_dpt_cd := mapa_dpt$f_check_dpt_cd(l_bsppl_dpt_cd, i_base_dt) ;
		IF l_bsppl_dpt_cd IS NULL THEN
			CALL fcpa_err$raise_app_err('MABSD0005', l_bind) ;
		END IF ;
	END IF ;

	RETURN l_bsppl_dpt_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_cred_of_sppl(
	 IN i_sppl_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	発注先から与信管理先を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_sppl_cd
		発注先ＣＤ
<ReturnValue>
	与信管理先ＣＤ
**********************************************************/
DECLARE
	l_cred_cd mam_bp.bp_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_cred_cd := NULL ;
	FOR x IN
		/* 買掛先の取得 */
		SELECT	m.asppl_cd
		FROM	mam_bp m
		WHERE	0=0
		AND	m.bp_cd = i_sppl_cd
		AND	m.sppl_flg = '1'
		AND	m.asppl_cd IS NOT NULL
	LOOP
		l_cred_cd := mapa_bp$f_get_cred_of_asppl(x.ASPPL_CD) ;
		EXIT ;
	END LOOP ;

	RETURN l_cred_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_cred_of_asppl(
	 IN i_asppl_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	買掛先から与信管理先を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_asppl_cd
		買掛先ＣＤ
<ReturnValue>
	与信管理先ＣＤ
**********************************************************/
DECLARE
	l_cred_cd mam_bp.bp_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_cred_cd := NULL ;
	FOR x IN
		/* 支払予定管理先の取得 */
		SELECT	m.bsppl_cd
		FROM	mam_bp m
		WHERE	0=0
		AND	m.bp_cd = i_asppl_cd
		AND	m.asppl_flg = '1'
		AND	m.bsppl_cd IS NOT NULL
	LOOP
		l_cred_cd := mapa_bp$f_get_cred_of_bsppl(x.BSPPL_CD) ;
		EXIT ;
	END LOOP ;

	RETURN l_cred_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_cred_of_bsppl(
	 IN i_bsppl_cd VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	支払予定管理先から与信管理先を取得する
<REMARKS>
<ARGUMENTS>
<IN>	i_bsppl_cd
		支払予定管理先ＣＤ
<ReturnValue>
	与信管理先ＣＤ
**********************************************************/
DECLARE
	l_cred_cd mam_bp.bp_cd%TYPE ;
BEGIN
	/* 与信管理先の取得 */
	SELECT	MIN(m.ap_cred_cd)
	INTO	STRICT l_cred_cd
	FROM	mam_bp m
	WHERE	0=0
	AND	m.bp_cd = i_bsppl_cd
	AND	m.bsppl_flg = '1'
	AND	m.ap_cred_cd IS NOT NULL
	;

	RETURN l_cred_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_pay_dpt_cd_ne(
	 IN i_psppl_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE, 
	 IN i_no_chk_flg CHARACTER DEFAULT '0'
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（支払先）に対する支払部門ＣＤを取得する(Not Exception版)
<REMARKS>
	支払先を入力値とする
	部門が取得できない場合はＮＵＬＬを返す
<ARGUMENTS>
<IN>	i_psppl_cd
		支払先ＣＤ
<IN>	i_base_dt
		基準日
<IN>	i_no_chk_flg
		部門有効確認対象外ＦＬＧ
<RETURNVALUE>
	支払先ＣＤ、基準日から取得した支払部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_pay_dpt_cd mam_dpt.dpt_cd%TYPE ;
	x	RECORD ;
BEGIN
	l_pay_dpt_cd := NULL ;
	IF i_psppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_pay_dpt_cd ;
	END IF ;

	FOR x IN
		SELECT	w.*
		FROM	mapa_bp$cursor_bp_sub(i_psppl_cd, i_base_dt) w
	LOOP
		l_pay_dpt_cd := x.pay_dpt_cd ;
		EXIT ;
	END LOOP ;

	IF i_no_chk_flg = '1' THEN
		RETURN l_pay_dpt_cd ;
	END IF ;

	RETURN mapa_dpt$f_check_dpt_cd(l_pay_dpt_cd, i_base_dt) ;

END ;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mapa_bp$f_get_pay_dpt_cd(
	 IN i_psppl_cd VARCHAR, 
	 IN i_base_dt TIMESTAMP WITHOUT TIME ZONE
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引先（支払先）に対する支払部門ＣＤを取得する
<REMARKS>
	支払先を入力値とする
	部門が取得できない場合はエラーを返す
<ARGUMENTS>
<IN>	i_psppl_cd
		支払先ＣＤ
<IN>	i_base_dt
		基準日
<RETURNVALUE>
	支払先ＣＤ、基準日から取得した支払部門ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_bind VARCHAR[] ;
	l_pay_dpt_cd mam_dpt.dpt_cd%TYPE ;
BEGIN
	l_pay_dpt_cd := NULL ;
	IF i_psppl_cd IS NULL OR i_base_dt IS NULL THEN
		RETURN l_pay_dpt_cd ;
	END IF ;

	l_pay_dpt_cd := mapa_bp$f_get_pay_dpt_cd_ne(i_psppl_cd, i_base_dt, '1') ;

	IF l_pay_dpt_cd IS NULL THEN
		l_bind := fcpa_err$msg_binder(i_psppl_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		CALL fcpa_err$raise_app_err('MABSD0050', l_bind) ;
	ELSE
		l_bind := fcpa_err$msg_binder(i_psppl_cd, l_pay_dpt_cd, fcpa_date_util$f_to_char(i_base_dt, fcpa_date_util$y4md())) ;
		l_pay_dpt_cd := mapa_dpt$f_check_dpt_cd(l_pay_dpt_cd, i_base_dt) ;
		IF l_pay_dpt_cd IS NULL THEN
			CALL fcpa_err$raise_app_err('MABSD0005', l_bind) ;
		END IF ;
	END IF ;

	RETURN l_pay_dpt_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;
CREATE OR REPLACE PROCEDURE mapa_bp$p_del_bp(
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	MAW_BP_KEYに登録されている取引先に対して
	取引先マスタのレコードを削除する
<REMARKS>
<ARGUMENTS>
<RETURNVALUE>
<HISTORY>
**********************************************************/
DECLARE
	l_cnt NUMERIC;
	l_co mam_co.co_cd%TYPE;

BEGIN
	l_co := fcpa_context$f_get_co_cd();

	DELETE FROM mam_bp_all m
	WHERE	0=0
	AND	m.co_cd = l_co
	AND	EXISTS (
			SELECT	'X'
			FROM	maw_bp_key w
			WHERE	0=0
			AND	w.bp_cd = m.bp_cd
		)
	;
	DELETE FROM mam_bp_lcl_all m
	WHERE	0=0
	AND	m.co_cd = l_co
	AND	EXISTS (
			SELECT	'X'
			FROM	maw_bp_key w
			WHERE	0=0
			AND	w.bp_cd = m.bp_cd
		)
	;
	
	DELETE FROM mam_bp_sub m
	WHERE	0=0
	AND	EXISTS (
			SELECT	'X'
			FROM	maw_bp_key w
			WHERE	0=0
			AND	w.bp_cd = m.bp_cd
		)
	;

	SELECT	COUNT(*)
	INTO	STRICT l_cnt
	FROM	mam_sys_parm m
	WHERE	0=0
	AND	m.parm_key = 'BP_CMN_DEL'
	AND	m.parm_val = '1'
	AND	m.del_flg = '0'
	;

	IF l_cnt > 0 THEN
		DELETE FROM mam_bp_cmn m
		WHERE	0=0
		AND	EXISTS(
			SELECT	'X'
			FROM	maw_bp_key w
			WHERE	0 = 0
			AND	m.bp_cd = w.bp_cd
			)
		AND	NOT EXISTS(
			SELECT	'X'
			FROM	mam_bp_all y1
			WHERE	0=0
			AND	m.bp_cd = y1.bp_cd
			)
		;
		DELETE FROM mam_bp_lcl m
		WHERE	0=0
		AND	EXISTS(
			SELECT	'X'
			FROM	maw_bp_key w
			WHERE	0 = 0
			AND	m.bp_cd = w.bp_cd
			)
		AND	NOT EXISTS(
			SELECT	'X'
			FROM	mam_bp_all y1
			WHERE	0=0
			AND	m.bp_cd = y1.bp_cd
			)
		;
	END IF ;
END ;
$BODY$
LANGUAGE plpgsql
;
