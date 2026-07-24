\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_act_inpt_all'
	 OR table_name = 'mgt_act_inpt_expns_all'
	 OR table_name = 'mgt_act_inst_wk_all'
	 OR table_name = 'mgt_act_other_wk_all'
	 OR table_name = 'mgt_act_inst_wip_all'
	 OR table_name = 'mgt_act_io_all'
	 OR table_name = 'mgt_act_io_expns_all'
	 OR table_name = 'mgt_act_sls_all'
	 OR table_name = 'mgt_act_sls_expns_all'
	;

