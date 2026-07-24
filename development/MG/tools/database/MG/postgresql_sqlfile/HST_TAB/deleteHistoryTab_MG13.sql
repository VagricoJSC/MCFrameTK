\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_calc_io_expns_amt_all'
	 OR table_name = 'mgt_calc_io_trd_all'
	 OR table_name = 'mgt_calc_trd_calc_no_all'
	 OR table_name = 'mgt_pre_alc_all'
	 OR table_name = 'mgt_pre_alc_path_all'
	 OR table_name = 'mgt_exp_mfg_purc_all'
	 OR table_name = 'mgt_exp_oper_all'
	 OR table_name = 'mgt_exp_inpt_all'
	 OR table_name = 'mgt_exp_wk_all'
	;

