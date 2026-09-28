\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_std_sls_upri_apl_all'
	 OR table_name = 'mam_itm_sls_upri_all'
	 OR table_name = 'mam_itm_sls_upri_apl_all'
	 OR table_name = 'mam_cst_sls_upri_all'
	 OR table_name = 'mam_cst_sls_upri_apl_all'
	 OR table_name = 'mam_cst_dlv_all'
	 OR table_name = 'mam_cst_usr_all'
	 OR table_name = 'mam_sppl_usr_all'
	 OR table_name = 'mam_bp_itm_all'
	;

