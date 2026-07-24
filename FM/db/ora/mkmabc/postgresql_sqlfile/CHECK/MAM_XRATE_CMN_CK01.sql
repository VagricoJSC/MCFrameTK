\encoding UTF-8

ALTER TABLE mam_xrate_cmn
 ADD CONSTRAINT mam_xrate_cmn_ck01 CHECK (del_flg IN ('0', '1'));

