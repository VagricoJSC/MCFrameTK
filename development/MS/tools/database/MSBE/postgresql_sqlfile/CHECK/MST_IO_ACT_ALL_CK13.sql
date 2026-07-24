\encoding UTF-8

ALTER TABLE mst_io_act_all
 ADD CONSTRAINT mst_io_act_all_ck13 CHECK (a_imp_flg IN ('0', '1'));

