\encoding UTF-8

ALTER TABLE mam_cost_io_cmn
 ADD CONSTRAINT mam_cost_io_cmn_ck06 CHECK (del_flg IN ('0', '1'));

