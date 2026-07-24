\encoding UTF-8

ALTER TABLE mgt_calc_sls_all
 ADD CONSTRAINT mgt_calc_sls_all_ck01 CHECK (zero_effect_flg IN ('0', '1'));

