\encoding UTF-8

CREATE OR REPLACE VIEW mam_aprv_rt_$u(
	aprv_func_typ,
	aprv_rt_ptn,
	aprv_role_cd,
	st_dt,
	end_dt,
	aprv_seq,
	memo1,
	memo2,
	memo3,
	del_flg,
	del_usr_id,
	del_usr_nm,
	del_ts,
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
	mam_aprv_rt_$u_mam_aprv_rt_all_org.aprv_func_typ,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.aprv_rt_ptn,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.aprv_role_cd,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.st_dt,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.end_dt,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.aprv_seq,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.memo1,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.memo2,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.memo3,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.del_flg,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.del_usr_id,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.del_usr_nm,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.del_ts,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.ins_usr_id,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.ins_usr_nm,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.ins_ts,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.ins_func_id,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.upd_cntr,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.upd_usr_id,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.upd_usr_nm,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.upd_ts,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.upd_func_id,
	mam_aprv_rt_$u_mam_aprv_rt_all_org.upd_srv_req_no
FROM
	mam_aprv_rt_all mam_aprv_rt_$u_mam_aprv_rt_all_org
WHERE
	0 = 0
	AND mam_aprv_rt_$u_mam_aprv_rt_all_org.co_cd = fcpa_context$f_get_co_cd()
;

