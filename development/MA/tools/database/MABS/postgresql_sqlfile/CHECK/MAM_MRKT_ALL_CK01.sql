\encoding UTF-8

ALTER TABLE mam_mrkt_all
 ADD CONSTRAINT mam_mrkt_all_ck01 CHECK (del_flg IN ('0', '1'));

