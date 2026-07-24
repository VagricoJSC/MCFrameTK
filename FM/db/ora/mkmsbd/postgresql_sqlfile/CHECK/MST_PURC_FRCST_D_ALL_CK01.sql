\encoding UTF-8

ALTER TABLE mst_purc_frcst_d_all
 ADD CONSTRAINT mst_purc_frcst_d_all_ck01 CHECK (fix_period_flg IN ('0', '1'));

