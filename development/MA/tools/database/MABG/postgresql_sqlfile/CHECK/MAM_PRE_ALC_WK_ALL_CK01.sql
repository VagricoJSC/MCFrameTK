\encoding UTF-8

ALTER TABLE mam_pre_alc_wk_all
 ADD CONSTRAINT mam_pre_alc_wk_all_ck01 CHECK (del_flg IN ('0', '1'));

