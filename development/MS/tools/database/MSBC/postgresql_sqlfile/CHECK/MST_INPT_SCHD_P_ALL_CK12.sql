\encoding UTF-8

ALTER TABLE mst_inpt_schd_p_all
 ADD CONSTRAINT mst_inpt_schd_p_all_ck12 CHECK (can_flg IN ('0', '1'));

