\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_co_all'
	 OR table_name = 'mam_co_sub_all'
	 OR table_name = 'mam_dpt_base_cmn'
	 OR table_name = 'mam_dpt_base_all'
	 OR table_name = 'mam_dpt_cmn'
	 OR table_name = 'mam_dpt_all'
	 OR table_name = 'mam_dpt_his_cmn'
	 OR table_name = 'mam_dpt_his_all'
	 OR table_name = 'mam_dpt_map_cmn'
	;

