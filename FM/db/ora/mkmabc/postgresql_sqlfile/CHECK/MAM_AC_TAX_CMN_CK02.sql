\encoding UTF-8

ALTER TABLE mam_ac_tax_cmn
 ADD CONSTRAINT mam_ac_tax_cmn_ck02 CHECK (del_flg IN ('0', '1'));

