\encoding UTF-8

ALTER TABLE mam_sttl_all
 ADD CONSTRAINT mam_sttl_all_ck05 CHECK (bill_tax_disp_flg IN ('0', '1'));

