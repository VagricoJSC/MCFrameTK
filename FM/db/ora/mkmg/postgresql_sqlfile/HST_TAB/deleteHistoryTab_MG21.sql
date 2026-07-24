\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgw_imp_itm_sls_all'
	 OR table_name = 'mgw_imp_pln_rqmt_all'
	 OR table_name = 'mgw_imp_pln_mfg_all'
	 OR table_name = 'mgw_imp_pln_purc_all'
	 OR table_name = 'mgw_imp_pln_sls_all'
	;

