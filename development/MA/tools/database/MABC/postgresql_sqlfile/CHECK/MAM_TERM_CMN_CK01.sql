\encoding UTF-8

ALTER TABLE mam_term_cmn
 ADD CONSTRAINT mam_term_cmn_ck01 CHECK (del_flg IN ('0', '1'));

