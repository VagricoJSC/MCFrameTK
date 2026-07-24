\encoding UTF-8

ALTER TABLE mam_da_cmn
 ADD CONSTRAINT mam_da_cmn_ck01 CHECK (del_flg IN ('0', '1'));

