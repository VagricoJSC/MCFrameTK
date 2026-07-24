\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_itm_typ_d_lcl_all'
	 OR table_name = 'mam_itm_lcl_cmn'
	 OR table_name = 'mam_itm_lcl_all'
	 OR table_name = 'mam_spec_lcl_cmn'
	 OR table_name = 'mam_spec_lcl_all'
	 OR table_name = 'mam_spec_desc_lcl_cmn'
	 OR table_name = 'mam_spec_desc_lcl_all'
	 OR table_name = 'mam_itm_spec_grp_lcl_cmn'
	 OR table_name = 'mam_itm_spec_grp_lcl_all'
	;

