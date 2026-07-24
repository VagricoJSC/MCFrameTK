\encoding UTF-8

ALTER TABLE mbt_ac_rcv_all
 ADD CONSTRAINT mbt_ac_rcv_all_ck02 CHECK (foreign_flg IN ('0', '1'));

