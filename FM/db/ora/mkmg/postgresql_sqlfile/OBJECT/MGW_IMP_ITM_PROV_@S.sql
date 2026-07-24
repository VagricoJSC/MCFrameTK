\encoding UTF-8

CREATE OR REPLACE VIEW mgw_imp_itm_prov_$s(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	prsppl_cd,
	term,
	calc_ctg_cd,
	wg_cd,
	prov_typ,
	base_qty,
	cur_cd,
	upri,
	rmrks,
	sub_char1,
	sub_char2,
	sub_char3,
	non_calc_flg,
	imp_err_flg,
	imp_flg,
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
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.itm_cd,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.itm_sub1,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.itm_sub2,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.itm_sub3,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.prsppl_cd,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.term,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.calc_ctg_cd,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.wg_cd,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.prov_typ,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.base_qty,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.cur_cd,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.upri,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.rmrks,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.sub_char1,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.sub_char2,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.sub_char3,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.non_calc_flg,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.imp_err_flg,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.imp_flg,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.ins_usr_id,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.ins_usr_nm,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.ins_ts,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.ins_func_id,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.upd_cntr,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.upd_usr_id,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.upd_usr_nm,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.upd_ts,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.upd_func_id,
	mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.upd_srv_req_no
FROM
	mgw_imp_itm_prov_all mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org
WHERE
	0 = 0
	AND mgw_imp_itm_prov_$s_mgw_imp_itm_prov_all_org.co_cd = (SELECT co_cd FROM fct_context mgw_imp_itm_prov_$s_fct_context WHERE pid = pg_backend_pid())
;

