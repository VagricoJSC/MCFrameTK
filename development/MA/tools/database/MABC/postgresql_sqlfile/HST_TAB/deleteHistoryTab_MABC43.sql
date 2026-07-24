\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_exim_port_lcl_all'
	 OR table_name = 'mam_ex_cntnr_lcl_cmn'
	 OR table_name = 'mam_ex_cntnr_lcl_all'
	 OR table_name = 'mam_stk_gd_lcl_cmn'
	 OR table_name = 'mam_stk_gd_lcl_all'
	 OR table_name = 'mam_trd_lcl_cmn'
	 OR table_name = 'mam_trd_lcl_all'
	 OR table_name = 'mam_slip_form_lcl_cmn'
	 OR table_name = 'mam_slip_form_lcl_all'
	;

