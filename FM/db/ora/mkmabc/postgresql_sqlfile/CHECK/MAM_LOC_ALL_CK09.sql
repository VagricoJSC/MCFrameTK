\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck09 CHECK (str_ln_tgt_flg IN ('0', '1'));

