\encoding UTF-8

ALTER TABLE mst_sim_itm_order_all
 ADD CONSTRAINT mst_sim_itm_order_all_ck02 CHECK (not_fix_flg IN ('0', '1'));

