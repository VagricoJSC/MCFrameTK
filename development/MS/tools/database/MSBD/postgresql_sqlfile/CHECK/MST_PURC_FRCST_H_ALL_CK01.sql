\encoding UTF-8

ALTER TABLE mst_purc_frcst_h_all
 ADD CONSTRAINT mst_purc_frcst_h_all_ck01 CHECK (pf_rpt_flg IN ('0', '1'));

