\encoding UTF-8

ALTER TABLE mam_act_io_all
 ADD CONSTRAINT mam_act_io_all_ck12 CHECK (sno1_flg IN ('0', '1'));

