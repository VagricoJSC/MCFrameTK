\encoding UTF-8

ALTER TABLE mst_qtn_all
 ADD CONSTRAINT mst_qtn_all_ck02 CHECK (cst_sundry_flg IN ('0', '1'));

