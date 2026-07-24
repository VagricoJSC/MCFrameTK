\encoding UTF-8

ALTER TABLE mgt_act_alc_amt_all
 ADD CONSTRAINT mgt_act_alc_amt_all_ck01 CHECK (pre_alc_fin_flg IN ('0', '1'));

