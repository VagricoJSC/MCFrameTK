\encoding UTF-8

ALTER TABLE mam_alc_ac_cmn
 ADD CONSTRAINT mam_alc_ac_cmn_ck02 CHECK (not_alc_rate_ac_flg IN ('0', '1'));

