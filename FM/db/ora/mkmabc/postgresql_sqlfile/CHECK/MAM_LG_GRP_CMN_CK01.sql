\encoding UTF-8

ALTER TABLE mam_lg_grp_cmn
 ADD CONSTRAINT mam_lg_grp_cmn_ck01 CHECK (loc_flg IN ('0', '1'));

