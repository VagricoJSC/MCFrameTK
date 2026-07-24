\encoding UTF-8

ALTER TABLE mam_com_paid_all
 ADD CONSTRAINT mam_com_paid_all_ck01 CHECK (del_flg IN ('0', '1'));

