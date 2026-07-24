\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_msg'
	 OR table_name = 'fct_batch_log_h_all'
	 OR table_name = 'fct_batch_log_msg_all'
	 OR table_name = 'fcm_para_ope_ctrl'
	 OR table_name = 'fcm_para_ope_grp'
	 OR table_name = 'fcm_para_ope_grp_itm'
	 OR table_name = 'fct_excld_grps'
	 OR table_name = 'fct_running_grps'
	 OR table_name = 'fcm_serv_sts'
	;

