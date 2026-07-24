\encoding UTF-8

ALTER TABLE mst_dlv_inst_all
 ADD CONSTRAINT mst_dlv_inst_all_ck01 CHECK (dlv_inst_print_flg IN ('0', '1'));

