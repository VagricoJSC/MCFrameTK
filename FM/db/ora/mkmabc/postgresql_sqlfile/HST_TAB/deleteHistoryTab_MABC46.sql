\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_alloc_grp_lcl_cmn'
	 OR table_name = 'mam_alloc_grp_lcl_all'
	 OR table_name = 'mam_wg_lcl_cmn'
	 OR table_name = 'mam_wg_lcl_all'
	 OR table_name = 'mam_loc_lcl_cmn'
	 OR table_name = 'mam_loc_lcl_all'
	 OR table_name = 'mam_str_ln_lcl_cmn'
	 OR table_name = 'mam_str_ln_lcl_all'
	 OR table_name = 'mam_itm_typ_d_lcl_cmn'
	;

