\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_out_appr_all'
	 OR table_name = 'mam_collat_exp_all'
	 OR table_name = 'mam_shipyard_all'
	 OR table_name = 'mam_mrkt_all'
	 OR table_name = 'mam_cntry_sign_all'
	 OR table_name = 'mam_purc_upri_all'
	 OR table_name = 'mam_purc_upri_apl_all'
	 OR table_name = 'mam_proc_upri_all'
	 OR table_name = 'mam_proc_upri_apl_all'
	;

