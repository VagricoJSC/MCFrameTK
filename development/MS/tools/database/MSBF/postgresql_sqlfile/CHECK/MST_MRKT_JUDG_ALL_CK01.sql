\encoding UTF-8

ALTER TABLE mst_mrkt_judg_all
 ADD CONSTRAINT mst_mrkt_judg_all_ck01 CHECK (main_flg IN ('0', '1'));

