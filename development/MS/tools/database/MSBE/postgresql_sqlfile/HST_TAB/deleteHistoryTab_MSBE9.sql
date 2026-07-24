\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_iv_ship_act_d_all'
	 OR table_name = 'mst_rcpt_iv_all'
	 OR table_name = 'mst_rcpt_iv_p_all'
	 OR table_name = 'mst_rcpt_iv_d_all'
	 OR table_name = 'mst_rcpt_iv_d_p_all'
	 OR table_name = 'mst_rcpt_iv_map_all'
	 OR table_name = 'mst_stktk_all'
	 OR table_name = 'mst_stktk_act_all'
	 OR table_name = 'mst_pre_stktk_all'
	;

