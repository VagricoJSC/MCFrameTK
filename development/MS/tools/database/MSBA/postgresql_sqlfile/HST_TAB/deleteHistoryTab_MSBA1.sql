\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_dmnd_all'
	 OR table_name = 'mst_dly_dmnd_all'
	 OR table_name = 'mst_dly_sd_all'
	 OR table_name = 'mst_dmnd_rec_map_all'
	 OR table_name = 'mst_wg_rqst_all'
	 OR table_name = 'mst_wg_rqst_prms_all'
	 OR table_name = 'mst_frcst_sum_all'
	 OR table_name = 'mst_awk_act_all'
	;

