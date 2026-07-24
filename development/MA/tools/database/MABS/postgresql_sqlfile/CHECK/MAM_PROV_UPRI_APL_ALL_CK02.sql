\encoding UTF-8

ALTER TABLE mam_prov_upri_apl_all
 ADD CONSTRAINT mam_prov_upri_apl_all_ck02 CHECK (del_flg IN ('0', '1'));

