\encoding UTF-8

ALTER TABLE mam_alc_ac_all
 ADD CONSTRAINT mam_alc_ac_all_ck02 CHECK (not_alc_rate_ac_flg IN ('0', '1'));

