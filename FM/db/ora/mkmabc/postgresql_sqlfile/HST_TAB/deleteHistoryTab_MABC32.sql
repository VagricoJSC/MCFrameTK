\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_if_x_all'
	 OR table_name = 'mam_http_header_cmn'
	 OR table_name = 'mam_http_header_all'
	 OR table_name = 'mam_ext_sys_usr_cmn'
	 OR table_name = 'mam_ext_sys_usr_all'
	 OR table_name = 'mam_strg_tgt_report_all'
	 OR table_name = 'mam_report_file_nm_all'
	 OR table_name = 'mam_report_strg_path_all'
	 OR table_name = 'mam_report_mng_def_all'
	;

