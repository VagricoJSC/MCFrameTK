\encoding UTF-8

ALTER TABLE mam_act_io_all
 ADD CONSTRAINT mam_act_io_all_ck02 CHECK (loc_null_flg IN ('0', '1'));

