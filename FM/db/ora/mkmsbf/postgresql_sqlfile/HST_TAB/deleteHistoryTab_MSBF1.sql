\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_insp_schd_all'
	 OR table_name = 'mst_insp_inst_all'
	 OR table_name = 'mst_insp_act_all'
	 OR table_name = 'mst_insp_stt_d_all'
	 OR table_name = 'mst_insp_act_d_all'
	 OR table_name = 'mst_insp_judg_d_all'
	 OR table_name = 'mst_insp_smpl_act_all'
	 OR table_name = 'mst_lot_all'
	 OR table_name = 'mst_lot_list_all'
	;

