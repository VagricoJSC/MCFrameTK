\encoding UTF-8

ALTER TABLE mst_bill_rcpt_d_all
 ADD CONSTRAINT mst_bill_rcpt_d_all_ck01 CHECK (interim_flg IN ('0', '1'));

