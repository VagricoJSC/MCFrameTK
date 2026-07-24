\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_pushmsg_screen'
	 OR table_name = 'fct_pushmsg_send'
	 OR table_name = 'fcm_pushmsg_setting'
	 OR table_name = 'fcm_mining'
	 OR table_name = 'fcm_mining_condition'
	 OR table_name = 'fcm_mining_method'
	 OR table_name = 'fcm_mining_sumcond'
	 OR table_name = 'fcm_mining_task'
	 OR table_name = 'fcm_mining_task_param'
	;

