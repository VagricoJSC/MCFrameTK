\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck13 CHECK (addr_flg IN ('0', '1'));

