\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_pw_dna'
	 OR table_name = 'fcm_resource'
	 OR table_name = 'fcm_user'
	 OR table_name = 'fcm_grantrole'
	 OR table_name = 'fcm_role_all'
	 OR table_name = 'fcm_roleitem'
	 OR table_name = 'fcm_license'
	 OR table_name = 'fcm_licensemap'
	 OR table_name = 'fcm_catalog'
	;

