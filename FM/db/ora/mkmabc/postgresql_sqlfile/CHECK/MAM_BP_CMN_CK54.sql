\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck54 CHECK (pay_ntc_dtl_pay_flg IN ('0', '1'));

