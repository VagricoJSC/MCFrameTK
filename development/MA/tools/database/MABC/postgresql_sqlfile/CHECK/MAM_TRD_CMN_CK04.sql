\encoding UTF-8

ALTER TABLE mam_trd_cmn
 ADD CONSTRAINT mam_trd_cmn_ck04 CHECK (del_flg IN ('0', '1'));

