\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_note_rsn_lcl_cmn'
	 OR table_name = 'mam_note_rsn_lcl_all'
	 OR table_name = 'mam_jnl_act_lcl_cmn'
	 OR table_name = 'mam_jnl_act_lcl_all'
	 OR table_name = 'mam_jnl_grp_lcl_cmn'
	 OR table_name = 'mam_jnl_grp_lcl_all'
	 OR table_name = 'mam_jnl_ptn_base_lcl_cmn'
	 OR table_name = 'mam_jnl_ptn_base_lcl_all'
	 OR table_name = 'mam_expns_grp_lcl_cmn'
	;

