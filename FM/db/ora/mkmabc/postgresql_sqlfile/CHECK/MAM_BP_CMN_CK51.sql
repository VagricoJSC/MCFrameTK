\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck51 CHECK (pay_ntc_dtl_outp_flg IN ('0', '1'));

