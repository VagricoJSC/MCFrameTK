\encoding UTF-8

ALTER TABLE mst_plnt_aprv_all
 ADD CONSTRAINT mst_plnt_aprv_all_ck02 CHECK (plnt_aprv_prnt_flg IN ('0', '1'));

