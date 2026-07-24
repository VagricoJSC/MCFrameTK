\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_dpt_map_all'
	 OR table_name = 'mam_dpt_lvl_cmn'
	 OR table_name = 'mam_dpt_lvl_all'
	 OR table_name = 'mam_usr_cmn'
	 OR table_name = 'mam_usr_all'
	 OR table_name = 'mam_da_cmn'
	 OR table_name = 'mam_da_all'
	 OR table_name = 'mam_da_ctl_cmn'
	 OR table_name = 'mam_da_ctl_all'
	;

