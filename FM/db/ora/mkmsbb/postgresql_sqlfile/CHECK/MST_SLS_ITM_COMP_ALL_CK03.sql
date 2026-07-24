\encoding UTF-8

ALTER TABLE mst_sls_itm_comp_all
 ADD CONSTRAINT mst_sls_itm_comp_all_ck03 CHECK (mst_flg IN ('0', '1'));

