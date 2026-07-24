\encoding UTF-8

ALTER TABLE mst_stktk_act_all
 ADD CONSTRAINT mst_stktk_act_all_ck03 CHECK (act_input_flg IN ('0', '1'));

