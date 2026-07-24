\encoding UTF-8

ALTER TABLE mst_stktk_all
 ADD CONSTRAINT mst_stktk_all_ck04 CHECK (diff_rpt_prnt_flg IN ('0', '1'));

