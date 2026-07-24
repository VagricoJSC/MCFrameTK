\encoding UTF-8

ALTER TABLE mst_sls_act_d_all
 ADD CONSTRAINT mst_sls_act_d_all_ck07 CHECK (ship_dlv_slip_multi_flg IN ('0', '1'));

