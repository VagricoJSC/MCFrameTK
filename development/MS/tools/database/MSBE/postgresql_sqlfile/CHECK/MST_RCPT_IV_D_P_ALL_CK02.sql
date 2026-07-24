\encoding UTF-8

ALTER TABLE mst_rcpt_iv_d_p_all
 ADD CONSTRAINT mst_rcpt_iv_d_p_all_ck02 CHECK (sundry_itm_flg IN ('0', '1'));

