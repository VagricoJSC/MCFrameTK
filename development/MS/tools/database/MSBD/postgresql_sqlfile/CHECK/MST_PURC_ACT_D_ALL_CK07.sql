\encoding UTF-8

ALTER TABLE mst_purc_act_d_all
 ADD CONSTRAINT mst_purc_act_d_all_ck07 CHECK (ncv_flg IN ('0', '1'));

