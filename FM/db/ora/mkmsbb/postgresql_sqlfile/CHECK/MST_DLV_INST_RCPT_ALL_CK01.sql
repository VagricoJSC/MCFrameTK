\encoding UTF-8

ALTER TABLE mst_dlv_inst_rcpt_all
 ADD CONSTRAINT mst_dlv_inst_rcpt_all_ck01 CHECK (edi_flg IN ('0', '1'));

