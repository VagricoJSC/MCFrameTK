\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_slo_prms_all'
	 OR table_name = 'mst_slo_prms_p_all'
	 OR table_name = 'mst_slo_sts_all'
	 OR table_name = 'mst_slo_rsn_all'
	 OR table_name = 'mst_slo_recv_if_all'
	 OR table_name = 'mst_slo_prms_send_if_all'
	 OR table_name = 'mst_dlv_inst_recv_if_all'
	 OR table_name = 'mst_sls_itm_all'
	 OR table_name = 'mst_sls_itm_ref_all'
	;

