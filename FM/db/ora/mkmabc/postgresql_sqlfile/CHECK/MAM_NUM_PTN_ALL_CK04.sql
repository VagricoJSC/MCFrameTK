\encoding UTF-8

ALTER TABLE mam_num_ptn_all
 ADD CONSTRAINT mam_num_ptn_all_ck04 CHECK (undisp_flg4 IN ('0', '1'));

