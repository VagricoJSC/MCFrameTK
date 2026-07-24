\encoding UTF-8

ALTER TABLE mst_itm_order_all
 ADD CONSTRAINT mst_itm_order_all_ck05 CHECK (not_fix_flg IN ('0', '1'));

