\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgc_non_mov_ctl_def'
	 OR table_name = 'mgc_non_mov_ctl_all'
	 OR table_name = 'mgt_io_act_rcv_all'
	 OR table_name = 'mgt_act_wk_rcv_all'
	 OR table_name = 'mgt_act_inst_wip_rcv_all'
	 OR table_name = 'mgt_act_stk_rcv_all'
	 OR table_name = 'mgt_pre_rate_term_all'
	 OR table_name = 'mgt_pre_rate_mly_all'
	 OR table_name = 'mgt_alc_rate_all'
	;

