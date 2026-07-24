\encoding UTF-8

ALTER TABLE mst_sls_act_io_all
 ADD CONSTRAINT mst_sls_act_io_all_ck01 CHECK (sync_flg IN ('0', '1'));

