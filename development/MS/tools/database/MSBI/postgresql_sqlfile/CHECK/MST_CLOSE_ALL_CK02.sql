\encoding UTF-8

ALTER TABLE mst_close_all
 ADD CONSTRAINT mst_close_all_ck02 CHECK (rcv_cl_flg IN ('0', '1'));

