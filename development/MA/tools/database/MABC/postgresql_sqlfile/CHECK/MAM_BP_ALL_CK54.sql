\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck54 CHECK (pay_ntc_dtl_pay_flg IN ('0', '1'));

