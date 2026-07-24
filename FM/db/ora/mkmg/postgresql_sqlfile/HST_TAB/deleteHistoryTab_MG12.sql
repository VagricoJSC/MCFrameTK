\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_calc_wk_all'
	 OR table_name = 'mgt_calc_other_wk_all'
	 OR table_name = 'mgt_calc_inst_wip_all'
	 OR table_name = 'mgt_calc_io_all'
	 OR table_name = 'mgt_calc_sls_all'
	 OR table_name = 'mgt_calc_gp_alc_all'
	 OR table_name = 'mgt_calc_itm_mfg_inst_all'
	 OR table_name = 'mgt_calc_xrate_all'
	 OR table_name = 'mgt_calc_cur_parm_all'
	;

