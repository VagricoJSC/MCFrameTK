\encoding UTF-8

ALTER TABLE mst_purc_ret_act_all
 ADD CONSTRAINT mst_purc_ret_act_all_ck02 CHECK (can_flg IN ('0', '1'));

