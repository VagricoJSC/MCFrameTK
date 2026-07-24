\encoding UTF-8

ALTER TABLE mam_cost_io_conf_cmn
 ADD CONSTRAINT mam_cost_io_conf_cmn_ck02 CHECK (qty_flg IN ('0', '1'));

