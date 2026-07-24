\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_mst_dblink'
	 OR table_name = 'mam_view_definition'
	 OR table_name = 'mac_trd_ptn_ctl'
	 OR table_name = 'mam_if_ntc_ctl_all'
	 OR table_name = 'mam_if_ntc_all'
	 OR table_name = 'mam_cntry_cmn'
	 OR table_name = 'mam_cntry_all'
	 OR table_name = 'mam_area_cmn'
	 OR table_name = 'mam_area_all'
	;

