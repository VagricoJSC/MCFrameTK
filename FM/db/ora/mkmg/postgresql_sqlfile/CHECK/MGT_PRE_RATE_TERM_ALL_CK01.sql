\encoding UTF-8

ALTER TABLE mgt_pre_rate_term_all
 ADD CONSTRAINT mgt_pre_rate_term_all_ck01 CHECK (adj_flg IN ('0', '1'));

