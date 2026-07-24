\encoding UTF-8

ALTER TABLE mst_itm_order_if_all
 ADD CONSTRAINT mst_itm_order_if_all_ck01 CHECK (blk_flg IN ('0', '1'));

