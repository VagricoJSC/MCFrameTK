\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_oper_lcl_all'
	 OR table_name = 'mam_bp_grp_lcl_cmn'
	 OR table_name = 'mam_bp_grp_lcl_all'
	 OR table_name = 'mam_sls_anly_lcl_cmn'
	 OR table_name = 'mam_sls_anly_lcl_all'
	 OR table_name = 'mam_tterm_lcl_cmn'
	 OR table_name = 'mam_tterm_lcl_all'
	 OR table_name = 'mam_setoff_grp_lcl_cmn'
	 OR table_name = 'mam_setoff_grp_lcl_all'
	;

