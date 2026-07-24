\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_wk_rsn_lcl_cmn'
	 OR table_name = 'mam_wk_rsn_lcl_all'
	 OR table_name = 'mam_wk_cost_lcl_cmn'
	 OR table_name = 'mam_wk_cost_lcl_all'
	 OR table_name = 'mam_wk_day_lcl_cmn'
	 OR table_name = 'mam_wk_day_lcl_all'
	 OR table_name = 'mam_rsrc_lcl_cmn'
	 OR table_name = 'mam_rsrc_lcl_all'
	 OR table_name = 'mam_oper_lcl_cmn'
	;

