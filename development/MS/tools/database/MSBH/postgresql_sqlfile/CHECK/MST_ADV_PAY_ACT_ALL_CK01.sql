\encoding UTF-8

ALTER TABLE mst_adv_pay_act_all
 ADD CONSTRAINT mst_adv_pay_act_all_ck01 CHECK (pay_ntc_adv_pay_flg IN ('0', '1'));

