\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_bom_$u(
	calc_no,
	calc_grp_cd,
	par_itm_cd,
	par_itm_sub1,
	par_itm_sub2,
	par_itm_sub3,
	bom_ptn,
	oper_cd,
	oper_seq,
	chd_itm_cd,
	chd_itm_sub1,
	chd_itm_sub2,
	chd_itm_sub3,
	alt_grp_cd,
	expns_cd,
	wg_cd,
	disp_seq,
	par_rqmt_qty,
	chd_rqmt_qty,
	chd_base_qty,
	fxd_chd_rqmt_qty,
	chd_min_qty,
	chd_batch_qty,
	alt_itm_ratio,
	calc_ctg_cd,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3
	)
AS
SELECT
	mgt_calc_bom_$u_mgt_calc_bom_all_org.calc_no,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.calc_grp_cd,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.par_itm_cd,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.par_itm_sub1,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.par_itm_sub2,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.par_itm_sub3,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.bom_ptn,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.oper_cd,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.oper_seq,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.chd_itm_cd,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.chd_itm_sub1,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.chd_itm_sub2,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.chd_itm_sub3,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.alt_grp_cd,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.expns_cd,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.wg_cd,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.disp_seq,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.par_rqmt_qty,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.chd_rqmt_qty,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.chd_base_qty,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.fxd_chd_rqmt_qty,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.chd_min_qty,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.chd_batch_qty,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.alt_itm_ratio,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.calc_ctg_cd,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.rmrks,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.sub_char1,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.sub_char2,
	mgt_calc_bom_$u_mgt_calc_bom_all_org.sub_char3
FROM
	mgt_calc_bom_all mgt_calc_bom_$u_mgt_calc_bom_all_org
WHERE
	0 = 0
	AND mgt_calc_bom_$u_mgt_calc_bom_all_org.co_cd = fcpa_context$f_get_co_cd()
;

