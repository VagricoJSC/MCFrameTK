\encoding UTF-8

ALTER TABLE mam_menu_config_all
 ADD CONSTRAINT mam_menu_config_all_ck01 CHECK (del_flg IN ('0', '1'));

