\encoding UTF-8

ALTER TABLE mbt_bp_if_all
 ADD CONSTRAINT mbt_bp_if_all_ck44 CHECK (rcpt_iv_dup_flg IN ('0', '1'));

