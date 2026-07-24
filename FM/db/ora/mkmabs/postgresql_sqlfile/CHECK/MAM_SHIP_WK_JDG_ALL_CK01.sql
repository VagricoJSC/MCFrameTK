\encoding UTF-8

ALTER TABLE mam_ship_wk_jdg_all
 ADD CONSTRAINT mam_ship_wk_jdg_all_ck01 CHECK (del_flg IN ('0', '1'));

