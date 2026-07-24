\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_bill_rcpt_d_all'
	 OR table_name = 'mst_bill_recv_if_all'
	 OR table_name = 'mst_pay_ntc_his_all'
	 OR table_name = 'mst_pay_ntc_d_his_all'
	;

