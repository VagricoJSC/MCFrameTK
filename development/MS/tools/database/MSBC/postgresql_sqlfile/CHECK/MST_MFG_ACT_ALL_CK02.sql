\encoding UTF-8

ALTER TABLE mst_mfg_act_all
 ADD CONSTRAINT mst_mfg_act_all_ck02 CHECK (arr_purc_auto_reg_flg IN ('0', '1'));

