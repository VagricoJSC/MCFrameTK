\encoding UTF-8

ALTER TABLE mam_sttl_cmn
 ADD CONSTRAINT mam_sttl_cmn_ck06 CHECK (del_flg IN ('0', '1'));

