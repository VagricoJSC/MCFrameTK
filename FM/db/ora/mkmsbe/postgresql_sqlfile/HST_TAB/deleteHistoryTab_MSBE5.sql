\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_arr_schd_send_if_all'
	 OR table_name = 'mst_arr_act_recv_if_all'
	 OR table_name = 'mst_eship_act_recv_if_all'
	 OR table_name = 'mst_arr_pr_if_all'
	 OR table_name = 'mst_ship_pr_all'
	 OR table_name = 'mst_ship_schd_all'
	 OR table_name = 'mst_ship_alloc_sts_all'
	 OR table_name = 'mst_ship_alloc_sts_p_all'
	 OR table_name = 'mst_ship_alloc_sts_sv_all'
	;

