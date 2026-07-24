\encoding UTF-8

ALTER TABLE mst_bill_d_all
 ADD CONSTRAINT mst_bill_d_all_ck02 CHECK (sundry_itm_flg IN ('0', '1'));

