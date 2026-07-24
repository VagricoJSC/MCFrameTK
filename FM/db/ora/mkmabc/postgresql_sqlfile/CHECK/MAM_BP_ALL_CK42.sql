\encoding UTF-8

ALTER TABLE mam_bp_all
 ADD CONSTRAINT mam_bp_all_ck42 CHECK (prov_tax_cd_prio_flg IN ('0', '1'));

