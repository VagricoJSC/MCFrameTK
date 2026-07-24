\encoding UTF-8

ALTER TABLE mst_close_all
 ADD CONSTRAINT mst_close_all_ck07 CHECK (ap_pre_cl_flg IN ('0', '1'));

