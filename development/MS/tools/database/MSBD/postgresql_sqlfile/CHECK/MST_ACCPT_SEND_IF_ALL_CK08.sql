\encoding UTF-8

ALTER TABLE mst_accpt_send_if_all
 ADD CONSTRAINT mst_accpt_send_if_all_ck08 CHECK (inc_tax_flg IN ('0', '1'));

