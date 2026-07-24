\encoding UTF-8

ALTER TABLE mst_mfg_act_all
 ADD CONSTRAINT mst_mfg_act_all_ck01 CHECK (act_prnt_flg IN ('0', '1'));

