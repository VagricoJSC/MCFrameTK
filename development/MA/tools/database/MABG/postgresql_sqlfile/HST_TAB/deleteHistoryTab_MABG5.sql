\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_rpt_cmp_conf_all'
	 OR table_name = 'mam_rpt_cmp_sml_all'
	 OR table_name = 'mam_stk_eval_all'
	 OR table_name = 'mam_cost_report_all'
	 OR table_name = 'mam_pre_alc_ptn_cmn'
	 OR table_name = 'mam_pre_alc_ptn_all'
	 OR table_name = 'mam_pre_alc_rate_all'
	 OR table_name = 'mam_pre_alc_ctg_all'
	 OR table_name = 'mam_pre_alc_rate_sel_all'
	;

