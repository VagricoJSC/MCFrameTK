\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_out_appr_all'
	 OR table_name = 'mam_purc_upri_all'
	 OR table_name = 'mam_purc_upri_apl_all'
	 OR table_name = 'mam_proc_upri_all'
	 OR table_name = 'mam_proc_upri_apl_all'
	 OR table_name = 'mam_prov_upri_all'
	 OR table_name = 'mam_prov_upri_apl_all'
	 OR table_name = 'mam_cst_sls_upri_rank_all'
	 OR table_name = 'mam_std_sls_upri_all'
	;

