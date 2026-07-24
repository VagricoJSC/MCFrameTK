\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck20 CHECK (tax_on_bill_flg IN ('0', '1'));

