\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_hs_all'
	 OR table_name = 'mam_ex_ctrl_cmn'
	 OR table_name = 'mam_ex_ctrl_all'
	 OR table_name = 'mam_itm_grp_cmn'
	 OR table_name = 'mam_itm_grp_all'
	 OR table_name = 'mam_sls_itm_grp_cmn'
	 OR table_name = 'mam_sls_itm_grp_all'
	 OR table_name = 'mam_itm_jnl_cmn'
	 OR table_name = 'mam_itm_jnl_all'
	;

