\encoding UTF-8

CREATE OR REPLACE VIEW mam_mps_itm_$u(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	wg_cd,
	mps_grp_cd,
	strg_loc_cd,
	mfg_loc_cd,
	sppl_cd,
	maker_cd,
	rqst_loc_cd,
	prod_rate,
	prod_begin_day,
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
	mam_mps_itm_$u_mam_mps_itm_all_org.itm_cd,
	mam_mps_itm_$u_mam_mps_itm_all_org.itm_sub1,
	mam_mps_itm_$u_mam_mps_itm_all_org.itm_sub2,
	mam_mps_itm_$u_mam_mps_itm_all_org.itm_sub3,
	mam_mps_itm_$u_mam_mps_itm_all_org.wg_cd,
	mam_mps_itm_$u_mam_mps_itm_all_org.mps_grp_cd,
	mam_mps_itm_$u_mam_mps_itm_all_org.strg_loc_cd,
	mam_mps_itm_$u_mam_mps_itm_all_org.mfg_loc_cd,
	mam_mps_itm_$u_mam_mps_itm_all_org.sppl_cd,
	mam_mps_itm_$u_mam_mps_itm_all_org.maker_cd,
	mam_mps_itm_$u_mam_mps_itm_all_org.rqst_loc_cd,
	mam_mps_itm_$u_mam_mps_itm_all_org.prod_rate,
	mam_mps_itm_$u_mam_mps_itm_all_org.prod_begin_day,
	mam_mps_itm_$u_mam_mps_itm_all_org.memo1,
	mam_mps_itm_$u_mam_mps_itm_all_org.memo2,
	mam_mps_itm_$u_mam_mps_itm_all_org.memo3,
	mam_mps_itm_$u_mam_mps_itm_all_org.del_flg,
	mam_mps_itm_$u_mam_mps_itm_all_org.del_usr_id,
	mam_mps_itm_$u_mam_mps_itm_all_org.del_usr_nm,
	mam_mps_itm_$u_mam_mps_itm_all_org.del_ts,
	mam_mps_itm_$u_mam_mps_itm_all_org.ins_usr_id,
	mam_mps_itm_$u_mam_mps_itm_all_org.ins_usr_nm,
	mam_mps_itm_$u_mam_mps_itm_all_org.ins_ts,
	mam_mps_itm_$u_mam_mps_itm_all_org.ins_func_id,
	mam_mps_itm_$u_mam_mps_itm_all_org.upd_cntr,
	mam_mps_itm_$u_mam_mps_itm_all_org.upd_usr_id,
	mam_mps_itm_$u_mam_mps_itm_all_org.upd_usr_nm,
	mam_mps_itm_$u_mam_mps_itm_all_org.upd_ts,
	mam_mps_itm_$u_mam_mps_itm_all_org.upd_func_id,
	mam_mps_itm_$u_mam_mps_itm_all_org.upd_srv_req_no
FROM
	mam_mps_itm_all mam_mps_itm_$u_mam_mps_itm_all_org
WHERE
	0 = 0
	AND mam_mps_itm_$u_mam_mps_itm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

