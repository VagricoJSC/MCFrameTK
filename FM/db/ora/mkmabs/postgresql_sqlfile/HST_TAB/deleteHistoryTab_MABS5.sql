\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_cst_sls_upri_all'
	 OR table_name = 'mam_cst_sls_upri_apl_all'
	 OR table_name = 'mam_cst_dlv_all'
	 OR table_name = 'mam_cst_usr_all'
	 OR table_name = 'mam_sppl_usr_all'
	 OR table_name = 'mam_bp_itm_all'
	 OR table_name = 'mam_edi_if_ctl_all'
	 OR table_name = 'mam_lg_ctl_all'
	 OR table_name = 'mam_ship_cl_all'
	;

