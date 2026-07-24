\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_act_alc_amt_all'
	 OR table_name = 'mgt_pln_alc_amt_all'
	 OR table_name = 'mgt_act_alc_amt_if_all'
	 OR table_name = 'mgt_pln_alc_amt_if_all'
	 OR table_name = 'mgt_act_alc_amt_rcv_all'
	 OR table_name = 'mgt_pln_alc_amt_rcv_all'
	 OR table_name = 'mgt_calc_no_all'
	 OR table_name = 'mgt_arg_all'
	 OR table_name = 'mgt_arg_usr_all'
	;

