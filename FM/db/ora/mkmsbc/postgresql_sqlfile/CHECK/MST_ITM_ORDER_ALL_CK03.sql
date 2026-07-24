\encoding UTF-8

ALTER TABLE mst_itm_order_all
 ADD CONSTRAINT mst_itm_order_all_ck03 CHECK (for_scheduler_frozen_flg IN ('0', '1'));

