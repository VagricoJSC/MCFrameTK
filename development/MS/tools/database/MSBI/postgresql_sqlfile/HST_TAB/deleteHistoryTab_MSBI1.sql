\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_close_all'
	 OR table_name = 'mst_ar_pre_close_all'
	 OR table_name = 'mst_ap_pre_close_all'
	;

