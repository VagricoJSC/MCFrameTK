\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_act_stk_all'
	 OR table_name = 'mgt_gp_alc_all'
	 OR table_name = 'mgt_st_stk_all'
	 OR table_name = 'mgt_st_stk_expns_all'
	 OR table_name = 'mgt_st_wip_all'
	 OR table_name = 'mgt_st_wip_expns_all'
	 OR table_name = 'mgt_st_stk_diff_all'
	 OR table_name = 'mgt_stk_eval_all'
	 OR table_name = 'mgt_act_mfg_if_all'
	;

