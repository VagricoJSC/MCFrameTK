\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_calc_itm_sls_all'
	 OR table_name = 'mgt_calc_itm_fix_all'
	 OR table_name = 'mgt_calc_std_alc_rate_all'
	 OR table_name = 'mgt_calc_pre_alc_amt_all'
	 OR table_name = 'mgt_calc_alc_amt_all'
	 OR table_name = 'mgt_calc_rqmt_all'
	 OR table_name = 'mgt_calc_mfg_all'
	 OR table_name = 'mgt_calc_purc_all'
	 OR table_name = 'mgt_calc_inpt_all'
	;

