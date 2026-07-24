\encoding UTF-8

ALTER TABLE mst_prms_rcpt_d_all
 ADD CONSTRAINT mst_prms_rcpt_d_all_ck01 CHECK (sync_flg IN ('0', '1'));

