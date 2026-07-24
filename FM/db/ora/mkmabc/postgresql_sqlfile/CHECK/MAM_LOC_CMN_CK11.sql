\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck11 CHECK (gi_pack_xfer_flg IN ('0', '1'));

