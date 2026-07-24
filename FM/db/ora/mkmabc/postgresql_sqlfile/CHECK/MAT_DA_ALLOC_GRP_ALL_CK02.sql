\encoding UTF-8

ALTER TABLE mat_da_alloc_grp_all
 ADD CONSTRAINT mat_da_alloc_grp_all_ck02 CHECK (wr_flg IN ('0', '1'));

