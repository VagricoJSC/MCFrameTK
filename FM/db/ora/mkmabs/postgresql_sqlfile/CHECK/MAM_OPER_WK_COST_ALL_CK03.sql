\encoding UTF-8

ALTER TABLE mam_oper_wk_cost_all
 ADD CONSTRAINT mam_oper_wk_cost_all_ck03 CHECK (del_flg IN ('0', '1'));

