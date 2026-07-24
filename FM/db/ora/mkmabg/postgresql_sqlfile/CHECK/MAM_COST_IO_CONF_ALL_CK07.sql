\encoding UTF-8

ALTER TABLE mam_cost_io_conf_all
 ADD CONSTRAINT mam_cost_io_conf_all_ck07 CHECK (prov_expns_flg IN ('0', '1'));

