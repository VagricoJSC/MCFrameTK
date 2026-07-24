\encoding UTF-8

ALTER TABLE mst_bill_d_all
 ADD CONSTRAINT mst_bill_d_all_ck06 CHECK (crryovr_flg IN ('0', '1'));

