\encoding UTF-8

ALTER TABLE mam_bom_all
 ADD CONSTRAINT mam_bom_all_ck03 CHECK (byprod_flg IN ('0', '1'));

