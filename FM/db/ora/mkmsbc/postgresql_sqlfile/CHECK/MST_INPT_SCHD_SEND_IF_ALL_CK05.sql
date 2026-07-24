\encoding UTF-8

ALTER TABLE mst_inpt_schd_send_if_all
 ADD CONSTRAINT mst_inpt_schd_send_if_all_ck05 CHECK (lot_mix_flg IN ('0', '1'));

