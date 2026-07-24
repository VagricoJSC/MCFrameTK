\encoding UTF-8

ALTER TABLE mgt_pln_alc_amt_all
 ADD CONSTRAINT mgt_pln_alc_amt_all_ck01 CHECK (pre_alc_fin_flg IN ('0', '1'));

