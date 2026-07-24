\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck46 CHECK (pay_spot_flg IN ('0', '1'));

