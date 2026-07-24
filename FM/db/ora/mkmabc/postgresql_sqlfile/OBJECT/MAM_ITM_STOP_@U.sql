\encoding UTF-8

CREATE OR REPLACE VIEW mam_itm_stop_$u(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	slo_stop_dt,
	po_stop_dt,
	sls_stop_dt,
	purc_stop_dt,
	order_stop_dt,
	mfg_inst_stop_dt,
	ship_inst_stop_dt,
	xfr_stop_dt,
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
	mam_itm_stop_$u_mam_itm_stop_all_org.itm_cd,
	mam_itm_stop_$u_mam_itm_stop_all_org.itm_sub1,
	mam_itm_stop_$u_mam_itm_stop_all_org.itm_sub2,
	mam_itm_stop_$u_mam_itm_stop_all_org.itm_sub3,
	mam_itm_stop_$u_mam_itm_stop_all_org.slo_stop_dt,
	mam_itm_stop_$u_mam_itm_stop_all_org.po_stop_dt,
	mam_itm_stop_$u_mam_itm_stop_all_org.sls_stop_dt,
	mam_itm_stop_$u_mam_itm_stop_all_org.purc_stop_dt,
	mam_itm_stop_$u_mam_itm_stop_all_org.order_stop_dt,
	mam_itm_stop_$u_mam_itm_stop_all_org.mfg_inst_stop_dt,
	mam_itm_stop_$u_mam_itm_stop_all_org.ship_inst_stop_dt,
	mam_itm_stop_$u_mam_itm_stop_all_org.xfr_stop_dt,
	mam_itm_stop_$u_mam_itm_stop_all_org.memo1,
	mam_itm_stop_$u_mam_itm_stop_all_org.memo2,
	mam_itm_stop_$u_mam_itm_stop_all_org.memo3,
	mam_itm_stop_$u_mam_itm_stop_all_org.del_flg,
	mam_itm_stop_$u_mam_itm_stop_all_org.del_usr_id,
	mam_itm_stop_$u_mam_itm_stop_all_org.del_usr_nm,
	mam_itm_stop_$u_mam_itm_stop_all_org.del_ts,
	mam_itm_stop_$u_mam_itm_stop_all_org.ins_usr_id,
	mam_itm_stop_$u_mam_itm_stop_all_org.ins_usr_nm,
	mam_itm_stop_$u_mam_itm_stop_all_org.ins_ts,
	mam_itm_stop_$u_mam_itm_stop_all_org.ins_func_id,
	mam_itm_stop_$u_mam_itm_stop_all_org.upd_cntr,
	mam_itm_stop_$u_mam_itm_stop_all_org.upd_usr_id,
	mam_itm_stop_$u_mam_itm_stop_all_org.upd_usr_nm,
	mam_itm_stop_$u_mam_itm_stop_all_org.upd_ts,
	mam_itm_stop_$u_mam_itm_stop_all_org.upd_func_id,
	mam_itm_stop_$u_mam_itm_stop_all_org.upd_srv_req_no
FROM
	mam_itm_stop_all mam_itm_stop_$u_mam_itm_stop_all_org
WHERE
	0 = 0
	AND mam_itm_stop_$u_mam_itm_stop_all_org.co_cd = fcpa_context$f_get_co_cd()
;

