\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_sls_sum_all'
	 OR table_name = 'mst_accpt_sls_br_all'
	 OR table_name = 'mst_accpt_recv_if_all'
	 OR table_name = 'mst_sls_bdg_all'
	;

