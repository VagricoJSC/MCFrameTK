\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_act_purc_if_all'
	 OR table_name = 'mgt_act_inpt_if_all'
	 OR table_name = 'mgt_act_inst_wk_if_all'
	 OR table_name = 'mgt_act_other_wk_if_all'
	 OR table_name = 'mgt_act_inst_wip_if_all'
	 OR table_name = 'mgt_act_io_if_all'
	 OR table_name = 'mgt_act_sls_if_all'
	 OR table_name = 'mgt_act_stk_if_all'
	 OR table_name = 'mgt_non_mov_stk_all'
	;

