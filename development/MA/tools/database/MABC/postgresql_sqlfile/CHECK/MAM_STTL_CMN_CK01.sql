\encoding UTF-8

ALTER TABLE mam_sttl_cmn
 ADD CONSTRAINT mam_sttl_cmn_ck01 CHECK (ar_sttl_flg IN ('0', '1'));

