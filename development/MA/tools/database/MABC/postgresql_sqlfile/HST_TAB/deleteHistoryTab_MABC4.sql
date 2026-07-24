\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_aprv_all'
	 OR table_name = 'mam_aprv_rt_cmn'
	 OR table_name = 'mam_aprv_rt_all'
	 OR table_name = 'mam_push_ntc_all'
	 OR table_name = 'mam_batch_push_ntc_all'
	 OR table_name = 'mam_gp_batch_grp_def'
	 OR table_name = 'mam_sys_parm_def'
	 OR table_name = 'mam_sys_parm_all'
	 OR table_name = 'mac_sys_parm_remark'
	;

