\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_ac_dpt_all'
	 OR table_name = 'mam_ac_subtypem_cmn'
	 OR table_name = 'mam_ac_subtypem_all'
	 OR table_name = 'mam_ac_subtypem_def'
	 OR table_name = 'mam_ac_tax_cmn'
	 OR table_name = 'mam_ac_tax_all'
	 OR table_name = 'mam_ac_tax_map_cmn'
	 OR table_name = 'mam_ac_tax_map_all'
	 OR table_name = 'mam_account_cmn'
	;

