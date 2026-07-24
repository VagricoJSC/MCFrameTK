\encoding UTF-8

ALTER TABLE mam_lot_inh_src_all
 ADD CONSTRAINT mam_lot_inh_src_all_ck01 CHECK (del_flg IN ('0', '1'));

