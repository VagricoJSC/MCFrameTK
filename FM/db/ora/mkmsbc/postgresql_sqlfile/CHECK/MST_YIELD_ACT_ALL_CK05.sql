\encoding UTF-8

ALTER TABLE mst_yield_act_all
 ADD CONSTRAINT mst_yield_act_all_ck05 CHECK (not_stk_flg IN ('0', '1'));

