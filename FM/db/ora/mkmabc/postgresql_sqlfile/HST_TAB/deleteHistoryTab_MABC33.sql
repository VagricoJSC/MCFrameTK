\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_report_strg_ctl_all'
	 OR table_name = 'mat_push_ntc_h_all'
	 OR table_name = 'mat_push_ntc_msg_all'
	 OR table_name = 'mat_push_ntc_trans_all'
	 OR table_name = 'mat_push_ntc_usr_all'
	 OR table_name = 'mac_push_ntc_clt'
	 OR table_name = 'mac_push_ntc_trans'
	 OR table_name = 'mat_biz_dat_dl_hst_all'
	 OR table_name = 'mat_blnk_bat_cntl_all'
	;

