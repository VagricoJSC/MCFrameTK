\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_bank_ac_all'
	 OR table_name = 'mam_cal_base_cmn'
	 OR table_name = 'mam_cal_base_all'
	 OR table_name = 'mam_cal_cmn'
	 OR table_name = 'mam_cal_all'
	 OR table_name = 'mam_cal_ext_cmn'
	 OR table_name = 'mam_cal_ext_all'
	 OR table_name = 'mam_xrate_cmn'
	 OR table_name = 'mam_xrate_all'
	;

