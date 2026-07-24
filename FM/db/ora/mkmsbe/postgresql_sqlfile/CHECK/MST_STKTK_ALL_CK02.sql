\encoding UTF-8

ALTER TABLE mst_stktk_all
 ADD CONSTRAINT mst_stktk_all_ck02 CHECK (act_qty_keep_flg IN ('0', '1'));

