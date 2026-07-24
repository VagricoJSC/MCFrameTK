\encoding UTF-8

ALTER TABLE mst_io_act_all
 ADD CONSTRAINT mst_io_act_all_ck06 CHECK (repurc_obli_flg IN ('0', '1'));

