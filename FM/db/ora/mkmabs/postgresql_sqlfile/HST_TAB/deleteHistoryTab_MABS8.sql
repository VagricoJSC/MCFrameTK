\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_com_paid_all'
	 OR table_name = 'mam_rcv_schd_ctl_all'
	 OR table_name = 'mam_pay_schd_ctl_all'
	 OR table_name = 'mam_fb_if_ctl_all'
	 OR table_name = 'mam_insp_ptn_lcl_all'
	 OR table_name = 'mam_insp_point_lcl_all'
	 OR table_name = 'mam_ship_wk_grp_lcl_all'
	 OR table_name = 'mam_set_grp_lcl_all'
	 OR table_name = 'mam_mps_grp_lcl_all'
	;

