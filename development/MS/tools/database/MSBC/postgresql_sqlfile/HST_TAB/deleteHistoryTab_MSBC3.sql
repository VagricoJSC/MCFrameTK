\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_prcd_itm_lnk_all'
	 OR table_name = 'mst_prcd_oper_order_all'
	 OR table_name = 'mst_prcd_io_schd_all'
	 OR table_name = 'mst_sim_mrp_all'
	 OR table_name = 'mst_sim_rqmt_all'
	 OR table_name = 'mst_sim_itm_order_all'
	 OR table_name = 'mst_sim_mrprqmt_all'
	 OR table_name = 'mst_sim_alloc_pln_all'
	 OR table_name = 'mst_sim_itm_lnk_all'
	;

