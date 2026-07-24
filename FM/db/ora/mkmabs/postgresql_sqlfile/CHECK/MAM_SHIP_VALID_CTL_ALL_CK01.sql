\encoding UTF-8

ALTER TABLE mam_ship_valid_ctl_all
 ADD CONSTRAINT mam_ship_valid_ctl_all_ck01 CHECK (del_flg IN ('0', '1'));

