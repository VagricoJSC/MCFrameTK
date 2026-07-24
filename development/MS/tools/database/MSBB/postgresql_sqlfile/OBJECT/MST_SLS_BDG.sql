\encoding UTF-8

CREATE OR REPLACE VIEW mst_sls_bdg(
	ym,
	sls_dpt_cd,
	wg_cd,
	sls_itm_grp_cd,
	cst_cd,
	sls_usr_cd,
	trd_cur_cd,
	wrk_no,
	sls_bdg_grp,
	bdg_sls_amt,
	bdg_sls_prof_rate,
	bdg_sls_prof_amt,
	not_sum_flg,
	sls_itm_grp_not_sum_flg,
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
	mst_sls_bdg_mst_sls_bdg_all_org.ym,
	mst_sls_bdg_mst_sls_bdg_all_org.sls_dpt_cd,
	mst_sls_bdg_mst_sls_bdg_all_org.wg_cd,
	mst_sls_bdg_mst_sls_bdg_all_org.sls_itm_grp_cd,
	mst_sls_bdg_mst_sls_bdg_all_org.cst_cd,
	mst_sls_bdg_mst_sls_bdg_all_org.sls_usr_cd,
	mst_sls_bdg_mst_sls_bdg_all_org.trd_cur_cd,
	mst_sls_bdg_mst_sls_bdg_all_org.wrk_no,
	mst_sls_bdg_mst_sls_bdg_all_org.sls_bdg_grp,
	mst_sls_bdg_mst_sls_bdg_all_org.bdg_sls_amt,
	mst_sls_bdg_mst_sls_bdg_all_org.bdg_sls_prof_rate,
	mst_sls_bdg_mst_sls_bdg_all_org.bdg_sls_prof_amt,
	mst_sls_bdg_mst_sls_bdg_all_org.not_sum_flg,
	mst_sls_bdg_mst_sls_bdg_all_org.sls_itm_grp_not_sum_flg,
	mst_sls_bdg_mst_sls_bdg_all_org.sub_char1,
	mst_sls_bdg_mst_sls_bdg_all_org.sub_char2,
	mst_sls_bdg_mst_sls_bdg_all_org.sub_char3,
	mst_sls_bdg_mst_sls_bdg_all_org.ins_usr_id,
	mst_sls_bdg_mst_sls_bdg_all_org.ins_usr_nm,
	mst_sls_bdg_mst_sls_bdg_all_org.ins_ts,
	mst_sls_bdg_mst_sls_bdg_all_org.ins_func_id,
	mst_sls_bdg_mst_sls_bdg_all_org.upd_cntr,
	mst_sls_bdg_mst_sls_bdg_all_org.upd_usr_id,
	mst_sls_bdg_mst_sls_bdg_all_org.upd_usr_nm,
	mst_sls_bdg_mst_sls_bdg_all_org.upd_ts,
	mst_sls_bdg_mst_sls_bdg_all_org.upd_func_id,
	mst_sls_bdg_mst_sls_bdg_all_org.upd_srv_req_no
FROM
	mst_sls_bdg_all mst_sls_bdg_mst_sls_bdg_all_org
WHERE
	0 = 0
	AND mst_sls_bdg_mst_sls_bdg_all_org.co_cd = (SELECT co_cd FROM fct_context mst_sls_bdg_fct_context WHERE pid = pg_backend_pid())
;

