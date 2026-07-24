\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_spln_sum_itm_all'
	 OR table_name = 'mst_spln_usr_itm_new_all'
	 OR table_name = 'mst_spln_sum_itm_new_all'
	 OR table_name = 'mst_frcst_slo_sum_all'
	 OR table_name = 'mst_cst_frcst_h_all'
	 OR table_name = 'mst_cst_frcst_d_all'
	 OR table_name = 'mst_cst_frcst_all'
	 OR table_name = 'mst_cst_frcst_lock_all'
	 OR table_name = 'mst_wrk_all'
	;

