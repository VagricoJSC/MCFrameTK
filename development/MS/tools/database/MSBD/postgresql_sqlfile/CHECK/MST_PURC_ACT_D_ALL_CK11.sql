\encoding UTF-8

ALTER TABLE mst_purc_act_d_all
 ADD CONSTRAINT mst_purc_act_d_all_ck11 CHECK (re_arr_sync_flg IN ('0', '1'));

