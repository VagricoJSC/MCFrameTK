\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_bank_lcl_all'
	 OR table_name = 'mam_bank_branch_lcl_cmn'
	 OR table_name = 'mam_bank_branch_lcl_all'
	 OR table_name = 'mam_bank_ac_lcl_cmn'
	 OR table_name = 'mam_bank_ac_lcl_all'
	 OR table_name = 'mam_cal_base_lcl_cmn'
	 OR table_name = 'mam_cal_base_lcl_all'
	 OR table_name = 'mam_xrate_lcl_cmn'
	 OR table_name = 'mam_xrate_lcl_all'
	;

