\encoding UTF-8

ALTER TABLE mst_bill_recv_if_all
 ADD CONSTRAINT mst_bill_recv_if_all_ck01 CHECK (interim_flg IN ('0', '1'));

