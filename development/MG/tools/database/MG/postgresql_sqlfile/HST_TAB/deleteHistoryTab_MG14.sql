\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_exp_prov_all'
	 OR table_name = 'mgt_alc_calc_rate_all'
	 OR table_name = 'mgt_alc_calc_err_all'
	 OR table_name = 'mgt_alc_calc_dtl_all'
	 OR table_name = 'mgt_std_top_all'
	 OR table_name = 'mgt_std_inpt_all'
	 OR table_name = 'mgt_std_oper_all'
	 OR table_name = 'mgt_std_wk_all'
	 OR table_name = 'mgt_std_cost_all'
	;

