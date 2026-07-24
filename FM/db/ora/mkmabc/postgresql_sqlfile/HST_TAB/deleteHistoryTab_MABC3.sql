\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mat_da_dpt_all'
	 OR table_name = 'mat_da_loc_all'
	 OR table_name = 'mat_da_lg_grp_all'
	 OR table_name = 'mat_da_alloc_grp_all'
	 OR table_name = 'mat_da_wg_all'
	 OR table_name = 'mam_usr_acl_all'
	 OR table_name = 'mam_aprv_role_cmn'
	 OR table_name = 'mam_aprv_role_all'
	 OR table_name = 'mam_aprv_cmn'
	;

