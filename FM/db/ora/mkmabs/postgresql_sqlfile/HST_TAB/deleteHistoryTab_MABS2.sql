\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mam_oper_wk_cost_all'
	 OR table_name = 'mam_alloc_ctl_all'
	 OR table_name = 'mam_stk_rpl_all'
	 OR table_name = 'mam_itm_insp_all'
	 OR table_name = 'mam_insp_ptn_all'
	 OR table_name = 'mam_itm_insp_ptn_all'
	 OR table_name = 'mam_insp_point_all'
	 OR table_name = 'mam_insp_spec_all'
	 OR table_name = 'mam_lot_inh_dest_all'
	;

