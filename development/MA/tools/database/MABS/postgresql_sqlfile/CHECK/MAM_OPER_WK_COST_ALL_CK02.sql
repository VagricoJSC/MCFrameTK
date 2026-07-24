\encoding UTF-8

ALTER TABLE mam_oper_wk_cost_all
 ADD CONSTRAINT mam_oper_wk_cost_all_ck02 CHECK (not_cost_flg IN ('0', '1'));

