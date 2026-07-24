\encoding UTF-8

ALTER TABLE mam_cost_io_conf_all
 ADD CONSTRAINT mam_cost_io_conf_all_ck03 CHECK (amt_flg IN ('0', '1'));

