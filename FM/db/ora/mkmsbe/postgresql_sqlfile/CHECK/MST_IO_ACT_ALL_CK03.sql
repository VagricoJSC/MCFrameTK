\encoding UTF-8

ALTER TABLE mst_io_act_all
 ADD CONSTRAINT mst_io_act_all_ck03 CHECK (sundry_itm_flg IN ('0', '1'));

