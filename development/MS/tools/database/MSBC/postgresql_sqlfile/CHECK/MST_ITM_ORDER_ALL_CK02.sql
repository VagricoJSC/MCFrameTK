\encoding UTF-8

ALTER TABLE mst_itm_order_all
 ADD CONSTRAINT mst_itm_order_all_ck02 CHECK (ord_snd_flg IN ('0', '1'));

