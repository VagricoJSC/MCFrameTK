\encoding UTF-8

ALTER TABLE mst_ordsnd_itmoper_if_all
 ADD CONSTRAINT mst_ordsnd_itmoper_if_all_ck01 CHECK (yield_oper_flg IN ('0', '1'));

