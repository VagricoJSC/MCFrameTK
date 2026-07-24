\encoding UTF-8

ALTER TABLE mam_num_ptn_def
 ADD CONSTRAINT mam_num_ptn_def_ck05 CHECK (undisp_flg5 IN ('0', '1'));

