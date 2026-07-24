\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_cred_ctrl_cmn'
	 OR table_name = 'mam_cred_ctrl_all'
	 OR table_name = 'mam_site_cmn'
	 OR table_name = 'mam_site_all'
	 OR table_name = 'mam_loc_grp_cmn'
	 OR table_name = 'mam_loc_grp_all'
	 OR table_name = 'mam_alloc_grp_cmn'
	 OR table_name = 'mam_alloc_grp_all'
	 OR table_name = 'mam_wg_cmn'
	;

