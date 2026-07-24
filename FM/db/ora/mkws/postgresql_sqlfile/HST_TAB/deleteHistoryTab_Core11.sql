\encoding UTF-8

DELETE FROM fcm_history_table WHERE 
table_name = 'fct_design_vector_segs'
	 OR table_name = 'fct_design_label'
	 OR table_name = 'fct_design_label_prop'
	 OR table_name = 'fct_design_text'
	 OR table_name = 'fct_design_res_grp'
	 OR table_name = 'fct_design_res'
	 OR table_name = 'fct_design_res_col'
	 OR table_name = 'fct_scenario'
	 OR table_name = 'fct_scenario_script'
	;

