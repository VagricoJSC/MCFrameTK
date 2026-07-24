\encoding UTF-8

ALTER TABLE mst_mrprqmt_all
 ADD CONSTRAINT mst_mrprqmt_all_ck01 CHECK (loc_lmt_flg IN ('0', '1'));

