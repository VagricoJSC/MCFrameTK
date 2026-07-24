\encoding UTF-8

ALTER TABLE mst_bill_d_all
 ADD CONSTRAINT mst_bill_d_all_ck05 CHECK (bill_prnt_tgt_flg IN ('0', '1'));

