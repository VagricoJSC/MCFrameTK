\encoding UTF-8

ALTER TABLE mst_ship_alloc_sts_all
 ADD CONSTRAINT mst_ship_alloc_sts_all_ck10 CHECK (stk_lst_prnt_flg IN ('0', '1'));

