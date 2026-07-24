\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_cur_xrate_cmn'
	 OR table_name = 'mam_cur_xrate_all'
	 OR table_name = 'mam_unit_cmn'
	 OR table_name = 'mam_unit_all'
	 OR table_name = 'mam_unit_conv_cmn'
	 OR table_name = 'mam_unit_conv_all'
	 OR table_name = 'mam_hs_grp_cmn'
	 OR table_name = 'mam_hs_grp_all'
	 OR table_name = 'mam_hs_cmn'
	;

