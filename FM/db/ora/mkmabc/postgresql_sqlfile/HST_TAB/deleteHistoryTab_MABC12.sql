\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_wk_cost_all'
	 OR table_name = 'mam_wk_day_cmn'
	 OR table_name = 'mam_wk_day_all'
	 OR table_name = 'mam_rsrc_cmn'
	 OR table_name = 'mam_rsrc_all'
	 OR table_name = 'mam_oper_cmn'
	 OR table_name = 'mam_oper_all'
	 OR table_name = 'mam_bp_grp_cmn'
	 OR table_name = 'mam_bp_grp_all'
	;

