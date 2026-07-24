\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_stk_xfr_act_all'
	 OR table_name = 'mst_stk_xfr_act_d_all'
	 OR table_name = 'mst_acxfr_act_recv_if_all'
	 OR table_name = 'mst_alloc_lock_all'
	 OR table_name = 'mst_alloc_stop_lot_all'
	 OR table_name = 'mst_arr_pr_all'
	 OR table_name = 'mst_arr_schd_all'
	 OR table_name = 'mst_arr_act_all'
	 OR table_name = 'mst_arr_map_all'
	;

