\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fcm_mining_task_sche'
	 OR table_name = 'fct_mining_task_log'
	 OR table_name = 'fct_mining_gadget_cache'
	 OR table_name = 'fct_design'
	 OR table_name = 'fct_design_prop'
	 OR table_name = 'fct_design_node'
	 OR table_name = 'fct_design_node_prop'
	 OR table_name = 'fct_design_vector'
	 OR table_name = 'fct_design_vector_prop'
	;

