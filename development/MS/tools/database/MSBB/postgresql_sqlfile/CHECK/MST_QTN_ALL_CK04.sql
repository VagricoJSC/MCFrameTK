\encoding UTF-8

ALTER TABLE mst_qtn_all
 ADD CONSTRAINT mst_qtn_all_ck04 CHECK (aprv_flg IN ('0', '1'));

