\encoding UTF-8

ALTER TABLE mst_inpt_stk_rpl_lst_all
 ADD CONSTRAINT mst_inpt_stk_rpl_lst_all_ck06 CHECK (not_lot_mix_flg IN ('0', '1'));

