\encoding UTF-8

ALTER TABLE mam_lg_grp_cmn
 ADD CONSTRAINT mam_lg_grp_cmn_ck08 CHECK (del_flg IN ('0', '1'));

