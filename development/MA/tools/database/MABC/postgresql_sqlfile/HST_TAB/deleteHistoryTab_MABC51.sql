\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_expns_grp_lcl_all'
	 OR table_name = 'mam_expns_lcl_cmn'
	 OR table_name = 'mam_expns_lcl_all'
	 OR table_name = 'mam_cost_menu_lcl_cmn'
	 OR table_name = 'mam_cost_menu_lcl_all'
	 OR table_name = 'mam_alc_ptn_lcl_cmn'
	 OR table_name = 'mam_alc_ptn_lcl_all'
	 OR table_name = 'mam_alc_ac_grp_lcl_cmn'
	 OR table_name = 'mam_alc_ac_grp_lcl_all'
	;

