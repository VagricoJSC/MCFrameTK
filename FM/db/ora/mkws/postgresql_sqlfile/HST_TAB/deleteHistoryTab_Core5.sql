\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_scmauth'
	 OR table_name = 'fcm_memo'
	 OR table_name = 'fcm_co_all'
	 OR table_name = 'fcm_grant_co'
	 OR table_name = 'fcm_today_all'
	 OR table_name = 'fcm_user_grp_all'
	 OR table_name = 'fcm_grant_user_grp'
	 OR table_name = 'fcm_ex_user_map'
	 OR table_name = 'fcm_grant_menu_ptn'
	;

