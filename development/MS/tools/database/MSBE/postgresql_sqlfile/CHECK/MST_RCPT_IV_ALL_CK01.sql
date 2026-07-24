\encoding UTF-8

ALTER TABLE mst_rcpt_iv_all
 ADD CONSTRAINT mst_rcpt_iv_all_ck01 CHECK (in_to_sundry_flg IN ('0', '1'));

