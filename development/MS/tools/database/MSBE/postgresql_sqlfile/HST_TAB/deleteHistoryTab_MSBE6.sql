\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_ship_inst_all'
	 OR table_name = 'mst_ship_inst_p_all'
	 OR table_name = 'mst_ship_inst_d_all'
	 OR table_name = 'mst_ship_inst_d_p_all'
	 OR table_name = 'mst_ship_act_all'
	 OR table_name = 'mst_ship_act_p_all'
	 OR table_name = 'mst_ship_act_d_all'
	 OR table_name = 'mst_ship_act_d_p_all'
	 OR table_name = 'mst_dlv_slip_all'
	;

