\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_da_lcl_cmn'
	 OR table_name = 'mam_da_lcl_all'
	 OR table_name = 'mam_aprv_role_lcl_cmn'
	 OR table_name = 'mam_aprv_role_lcl_all'
	 OR table_name = 'mam_num_ptn_lcl_all'
	 OR table_name = 'mam_gp_grp_lcl_all'
	 OR table_name = 'mam_gp_lcl_all'
	 OR table_name = 'mam_term_lcl_cmn'
	 OR table_name = 'mam_term_lcl_all'
	;

