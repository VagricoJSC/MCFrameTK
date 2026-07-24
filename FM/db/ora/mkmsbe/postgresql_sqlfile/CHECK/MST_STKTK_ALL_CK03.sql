\encoding UTF-8

ALTER TABLE mst_stktk_all
 ADD CONSTRAINT mst_stktk_all_ck03 CHECK (stktk_rpt_prnt_flg IN ('0', '1'));

