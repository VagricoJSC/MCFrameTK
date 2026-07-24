\encoding UTF-8

CREATE OR REPLACE VIEW mst_onr_prov_bal_$u(
	asppl_cd,
	ap_dpt_cd,
	ac_ym,
	trd_cur_cd,
	init_bal,
	onr_prov_amt,
	onr_prov_ret_amt,
	setoff_amt,
	tax_amt,
	end_bal,
	base_cur_cd,
	base_cur_init_bal,
	base_cur_onr_prov_amt,
	base_cur_onr_prov_ret_amt,
	base_cur_setoff_amt,
	base_cur_tax_amt,
	base_cur_end_bal,
	sub_char1,
	sub_char2,
	sub_char3,
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
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.asppl_cd,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.ap_dpt_cd,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.ac_ym,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.trd_cur_cd,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.init_bal,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.onr_prov_amt,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.onr_prov_ret_amt,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.setoff_amt,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.tax_amt,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.end_bal,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.base_cur_cd,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.base_cur_init_bal,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.base_cur_onr_prov_amt,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.base_cur_onr_prov_ret_amt,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.base_cur_setoff_amt,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.base_cur_tax_amt,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.base_cur_end_bal,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.sub_char1,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.sub_char2,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.sub_char3,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.ins_usr_id,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.ins_usr_nm,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.ins_ts,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.ins_func_id,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.upd_cntr,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.upd_usr_id,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.upd_usr_nm,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.upd_ts,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.upd_func_id,
	mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.upd_srv_req_no
FROM
	mst_onr_prov_bal_all mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org
WHERE
	0 = 0
	AND mst_onr_prov_bal_$u_mst_onr_prov_bal_all_org.co_cd = fcpa_context$f_get_co_cd()
;

