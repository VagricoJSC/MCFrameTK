\encoding UTF-8

CREATE OR REPLACE VIEW mgc_non_mov_ctl(
	io_act_typ,
	memo1,
	memo2,
	memo3,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no
	)
AS
SELECT
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.io_act_typ,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.memo1,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.memo2,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.memo3,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.ins_usr_id,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.ins_usr_nm,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.ins_ts,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.ins_func_id,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.upd_cntr,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.upd_usr_id,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.upd_usr_nm,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.upd_ts,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.upd_func_id,
	mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.upd_srv_req_no
FROM
	mgc_non_mov_ctl_all mgc_non_mov_ctl_mgc_non_mov_ctl_all_org
WHERE
	0 = 0
	AND mgc_non_mov_ctl_mgc_non_mov_ctl_all_org.co_cd = (SELECT co_cd FROM fct_context mgc_non_mov_ctl_fct_context WHERE pid = pg_backend_pid())
;

