\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck28 CHECK (rcv_amt_match_flg IN ('0', '1'));

