\encoding UTF-8

ALTER TABLE mst_yield_act_all
 ADD CONSTRAINT mst_yield_act_all_ck04 CHECK (stk_lst_prnt_flg IN ('0', '1'));

