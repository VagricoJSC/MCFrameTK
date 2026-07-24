\encoding UTF-8

ALTER TABLE mam_ship_valid_cmn
 ADD CONSTRAINT mam_ship_valid_cmn_ck01 CHECK (del_flg IN ('0', '1'));

