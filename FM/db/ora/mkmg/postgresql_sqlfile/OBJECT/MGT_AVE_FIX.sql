\encoding UTF-8

CREATE OR REPLACE VIEW mgt_ave_fix(
	calc_grp_cd,
	wg_cd,
	ym,
	mng_dpt_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	lot_no,
	sublot_no,
	sno1,
	sno2,
	sno3,
	sno4,
	sppl_cd,
	asst_typ,
	std_qty,
	ave_upri,
	std_upri,
	calc_no,
	top_rec_no,
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
	mgt_ave_fix_mgt_ave_fix_all_org.calc_grp_cd,
	mgt_ave_fix_mgt_ave_fix_all_org.wg_cd,
	mgt_ave_fix_mgt_ave_fix_all_org.ym,
	mgt_ave_fix_mgt_ave_fix_all_org.mng_dpt_cd,
	mgt_ave_fix_mgt_ave_fix_all_org.itm_cd,
	mgt_ave_fix_mgt_ave_fix_all_org.itm_sub1,
	mgt_ave_fix_mgt_ave_fix_all_org.itm_sub2,
	mgt_ave_fix_mgt_ave_fix_all_org.itm_sub3,
	mgt_ave_fix_mgt_ave_fix_all_org.lot_no,
	mgt_ave_fix_mgt_ave_fix_all_org.sublot_no,
	mgt_ave_fix_mgt_ave_fix_all_org.sno1,
	mgt_ave_fix_mgt_ave_fix_all_org.sno2,
	mgt_ave_fix_mgt_ave_fix_all_org.sno3,
	mgt_ave_fix_mgt_ave_fix_all_org.sno4,
	mgt_ave_fix_mgt_ave_fix_all_org.sppl_cd,
	mgt_ave_fix_mgt_ave_fix_all_org.asst_typ,
	mgt_ave_fix_mgt_ave_fix_all_org.std_qty,
	mgt_ave_fix_mgt_ave_fix_all_org.ave_upri,
	mgt_ave_fix_mgt_ave_fix_all_org.std_upri,
	mgt_ave_fix_mgt_ave_fix_all_org.calc_no,
	mgt_ave_fix_mgt_ave_fix_all_org.top_rec_no,
	mgt_ave_fix_mgt_ave_fix_all_org.ins_usr_id,
	mgt_ave_fix_mgt_ave_fix_all_org.ins_usr_nm,
	mgt_ave_fix_mgt_ave_fix_all_org.ins_ts,
	mgt_ave_fix_mgt_ave_fix_all_org.ins_func_id,
	mgt_ave_fix_mgt_ave_fix_all_org.upd_cntr,
	mgt_ave_fix_mgt_ave_fix_all_org.upd_usr_id,
	mgt_ave_fix_mgt_ave_fix_all_org.upd_usr_nm,
	mgt_ave_fix_mgt_ave_fix_all_org.upd_ts,
	mgt_ave_fix_mgt_ave_fix_all_org.upd_func_id,
	mgt_ave_fix_mgt_ave_fix_all_org.upd_srv_req_no
FROM
	mgt_ave_fix_all mgt_ave_fix_mgt_ave_fix_all_org
WHERE
	0 = 0
	AND mgt_ave_fix_mgt_ave_fix_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_ave_fix_fct_context WHERE pid = pg_backend_pid())
;

