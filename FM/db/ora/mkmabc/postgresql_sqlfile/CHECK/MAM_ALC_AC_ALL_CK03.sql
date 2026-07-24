\encoding UTF-8

ALTER TABLE mam_alc_ac_all
 ADD CONSTRAINT mam_alc_ac_all_ck03 CHECK (del_flg IN ('0', '1'));

