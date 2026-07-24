\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck29 CHECK (rcv_amt_match_flg IN ('0', '1'));

