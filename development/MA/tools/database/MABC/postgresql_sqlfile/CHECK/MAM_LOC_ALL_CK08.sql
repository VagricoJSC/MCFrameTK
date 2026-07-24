\encoding UTF-8

ALTER TABLE mam_loc_all
 ADD CONSTRAINT mam_loc_all_ck08 CHECK (stktk_amt_flg IN ('0', '1'));

