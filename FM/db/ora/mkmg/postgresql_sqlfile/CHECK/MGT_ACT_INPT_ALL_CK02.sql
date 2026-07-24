\encoding UTF-8

ALTER TABLE mgt_act_inpt_all
 ADD CONSTRAINT mgt_act_inpt_all_ck02 CHECK (zero_effect_flg IN ('0', '1'));

