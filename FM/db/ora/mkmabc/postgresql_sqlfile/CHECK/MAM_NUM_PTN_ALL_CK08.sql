\encoding UTF-8

ALTER TABLE mam_num_ptn_all
 ADD CONSTRAINT mam_num_ptn_all_ck08 CHECK (undisp_flg8 IN ('0', '1'));

