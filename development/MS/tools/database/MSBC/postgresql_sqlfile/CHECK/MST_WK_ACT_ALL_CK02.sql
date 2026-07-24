\encoding UTF-8

ALTER TABLE mst_wk_act_all
 ADD CONSTRAINT mst_wk_act_all_ck02 CHECK (mes_flg IN ('0', '1'));

