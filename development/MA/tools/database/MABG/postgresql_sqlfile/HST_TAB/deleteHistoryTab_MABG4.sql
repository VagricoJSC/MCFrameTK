\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_rpt_key_cmn'
	 OR table_name = 'mam_rpt_key_all'
	 OR table_name = 'mam_calc_rpt_ptn_all'
	 OR table_name = 'mam_rpt_key_conf_all'
	 OR table_name = 'mam_rpt_conf_cmn'
	 OR table_name = 'mam_rpt_conf_all'
	 OR table_name = 'mam_rpt_row_sml_cmn'
	 OR table_name = 'mam_rpt_row_sml_all'
	 OR table_name = 'mam_rpt_cmp_all'
	;

