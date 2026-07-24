\encoding UTF-8

ALTER TABLE mgt_act_io_all
 ADD CONSTRAINT mgt_act_io_all_ck03 CHECK (zero_effect_flg IN ('0', '1'));

