\encoding UTF-8

ALTER TABLE mst_sche_exec_all
 ADD CONSTRAINT mst_sche_exec_all_ck01 CHECK (exec_flg IN ('0', '1'));

