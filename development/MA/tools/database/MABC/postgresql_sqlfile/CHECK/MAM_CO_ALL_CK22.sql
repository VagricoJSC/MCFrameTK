\encoding UTF-8

ALTER TABLE mam_co_all
 ADD CONSTRAINT mam_co_all_ck22 CHECK (ac_slip_seq_flg IN ('0', '1'));

