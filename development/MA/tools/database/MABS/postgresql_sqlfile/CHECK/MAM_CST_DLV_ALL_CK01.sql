\encoding UTF-8

ALTER TABLE mam_cst_dlv_all
 ADD CONSTRAINT mam_cst_dlv_all_ck01 CHECK (del_flg IN ('0', '1'));

