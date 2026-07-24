\encoding UTF-8

ALTER TABLE mam_num_ptn_all
 ADD CONSTRAINT mam_num_ptn_all_ck07 CHECK (undisp_flg7 IN ('0', '1'));

