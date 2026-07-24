\encoding UTF-8

ALTER TABLE mam_cost_io_conf_cmn
 ADD CONSTRAINT mam_cost_io_conf_cmn_ck06 CHECK (minus_flg IN ('0', '1'));

