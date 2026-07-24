\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_unit_lcl_cmn'
	 OR table_name = 'mam_unit_lcl_all'
	 OR table_name = 'mam_hs_grp_lcl_cmn'
	 OR table_name = 'mam_hs_grp_lcl_all'
	 OR table_name = 'mam_hs_lcl_cmn'
	 OR table_name = 'mam_hs_lcl_all'
	 OR table_name = 'mam_itm_grp_lcl_cmn'
	 OR table_name = 'mam_itm_grp_lcl_all'
	 OR table_name = 'mam_sls_itm_grp_lcl_cmn'
	;

