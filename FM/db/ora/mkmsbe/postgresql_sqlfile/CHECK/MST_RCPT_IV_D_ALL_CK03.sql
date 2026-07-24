\encoding UTF-8

ALTER TABLE mst_rcpt_iv_d_all
 ADD CONSTRAINT mst_rcpt_iv_d_all_ck03 CHECK (upri_not_tgt_flg IN ('0', '1'));

