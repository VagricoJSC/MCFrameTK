\encoding UTF-8

ALTER TABLE mst_sls_act_all
 ADD CONSTRAINT mst_sls_act_all_ck04 CHECK (edi_flg IN ('0', '1'));

