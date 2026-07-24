\encoding UTF-8

ALTER TABLE mam_bp_cmn
 ADD CONSTRAINT mam_bp_cmn_ck28 CHECK (rcv_amt_match_flg IN ('0', '1'));

