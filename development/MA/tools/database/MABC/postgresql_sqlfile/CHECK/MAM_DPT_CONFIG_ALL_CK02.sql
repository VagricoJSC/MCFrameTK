\encoding UTF-8

ALTER TABLE mam_dpt_config_all
 ADD CONSTRAINT mam_dpt_config_all_ck02 CHECK (del_flg IN ('0', '1'));

