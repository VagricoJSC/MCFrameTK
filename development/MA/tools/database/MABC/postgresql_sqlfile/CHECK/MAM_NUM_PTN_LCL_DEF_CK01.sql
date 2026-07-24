\encoding UTF-8

ALTER TABLE mam_num_ptn_lcl_def
 ADD CONSTRAINT mam_num_ptn_lcl_def_ck01 CHECK (del_flg IN ('0', '1'));

