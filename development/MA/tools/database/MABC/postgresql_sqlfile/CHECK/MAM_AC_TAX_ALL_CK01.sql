\encoding UTF-8

ALTER TABLE mam_ac_tax_all
 ADD CONSTRAINT mam_ac_tax_all_ck01 CHECK (tran_flg IN ('0', '1'));

