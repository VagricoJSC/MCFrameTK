\encoding UTF-8

ALTER TABLE mam_stdcost_all
 ADD CONSTRAINT mam_stdcost_all_ck01 CHECK (del_flg IN ('0', '1'));

