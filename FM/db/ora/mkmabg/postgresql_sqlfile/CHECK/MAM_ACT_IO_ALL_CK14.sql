\encoding UTF-8

ALTER TABLE mam_act_io_all
 ADD CONSTRAINT mam_act_io_all_ck14 CHECK (sno3_flg IN ('0', '1'));

