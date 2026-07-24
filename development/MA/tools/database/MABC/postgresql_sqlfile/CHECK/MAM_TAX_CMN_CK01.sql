\encoding UTF-8

ALTER TABLE mam_tax_cmn
 ADD CONSTRAINT mam_tax_cmn_ck01 CHECK (inc_tax_flg IN ('0', '1'));

