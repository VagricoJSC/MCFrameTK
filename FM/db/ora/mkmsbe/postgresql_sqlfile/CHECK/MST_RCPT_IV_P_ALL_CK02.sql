\encoding UTF-8

ALTER TABLE mst_rcpt_iv_p_all
 ADD CONSTRAINT mst_rcpt_iv_p_all_ck02 CHECK (xrate_inpt_flg IN ('0', '1'));

