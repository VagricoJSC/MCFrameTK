\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_ctg_grp_cmn'
	 OR table_name = 'mam_ctg_grp_all'
	 OR table_name = 'mam_cost_ctg_cmn'
	 OR table_name = 'mam_cost_ctg_all'
	 OR table_name = 'mam_ctg_config_cmn'
	 OR table_name = 'mam_ctg_config_all'
	 OR table_name = 'mam_cost_dpt_cmn'
	 OR table_name = 'mam_cost_dpt_all'
	 OR table_name = 'mam_dpt_config_cmn'
	;

