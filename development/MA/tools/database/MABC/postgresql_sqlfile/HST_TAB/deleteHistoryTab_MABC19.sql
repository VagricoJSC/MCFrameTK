\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_wg_all'
	 OR table_name = 'mam_loc_cmn'
	 OR table_name = 'mam_loc_all'
	 OR table_name = 'mam_loc_sub_cmn'
	 OR table_name = 'mam_loc_sub_all'
	 OR table_name = 'mam_str_ln_cmn'
	 OR table_name = 'mam_str_ln_all'
	 OR table_name = 'mam_itm_typ_d_cmn'
	 OR table_name = 'mam_itm_typ_d_all'
	;

