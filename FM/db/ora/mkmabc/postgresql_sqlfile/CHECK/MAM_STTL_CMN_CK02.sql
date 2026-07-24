\encoding UTF-8

ALTER TABLE mam_sttl_cmn
 ADD CONSTRAINT mam_sttl_cmn_ck02 CHECK (ap_sttl_flg IN ('0', '1'));

