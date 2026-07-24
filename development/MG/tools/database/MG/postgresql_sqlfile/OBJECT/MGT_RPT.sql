\encoding UTF-8

CREATE OR REPLACE VIEW mgt_rpt(
	calc_no,
	calc_grp_cd,
	ym,
	rpt_ptn_cd,
	rpt_key_cd,
	rpt_row_cd,
	wg_cd,
	dpt_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_jnl_cd,
	itm_grp_typ,
	itm_grp_cd,
	rpt_val,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no
	)
AS
SELECT
	mgt_rpt_mgt_rpt_all_org.calc_no,
	mgt_rpt_mgt_rpt_all_org.calc_grp_cd,
	mgt_rpt_mgt_rpt_all_org.ym,
	mgt_rpt_mgt_rpt_all_org.rpt_ptn_cd,
	mgt_rpt_mgt_rpt_all_org.rpt_key_cd,
	mgt_rpt_mgt_rpt_all_org.rpt_row_cd,
	mgt_rpt_mgt_rpt_all_org.wg_cd,
	mgt_rpt_mgt_rpt_all_org.dpt_cd,
	mgt_rpt_mgt_rpt_all_org.itm_cd,
	mgt_rpt_mgt_rpt_all_org.itm_sub1,
	mgt_rpt_mgt_rpt_all_org.itm_sub2,
	mgt_rpt_mgt_rpt_all_org.itm_sub3,
	mgt_rpt_mgt_rpt_all_org.itm_jnl_cd,
	mgt_rpt_mgt_rpt_all_org.itm_grp_typ,
	mgt_rpt_mgt_rpt_all_org.itm_grp_cd,
	mgt_rpt_mgt_rpt_all_org.rpt_val,
	mgt_rpt_mgt_rpt_all_org.ins_usr_id,
	mgt_rpt_mgt_rpt_all_org.ins_usr_nm,
	mgt_rpt_mgt_rpt_all_org.ins_ts,
	mgt_rpt_mgt_rpt_all_org.ins_func_id,
	mgt_rpt_mgt_rpt_all_org.upd_cntr,
	mgt_rpt_mgt_rpt_all_org.upd_usr_id,
	mgt_rpt_mgt_rpt_all_org.upd_usr_nm,
	mgt_rpt_mgt_rpt_all_org.upd_ts,
	mgt_rpt_mgt_rpt_all_org.upd_func_id,
	mgt_rpt_mgt_rpt_all_org.upd_srv_req_no
FROM
	mgt_rpt_all mgt_rpt_mgt_rpt_all_org
WHERE
	0 = 0
	AND mgt_rpt_mgt_rpt_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_rpt_fct_context WHERE pid = pg_backend_pid())
;

