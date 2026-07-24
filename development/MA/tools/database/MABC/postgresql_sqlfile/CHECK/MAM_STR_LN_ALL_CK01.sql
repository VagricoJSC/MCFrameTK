\encoding UTF-8

ALTER TABLE mam_str_ln_all
 ADD CONSTRAINT mam_str_ln_all_ck01 CHECK (ln_flg IN ('0', '1'));

