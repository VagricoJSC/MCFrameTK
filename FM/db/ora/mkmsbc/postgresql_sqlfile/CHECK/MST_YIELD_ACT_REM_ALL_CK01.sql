\encoding UTF-8

ALTER TABLE mst_yield_act_rem_all
 ADD CONSTRAINT mst_yield_act_rem_all_ck01 CHECK (stk_lst_prnt_flg IN ('0', '1'));

