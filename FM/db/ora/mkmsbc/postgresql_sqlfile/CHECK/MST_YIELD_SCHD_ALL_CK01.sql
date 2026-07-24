\encoding UTF-8

ALTER TABLE mst_yield_schd_all
 ADD CONSTRAINT mst_yield_schd_all_ck01 CHECK (can_flg IN ('0', '1'));

