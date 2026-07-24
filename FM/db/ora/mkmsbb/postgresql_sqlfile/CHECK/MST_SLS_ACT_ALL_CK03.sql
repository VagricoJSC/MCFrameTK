\encoding UTF-8

ALTER TABLE mst_sls_act_all
 ADD CONSTRAINT mst_sls_act_all_ck03 CHECK (ship_act_sync_flg IN ('0', '1'));

