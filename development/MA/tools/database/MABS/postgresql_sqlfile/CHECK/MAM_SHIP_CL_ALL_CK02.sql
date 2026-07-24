\encoding UTF-8

ALTER TABLE mam_ship_cl_all
 ADD CONSTRAINT mam_ship_cl_all_ck02 CHECK (del_flg IN ('0', '1'));

