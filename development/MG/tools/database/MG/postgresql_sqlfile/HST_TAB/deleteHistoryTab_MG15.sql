\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_std_sml_cost_all'
	 OR table_name = 'mgt_std_alc_all'
	 OR table_name = 'mgt_std_fix_all'
	 OR table_name = 'mgt_acc_top_all'
	 OR table_name = 'mgt_acc_inpt_all'
	 OR table_name = 'mgt_acc_wk_all'
	 OR table_name = 'mgt_acc_cost_all'
	 OR table_name = 'mgt_acc_sml_cost_all'
	 OR table_name = 'mgt_acc_trd_all'
	;

