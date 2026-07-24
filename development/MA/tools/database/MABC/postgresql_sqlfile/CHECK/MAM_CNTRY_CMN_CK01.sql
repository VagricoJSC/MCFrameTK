\encoding UTF-8

ALTER TABLE mam_cntry_cmn
 ADD CONSTRAINT mam_cntry_cmn_ck01 CHECK (del_flg IN ('0', '1'));

