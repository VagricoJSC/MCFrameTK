\encoding UTF-8

ALTER TABLE mam_lot_inh_dest_all
 ADD CONSTRAINT mam_lot_inh_dest_all_ck02 CHECK (del_flg IN ('0', '1'));

