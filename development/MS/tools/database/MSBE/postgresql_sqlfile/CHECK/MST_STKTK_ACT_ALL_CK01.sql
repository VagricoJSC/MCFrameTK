\encoding UTF-8

ALTER TABLE mst_stktk_act_all
 ADD CONSTRAINT mst_stktk_act_all_ck01 CHECK (fix_no_flg IN ('0', '1'));

