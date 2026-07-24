\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_iv_all'
	 OR table_name = 'mst_iv_p_all'
	 OR table_name = 'mst_iv_d_all'
	 OR table_name = 'mst_iv_d_p_all'
	 OR table_name = 'mst_pl_d_all'
	 OR table_name = 'mst_iv_map_all'
	 OR table_name = 'mst_iv_ship_inst_map_all'
	 OR table_name = 'mst_iv_ship_act_map_all'
	 OR table_name = 'mst_iv_no_all'
	;

