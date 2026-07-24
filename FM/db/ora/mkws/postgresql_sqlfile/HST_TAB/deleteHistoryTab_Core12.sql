\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_message_queue'
	 OR table_name = 'fct_message_queue_param'
	 OR table_name = 'fcm_role_lcl_all'
	 OR table_name = 'fcm_co_lcl_all'
	 OR table_name = 'fcm_user_grp_lcl_all'
	 OR table_name = 'fcm_gp_batch_grp_lcl_all'
	 OR table_name = 'fcm_gp_batch_all'
	 OR table_name = 'fcm_gp_batch_args'
	 OR table_name = 'fcm_gp_batch_grp_all'
	;

