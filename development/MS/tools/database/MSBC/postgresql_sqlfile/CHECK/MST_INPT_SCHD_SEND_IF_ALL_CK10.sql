\encoding UTF-8

ALTER TABLE mst_inpt_schd_send_if_all
 ADD CONSTRAINT mst_inpt_schd_send_if_all_ck10 CHECK (abort_flg IN ('0', '1'));

