\encoding UTF-8

ALTER TABLE mst_acxfr_act_d_all
 ADD CONSTRAINT mst_acxfr_act_d_all_ck02 CHECK (aprv_flg IN ('0', '1'));

