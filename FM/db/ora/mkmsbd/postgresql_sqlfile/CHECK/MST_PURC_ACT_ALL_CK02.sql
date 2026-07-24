\encoding UTF-8

ALTER TABLE mst_purc_act_all
 ADD CONSTRAINT mst_purc_act_all_ck02 CHECK (temp_ap_use_flg IN ('0', '1'));

