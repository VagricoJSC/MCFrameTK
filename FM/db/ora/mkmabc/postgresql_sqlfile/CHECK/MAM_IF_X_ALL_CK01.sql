\encoding UTF-8

ALTER TABLE mam_if_x_all
 ADD CONSTRAINT mam_if_x_all_ck01 CHECK (del_flg IN ('0', '1'));

