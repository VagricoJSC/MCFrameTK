\encoding UTF-8

ALTER TABLE mam_ac_tax_cmn
 ADD CONSTRAINT mam_ac_tax_cmn_ck01 CHECK (tran_flg IN ('0', '1'));

