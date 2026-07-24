\encoding UTF-8

ALTER TABLE mam_loc_cmn
 ADD CONSTRAINT mam_loc_cmn_ck08 CHECK (stktk_amt_flg IN ('0', '1'));

