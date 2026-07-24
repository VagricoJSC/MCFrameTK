\encoding UTF-8

ALTER TABLE mst_oper_inst_p_all
 ADD CONSTRAINT mst_oper_inst_p_all_ck04 CHECK (wk_cost_calc_flg IN ('0', '1'));

