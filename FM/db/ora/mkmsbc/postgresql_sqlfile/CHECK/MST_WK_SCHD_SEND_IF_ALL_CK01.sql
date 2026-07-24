\encoding UTF-8

ALTER TABLE mst_wk_schd_send_if_all
 ADD CONSTRAINT mst_wk_schd_send_if_all_ck01 CHECK (wk_cost_calc_flg IN ('0', '1'));

