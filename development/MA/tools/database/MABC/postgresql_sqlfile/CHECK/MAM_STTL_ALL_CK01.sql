\encoding UTF-8

ALTER TABLE mam_sttl_all
 ADD CONSTRAINT mam_sttl_all_ck01 CHECK (ar_sttl_flg IN ('0', '1'));

