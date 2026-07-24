\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fcm_systs_co'
	 OR table_name = 'fct_print_dat'
	 OR table_name = 'fct_print_img'
	 OR table_name = 'fcm_report_key'
	 OR table_name = 'fcm_report_conf'
	 OR table_name = 'fcm_sqltrace'
	 OR table_name = 'fct_db_session_map'
	 OR table_name = 'fct_db_session'
	 OR table_name = 'fct_oracle_session'
	;

