\encoding UTF-8

ALTER TABLE fct_running_grps
 ADD CONSTRAINT fct_running_grps_ck01 CHECK (man_flg IN ('0', '1'));

