\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_wk_act_recv_if_all'
	 OR table_name = 'mst_oper_inst_send_if_all'
	 OR table_name = 'mst_yield_schd_snd_if_all'
	 OR table_name = 'mst_inpt_schd_send_if_all'
	 OR table_name = 'mst_wk_schd_send_if_all'
	;

