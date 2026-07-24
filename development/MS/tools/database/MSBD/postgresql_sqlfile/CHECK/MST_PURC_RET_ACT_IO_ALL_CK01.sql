\encoding UTF-8

ALTER TABLE mst_purc_ret_act_io_all
 ADD CONSTRAINT mst_purc_ret_act_io_all_ck01 CHECK (can_flg IN ('0', '1'));

