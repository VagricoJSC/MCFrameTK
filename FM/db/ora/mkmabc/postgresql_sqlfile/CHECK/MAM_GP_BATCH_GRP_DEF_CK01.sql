\encoding UTF-8

ALTER TABLE mam_gp_batch_grp_def
 ADD CONSTRAINT mam_gp_batch_grp_def_ck01 CHECK (del_flg IN ('0', '1'));

