\encoding UTF-8

ALTER TABLE mam_grp_ctg_all
 ADD CONSTRAINT mam_grp_ctg_all_ck01 CHECK (del_flg IN ('0', '1'));

