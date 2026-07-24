\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_ship_term_all'
	 OR table_name = 'mam_ship_wk_cmn'
	 OR table_name = 'mam_ship_wk_all'
	 OR table_name = 'mam_trnspt_cmn'
	 OR table_name = 'mam_trnspt_all'
	 OR table_name = 'mam_exim_port_cmn'
	 OR table_name = 'mam_exim_port_all'
	 OR table_name = 'mam_ex_cntnr_cmn'
	 OR table_name = 'mam_ex_cntnr_all'
	;

