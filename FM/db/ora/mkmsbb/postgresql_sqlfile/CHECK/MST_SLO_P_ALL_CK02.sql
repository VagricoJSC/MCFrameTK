\encoding UTF-8

ALTER TABLE mst_slo_p_all
 ADD CONSTRAINT mst_slo_p_all_ck02 CHECK (ptax_xrate_inpt_flg IN ('0', '1'));

