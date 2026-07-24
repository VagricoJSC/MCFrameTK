\encoding UTF-8

ALTER TABLE mst_purc_act_d_all
 ADD CONSTRAINT mst_purc_act_d_all_ck03 CHECK (upri_not_tgt_flg IN ('0', '1'));

