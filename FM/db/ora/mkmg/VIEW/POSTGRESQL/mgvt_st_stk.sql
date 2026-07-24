SELECT	mgvt_st_stk_mgt_st_stk_t1.st_stk_key,
	COALESCE(mgvt_st_stk_mgw_arg_w1.runtime_wg_cd, mgvt_st_stk_mgt_st_stk_t1.wg_cd) AS wg_cd,
	mgvt_st_stk_mgt_st_stk_t1.gr_dt,
	mgvt_st_stk_mgt_st_stk_t1.mng_dpt_cd,
	mgvt_st_stk_mgt_st_stk_t1.itm_cd,
	mgvt_st_stk_mgt_st_stk_t1.itm_sub1,
	mgvt_st_stk_mgt_st_stk_t1.itm_sub2,
	mgvt_st_stk_mgt_st_stk_t1.itm_sub3,
	mgvt_st_stk_mgt_st_stk_t1.itm_ext,
	mgvt_st_stk_mgt_st_stk_t1.lot_no,
	mgvt_st_stk_mgt_st_stk_t1.sublot_no,
	mgvt_st_stk_mgt_st_stk_t1.sno1,
	mgvt_st_stk_mgt_st_stk_t1.sno2,
	mgvt_st_stk_mgt_st_stk_t1.sno3,
	mgvt_st_stk_mgt_st_stk_t1.sno4,
	mgvt_st_stk_mgt_st_stk_t1.bp_cd,
	mgvt_st_stk_mgt_st_stk_t1.asst_typ,
	mgvt_st_stk_mgt_st_stk_t1.qty,
	mgvt_st_stk_mgt_st_stk_t1.repurc_obli_flg
FROM	mgw_arg mgvt_st_stk_mgw_arg_w1, mgt_calc_parm mgvt_st_stk_mgt_calc_parm_m1, mgt_st_stk mgvt_st_stk_mgt_st_stk_t1,
		(	SELECT calc_grp_cd,wg_cd FROM mam_grp_wg
			UNION
			SELECT calc_grp_cd,runtime_wg_cd wg_cd FROM mgw_arg 
		) mgvt_st_stk_mam_grp_wg_m2
WHERE	0=0
AND	mgvt_st_stk_mgw_arg_w1.calc_no = mgvt_st_stk_mgt_calc_parm_m1.calc_no
AND	mgvt_st_stk_mgw_arg_w1.calc_grp_cd = mgvt_st_stk_mgt_calc_parm_m1.calc_grp_cd
AND	mgvt_st_stk_mgt_calc_parm_m1.parm_key = 'ETC_STK_CALC_GRP'
AND	mgvt_st_stk_mgt_calc_parm_m1.parm_val = mgvt_st_stk_mgt_st_stk_t1.calc_grp_cd
AND	mgvt_st_stk_mgw_arg_w1.st_ym = mgvt_st_stk_mgt_st_stk_t1.ym
AND	mgvt_st_stk_mam_grp_wg_m2.calc_grp_cd = mgvt_st_stk_mgw_arg_w1.calc_grp_cd
AND	mgvt_st_stk_mam_grp_wg_m2.wg_cd = mgvt_st_stk_mgt_st_stk_t1.wg_cd
AND	(
	NOT EXISTS (
		SELECT	'X'
		FROM	mgw_usr_itm mgvt_st_stk_mgw_usr_itm_t
		WHERE	0=0
		)
	OR EXISTS (
		SELECT	'X'
		FROM	mgw_usr_itm mgvt_st_stk_mgw_usr_itm_x
		WHERE	0=0
		AND	mgvt_st_stk_mgw_usr_itm_x.itm_cd = mgvt_st_stk_mgt_st_stk_t1.itm_cd
		AND	mgvt_st_stk_mgw_usr_itm_x.itm_sub1 = mgvt_st_stk_mgt_st_stk_t1.itm_sub1
		AND	mgvt_st_stk_mgw_usr_itm_x.itm_sub2 = mgvt_st_stk_mgt_st_stk_t1.itm_sub2
		AND	mgvt_st_stk_mgw_usr_itm_x.itm_sub3 = mgvt_st_stk_mgt_st_stk_t1.itm_sub3
		)
	)
;
