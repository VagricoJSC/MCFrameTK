\encoding UTF-8

ALTER TABLE mam_str_ln_cmn
 ADD CONSTRAINT mam_str_ln_cmn_ck01 CHECK (ln_flg IN ('0', '1'));

