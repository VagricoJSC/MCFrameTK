\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_oper_inst_all'
	 OR table_name = 'mst_oper_inst_p_all'
	 OR table_name = 'mst_oper_act_rem_all'
	 OR table_name = 'mst_yield_schd_all'
	 OR table_name = 'mst_yield_schd_p_all'
	 OR table_name = 'mst_yield_act_rem_all'
	 OR table_name = 'mst_inpt_schd_all'
	 OR table_name = 'mst_inpt_schd_p_all'
	 OR table_name = 'mst_inpt_act_rem_all'
	;

