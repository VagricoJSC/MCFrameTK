\encoding UTF-8

ALTER TABLE mam_wg_all
 ADD CONSTRAINT mam_wg_all_ck10 CHECK (cmn_upri_flg IN ('0', '1'));

