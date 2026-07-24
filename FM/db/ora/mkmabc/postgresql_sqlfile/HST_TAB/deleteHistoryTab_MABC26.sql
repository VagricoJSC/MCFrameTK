\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_jnl_ptn_base_all'
	 OR table_name = 'mam_jnl_ac_cmn'
	 OR table_name = 'mam_jnl_ac_all'
	 OR table_name = 'mam_bac_ac_cmn'
	 OR table_name = 'mam_bac_ac_all'
	 OR table_name = 'mam_rsn_ac_cmn'
	 OR table_name = 'mam_rsn_ac_all'
	 OR table_name = 'mam_slip_jnl_cmn'
	 OR table_name = 'mam_slip_jnl_all'
	;

