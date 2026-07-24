\encoding UTF-8

ALTER TABLE mst_purc_act_all
 ADD CONSTRAINT mst_purc_act_all_ck01 CHECK (purc_adjst_flg IN ('0', '1'));

