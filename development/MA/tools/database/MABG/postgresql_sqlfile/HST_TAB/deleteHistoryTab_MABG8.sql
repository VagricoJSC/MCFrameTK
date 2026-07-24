\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_cost_sls_lcl_all'
	 OR table_name = 'mam_alc_coef_lcl_all'
	 OR table_name = 'mam_cost_io_lcl_cmn'
	 OR table_name = 'mam_cost_io_lcl_all'
	 OR table_name = 'mam_cost_io_conf_lcl_cmn'
	 OR table_name = 'mam_cost_io_conf_lcl_all'
	 OR table_name = 'mam_rpt_key_lcl_cmn'
	 OR table_name = 'mam_rpt_key_lcl_all'
	 OR table_name = 'mam_rpt_conf_lcl_cmn'
	;

