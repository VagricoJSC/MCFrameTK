\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_grs_alloc_ctl_all'
	 OR table_name = 'mam_dmnd_div_all'
	 OR table_name = 'mam_itm_spec_all'
	 OR table_name = 'mam_itm_spec_desc_all'
	 OR table_name = 'mam_itm_comp_all'
	 OR table_name = 'mam_set_grp_all'
	 OR table_name = 'mam_set_itm_all'
	 OR table_name = 'mam_scm_if_ctl_all'
	 OR table_name = 'mam_mps_grp_all'
	;

