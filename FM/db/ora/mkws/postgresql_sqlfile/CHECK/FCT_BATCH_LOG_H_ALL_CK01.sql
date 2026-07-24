\encoding UTF-8

ALTER TABLE fct_batch_log_h_all
 ADD CONSTRAINT fct_batch_log_h_all_ck01 CHECK (end_flg IN ('0', '1'));

