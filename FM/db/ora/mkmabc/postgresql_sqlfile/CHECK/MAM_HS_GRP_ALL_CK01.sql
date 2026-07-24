\encoding UTF-8

ALTER TABLE mam_hs_grp_all
 ADD CONSTRAINT mam_hs_grp_all_ck01 CHECK (del_flg IN ('0', '1'));

