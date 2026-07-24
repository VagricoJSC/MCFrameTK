\encoding UTF-8

ALTER TABLE mam_rpt_key_all
 ADD CONSTRAINT mam_rpt_key_all_ck01 CHECK (del_flg IN ('0', '1'));

