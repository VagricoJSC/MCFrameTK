\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck04 CHECK (stktk_tgt_flg IN ('0', '1'));

