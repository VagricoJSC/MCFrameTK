\encoding UTF-8

ALTER TABLE mst_mrkt_judg_all
 ADD CONSTRAINT mst_mrkt_judg_all_ck04 CHECK (no_del_flg IN ('0', '1'));

