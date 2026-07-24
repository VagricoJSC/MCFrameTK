\encoding UTF-8

ALTER TABLE mst_acxfr_schd_all
 ADD CONSTRAINT mst_acxfr_schd_all_ck04 CHECK (can_flg IN ('0', '1'));

