\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_num_ptn_def'
	 OR table_name = 'mam_num_ptn_lcl_def'
	 OR table_name = 'mam_num_ptn_all'
	 OR table_name = 'mat_seq_all'
	 OR table_name = 'mam_gp_grp_all'
	 OR table_name = 'mam_gp_all'
	 OR table_name = 'mam_term_cmn'
	 OR table_name = 'mam_term_all'
	 OR table_name = 'mam_mst_ctl'
	;

