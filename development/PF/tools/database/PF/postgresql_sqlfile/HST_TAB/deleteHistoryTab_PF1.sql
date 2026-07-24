\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'pft_sdrv_if_all'
	 OR table_name = 'pft_sdrv_if_file_all'
	 OR table_name = 'pft_if_file_all'
	;

