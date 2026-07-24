\encoding UTF-8

ALTER TABLE mam_expns_cmn
 ADD CONSTRAINT mam_expns_cmn_ck01 CHECK (del_flg IN ('0', '1'));

