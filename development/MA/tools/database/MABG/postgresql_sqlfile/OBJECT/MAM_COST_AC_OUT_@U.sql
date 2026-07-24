\encoding UTF-8

CREATE OR REPLACE VIEW mam_cost_ac_out_$u(
	calc_grp_cd,
	ac_slip_typ,
	itm_jnl_cd,
	st_dt,
	end_dt,
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
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.calc_grp_cd,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.ac_slip_typ,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.itm_jnl_cd,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.st_dt,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.end_dt,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.memo1,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.memo2,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.memo3,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.del_flg,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.del_usr_id,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.del_usr_nm,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.del_ts,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.ins_usr_id,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.ins_usr_nm,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.ins_ts,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.ins_func_id,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.upd_cntr,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.upd_usr_id,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.upd_usr_nm,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.upd_ts,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.upd_func_id,
	mam_cost_ac_out_$u_mam_cost_ac_out_all_org.upd_srv_req_no
FROM
	mam_cost_ac_out_all mam_cost_ac_out_$u_mam_cost_ac_out_all_org
WHERE
	0 = 0
	AND mam_cost_ac_out_$u_mam_cost_ac_out_all_org.co_cd = fcpa_context$f_get_co_cd()
;

