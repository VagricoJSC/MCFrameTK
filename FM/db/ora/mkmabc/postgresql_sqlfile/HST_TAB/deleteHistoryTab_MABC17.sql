\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_bp_com_all'
	 OR table_name = 'mam_bp_cmn'
	 OR table_name = 'mam_bp_all'
	 OR table_name = 'mam_bp_sub_cmn'
	 OR table_name = 'mam_bp_sub_all'
	 OR table_name = 'mam_bp_stop_cmn'
	 OR table_name = 'mam_bp_stop_all'
	 OR table_name = 'mam_pf_grp_cmn'
	 OR table_name = 'mam_pf_grp_all'
	;

