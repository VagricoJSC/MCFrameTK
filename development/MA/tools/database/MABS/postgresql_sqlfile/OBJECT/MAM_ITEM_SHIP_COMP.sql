\encoding UTF-8

CREATE OR REPLACE VIEW mam_item_ship_comp(
	prod_itm_cd,
	prod_itm_sub1,
	prod_itm_sub2,
	prod_itm_sub3,
	surv_line_qty,
	diameter,
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	qty,
	spec_cd,
	disp_seq,
	body_flg,
	comp_flg,
	ship_prnt_flg,
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
	mam_item_ship_comp_mam_item_ship_comp_all_org.prod_itm_cd,
	mam_item_ship_comp_mam_item_ship_comp_all_org.prod_itm_sub1,
	mam_item_ship_comp_mam_item_ship_comp_all_org.prod_itm_sub2,
	mam_item_ship_comp_mam_item_ship_comp_all_org.prod_itm_sub3,
	mam_item_ship_comp_mam_item_ship_comp_all_org.surv_line_qty,
	mam_item_ship_comp_mam_item_ship_comp_all_org.diameter,
	mam_item_ship_comp_mam_item_ship_comp_all_org.itm_cd,
	mam_item_ship_comp_mam_item_ship_comp_all_org.itm_sub1,
	mam_item_ship_comp_mam_item_ship_comp_all_org.itm_sub2,
	mam_item_ship_comp_mam_item_ship_comp_all_org.itm_sub3,
	mam_item_ship_comp_mam_item_ship_comp_all_org.qty,
	mam_item_ship_comp_mam_item_ship_comp_all_org.spec_cd,
	mam_item_ship_comp_mam_item_ship_comp_all_org.disp_seq,
	mam_item_ship_comp_mam_item_ship_comp_all_org.body_flg,
	mam_item_ship_comp_mam_item_ship_comp_all_org.comp_flg,
	mam_item_ship_comp_mam_item_ship_comp_all_org.ship_prnt_flg,
	mam_item_ship_comp_mam_item_ship_comp_all_org.memo1,
	mam_item_ship_comp_mam_item_ship_comp_all_org.memo2,
	mam_item_ship_comp_mam_item_ship_comp_all_org.memo3,
	mam_item_ship_comp_mam_item_ship_comp_all_org.del_flg,
	mam_item_ship_comp_mam_item_ship_comp_all_org.del_usr_id,
	mam_item_ship_comp_mam_item_ship_comp_all_org.del_usr_nm,
	mam_item_ship_comp_mam_item_ship_comp_all_org.del_ts,
	mam_item_ship_comp_mam_item_ship_comp_all_org.ins_usr_id,
	mam_item_ship_comp_mam_item_ship_comp_all_org.ins_usr_nm,
	mam_item_ship_comp_mam_item_ship_comp_all_org.ins_ts,
	mam_item_ship_comp_mam_item_ship_comp_all_org.ins_func_id,
	mam_item_ship_comp_mam_item_ship_comp_all_org.upd_cntr,
	mam_item_ship_comp_mam_item_ship_comp_all_org.upd_usr_id,
	mam_item_ship_comp_mam_item_ship_comp_all_org.upd_usr_nm,
	mam_item_ship_comp_mam_item_ship_comp_all_org.upd_ts,
	mam_item_ship_comp_mam_item_ship_comp_all_org.upd_func_id,
	mam_item_ship_comp_mam_item_ship_comp_all_org.upd_srv_req_no
FROM
	mam_item_ship_comp_all mam_item_ship_comp_mam_item_ship_comp_all_org
WHERE
	0 = 0
	AND mam_item_ship_comp_mam_item_ship_comp_all_org.co_cd = (SELECT co_cd FROM fct_context mam_item_ship_comp_fct_context WHERE pid = pg_backend_pid())
	AND (mam_item_ship_comp_mam_item_ship_comp_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_item_ship_comp_maw_del_flg_ctl_W WHERE lower(mam_item_ship_comp_maw_del_flg_ctl_W.tbl_nm) = 'mam_item_ship_comp'))
;

