\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_cost_io4_all'
	 OR table_name = 'mgt_cost_io5_all'
	 OR table_name = 'mgt_cost_io6_all'
	 OR table_name = 'mgt_cost_io7_all'
	 OR table_name = 'mgt_cost_io8_all'
	 OR table_name = 'mgt_cost_io9_all'
	 OR table_name = 'mgt_cost_io10_all'
	 OR table_name = 'mgt_cost_io11_all'
	 OR table_name = 'mgt_cost_io12_all'
	;

