\encoding UTF-8

ALTER TABLE mgt_calc_inpt_all
 ADD CONSTRAINT mgt_calc_inpt_all_ck02 CHECK (zero_effect_flg IN ('0', '1'));

