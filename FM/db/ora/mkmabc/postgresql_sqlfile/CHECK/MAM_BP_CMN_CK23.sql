\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck23 CHECK (bill_dtl_outp_flg IN ('0', '1'));

