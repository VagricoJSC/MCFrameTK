\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_cost_menu_all'
	 OR table_name = 'mam_menu_config_cmn'
	 OR table_name = 'mam_menu_config_all'
	 OR table_name = 'mam_alc_ptn_cmn'
	 OR table_name = 'mam_alc_ptn_all'
	 OR table_name = 'mam_alc_ac_grp_cmn'
	 OR table_name = 'mam_alc_ac_grp_all'
	 OR table_name = 'mam_alc_ac_cmn'
	 OR table_name = 'mam_alc_ac_all'
	;

