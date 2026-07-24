\encoding UTF-8

ALTER TABLE mst_prms_rcpt_all
 ADD CONSTRAINT mst_prms_rcpt_all_ck03 CHECK (can_flg IN ('0', '1'));

