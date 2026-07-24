\encoding UTF-8

ALTER TABLE mam_pre_rate_tgt_all
 ADD CONSTRAINT mam_pre_rate_tgt_all_ck01 CHECK (del_flg IN ('0', '1'));

