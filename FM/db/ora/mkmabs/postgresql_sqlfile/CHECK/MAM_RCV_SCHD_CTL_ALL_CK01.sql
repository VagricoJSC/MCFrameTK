\encoding UTF-8

ALTER TABLE mam_rcv_schd_ctl_all
 ADD CONSTRAINT mam_rcv_schd_ctl_all_ck01 CHECK (del_flg IN ('0', '1'));

