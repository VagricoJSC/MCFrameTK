\encoding UTF-8

ALTER TABLE mst_ship_alloc_sts_p_all
 ADD CONSTRAINT mst_ship_alloc_sts_p_all_ck08 CHECK (not_sublot_mix_flg IN ('0', '1'));

