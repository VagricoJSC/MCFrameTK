\encoding UTF-8

ALTER TABLE mam_rpt_ptn_cmn
 ADD CONSTRAINT mam_rpt_ptn_cmn_ck01 CHECK (del_flg IN ('0', '1'));

