\encoding UTF-8

ALTER TABLE mst_bill_all
 ADD CONSTRAINT mst_bill_all_ck06 CHECK (edi_flg IN ('0', '1'));

