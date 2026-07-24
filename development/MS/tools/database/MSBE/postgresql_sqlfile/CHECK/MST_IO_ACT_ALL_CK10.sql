\encoding UTF-8

ALTER TABLE mst_io_act_all
 ADD CONSTRAINT mst_io_act_all_ck10 CHECK (slip_cmpl_flg IN ('0', '1'));

