\encoding UTF-8

ALTER TABLE mam_cntry_sign_all
 ADD CONSTRAINT mam_cntry_sign_all_ck01 CHECK (del_flg IN ('0', '1'));

