\encoding UTF-8

ALTER TABLE mst_order_recv_if_all
 ADD CONSTRAINT mst_order_recv_if_all_ck01 CHECK (scheduler_frozen_flg IN ('0', '1'));

