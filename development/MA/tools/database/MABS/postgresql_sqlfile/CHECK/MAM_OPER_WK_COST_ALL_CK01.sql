\encoding UTF-8

ALTER TABLE mam_oper_wk_cost_all
 ADD CONSTRAINT mam_oper_wk_cost_all_ck01 CHECK (wk_cost_calc_flg IN ('0', '1'));

