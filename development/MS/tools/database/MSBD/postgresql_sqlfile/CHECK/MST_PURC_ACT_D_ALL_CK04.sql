\encoding UTF-8

ALTER TABLE mst_purc_act_d_all
 ADD CONSTRAINT mst_purc_act_d_all_ck04 CHECK (interim_flg IN ('0', '1'));

