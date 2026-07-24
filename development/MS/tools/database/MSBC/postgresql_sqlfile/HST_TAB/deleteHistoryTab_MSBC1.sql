\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_rqmt_all'
	 OR table_name = 'mst_itm_order_all'
	 OR table_name = 'mst_mrprqmt_all'
	 OR table_name = 'mst_alloc_pln_all'
	 OR table_name = 'mst_itm_lnk_all'
	 OR table_name = 'mst_oper_order_all'
	 OR table_name = 'mst_ord_io_schd_all'
	 OR table_name = 'mst_savord_io_schd_all'
	 OR table_name = 'mst_mrp_cntr_all'
	;

