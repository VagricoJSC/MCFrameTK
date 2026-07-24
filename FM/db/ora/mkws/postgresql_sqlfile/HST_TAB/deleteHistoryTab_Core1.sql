\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_binary'
	 OR table_name = 'fcw_delete_binary'
	 OR table_name = 'fcm_delete_binary'
	 OR table_name = 'fcc_commonparam'
	 OR table_name = 'fcm_week_of_day_map'
	 OR table_name = 'fct_dbversion'
	 OR table_name = 'fct_patchversion'
	 OR table_name = 'fct_notice'
	 OR table_name = 'fcm_systs'
	;

