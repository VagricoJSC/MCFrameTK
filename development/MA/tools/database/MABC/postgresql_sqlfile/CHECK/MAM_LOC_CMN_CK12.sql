\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck12 CHECK (gi_vmi_flg IN ('0', '1'));

