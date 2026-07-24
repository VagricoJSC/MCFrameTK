\encoding UTF-8

ALTER TABLE mst_io_act_if_all
 ADD CONSTRAINT mst_io_act_if_all_ck01 CHECK (un_fix_flg IN ('0', '1'));

