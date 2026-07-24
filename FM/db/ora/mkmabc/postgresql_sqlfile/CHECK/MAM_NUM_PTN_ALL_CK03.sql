\encoding UTF-8

ALTER TABLE mam_num_ptn_all
 ADD CONSTRAINT mam_num_ptn_all_ck03 CHECK (undisp_flg3 IN ('0', '1'));

