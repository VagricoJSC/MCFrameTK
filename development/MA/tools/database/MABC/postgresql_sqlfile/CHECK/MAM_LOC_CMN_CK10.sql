\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck10 CHECK (alloc_lmt_flg IN ('0', '1'));

