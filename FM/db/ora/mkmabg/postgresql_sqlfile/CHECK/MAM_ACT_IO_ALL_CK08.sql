\encoding UTF-8

ALTER TABLE mam_act_io_all
 ADD CONSTRAINT mam_act_io_all_ck08 CHECK (ctg_flg IN ('0', '1'));

