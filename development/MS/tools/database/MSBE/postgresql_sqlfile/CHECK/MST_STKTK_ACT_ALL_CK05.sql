\encoding UTF-8

ALTER TABLE mst_stktk_act_all
 ADD CONSTRAINT mst_stktk_act_all_ck05 CHECK (stktk_itm_spc_flg IN ('0', '1'));

