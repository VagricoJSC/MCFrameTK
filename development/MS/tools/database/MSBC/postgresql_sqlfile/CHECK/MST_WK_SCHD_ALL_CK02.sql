\encoding UTF-8

ALTER TABLE mst_wk_schd_all
 ADD CONSTRAINT mst_wk_schd_all_ck02 CHECK (can_flg IN ('0', '1'));

