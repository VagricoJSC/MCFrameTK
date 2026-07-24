\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_inpt_alloc_sts_all'
	 OR table_name = 'mst_wk_schd_all'
	 OR table_name = 'mst_wk_schd_p_all'
	 OR table_name = 'mst_wk_act_rem_all'
	 OR table_name = 'mst_mfg_act_all'
	 OR table_name = 'mst_oper_act_all'
	 OR table_name = 'mst_yield_act_all'
	 OR table_name = 'mst_inpt_act_all'
	 OR table_name = 'mst_wk_act_all'
	;

