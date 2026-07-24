\encoding UTF-8

ALTER TABLE mam_alc_wk_all
 ADD CONSTRAINT mam_alc_wk_all_ck01 CHECK (del_flg IN ('0', '1'));

