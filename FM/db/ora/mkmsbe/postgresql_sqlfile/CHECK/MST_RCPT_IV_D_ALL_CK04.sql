\encoding UTF-8

ALTER TABLE mst_rcpt_iv_d_all
 ADD CONSTRAINT mst_rcpt_iv_d_all_ck04 CHECK (interim_flg IN ('0', '1'));

