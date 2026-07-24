\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_acc_sml_cost1_if_all'
	 OR table_name = 'mgt_acc_sml_cost2_if_all'
	 OR table_name = 'mgt_acc_sml_cost3_if_all'
	 OR table_name = 'mgt_acc_sml_cost4_if_all'
	 OR table_name = 'mgt_acc_sml_cost5_if_all'
	 OR table_name = 'mgt_acc_oper_cost1_if_all'
	 OR table_name = 'mgt_acc_oper_cost2_if_all'
	 OR table_name = 'mgt_acc_oper_cost3_if_all'
	 OR table_name = 'mgt_acc_oper_cost4_if_all'
	;

