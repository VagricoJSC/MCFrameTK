\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_itm_wg_all'
	 OR table_name = 'mam_itm_site_all'
	 OR table_name = 'mam_itm_dtl_all'
	 OR table_name = 'mam_itm_strg_all'
	 OR table_name = 'mam_bom_all'
	 OR table_name = 'mam_gp_bom_all'
	 OR table_name = 'mam_alt_grp_all'
	 OR table_name = 'mam_alt_itm_all'
	 OR table_name = 'mam_itm_oper_all'
	;

