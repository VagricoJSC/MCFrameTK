\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_pay_note_all'
	 OR table_name = 'mst_mly_ap_bal_all'
	 OR table_name = 'mst_onr_prov_bal_all'
	 OR table_name = 'mst_pay_schd_cl_br_all'
	 OR table_name = 'mst_pay_act_br_all'
	 OR table_name = 'mst_pay_schd_lock_all'
	 OR table_name = 'mst_pay_act_if_all'
	 OR table_name = 'mst_pay_schd_if_all'
	 OR table_name = 'mst_bill_rcpt_all'
	;

