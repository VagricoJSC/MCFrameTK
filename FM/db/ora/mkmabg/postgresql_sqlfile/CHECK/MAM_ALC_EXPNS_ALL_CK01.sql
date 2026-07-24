\encoding UTF-8

ALTER TABLE mam_alc_expns_all
 ADD CONSTRAINT mam_alc_expns_all_ck01 CHECK (self_oper_flg IN ('0', '1'));

