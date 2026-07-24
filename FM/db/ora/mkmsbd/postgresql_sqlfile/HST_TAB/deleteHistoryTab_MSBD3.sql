\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_purc_ret_act_d_p_all'
	 OR table_name = 'mst_purc_ret_act_io_all'
	 OR table_name = 'mst_purc_ret_act_io_p_all'
	 OR table_name = 'mst_purc_act_all'
	 OR table_name = 'mst_purc_act_d_all'
	 OR table_name = 'mst_purc_act_io_all'
	 OR table_name = 'mst_dlv_inst_all'
	 OR table_name = 'mst_dlv_inst_d_all'
	 OR table_name = 'mst_prms_rcpt_all'
	;

