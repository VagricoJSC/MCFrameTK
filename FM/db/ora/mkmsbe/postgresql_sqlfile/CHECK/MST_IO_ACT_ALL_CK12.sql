\encoding UTF-8

ALTER TABLE mst_io_act_all
 ADD CONSTRAINT mst_io_act_all_ck12 CHECK (c_imp_flg IN ('0', '1'));

