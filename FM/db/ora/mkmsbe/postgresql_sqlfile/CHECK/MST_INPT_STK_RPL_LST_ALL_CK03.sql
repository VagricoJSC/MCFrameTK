\encoding UTF-8

ALTER TABLE mst_inpt_stk_rpl_lst_all
 ADD CONSTRAINT mst_inpt_stk_rpl_lst_all_ck03 CHECK (sno2_null_flg IN ('0', '1'));

