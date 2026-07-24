\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck21 CHECK (tax_on_bill_flg IN ('0', '1'));

