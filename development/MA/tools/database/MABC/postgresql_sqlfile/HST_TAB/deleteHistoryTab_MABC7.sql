\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_cur_cmn'
	 OR table_name = 'mam_cur_all'
	 OR table_name = 'mam_tax_cmn'
	 OR table_name = 'mam_tax_all'
	 OR table_name = 'mam_bank_cmn'
	 OR table_name = 'mam_bank_all'
	 OR table_name = 'mam_bank_branch_cmn'
	 OR table_name = 'mam_bank_branch_all'
	 OR table_name = 'mam_bank_ac_cmn'
	;

