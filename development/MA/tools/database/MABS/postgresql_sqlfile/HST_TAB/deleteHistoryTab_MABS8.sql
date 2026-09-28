\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_mps_itm_all'
	 OR table_name = 'mam_rsrc_loc_all'
	 OR table_name = 'mam_spln_itm_conf_all'
	 OR table_name = 'mam_com_paid_all'
	 OR table_name = 'mam_rcv_schd_ctl_all'
	 OR table_name = 'mam_pay_schd_ctl_all'
	 OR table_name = 'mam_fb_if_ctl_all'
	 OR table_name = 'mam_insp_ptn_lcl_all'
	 OR table_name = 'mam_insp_point_lcl_all'
	;

