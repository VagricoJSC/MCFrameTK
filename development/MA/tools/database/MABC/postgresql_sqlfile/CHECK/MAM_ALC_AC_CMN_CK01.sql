\encoding UTF-8

ALTER TABLE mam_alc_ac_cmn
 ADD CONSTRAINT mam_alc_ac_cmn_ck01 CHECK (not_itm_alc_ac_flg IN ('0', '1'));

