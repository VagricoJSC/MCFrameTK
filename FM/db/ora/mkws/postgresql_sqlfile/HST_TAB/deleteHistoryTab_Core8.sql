\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_searchcondition'
	 OR table_name = 'fcm_hst_dump'
	 OR table_name = 'fct_hst_login'
	 OR table_name = 'fcm_menu'
	 OR table_name = 'fcm_menu_args'
	 OR table_name = 'fcm_menu_nm'
	 OR table_name = 'fcm_menu_ptn'
	 OR table_name = 'fcm_menu_ptn_info'
	 OR table_name = 'fct_pushmsg'
	;

