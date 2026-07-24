\encoding UTF-8

ALTER TABLE mam_alc_gp_alc_all
 ADD CONSTRAINT mam_alc_gp_alc_all_ck01 CHECK (del_flg IN ('0', '1'));

