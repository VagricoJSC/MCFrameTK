\encoding UTF-8

ALTER TABLE mst_bill_rcpt_all
 ADD CONSTRAINT mst_bill_rcpt_all_ck01 CHECK (invalid_flg IN ('0', '1'));

