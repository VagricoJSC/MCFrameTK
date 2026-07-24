\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_alc_gp_alc_all'
	 OR table_name = 'mam_alc_ptn_sel_all'
	 OR table_name = 'mam_cost_io_cmn'
	 OR table_name = 'mam_cost_io_all'
	 OR table_name = 'mam_cost_io_conf_cmn'
	 OR table_name = 'mam_cost_io_conf_all'
	 OR table_name = 'mam_cost_io_col_cmn'
	 OR table_name = 'mam_cost_io_col_all'
	 OR table_name = 'mam_calc_cost_io_all'
	;

