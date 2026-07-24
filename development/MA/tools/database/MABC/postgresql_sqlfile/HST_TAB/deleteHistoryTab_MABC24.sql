\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_account_all'
	 OR table_name = 'mam_sub_account_cmn'
	 OR table_name = 'mam_sub_account_all'
	 OR table_name = 'mam_auto_jnl_cmn'
	 OR table_name = 'mam_auto_jnl_all'
	 OR table_name = 'mam_auto_jnl_key_cmn'
	 OR table_name = 'mam_auto_jnl_key_all'
	 OR table_name = 'mam_note_rsn_cmn'
	 OR table_name = 'mam_note_rsn_all'
	;

