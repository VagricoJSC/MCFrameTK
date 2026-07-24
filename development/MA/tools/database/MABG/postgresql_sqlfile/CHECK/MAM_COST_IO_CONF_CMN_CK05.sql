\encoding UTF-8

ALTER TABLE mam_cost_io_conf_cmn
 ADD CONSTRAINT mam_cost_io_conf_cmn_ck05 CHECK (diff_flg IN ('0', '1'));

