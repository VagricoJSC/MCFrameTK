\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'mst_itm_lnk_fix_all'
	 OR table_name = 'mst_ordsnd_ord_lnk_if_all'
	 OR table_name = 'mst_ordsnd_ope_act_if_all'
	 OR table_name = 'mst_ordsnd_act_qty_if_all'
	 OR table_name = 'mst_itm_mfg_inst_all'
	 OR table_name = 'mst_itm_mfg_inst_p_all'
	 OR table_name = 'mst_mfg_inst_all'
	 OR table_name = 'mst_mfg_inst_p_all'
	 OR table_name = 'mst_mfg_act_rem_all'
	;

