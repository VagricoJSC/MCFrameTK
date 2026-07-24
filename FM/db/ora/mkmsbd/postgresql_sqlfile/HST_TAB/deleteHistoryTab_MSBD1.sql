\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_purc_frcst_lock_all'
	 OR table_name = 'mst_purc_frcst_h_all'
	 OR table_name = 'mst_purc_frcst_fix_all'
	 OR table_name = 'mst_purc_frcst_d_all'
	 OR table_name = 'mst_purc_frcst_bal_all'
	 OR table_name = 'mst_po_schd_all'
	 OR table_name = 'mst_po_all'
	 OR table_name = 'mst_po_p_all'
	 OR table_name = 'mst_po_d_all'
	;

