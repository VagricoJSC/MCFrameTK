\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_sls_anly_cmn'
	 OR table_name = 'mam_sls_anly_all'
	 OR table_name = 'mam_tterm_cmn'
	 OR table_name = 'mam_tterm_all'
	 OR table_name = 'mam_setoff_grp_cmn'
	 OR table_name = 'mam_setoff_grp_all'
	 OR table_name = 'mam_lg_grp_cmn'
	 OR table_name = 'mam_lg_grp_all'
	 OR table_name = 'mam_ship_term_cmn'
	;

