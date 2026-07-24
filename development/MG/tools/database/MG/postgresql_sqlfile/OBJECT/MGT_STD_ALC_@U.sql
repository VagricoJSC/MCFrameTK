\encoding UTF-8

CREATE OR REPLACE VIEW mgt_std_alc_$u(
	calc_no,
	calc_grp_cd,
	top_rec_no,
	alc_ac_cd,
	dpt_cd,
	loc_cd,
	oper_cd,
	bp_cd,
	ctg_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	wg_cd,
	alc_tgt_val,
	alc_rate,
	alc_amt,
	coef_val,
	alc_org_tgt_val,
	expns_cd,
	alc_ptn_cd,
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
	mgt_std_alc_$u_mgt_std_alc_all_org.calc_no,
	mgt_std_alc_$u_mgt_std_alc_all_org.calc_grp_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.top_rec_no,
	mgt_std_alc_$u_mgt_std_alc_all_org.alc_ac_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.dpt_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.loc_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.oper_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.bp_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.ctg_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.itm_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.itm_sub1,
	mgt_std_alc_$u_mgt_std_alc_all_org.itm_sub2,
	mgt_std_alc_$u_mgt_std_alc_all_org.itm_sub3,
	mgt_std_alc_$u_mgt_std_alc_all_org.wg_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.alc_tgt_val,
	mgt_std_alc_$u_mgt_std_alc_all_org.alc_rate,
	mgt_std_alc_$u_mgt_std_alc_all_org.alc_amt,
	mgt_std_alc_$u_mgt_std_alc_all_org.coef_val,
	mgt_std_alc_$u_mgt_std_alc_all_org.alc_org_tgt_val,
	mgt_std_alc_$u_mgt_std_alc_all_org.expns_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.alc_ptn_cd,
	mgt_std_alc_$u_mgt_std_alc_all_org.ins_usr_id,
	mgt_std_alc_$u_mgt_std_alc_all_org.ins_usr_nm,
	mgt_std_alc_$u_mgt_std_alc_all_org.ins_ts,
	mgt_std_alc_$u_mgt_std_alc_all_org.ins_func_id,
	mgt_std_alc_$u_mgt_std_alc_all_org.upd_cntr,
	mgt_std_alc_$u_mgt_std_alc_all_org.upd_usr_id,
	mgt_std_alc_$u_mgt_std_alc_all_org.upd_usr_nm,
	mgt_std_alc_$u_mgt_std_alc_all_org.upd_ts,
	mgt_std_alc_$u_mgt_std_alc_all_org.upd_func_id,
	mgt_std_alc_$u_mgt_std_alc_all_org.upd_srv_req_no
FROM
	mgt_std_alc_all mgt_std_alc_$u_mgt_std_alc_all_org
WHERE
	0 = 0
	AND mgt_std_alc_$u_mgt_std_alc_all_org.co_cd = fcpa_context$f_get_co_cd()
;

