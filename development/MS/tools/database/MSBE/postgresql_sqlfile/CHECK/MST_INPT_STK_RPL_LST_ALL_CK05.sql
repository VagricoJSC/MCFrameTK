\encoding UTF-8

ALTER TABLE mst_inpt_stk_rpl_lst_all
 ADD CONSTRAINT mst_inpt_stk_rpl_lst_all_ck05 CHECK (sno4_null_flg IN ('0', '1'));

