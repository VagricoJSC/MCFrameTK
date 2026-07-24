\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_cost_io13_all'
	 OR table_name = 'mgt_cost_io14_all'
	 OR table_name = 'mgt_cost_io15_all'
	 OR table_name = 'mgt_cost_io16_all'
	 OR table_name = 'mgt_cost_io17_all'
	 OR table_name = 'mgt_cost_io18_all'
	 OR table_name = 'mgt_cost_io19_all'
	 OR table_name = 'mgt_cost_io20_all'
	 OR table_name = 'mgt_stk_loss_all'
	;

