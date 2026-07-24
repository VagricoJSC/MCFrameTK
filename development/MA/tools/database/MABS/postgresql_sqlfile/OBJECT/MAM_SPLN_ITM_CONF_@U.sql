\encoding UTF-8

CREATE OR REPLACE VIEW mam_spln_itm_conf_$u(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	spln_itm_cd,
	dpt_cd,
	st_ym,
	end_ym,
	calc_rate,
	calc_seq,
	upri_unit_cd,
	lot_qty,
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
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.itm_cd,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.itm_sub1,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.itm_sub2,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.itm_sub3,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.spln_itm_cd,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.dpt_cd,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.st_ym,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.end_ym,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.calc_rate,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.calc_seq,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.upri_unit_cd,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.lot_qty,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.memo1,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.memo2,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.memo3,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.del_flg,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.del_usr_id,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.del_usr_nm,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.del_ts,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.ins_usr_id,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.ins_usr_nm,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.ins_ts,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.ins_func_id,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.upd_cntr,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.upd_usr_id,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.upd_usr_nm,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.upd_ts,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.upd_func_id,
	mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.upd_srv_req_no
FROM
	mam_spln_itm_conf_all mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org
WHERE
	0 = 0
	AND mam_spln_itm_conf_$u_mam_spln_itm_conf_all_org.co_cd = fcpa_context$f_get_co_cd()
;

