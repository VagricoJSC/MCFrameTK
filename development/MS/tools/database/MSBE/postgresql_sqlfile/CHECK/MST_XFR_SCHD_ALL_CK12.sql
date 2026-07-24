\encoding UTF-8

ALTER TABLE mst_xfr_schd_all
 ADD CONSTRAINT mst_xfr_schd_all_ck12 CHECK (ptax_xrate_inpt_flg IN ('0', '1'));

