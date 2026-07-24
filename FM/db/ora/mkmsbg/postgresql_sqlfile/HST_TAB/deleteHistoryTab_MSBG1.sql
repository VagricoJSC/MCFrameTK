\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_bill_all'
	 OR table_name = 'mst_bill_acst_all'
	 OR table_name = 'mst_bill_d_all'
	 OR table_name = 'mst_rcv_schd_all'
	 OR table_name = 'mst_rcv_schd_appl_act_all'
	 OR table_name = 'mst_ar_appl_schd_all'
	 OR table_name = 'mst_ar_appl_act_all'
	 OR table_name = 'mst_mly_ar_bal_all'
	 OR table_name = 'mst_rcv_act_all'
	;

