\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_itm_unit_cmn'
	 OR table_name = 'mam_itm_unit_all'
	 OR table_name = 'mam_itm_cmn'
	 OR table_name = 'mam_itm_all'
	 OR table_name = 'mam_itm_com'
	 OR table_name = 'mam_itm_sub_cmn'
	 OR table_name = 'mam_itm_sub_all'
	 OR table_name = 'mam_attach_info_cmn'
	 OR table_name = 'mam_attach_info_all'
	;

