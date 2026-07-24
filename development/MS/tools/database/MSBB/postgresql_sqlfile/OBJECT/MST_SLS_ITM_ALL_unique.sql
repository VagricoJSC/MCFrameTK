\encoding UTF-8

ALTER TABLE mst_sls_itm_all
 ADD CONSTRAINT mst_sls_itm_all_ak01 UNIQUE (itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_comp_rev_no,qtn_d_no,co_cd);

CREATE UNIQUE INDEX mst_sls_itm_all_ak01_ie ON mst_sls_itm_all (itm_cd,itm_sub1,itm_sub2,itm_sub3,COALESCE(itm_comp_rev_no,''),COALESCE(qtn_d_no,''),co_cd);

