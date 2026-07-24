\encoding UTF-8

ALTER TABLE mst_purc_frcst_bal_all
 ADD CONSTRAINT mst_purc_frcst_bal_all_ck01 CHECK (cmpl_flg IN ('0', '1'));

