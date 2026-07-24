\encoding UTF-8

ALTER TABLE mst_prov_schd_all
 ADD CONSTRAINT mst_prov_schd_all_ck03 CHECK (tax_fix_flg IN ('0', '1'));

