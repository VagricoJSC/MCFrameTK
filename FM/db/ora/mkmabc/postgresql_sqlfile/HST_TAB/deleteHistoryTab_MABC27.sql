\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_jnl_key_map_cmn'
	 OR table_name = 'mam_jnl_key_map_all'
	 OR table_name = 'mam_schd_pay_cmn'
	 OR table_name = 'mam_schd_pay_all'
	 OR table_name = 'mam_expns_grp_cmn'
	 OR table_name = 'mam_expns_grp_all'
	 OR table_name = 'mam_expns_cmn'
	 OR table_name = 'mam_expns_all'
	 OR table_name = 'mam_cost_menu_cmn'
	;

