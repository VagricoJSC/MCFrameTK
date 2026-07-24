\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_lg_grp_lcl_cmn'
	 OR table_name = 'mam_lg_grp_lcl_all'
	 OR table_name = 'mam_ship_term_lcl_cmn'
	 OR table_name = 'mam_ship_term_lcl_all'
	 OR table_name = 'mam_ship_wk_lcl_cmn'
	 OR table_name = 'mam_ship_wk_lcl_all'
	 OR table_name = 'mam_trnspt_lcl_cmn'
	 OR table_name = 'mam_trnspt_lcl_all'
	 OR table_name = 'mam_exim_port_lcl_cmn'
	;

