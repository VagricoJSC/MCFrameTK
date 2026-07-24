\encoding UTF-8

ALTER TABLE mst_stktk_act_all
 ADD CONSTRAINT mst_stktk_act_all_ck04 CHECK (use_diff_flg IN ('0', '1'));

