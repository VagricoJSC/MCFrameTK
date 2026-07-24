\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck20 CHECK (tax_on_bill_flg IN ('0', '1'));

