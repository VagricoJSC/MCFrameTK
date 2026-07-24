\encoding UTF-8

ALTER TABLE mbt_purc_slip_snd_if_all
 ADD CONSTRAINT mbt_purc_slip_snd_if_all_ck04 CHECK (purc_adj_flg IN ('0', '1'));

