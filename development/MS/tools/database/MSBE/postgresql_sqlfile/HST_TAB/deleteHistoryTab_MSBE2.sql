\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_xfr_schd_all'
	 OR table_name = 'mst_xfr_alloc_sts_all'
	 OR table_name = 'mst_xfr_alloc_sts_sv_all'
	 OR table_name = 'mst_xfr_inst_all'
	 OR table_name = 'mst_xfr_inst_d_all'
	 OR table_name = 'mst_xfr_act_all'
	 OR table_name = 'mst_xfr_act_d_all'
	 OR table_name = 'mst_xfr_inst_send_if_all'
	 OR table_name = 'mst_xfr_act_recv_if_all'
	;

