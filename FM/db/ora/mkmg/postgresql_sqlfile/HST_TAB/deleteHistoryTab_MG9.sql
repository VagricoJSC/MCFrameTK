\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_calc_fix_all'
	 OR table_name = 'mgt_ctg_fix_all'
	 OR table_name = 'mgt_wg_fix_all'
	 OR table_name = 'mgt_ym_no_all'
	 OR table_name = 'mgt_calc_log_all'
	 OR table_name = 'mgt_usr_itm_all'
	 OR table_name = 'mgt_batch_out_all'
	 OR table_name = 'mgt_act_ptn_config_all'
	 OR table_name = 'mgt_calc_ptn_all'
	;

