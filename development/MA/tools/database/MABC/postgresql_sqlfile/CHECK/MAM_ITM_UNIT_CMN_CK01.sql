\encoding UTF-8

ALTER TABLE mam_itm_unit_cmn
 ADD CONSTRAINT mam_itm_unit_cmn_ck01 CHECK (pack_flg IN ('0', '1'));

