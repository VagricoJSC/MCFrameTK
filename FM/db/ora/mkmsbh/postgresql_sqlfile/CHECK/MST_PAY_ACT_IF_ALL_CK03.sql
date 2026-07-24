\encoding UTF-8

ALTER TABLE mst_pay_act_if_all
 ADD CONSTRAINT mst_pay_act_if_all_ck03 CHECK (a_imp_flg IN ('0', '1'));

