\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_ordsnd_if_all'
	 OR table_name = 'mst_ordsnd_loc_if_all'
	 OR table_name = 'mst_ordsnd_cal_if_all'
	 OR table_name = 'mst_ordsnd_cal_ext_if_all'
	 OR table_name = 'mst_ordsnd_stk_if_all'
	 OR table_name = 'mst_ordsnd_gr_schd_if_all'
	 OR table_name = 'mst_ordsnd_gi_schd_if_all'
	 OR table_name = 'mst_ordsnd_dlydmnd_if_all'
	 OR table_name = 'mst_ordsnd_dtl_bom_if_all'
	;

