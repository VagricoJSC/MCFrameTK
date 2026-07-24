\encoding UTF-8

ALTER TABLE mst_ship_act_d_all
 ADD CONSTRAINT mst_ship_act_d_all_ck08 CHECK (stk_lst_prnt_flg IN ('0', '1'));

