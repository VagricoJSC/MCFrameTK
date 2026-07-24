\encoding UTF-8

ALTER TABLE fcm_report_conf
 ADD CONSTRAINT fcm_report_conf_ck02 CHECK (print_exec IN ('0', '1'));

