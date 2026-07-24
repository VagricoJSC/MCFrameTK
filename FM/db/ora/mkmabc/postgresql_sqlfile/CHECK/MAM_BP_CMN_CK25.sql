\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck25 CHECK (bill_dtl_rcv_flg IN ('0', '1'));

