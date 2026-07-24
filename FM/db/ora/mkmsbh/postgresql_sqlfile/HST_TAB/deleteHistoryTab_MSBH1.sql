\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_ap_d_all'
	 OR table_name = 'mst_pay_chk_all'
	 OR table_name = 'mst_pay_schd_all'
	 OR table_name = 'mst_ap_appl_schd_all'
	 OR table_name = 'mst_pay_act_all'
	 OR table_name = 'mst_pay_act_d_all'
	 OR table_name = 'mst_ap_xrate_rev_his_all'
	 OR table_name = 'mst_ap_exc_gain_loss_all'
	 OR table_name = 'mst_adv_pay_act_all'
	;

