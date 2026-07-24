\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_act_ptn_lcl_all'
	 OR table_name = 'mam_gp_alc_lcl_cmn'
	 OR table_name = 'mam_gp_alc_lcl_all'
	 OR table_name = 'mam_calc_ctg_lcl_cmn'
	 OR table_name = 'mam_calc_ctg_lcl_all'
	 OR table_name = 'mam_rpt_ptn_lcl_cmn'
	 OR table_name = 'mam_rpt_ptn_lcl_all'
	 OR table_name = 'mam_ext_sys_lcl_cmn'
	 OR table_name = 'mam_ext_sys_lcl_all'
	;

