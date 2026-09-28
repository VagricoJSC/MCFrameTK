\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_ship_wk_grp_lcl_all'
	 OR table_name = 'mam_set_grp_lcl_all'
	 OR table_name = 'mam_mps_grp_lcl_all'
	;

