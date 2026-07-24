\encoding UTF-8

ALTER TABLE mam_tax_cmn
 ADD CONSTRAINT mam_tax_cmn_ck03 CHECK (purc_flg IN ('0', '1'));

