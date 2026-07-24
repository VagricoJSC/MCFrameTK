\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_itm_prov_$s(
	calc_no,
	calc_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	prsppl_cd,
	wg_cd,
	prov_typ,
	base_qty,
	cur_cd,
	upri,
	base_cur_upri,
	calc_ctg_cd,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3
	)
AS
SELECT
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.calc_no,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.calc_grp_cd,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.itm_cd,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.itm_sub1,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.itm_sub2,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.itm_sub3,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.prsppl_cd,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.wg_cd,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.prov_typ,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.base_qty,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.cur_cd,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.upri,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.base_cur_upri,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.calc_ctg_cd,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.rmrks,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.sub_char1,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.sub_char2,
	mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.sub_char3
FROM
	mgt_calc_itm_prov_all mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org
WHERE
	0 = 0
	AND mgt_calc_itm_prov_$s_mgt_calc_itm_prov_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_itm_prov_$s_fct_context WHERE pid = pg_backend_pid())
;

