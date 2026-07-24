\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_sls_upri_grp_all'
	 OR table_name = 'mam_sls_upri_rank_cmn'
	 OR table_name = 'mam_sls_upri_rank_all'
	 OR table_name = 'mam_itm_ship_grp_cmn'
	 OR table_name = 'mam_itm_ship_grp_all'
	 OR table_name = 'mam_ship_valid_cmn'
	 OR table_name = 'mam_ship_valid_all'
	 OR table_name = 'mam_site_co_cmn'
	 OR table_name = 'mam_site_co_all'
	;

