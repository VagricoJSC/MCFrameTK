\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_spln_lock_all'
	 OR table_name = 'mst_spln_fmt_all'
	 OR table_name = 'mst_spln_usr_vers_all'
	 OR table_name = 'mst_spln_usr_fix_all'
	 OR table_name = 'mst_spln_usr_dtl_all'
	 OR table_name = 'mst_spln_usr_itm_all'
	 OR table_name = 'mst_spln_sum_vers_all'
	 OR table_name = 'mst_spln_sum_fix_all'
	 OR table_name = 'mst_spln_sum_dtl_all'
	;

