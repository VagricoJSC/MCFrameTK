\encoding UTF-8

ALTER TABLE mst_sls_act_d_all
 ADD CONSTRAINT mst_sls_act_d_all_ck06 CHECK (sundry_itm_flg IN ('0', '1'));

