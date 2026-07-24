\encoding UTF-8

ALTER TABLE mst_dlv_inst_d_all
 ADD CONSTRAINT mst_dlv_inst_d_all_ck01 CHECK (sync_flg IN ('0', '1'));

