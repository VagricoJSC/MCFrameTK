\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck50 CHECK (pay_ntc_prnt_flg IN ('0', '1'));

