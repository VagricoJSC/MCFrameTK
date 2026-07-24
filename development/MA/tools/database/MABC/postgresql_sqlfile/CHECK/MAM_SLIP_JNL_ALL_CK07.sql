\encoding UTF-8

ALTER TABLE mam_slip_jnl_all
 ADD CONSTRAINT mam_slip_jnl_all_ck07 CHECK (del_flg IN ('0', '1'));

