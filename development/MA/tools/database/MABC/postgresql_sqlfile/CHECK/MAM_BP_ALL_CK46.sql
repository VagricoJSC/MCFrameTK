\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck46 CHECK (pay_spot_flg IN ('0', '1'));

