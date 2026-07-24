\encoding UTF-8

ALTER TABLE mst_stktk_all
 ADD CONSTRAINT mst_stktk_all_ck01 CHECK (io_ctrl_flg IN ('0', '1'));

