\encoding UTF-8

ALTER TABLE mam_coef_auto_all
 ADD CONSTRAINT mam_coef_auto_all_ck01 CHECK (del_flg IN ('0', '1'));

