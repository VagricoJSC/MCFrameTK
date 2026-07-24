\encoding UTF-8

ALTER TABLE mst_io_act_if_all
 ADD CONSTRAINT mst_io_act_if_all_ck02 CHECK (temp_ap_flg IN ('0', '1'));

