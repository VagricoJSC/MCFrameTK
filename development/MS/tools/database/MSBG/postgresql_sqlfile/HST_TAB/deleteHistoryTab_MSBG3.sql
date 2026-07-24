\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_bill_d_sw_act_all'
	 OR table_name = 'mst_ar_xrate_rev_his_all'
	 OR table_name = 'mst_ar_exc_gain_loss_all'
	 OR table_name = 'mst_bill_cl_br_all'
	 OR table_name = 'mst_bill_send_if_all'
	 OR table_name = 'mst_bill_cl_can_all'
	 OR table_name = 'mst_bill_his_all'
	 OR table_name = 'mst_bill_d_his_all'
	 OR table_name = 'mst_bill_lock_all'
	;

