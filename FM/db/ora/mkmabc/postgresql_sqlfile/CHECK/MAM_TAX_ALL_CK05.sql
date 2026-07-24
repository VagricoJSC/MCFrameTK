\encoding UTF-8

ALTER TABLE mam_tax_all
 ADD CONSTRAINT mam_tax_all_ck05 CHECK (del_flg IN ('0', '1'));

