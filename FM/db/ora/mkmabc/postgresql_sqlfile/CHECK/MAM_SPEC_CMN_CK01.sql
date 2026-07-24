\encoding UTF-8

ALTER TABLE mam_spec_cmn
 ADD CONSTRAINT mam_spec_cmn_ck01 CHECK (del_flg IN ('0', '1'));

