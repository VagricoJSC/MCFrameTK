\encoding UTF-8

ALTER TABLE mam_sttl_cmn
 ADD CONSTRAINT mam_sttl_cmn_ck05 CHECK (bill_tax_disp_flg IN ('0', '1'));

