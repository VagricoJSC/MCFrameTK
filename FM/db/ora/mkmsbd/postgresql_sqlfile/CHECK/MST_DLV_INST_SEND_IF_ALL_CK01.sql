\encoding UTF-8

ALTER TABLE mst_dlv_inst_send_if_all
 ADD CONSTRAINT mst_dlv_inst_send_if_all_ck01 CHECK (in_to_sundry_flg IN ('0', '1'));

