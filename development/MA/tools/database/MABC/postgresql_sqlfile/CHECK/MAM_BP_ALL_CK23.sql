\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck23 CHECK (bill_dtl_outp_flg IN ('0', '1'));

