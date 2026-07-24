\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_po_d_p_all'
	 OR table_name = 'mst_purc_schd_all'
	 OR table_name = 'mst_po_crct_rsn_all'
	 OR table_name = 'mst_purc_ret_schd_all'
	 OR table_name = 'mst_purc_ret_schd_d_all'
	 OR table_name = 'mst_purc_ret_schd_io_all'
	 OR table_name = 'mst_purc_ret_act_all'
	 OR table_name = 'mst_purc_ret_act_p_all'
	 OR table_name = 'mst_purc_ret_act_d_all'
	;

