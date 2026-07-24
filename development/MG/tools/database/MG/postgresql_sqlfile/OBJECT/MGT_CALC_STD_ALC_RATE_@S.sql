\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_std_alc_rate_$s(
	calc_no,
	calc_grp_cd,
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
	alc_rate,
	alc_ptn_cd,
	expns_cd,
	calc_ctg_cd
	)
AS
SELECT
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.calc_no,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.calc_grp_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.alc_ac_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.dpt_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.loc_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.oper_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.bp_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.ctg_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.itm_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.itm_sub1,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.itm_sub2,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.itm_sub3,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.wg_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.alc_rate,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.alc_ptn_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.expns_cd,
	mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.calc_ctg_cd
FROM
	mgt_calc_std_alc_rate_all mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org
WHERE
	0 = 0
	AND mgt_calc_std_alc_rate_$s_mgt_calc_std_alc_rate_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_std_alc_rate_$s_fct_context WHERE pid = pg_backend_pid())
;

