\encoding UTF-8

ALTER TABLE mat_seq_all
 ADD CONSTRAINT mat_seq_all_ck01 CHECK (cycl_flg IN ('0', '1'));

