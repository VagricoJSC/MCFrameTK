\encoding UTF-8

ALTER TABLE mam_rpt_conf_cmn
 ADD CONSTRAINT mam_rpt_conf_cmn_ck03 CHECK (std_flg IN ('0', '1'));

