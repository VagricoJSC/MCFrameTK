\encoding UTF-8

ALTER TABLE mam_alc_ac_cmn
 ADD CONSTRAINT mam_alc_ac_cmn_ck03 CHECK (del_flg IN ('0', '1'));

