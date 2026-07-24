\encoding UTF-8

ALTER TABLE mst_bill_all
 ADD CONSTRAINT mst_bill_all_ck07 CHECK (bill_d_sel_flg IN ('0', '1'));

