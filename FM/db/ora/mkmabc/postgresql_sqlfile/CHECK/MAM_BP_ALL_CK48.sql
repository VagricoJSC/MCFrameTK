\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck48 CHECK (tax_on_pay_flg IN ('0', '1'));

