\encoding UTF-8

ALTER TABLE mst_wg_rqst_all
 ADD CONSTRAINT mst_wg_rqst_all_ck07 CHECK (dlv_inst_rcpt_flg IN ('0', '1'));

