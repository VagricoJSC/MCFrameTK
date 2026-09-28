\encoding UTF-8

ALTER TABLE mst_awk_act_all
 ADD CONSTRAINT mst_awk_act_all_ck01 CHECK (aprv_flg IN ('0', '1'));

