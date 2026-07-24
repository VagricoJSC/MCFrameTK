\encoding UTF-8

CREATE OR REPLACE VIEW mam_cur_$u(
	cur_cd,
	cur_nm,
	amt_dec_place,
	upri_dec_place,
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
	mam_cur_$u_mam_cur_all_org.cur_cd,
	mam_cur_$u_mam_cur_all_org.cur_nm,
	mam_cur_$u_mam_cur_all_org.amt_dec_place,
	mam_cur_$u_mam_cur_all_org.upri_dec_place,
	mam_cur_$u_mam_cur_all_org.memo1,
	mam_cur_$u_mam_cur_all_org.memo2,
	mam_cur_$u_mam_cur_all_org.memo3,
	mam_cur_$u_mam_cur_all_org.del_flg,
	mam_cur_$u_mam_cur_all_org.del_usr_id,
	mam_cur_$u_mam_cur_all_org.del_usr_nm,
	mam_cur_$u_mam_cur_all_org.del_ts,
	mam_cur_$u_mam_cur_all_org.ins_usr_id,
	mam_cur_$u_mam_cur_all_org.ins_usr_nm,
	mam_cur_$u_mam_cur_all_org.ins_ts,
	mam_cur_$u_mam_cur_all_org.ins_func_id,
	mam_cur_$u_mam_cur_all_org.upd_cntr,
	mam_cur_$u_mam_cur_all_org.upd_usr_id,
	mam_cur_$u_mam_cur_all_org.upd_usr_nm,
	mam_cur_$u_mam_cur_all_org.upd_ts,
	mam_cur_$u_mam_cur_all_org.upd_func_id,
	mam_cur_$u_mam_cur_all_org.upd_srv_req_no
FROM
	mam_cur_all mam_cur_$u_mam_cur_all_org
WHERE
	0 = 0
	AND mam_cur_$u_mam_cur_all_org.co_cd = fcpa_context$f_get_co_cd()
;

