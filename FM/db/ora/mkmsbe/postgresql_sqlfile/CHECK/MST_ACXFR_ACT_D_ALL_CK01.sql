\encoding UTF-8

ALTER TABLE mst_acxfr_act_d_all
 ADD CONSTRAINT mst_acxfr_act_d_all_ck01 CHECK (can_flg IN ('0', '1'));

