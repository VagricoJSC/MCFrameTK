\encoding UTF-8

ALTER TABLE mst_ship_alloc_sts_sv_all
 ADD CONSTRAINT mst_ship_alloc_sts_sv_all_ck07 CHECK (not_lot_mix_flg IN ('0', '1'));

