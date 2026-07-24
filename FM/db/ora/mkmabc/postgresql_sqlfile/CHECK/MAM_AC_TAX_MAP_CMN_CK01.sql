\encoding UTF-8

ALTER TABLE mam_ac_tax_map_cmn
 ADD CONSTRAINT mam_ac_tax_map_cmn_ck01 CHECK (del_flg IN ('0', '1'));

