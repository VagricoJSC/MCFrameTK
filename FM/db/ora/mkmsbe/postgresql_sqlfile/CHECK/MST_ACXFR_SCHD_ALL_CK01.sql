\encoding UTF-8

ALTER TABLE mst_acxfr_schd_all
 ADD CONSTRAINT mst_acxfr_schd_all_ck01 CHECK (alloc_flg IN ('0', '1'));

