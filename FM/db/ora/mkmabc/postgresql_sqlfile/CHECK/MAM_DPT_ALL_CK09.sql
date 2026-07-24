\encoding UTF-8

ALTER TABLE mam_dpt_all
 ADD CONSTRAINT mam_dpt_all_ck09 CHECK (sd_dpt_flg IN ('0', '1'));

