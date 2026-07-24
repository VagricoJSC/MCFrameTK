\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_mrp_log_all'
	 OR table_name = 'mst_sche_exec_all'
	 OR table_name = 'mst_sche_ord_exec_all'
	 OR table_name = 'mst_mly_rqmt_all'
	 OR table_name = 'mst_mrp_lock_all'
	 OR table_name = 'mst_prcd_rqmt_all'
	 OR table_name = 'mst_prcd_itm_order_all'
	 OR table_name = 'mst_prcd_mrprqmt_all'
	 OR table_name = 'mst_prcd_alloc_pln_all'
	;

