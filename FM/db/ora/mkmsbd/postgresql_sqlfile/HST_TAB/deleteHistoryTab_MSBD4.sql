\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_prms_rcpt_d_all'
	 OR table_name = 'mst_po_send_if_all'
	 OR table_name = 'mst_po_recv_if_all'
	 OR table_name = 'mst_prms_recv_if_all'
	 OR table_name = 'mst_accpt_send_if_all'
	 OR table_name = 'mst_po_reg_br_all'
	 OR table_name = 'mst_purc_dlv_slip_all'
	 OR table_name = 'mst_purc_dlv_slip_d_all'
	 OR table_name = 'mst_dlv_inst_send_if_all'
	;

