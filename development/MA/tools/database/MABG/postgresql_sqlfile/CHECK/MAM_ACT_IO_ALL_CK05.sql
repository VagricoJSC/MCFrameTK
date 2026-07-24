\encoding UTF-8

ALTER TABLE mam_act_io_all
 ADD CONSTRAINT mam_act_io_all_ck05 CHECK (loc_flg IN ('0', '1'));

