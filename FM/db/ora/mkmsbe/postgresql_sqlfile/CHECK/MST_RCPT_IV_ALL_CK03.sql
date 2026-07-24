\encoding UTF-8

ALTER TABLE mst_rcpt_iv_all
 ADD CONSTRAINT mst_rcpt_iv_all_ck03 CHECK (ptax_xrate_inpt_flg IN ('0', '1'));

