\encoding UTF-8

ALTER TABLE mst_io_act_all
 ADD CONSTRAINT mst_io_act_all_ck11 CHECK (send_flg IN ('0', '1'));

