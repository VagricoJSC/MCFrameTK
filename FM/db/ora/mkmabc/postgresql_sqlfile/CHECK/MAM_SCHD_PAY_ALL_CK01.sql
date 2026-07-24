\encoding UTF-8

ALTER TABLE mam_schd_pay_all
 ADD CONSTRAINT mam_schd_pay_all_ck01 CHECK (dpt_id_flg IN ('0', '1'));

