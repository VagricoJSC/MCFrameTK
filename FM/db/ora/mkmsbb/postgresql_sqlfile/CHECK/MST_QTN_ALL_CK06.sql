\encoding UTF-8

ALTER TABLE mst_qtn_all
 ADD CONSTRAINT mst_qtn_all_ck06 CHECK (can_flg IN ('0', '1'));

