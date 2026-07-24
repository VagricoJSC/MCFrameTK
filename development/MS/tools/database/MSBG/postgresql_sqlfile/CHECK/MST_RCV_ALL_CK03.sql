\encoding UTF-8

ALTER TABLE mst_rcv_all
 ADD CONSTRAINT mst_rcv_all_ck03 CHECK (prnt_flg IN ('0', '1'));

