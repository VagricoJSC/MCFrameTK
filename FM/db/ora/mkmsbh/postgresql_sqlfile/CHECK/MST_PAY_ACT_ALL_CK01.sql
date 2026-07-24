\encoding UTF-8

ALTER TABLE mst_pay_act_all
 ADD CONSTRAINT mst_pay_act_all_ck01 CHECK (schd_act_flg IN ('0', '1'));

