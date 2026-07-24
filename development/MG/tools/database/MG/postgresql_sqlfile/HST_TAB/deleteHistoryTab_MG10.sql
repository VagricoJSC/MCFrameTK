\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_calc_parm_all'
	 OR table_name = 'mgt_calc_itm_all'
	 OR table_name = 'mgt_calc_itm_dtl_all'
	 OR table_name = 'mgt_calc_itm_oper_all'
	 OR table_name = 'mgt_calc_bom_all'
	 OR table_name = 'mgt_calc_itm_wk_all'
	 OR table_name = 'mgt_calc_itm_purc_all'
	 OR table_name = 'mgt_calc_itm_proc_all'
	 OR table_name = 'mgt_calc_itm_prov_all'
	;

