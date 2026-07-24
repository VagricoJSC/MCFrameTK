\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_cost_sls_all'
	 OR table_name = 'mam_alc_coef_all'
	 OR table_name = 'mam_coef_config_all'
	 OR table_name = 'mam_coef_auto_all'
	 OR table_name = 'mam_alc_rule_all'
	 OR table_name = 'mam_alc_wk_all'
	 OR table_name = 'mam_alc_expns_all'
	 OR table_name = 'mam_alc_inpt_all'
	 OR table_name = 'mam_alc_other_all'
	;

