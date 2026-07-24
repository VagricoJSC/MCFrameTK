\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_co_lcl_all'
	 OR table_name = 'mam_dpt_base_lcl_cmn'
	 OR table_name = 'mam_dpt_base_lcl_all'
	 OR table_name = 'mam_dpt_lcl_cmn'
	 OR table_name = 'mam_dpt_lcl_all'
	 OR table_name = 'mam_dpt_lvl_lcl_cmn'
	 OR table_name = 'mam_dpt_lvl_lcl_all'
	 OR table_name = 'mam_usr_lcl_cmn'
	 OR table_name = 'mam_usr_lcl_all'
	;

