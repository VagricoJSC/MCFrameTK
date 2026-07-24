\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_stk_gd_cmn'
	 OR table_name = 'mam_stk_gd_all'
	 OR table_name = 'mam_trd_cmn'
	 OR table_name = 'mam_trd_all'
	 OR table_name = 'mam_slip_form_cmn'
	 OR table_name = 'mam_slip_form_all'
	 OR table_name = 'mam_po_print_cmn'
	 OR table_name = 'mam_po_print_all'
	 OR table_name = 'mam_sls_upri_grp_cmn'
	;

