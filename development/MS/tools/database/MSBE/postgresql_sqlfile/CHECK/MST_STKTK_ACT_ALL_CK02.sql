\encoding UTF-8

ALTER TABLE mst_stktk_act_all
 ADD CONSTRAINT mst_stktk_act_all_ck02 CHECK (keep_data_flg IN ('0', '1'));

