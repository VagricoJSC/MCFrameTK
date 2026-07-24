\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_loss_act_all'
	 OR table_name = 'mst_mly_wip_all'
	 OR table_name = 'mst_re_ext_hst_all'
	 OR table_name = 'mst_inpt_alloc_br_all'
	 OR table_name = 'mst_bf_br_all'
	 OR table_name = 'mst_ver_chg_all'
	 OR table_name = 'mst_oper_act_recv_if_all'
	 OR table_name = 'mst_yield_act_recv_if_all'
	 OR table_name = 'mst_inpt_act_recv_if_all'
	;

