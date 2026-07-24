\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_sls_upri_grp_lcl_cmn'
	 OR table_name = 'mam_sls_upri_grp_lcl_all'
	 OR table_name = 'mam_sls_upri_rank_lcl_cmn'
	 OR table_name = 'mam_sls_upri_rank_lcl_all'
	 OR table_name = 'mam_itm_ship_grp_lcl_cmn'
	 OR table_name = 'mam_itm_ship_grp_lcl_all'
	 OR table_name = 'mam_ship_valid_lcl_cmn'
	 OR table_name = 'mam_ship_valid_lcl_all'
	 OR table_name = 'mam_site_co_lcl_cmn'
	;

