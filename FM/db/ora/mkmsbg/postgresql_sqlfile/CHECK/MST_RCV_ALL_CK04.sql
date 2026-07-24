\encoding UTF-8

ALTER TABLE mst_rcv_all
 ADD CONSTRAINT mst_rcv_all_ck04 CHECK (div_flg IN ('0', '1'));

