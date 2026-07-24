\encoding UTF-8

ALTER TABLE mgt_pln_alc_amt_rcv_all
 ADD CONSTRAINT mgt_pln_alc_amt_rcv_all_ck01 CHECK (imp_flg IN ('0', '1'));

