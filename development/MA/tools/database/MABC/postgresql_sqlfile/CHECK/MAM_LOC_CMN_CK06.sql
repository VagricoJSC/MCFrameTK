\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck06 CHECK (stktk_tor_ex_zero_flg IN ('0', '1'));

