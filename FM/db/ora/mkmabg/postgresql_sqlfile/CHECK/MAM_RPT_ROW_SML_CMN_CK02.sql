\encoding UTF-8

ALTER TABLE mam_rpt_row_sml_cmn
 ADD CONSTRAINT mam_rpt_row_sml_cmn_ck02 CHECK (del_flg IN ('0', '1'));

