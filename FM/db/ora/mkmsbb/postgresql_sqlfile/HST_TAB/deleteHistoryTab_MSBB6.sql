\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_spec_desc_all'
	 OR table_name = 'mst_comp_spec_desc_all'
	 OR table_name = 'mst_sls_ret_schd_all'
	 OR table_name = 'mst_sls_ret_schd_d_all'
	 OR table_name = 'mst_sls_act_all'
	 OR table_name = 'mst_sls_act_d_all'
	 OR table_name = 'mst_sls_act_io_all'
	 OR table_name = 'mst_sls_sum_all'
	 OR table_name = 'mst_accpt_sls_br_all'
	;

