\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck05 CHECK (stktk_tor_disp_flg IN ('0', '1'));

