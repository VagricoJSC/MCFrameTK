\encoding UTF-8

ALTER TABLE mgt_std_alc_rate_all
 ADD CONSTRAINT mgt_std_alc_rate_all_ck01 CHECK (fix_flg IN ('0', '1'));

