\encoding UTF-8

ALTER TABLE mam_str_ln_cmn
 ADD CONSTRAINT mam_str_ln_cmn_ck02 CHECK (del_flg IN ('0', '1'));

