\encoding UTF-8

ALTER TABLE mst_inpt_schd_p_all
 ADD CONSTRAINT mst_inpt_schd_p_all_ck10 CHECK (alloc_flg IN ('0', '1'));

