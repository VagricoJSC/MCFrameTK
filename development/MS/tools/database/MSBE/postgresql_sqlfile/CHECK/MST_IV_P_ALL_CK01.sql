\encoding UTF-8

ALTER TABLE mst_iv_p_all
 ADD CONSTRAINT mst_iv_p_all_ck01 CHECK (tdlv_sundry_flg IN ('0', '1'));

