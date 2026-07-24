\encoding UTF-8

ALTER TABLE mst_spln_fmt_all
 ADD CONSTRAINT mst_spln_fmt_all_ak01 UNIQUE (dpt_cd,cst_cd,wrk_no,spln_itm_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,st_ym,co_cd);

