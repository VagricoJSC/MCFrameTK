\encoding UTF-8

ALTER TABLE mst_sls_itm_spec_all
 ADD CONSTRAINT mst_sls_itm_spec_all_ak01 UNIQUE (sls_itm_no,sno1,sno2,sno3,sno4,co_cd);

