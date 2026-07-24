\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_dlv_slip_d_all'
	 OR table_name = 'mst_ship_lot_ex_all'
	 OR table_name = 'mst_ship_lot_all'
	 OR table_name = 'mst_ship_stk_rpl_lock_all'
	 OR table_name = 'mst_ship_stk_rpl_lst_all'
	 OR table_name = 'mst_ship_inst_send_if_all'
	 OR table_name = 'mst_ship_act_recv_if_all'
	 OR table_name = 'mst_eship_act_send_if_all'
	 OR table_name = 'mst_ship_pr_if_all'
	;

