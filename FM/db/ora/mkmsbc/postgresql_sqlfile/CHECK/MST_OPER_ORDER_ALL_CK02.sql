\encoding UTF-8

ALTER TABLE mst_oper_order_all
 ADD CONSTRAINT mst_oper_order_all_ck02 CHECK (yield_oper_flg IN ('0', '1'));

