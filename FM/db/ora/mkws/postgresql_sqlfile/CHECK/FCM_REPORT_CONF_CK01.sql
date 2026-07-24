\encoding UTF-8

ALTER TABLE fcm_report_conf
 ADD CONSTRAINT fcm_report_conf_ck01 CHECK (server_print IN ('0', '1'));

