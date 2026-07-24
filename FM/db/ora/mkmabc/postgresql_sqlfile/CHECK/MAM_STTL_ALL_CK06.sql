\encoding UTF-8

ALTER TABLE mam_sttl_all
 ADD CONSTRAINT mam_sttl_all_ck06 CHECK (del_flg IN ('0', '1'));

