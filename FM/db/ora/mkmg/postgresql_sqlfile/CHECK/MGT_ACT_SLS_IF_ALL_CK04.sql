\encoding UTF-8

ALTER TABLE mgt_act_sls_if_all
 ADD CONSTRAINT mgt_act_sls_if_all_ck04 CHECK (zero_effect_flg IN ('0', '1'));

