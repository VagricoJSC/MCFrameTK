\encoding UTF-8

ALTER TABLE mst_dlv_inst_d_all
 ADD CONSTRAINT mst_dlv_inst_d_all_ck05 CHECK (tdlv_sundry_flg IN ('0', '1'));

