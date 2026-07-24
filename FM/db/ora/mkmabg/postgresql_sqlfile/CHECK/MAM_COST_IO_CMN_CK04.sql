\encoding UTF-8

ALTER TABLE mam_cost_io_cmn
 ADD CONSTRAINT mam_cost_io_cmn_ck04 CHECK (in_flg IN ('0', '1'));

