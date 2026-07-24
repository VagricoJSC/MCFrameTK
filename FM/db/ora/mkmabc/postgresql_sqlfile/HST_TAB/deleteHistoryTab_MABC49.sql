\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_ac_subtypem_lcl_all'
	 OR table_name = 'mam_ac_tax_lcl_cmn'
	 OR table_name = 'mam_ac_tax_lcl_all'
	 OR table_name = 'mam_account_lcl_cmn'
	 OR table_name = 'mam_account_lcl_all'
	 OR table_name = 'mam_sub_account_lcl_cmn'
	 OR table_name = 'mam_sub_account_lcl_all'
	 OR table_name = 'mam_auto_jnl_key_lcl_cmn'
	 OR table_name = 'mam_auto_jnl_key_lcl_all'
	;

