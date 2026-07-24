\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'msc_io_schd_typ_map'
	 OR table_name = 'msc_stk_anly_ctl_def'
	 OR table_name = 'msc_stk_anly_ctl_all'
	 OR table_name = 'msc_non_mov_schd_ctl_def'
	 OR table_name = 'msc_non_mov_schd_ctl_all'
	;

