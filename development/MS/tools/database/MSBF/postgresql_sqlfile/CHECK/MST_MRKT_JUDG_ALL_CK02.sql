\encoding UTF-8

ALTER TABLE mst_mrkt_judg_all
 ADD CONSTRAINT mst_mrkt_judg_all_ck02 CHECK (mrkt_judg_prnt_flg IN ('0', '1'));

