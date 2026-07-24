\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_sim_oper_order_all'
	 OR table_name = 'mst_sim_io_schd_all'
	 OR table_name = 'mst_sim_prms_rslt_all'
	 OR table_name = 'mst_itm_order_if_all'
	 OR table_name = 'mst_order_recv_if_all'
	 OR table_name = 'mst_ordsnd_itm_if_all'
	 OR table_name = 'mst_ordsnd_itmoper_if_all'
	 OR table_name = 'mst_ordsnd_itm_dtl_if_all'
	 OR table_name = 'mst_ordsnd_bom_if_all'
	;

