\encoding UTF-8

ALTER TABLE mam_wk_rsn_all
 ADD CONSTRAINT mam_wk_rsn_all_ck01 CHECK (del_flg IN ('0', '1'));

