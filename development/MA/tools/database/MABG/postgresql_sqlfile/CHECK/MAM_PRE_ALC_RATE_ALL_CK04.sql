\encoding UTF-8

ALTER TABLE mam_pre_alc_rate_all
 ADD CONSTRAINT mam_pre_alc_rate_all_ck04 CHECK (del_flg IN ('0', '1'));

