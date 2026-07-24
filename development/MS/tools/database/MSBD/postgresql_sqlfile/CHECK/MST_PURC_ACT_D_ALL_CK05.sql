\encoding UTF-8

ALTER TABLE mst_purc_act_d_all
 ADD CONSTRAINT mst_purc_act_d_all_ck05 CHECK (temp_ap_flg IN ('0', '1'));

