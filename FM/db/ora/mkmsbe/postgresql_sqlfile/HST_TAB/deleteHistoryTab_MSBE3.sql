\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_prov_schd_all'
	 OR table_name = 'mst_prov_act_all'
	 OR table_name = 'mst_acxfr_schd_all'
	 OR table_name = 'mst_acxfr_inst_all'
	 OR table_name = 'mst_acxfr_inst_d_all'
	 OR table_name = 'mst_acxfr_act_all'
	 OR table_name = 'mst_acxfr_act_p_all'
	 OR table_name = 'mst_acxfr_act_d_all'
	 OR table_name = 'mst_acxfr_act_d_p_all'
	;

