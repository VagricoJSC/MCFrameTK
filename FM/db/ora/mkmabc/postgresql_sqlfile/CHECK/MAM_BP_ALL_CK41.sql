\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck41 CHECK (prov_upri_cng_flg IN ('0', '1'));

