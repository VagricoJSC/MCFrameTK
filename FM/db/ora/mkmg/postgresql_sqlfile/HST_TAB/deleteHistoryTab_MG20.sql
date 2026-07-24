\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_acc_oper_cost5_if_all'
	 OR table_name = 'mgt_io_if_all'
	 OR table_name = 'mgw_imp_itm_dtl_all'
	 OR table_name = 'mgw_imp_itm_oper_all'
	 OR table_name = 'mgw_imp_bom_all'
	 OR table_name = 'mgw_imp_itm_wk_all'
	 OR table_name = 'mgw_imp_itm_purc_all'
	 OR table_name = 'mgw_imp_itm_proc_all'
	 OR table_name = 'mgw_imp_itm_prov_all'
	;

