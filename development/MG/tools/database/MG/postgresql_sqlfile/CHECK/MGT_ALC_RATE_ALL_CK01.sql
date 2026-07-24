\encoding UTF-8

ALTER TABLE mgt_alc_rate_all
 ADD CONSTRAINT mgt_alc_rate_all_ck01 CHECK (no_calc_flg IN ('0', '1'));

