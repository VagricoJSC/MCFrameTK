\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_sundry_itm_all'
	 OR table_name = 'mam_itm_stop_cmn'
	 OR table_name = 'mam_itm_stop_all'
	 OR table_name = 'mam_inpt_chk_all'
	 OR table_name = 'mam_stdcost_all'
	 OR table_name = 'mam_spec_cmn'
	 OR table_name = 'mam_spec_all'
	 OR table_name = 'mam_spec_desc_cmn'
	 OR table_name = 'mam_spec_desc_all'
	;

