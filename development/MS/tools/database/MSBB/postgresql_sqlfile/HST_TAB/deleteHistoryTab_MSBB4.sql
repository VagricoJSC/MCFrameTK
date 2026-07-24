\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_slo_p_all'
	 OR table_name = 'mst_slo_d_all'
	 OR table_name = 'mst_slo_d_p_all'
	 OR table_name = 'mst_slo_itm_comp_all'
	 OR table_name = 'mst_sls_schd_all'
	 OR table_name = 'mst_dlv_inst_rcpt_all'
	 OR table_name = 'mst_slo_prms_h_all'
	 OR table_name = 'mst_slo_prms_all'
	 OR table_name = 'mst_slo_prms_p_all'
	;

