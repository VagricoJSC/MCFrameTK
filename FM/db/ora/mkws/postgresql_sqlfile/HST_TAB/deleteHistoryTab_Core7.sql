\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fcm_serv_sts_msg'
	 OR table_name = 'fcm_grant_serv_sts'
	 OR table_name = 'fct_serv_sts_ctrl'
	 OR table_name = 'fct_ex_ctrl'
	 OR table_name = 'fct_ref_time'
	 OR table_name = 'fcm_server'
	 OR table_name = 'fct_hst_header'
	 OR table_name = 'fct_oprhistory'
	 OR table_name = 'fcm_history_table'
	;

