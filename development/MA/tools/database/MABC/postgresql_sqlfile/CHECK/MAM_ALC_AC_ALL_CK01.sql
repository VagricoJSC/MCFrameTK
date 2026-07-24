\encoding UTF-8

ALTER TABLE mam_alc_ac_all
 ADD CONSTRAINT mam_alc_ac_all_ck01 CHECK (not_itm_alc_ac_flg IN ('0', '1'));

