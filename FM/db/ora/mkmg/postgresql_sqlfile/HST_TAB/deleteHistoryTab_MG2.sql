\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_itm_fix_all'
	 OR table_name = 'mgt_std_alc_rate_all'
	 OR table_name = 'mgt_parm_def'
	 OR table_name = 'mgt_parm_all'
	 OR table_name = 'mgc_parm_remark'
	 OR table_name = 'mgt_calc_chk_all'
	 OR table_name = 'mgt_cur_xrate_all'
	 OR table_name = 'mgt_pln_rqmt_all'
	 OR table_name = 'mgt_pln_mfg_all'
	;

