\encoding UTF-8

ALTER TABLE mst_rcpt_iv_d_p_all
 ADD CONSTRAINT mst_rcpt_iv_d_p_all_ck01 CHECK (bndl_flg IN ('0', '1'));

