\encoding UTF-8

ALTER TABLE mst_io_act_if_all
 ADD CONSTRAINT mst_io_act_if_all_ck07 CHECK (accpt_flg IN ('0', '1'));

