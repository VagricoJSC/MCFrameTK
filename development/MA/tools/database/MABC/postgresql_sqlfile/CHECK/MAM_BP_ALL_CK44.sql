\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck44 CHECK (rcpt_iv_dup_flg IN ('0', '1'));

