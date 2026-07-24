\encoding UTF-8

ALTER TABLE mst_bill_send_if_all
 ADD CONSTRAINT mst_bill_send_if_all_ck02 CHECK (inc_tax_flg IN ('0', '1'));

