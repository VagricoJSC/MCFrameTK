\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_edi_if_ctl_all'
	 OR table_name = 'mam_lg_ctl_all'
	 OR table_name = 'mam_ship_cl_all'
	 OR table_name = 'mam_ship_wk_grp_all'
	 OR table_name = 'mam_ship_wk_jdg_all'
	 OR table_name = 'mam_purc_ddlv_lt_all'
	 OR table_name = 'mam_ship_valid_ctl_all'
	 OR table_name = 'mam_slo_alloc_gd_all'
	 OR table_name = 'mam_slo_alloc_all'
	;

