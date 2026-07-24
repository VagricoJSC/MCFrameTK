\encoding UTF-8

ALTER TABLE mst_wrk_all
 ADD CONSTRAINT mst_wrk_all_ck03 CHECK (can_flg IN ('0', '1'));

