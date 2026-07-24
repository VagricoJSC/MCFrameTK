\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_site_co_lcl_all'
	 OR table_name = 'mam_bp_lcl_cmn'
	 OR table_name = 'mam_bp_lcl_all'
	 OR table_name = 'mam_pf_grp_lcl_cmn'
	 OR table_name = 'mam_pf_grp_lcl_all'
	 OR table_name = 'mam_site_lcl_cmn'
	 OR table_name = 'mam_site_lcl_all'
	 OR table_name = 'mam_loc_grp_lcl_cmn'
	 OR table_name = 'mam_loc_grp_lcl_all'
	;

