\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_rpt_conf_lcl_all'
	 OR table_name = 'mam_rpt_cmp_lcl_all'
	 OR table_name = 'mam_rpt_cmp_conf_lcl_all'
	 OR table_name = 'mam_stk_eval_lcl_all'
	 OR table_name = 'mam_pre_alc_ptn_lcl_cmn'
	 OR table_name = 'mam_pre_alc_ptn_lcl_all'
	 OR table_name = 'mam_pre_alc_rate_lcl_all'
	;

