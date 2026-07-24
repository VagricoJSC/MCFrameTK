\encoding UTF-8

ALTER TABLE mst_inpt_schd_send_if_all
 ADD CONSTRAINT mst_inpt_schd_send_if_all_ck08 CHECK (alloc_flg IN ('0', '1'));

