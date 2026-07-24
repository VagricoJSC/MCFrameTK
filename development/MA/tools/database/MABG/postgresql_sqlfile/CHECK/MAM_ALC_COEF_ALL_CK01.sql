\encoding UTF-8

ALTER TABLE mam_alc_coef_all
 ADD CONSTRAINT mam_alc_coef_all_ck01 CHECK (del_flg IN ('0', '1'));

