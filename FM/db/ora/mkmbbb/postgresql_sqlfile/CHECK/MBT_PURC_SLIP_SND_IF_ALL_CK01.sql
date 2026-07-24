\encoding UTF-8

ALTER TABLE mbt_purc_slip_snd_if_all
 ADD CONSTRAINT mbt_purc_slip_snd_if_all_ck01 CHECK (iv_flg IN ('0', '1'));

