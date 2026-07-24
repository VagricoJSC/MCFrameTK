\encoding UTF-8

ALTER TABLE mam_hs_cmn
 ADD CONSTRAINT mam_hs_cmn_ck01 CHECK (del_flg IN ('0', '1'));

