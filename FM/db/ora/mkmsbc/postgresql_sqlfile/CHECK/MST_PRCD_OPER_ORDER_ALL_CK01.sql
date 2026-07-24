\encoding UTF-8

ALTER TABLE mst_prcd_oper_order_all
 ADD CONSTRAINT mst_prcd_oper_order_all_ck01 CHECK (yield_oper_flg IN ('0', '1'));

