\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_cst_wrk_all'
	 OR table_name = 'mst_wrk_act_hist_all'
	 OR table_name = 'mst_wrk_comp_all'
	 OR table_name = 'mst_wrk_mng_all'
	 OR table_name = 'mst_wrk_sno_all'
	 OR table_name = 'mst_qtn_all'
	 OR table_name = 'mst_qtn_d_all'
	 OR table_name = 'mst_qtn_itm_comp_all'
	 OR table_name = 'mst_slo_all'
	;

