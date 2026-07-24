\encoding UTF-8

ALTER TABLE mam_oper_all
 ADD CONSTRAINT mam_oper_all_ck01 CHECK (del_flg IN ('0', '1'));

