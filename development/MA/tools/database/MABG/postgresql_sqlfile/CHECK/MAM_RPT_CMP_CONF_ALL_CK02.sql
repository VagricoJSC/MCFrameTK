\encoding UTF-8

ALTER TABLE mam_rpt_cmp_conf_all
 ADD CONSTRAINT mam_rpt_cmp_conf_all_ck02 CHECK (del_flg IN ('0', '1'));

