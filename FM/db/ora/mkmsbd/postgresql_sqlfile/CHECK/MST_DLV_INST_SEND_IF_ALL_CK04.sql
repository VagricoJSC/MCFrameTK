\encoding UTF-8

ALTER TABLE mst_dlv_inst_send_if_all
 ADD CONSTRAINT mst_dlv_inst_send_if_all_ck04 CHECK (pri_print_flg IN ('0', '1'));

