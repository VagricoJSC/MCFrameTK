\encoding UTF-8

CREATE OR REPLACE VIEW mgt_calc_itm_mfg_inst(
	calc_no,
	calc_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	itm_ext,
	itm_mfg_inst_no,
	mfg_act_no,
	wg_cd,
	mng_dpt_cd,
	lot_no,
	sublot_no,
	sno1,
	sno2,
	sno3,
	sno4,
	sppl_cd,
	po_no,
	slo_no,
	iv_no,
	asst_typ,
	qty,
	schd_st_dt,
	schd_end_dt,
	act_st_dt,
	act_end_dt,
	calc_ctg_cd
	)
AS
SELECT
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.calc_no,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.calc_grp_cd,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.itm_cd,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.itm_sub1,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.itm_sub2,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.itm_sub3,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.itm_ext,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.itm_mfg_inst_no,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.mfg_act_no,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.wg_cd,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.mng_dpt_cd,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.lot_no,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.sublot_no,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.sno1,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.sno2,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.sno3,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.sno4,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.sppl_cd,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.po_no,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.slo_no,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.iv_no,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.asst_typ,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.qty,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.schd_st_dt,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.schd_end_dt,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.act_st_dt,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.act_end_dt,
	mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.calc_ctg_cd
FROM
	mgt_calc_itm_mfg_inst_all mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org
WHERE
	0 = 0
	AND mgt_calc_itm_mfg_inst_mgt_calc_itm_mfg_inst_all_org.co_cd = (SELECT co_cd FROM fct_context mgt_calc_itm_mfg_inst_fct_context WHERE pid = pg_backend_pid())
;

