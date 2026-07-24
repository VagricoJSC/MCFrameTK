\encoding UTF-8

ALTER TABLE mam_dpt_lvl_all
 ADD CONSTRAINT mam_dpt_lvl_all_ck01 CHECK (del_flg IN ('0', '1'));

