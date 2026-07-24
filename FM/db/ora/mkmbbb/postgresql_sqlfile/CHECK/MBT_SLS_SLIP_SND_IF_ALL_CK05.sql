\encoding UTF-8

ALTER TABLE mbt_sls_slip_snd_if_all
 ADD CONSTRAINT mbt_sls_slip_snd_if_all_ck05 CHECK (sls_adj_flg IN ('0', '1'));

