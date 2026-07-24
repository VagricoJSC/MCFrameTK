\encoding UTF-8

CREATE OR REPLACE VIEW mam_itm_unit_$u(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	unit_cd,
	conv_base_qty,
	conv_qty,
	dec_place,
	rnd_typ,
	pack_flg,
	pckg_flg,
	unit_dim,
	unit_wt,
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
	mam_itm_unit_$u_mam_itm_unit_all_org.itm_cd,
	mam_itm_unit_$u_mam_itm_unit_all_org.itm_sub1,
	mam_itm_unit_$u_mam_itm_unit_all_org.itm_sub2,
	mam_itm_unit_$u_mam_itm_unit_all_org.itm_sub3,
	mam_itm_unit_$u_mam_itm_unit_all_org.unit_cd,
	mam_itm_unit_$u_mam_itm_unit_all_org.conv_base_qty,
	mam_itm_unit_$u_mam_itm_unit_all_org.conv_qty,
	mam_itm_unit_$u_mam_itm_unit_all_org.dec_place,
	mam_itm_unit_$u_mam_itm_unit_all_org.rnd_typ,
	mam_itm_unit_$u_mam_itm_unit_all_org.pack_flg,
	mam_itm_unit_$u_mam_itm_unit_all_org.pckg_flg,
	mam_itm_unit_$u_mam_itm_unit_all_org.unit_dim,
	mam_itm_unit_$u_mam_itm_unit_all_org.unit_wt,
	mam_itm_unit_$u_mam_itm_unit_all_org.memo1,
	mam_itm_unit_$u_mam_itm_unit_all_org.memo2,
	mam_itm_unit_$u_mam_itm_unit_all_org.memo3,
	mam_itm_unit_$u_mam_itm_unit_all_org.del_flg,
	mam_itm_unit_$u_mam_itm_unit_all_org.del_usr_id,
	mam_itm_unit_$u_mam_itm_unit_all_org.del_usr_nm,
	mam_itm_unit_$u_mam_itm_unit_all_org.del_ts,
	mam_itm_unit_$u_mam_itm_unit_all_org.ins_usr_id,
	mam_itm_unit_$u_mam_itm_unit_all_org.ins_usr_nm,
	mam_itm_unit_$u_mam_itm_unit_all_org.ins_ts,
	mam_itm_unit_$u_mam_itm_unit_all_org.ins_func_id,
	mam_itm_unit_$u_mam_itm_unit_all_org.upd_cntr,
	mam_itm_unit_$u_mam_itm_unit_all_org.upd_usr_id,
	mam_itm_unit_$u_mam_itm_unit_all_org.upd_usr_nm,
	mam_itm_unit_$u_mam_itm_unit_all_org.upd_ts,
	mam_itm_unit_$u_mam_itm_unit_all_org.upd_func_id,
	mam_itm_unit_$u_mam_itm_unit_all_org.upd_srv_req_no
FROM
	mam_itm_unit_all mam_itm_unit_$u_mam_itm_unit_all_org
WHERE
	0 = 0
	AND mam_itm_unit_$u_mam_itm_unit_all_org.co_cd = fcpa_context$f_get_co_cd()
;

