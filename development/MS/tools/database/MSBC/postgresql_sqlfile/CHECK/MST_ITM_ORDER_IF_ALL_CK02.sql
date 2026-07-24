\encoding UTF-8

ALTER TABLE mst_itm_order_if_all
 ADD CONSTRAINT mst_itm_order_if_all_ck02 CHECK (bi_not_send_flg IN ('0', '1'));

