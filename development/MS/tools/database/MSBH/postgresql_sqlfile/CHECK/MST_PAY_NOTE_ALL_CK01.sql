\encoding UTF-8

ALTER TABLE mst_pay_note_all
 ADD CONSTRAINT mst_pay_note_all_ck01 CHECK (a_imp_flg IN ('0', '1'));

