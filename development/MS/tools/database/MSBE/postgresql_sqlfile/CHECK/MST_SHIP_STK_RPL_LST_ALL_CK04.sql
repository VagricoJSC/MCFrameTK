\encoding UTF-8

ALTER TABLE mst_ship_stk_rpl_lst_all
 ADD CONSTRAINT mst_ship_stk_rpl_lst_all_ck04 CHECK (sno3_null_flg IN ('0', '1'));

