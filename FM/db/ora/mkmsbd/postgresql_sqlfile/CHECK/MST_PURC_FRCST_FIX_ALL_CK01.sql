\encoding UTF-8

ALTER TABLE mst_purc_frcst_fix_all
 ADD CONSTRAINT mst_purc_frcst_fix_all_ck01 CHECK (fix_flg IN ('0', '1'));

