\encoding UTF-8

CREATE OR REPLACE VIEW msc_non_mov_schd_ctl_$u(
	io_schd_typ,
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
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.io_schd_typ,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.memo1,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.memo2,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.memo3,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.ins_usr_id,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.ins_usr_nm,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.ins_ts,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.ins_func_id,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.upd_cntr,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.upd_usr_id,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.upd_usr_nm,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.upd_ts,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.upd_func_id,
	msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.upd_srv_req_no
FROM
	msc_non_mov_schd_ctl_all msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org
WHERE
	0 = 0
	AND msc_non_mov_schd_ctl_$u_msc_non_mov_schd_ctl_all_org.co_cd = fcpa_context$f_get_co_cd()
;

