\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_insp_inst_send_if_all'
	 OR table_name = 'mst_insp_act_recv_if_all'
	;

