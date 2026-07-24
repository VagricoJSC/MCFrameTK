\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck04 CHECK (stktk_tgt_flg IN ('0', '1'));

