\encoding UTF-8

ALTER TABLE mst_prcd_itm_order_all
 ADD CONSTRAINT mst_prcd_itm_order_all_ck01 CHECK (blk_flg IN ('0', '1'));

