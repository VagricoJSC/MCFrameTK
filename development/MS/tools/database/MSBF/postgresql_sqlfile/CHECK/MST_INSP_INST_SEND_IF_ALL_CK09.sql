\encoding UTF-8

ALTER TABLE mst_insp_inst_send_if_all
 ADD CONSTRAINT mst_insp_inst_send_if_all_ck09 CHECK (in_prmt_insp_flg IN ('0', '1'));

