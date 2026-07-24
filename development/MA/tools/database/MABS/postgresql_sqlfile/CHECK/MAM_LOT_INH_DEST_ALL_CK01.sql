\encoding UTF-8

ALTER TABLE mam_lot_inh_dest_all
 ADD CONSTRAINT mam_lot_inh_dest_all_ck01 CHECK (overflow_err_flg IN ('0', '1'));

