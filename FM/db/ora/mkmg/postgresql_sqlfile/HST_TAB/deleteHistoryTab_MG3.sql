\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mgt_pln_purc_all'
	 OR table_name = 'mgt_pln_inpt_all'
	 OR table_name = 'mgt_pln_itm_wk_all'
	 OR table_name = 'mgt_pln_other_wk_all'
	 OR table_name = 'mgt_pln_sls_all'
	 OR table_name = 'mgt_itm_mfg_inst_all'
	 OR table_name = 'mgt_inst_oper_all'
	 OR table_name = 'mgt_act_mfg_all'
	 OR table_name = 'mgt_act_purc_all'
	;

