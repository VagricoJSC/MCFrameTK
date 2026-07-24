\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck25 CHECK (bill_dtl_rcv_flg IN ('0', '1'));

