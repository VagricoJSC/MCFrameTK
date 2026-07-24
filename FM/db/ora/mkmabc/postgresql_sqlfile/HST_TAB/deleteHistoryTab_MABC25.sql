\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_col_map_cmn'
	 OR table_name = 'mam_col_map_all'
	 OR table_name = 'mam_jnl_act_cmn'
	 OR table_name = 'mam_jnl_act_all'
	 OR table_name = 'mam_jnl_grp_cmn'
	 OR table_name = 'mam_jnl_grp_all'
	 OR table_name = 'mam_jnl_ptn_cmn'
	 OR table_name = 'mam_jnl_ptn_all'
	 OR table_name = 'mam_jnl_ptn_base_cmn'
	;

