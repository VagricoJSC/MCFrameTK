\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_itm_all'
	 OR table_name = 'mgt_itm_dtl_all'
	 OR table_name = 'mgt_itm_oper_all'
	 OR table_name = 'mgt_bom_all'
	 OR table_name = 'mgt_itm_wk_all'
	 OR table_name = 'mgt_itm_purc_all'
	 OR table_name = 'mgt_itm_proc_all'
	 OR table_name = 'mgt_itm_prov_all'
	 OR table_name = 'mgt_itm_sls_all'
	;

