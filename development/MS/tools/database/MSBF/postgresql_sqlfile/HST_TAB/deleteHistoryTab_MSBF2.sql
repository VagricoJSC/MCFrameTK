\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_std_insp_inst_all'
	 OR table_name = 'mst_std_insp_act_all'
	 OR table_name = 'mst_plnt_aprv_all'
	 OR table_name = 'mst_plnt_aprv_d_all'
	 OR table_name = 'mst_mrkt_judg_all'
	 OR table_name = 'mst_mrkt_judg_d_all'
	 OR table_name = 'mst_lot_trace_gr_all'
	 OR table_name = 'mst_lot_trace_gi_all'
	 OR table_name = 'mst_insp_act_if_all'
	;

