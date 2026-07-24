\encoding UTF-8

ALTER TABLE mam_tax_cmn
 ADD CONSTRAINT mam_tax_cmn_ck04 CHECK (prov_flg IN ('0', '1'));

