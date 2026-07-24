\encoding UTF-8

ALTER TABLE mam_exim_port_cmn
 ADD CONSTRAINT mam_exim_port_cmn_ck01 CHECK (del_flg IN ('0', '1'));

