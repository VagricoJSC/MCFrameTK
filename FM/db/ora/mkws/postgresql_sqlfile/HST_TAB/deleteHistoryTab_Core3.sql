\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_postgresql_session'
	 OR table_name = 'fct_srv_request'
	 OR table_name = 'fct_srv_request_file'
	 OR table_name = 'fcm_const_nm'
	 OR table_name = 'fcm_const_grp_nm'
	 OR table_name = 'fct_server_signal'
	 OR table_name = 'fct_context'
	 OR table_name = 'fct_login'
	 OR table_name = 'fct_pw_mod'
	;

