\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_rcv_act_d_all'
	 OR table_name = 'mst_rcv_act_if_all'
	 OR table_name = 'mst_note_if_all'
	 OR table_name = 'mst_rcv_all'
	 OR table_name = 'mst_rcv_recv_if_all'
	 OR table_name = 'mst_note_all'
	 OR table_name = 'mst_cred_all'
	 OR table_name = 'mst_bill_d_appl_bal_all'
	 OR table_name = 'mst_bill_d_appl_act_all'
	;

