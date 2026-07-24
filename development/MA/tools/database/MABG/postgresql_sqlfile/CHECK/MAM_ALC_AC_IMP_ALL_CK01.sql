\encoding UTF-8

ALTER TABLE mam_alc_ac_imp_all
 ADD CONSTRAINT mam_alc_ac_imp_all_ck01 CHECK (del_flg IN ('0', '1'));

