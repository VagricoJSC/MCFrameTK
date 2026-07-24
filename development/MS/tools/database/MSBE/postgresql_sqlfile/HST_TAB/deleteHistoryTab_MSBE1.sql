\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_io_act_all'
	 OR table_name = 'mst_io_schd_all'
	 OR table_name = 'mst_stk_all'
	 OR table_name = 'mst_mly_stk_dtl_all'
	 OR table_name = 'mst_non_mov_stk_all'
	 OR table_name = 'mst_io_act_if_all'
	 OR table_name = 'mst_io_schd_if_all'
	 OR table_name = 'mst_mly_stk_if_all'
	 OR table_name = 'mst_non_mov_stk_if_all'
	;

