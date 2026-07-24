\encoding UTF-8

ALTER TABLE mam_num_ptn_def
 ADD CONSTRAINT mam_num_ptn_def_ck01 CHECK (undisp_flg1 IN ('0', '1'));

