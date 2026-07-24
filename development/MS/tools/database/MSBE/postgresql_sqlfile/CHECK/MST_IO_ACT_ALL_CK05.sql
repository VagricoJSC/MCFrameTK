\encoding UTF-8

ALTER TABLE mst_io_act_all
 ADD CONSTRAINT mst_io_act_all_ck05 CHECK (spot_flg IN ('0', '1'));

