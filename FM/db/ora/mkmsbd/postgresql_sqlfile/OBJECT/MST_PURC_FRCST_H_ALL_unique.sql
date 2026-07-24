\encoding UTF-8

ALTER TABLE mst_purc_frcst_h_all
 ADD CONSTRAINT mst_purc_frcst_h_all_ak01 UNIQUE (pf_dt,sppl_cd,wg_cd,co_cd);

