\encoding UTF-8

ALTER TABLE mst_iv_all
 ADD CONSTRAINT mst_iv_all_ck12 CHECK (pre_rcpt_iv_flg IN ('0', '1'));

