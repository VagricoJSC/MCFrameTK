\encoding UTF-8

ALTER TABLE mst_purc_frcst_h_all
 ADD CONSTRAINT mst_purc_frcst_h_all_ck02 CHECK (del_flg IN ('0', '1'));

