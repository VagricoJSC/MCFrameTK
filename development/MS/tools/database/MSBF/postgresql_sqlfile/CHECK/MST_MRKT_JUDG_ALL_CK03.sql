\encoding UTF-8

ALTER TABLE mst_mrkt_judg_all
 ADD CONSTRAINT mst_mrkt_judg_all_ck03 CHECK (add_flg IN ('0', '1'));

