\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_itm_sls(
	calc_no,
	calc_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	dpt_cd,
	cst_cd,
	dlv_cd,
	dest_cd1,
	dest_cd2,
	dest_cd3,
	wg_cd,
	base_qty,
	cur_cd,
	upri,
	base_cur_upri,
	prio,
	alc_val1,
	alc_val2,
	alc_val3,
	alc_val4,
	alc_val5,
	calc_ctg_cd,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3
	)
AS
SELECT
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.calc_no,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.calc_grp_cd,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.itm_cd,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.itm_sub1,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.itm_sub2,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.itm_sub3,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.dpt_cd,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.cst_cd,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.dlv_cd,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.dest_cd1,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.dest_cd2,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.dest_cd3,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.wg_cd,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.base_qty,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.cur_cd,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.upri,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.base_cur_upri,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.prio,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.alc_val1,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.alc_val2,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.alc_val3,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.alc_val4,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.alc_val5,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.calc_ctg_cd,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.rmrks,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.sub_char1,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.sub_char2,
	mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.sub_char3
FROM
	mgt_calc_itm_sls_all mgt_calc_itm_sls_mgt_calc_itm_sls_all_org
WHERE
	0 = 0
	AND mgt_calc_itm_sls_mgt_calc_itm_sls_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_itm_sls_fct_context WHERE pid = pg_backend_pid())
;

