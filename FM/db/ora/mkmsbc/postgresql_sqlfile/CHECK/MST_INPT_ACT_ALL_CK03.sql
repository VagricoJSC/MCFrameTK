\encoding UTF-8

ALTER TABLE mst_inpt_act_all
 ADD CONSTRAINT mst_inpt_act_all_ck03 CHECK (mes_flg IN ('0', '1'));

