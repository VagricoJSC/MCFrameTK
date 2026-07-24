\encoding UTF-8

ALTER TABLE mam_schd_pay_all
 ADD CONSTRAINT mam_schd_pay_all_ck02 CHECK (del_flg IN ('0', '1'));

