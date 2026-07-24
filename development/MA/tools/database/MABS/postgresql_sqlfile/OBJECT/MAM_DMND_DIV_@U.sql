\encoding UTF-8

CREATE OR REPLACE VIEW mam_dmnd_div_$u(
	to_lg_grp_cd,
	itm_ship_grp_cd,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	wg_cd,
	sls_dpt_cd,
	ship_loc_cd,
	st_dt,
	end_dt,
	dmnd_div_ratio,
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
	mam_dmnd_div_$u_mam_dmnd_div_all_org.to_lg_grp_cd,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.itm_ship_grp_cd,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.itm_cd,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.itm_sub1,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.itm_sub2,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.itm_sub3,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.wg_cd,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.sls_dpt_cd,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.ship_loc_cd,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.st_dt,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.end_dt,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.dmnd_div_ratio,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.memo1,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.memo2,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.memo3,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.del_flg,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.del_usr_id,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.del_usr_nm,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.del_ts,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.ins_usr_id,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.ins_usr_nm,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.ins_ts,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.ins_func_id,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.upd_cntr,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.upd_usr_id,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.upd_usr_nm,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.upd_ts,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.upd_func_id,
	mam_dmnd_div_$u_mam_dmnd_div_all_org.upd_srv_req_no
FROM
	mam_dmnd_div_all mam_dmnd_div_$u_mam_dmnd_div_all_org
WHERE
	0 = 0
	AND mam_dmnd_div_$u_mam_dmnd_div_all_org.co_cd = fcpa_context$f_get_co_cd()
;

