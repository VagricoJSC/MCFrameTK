\encoding UTF-8

CREATE OR REPLACE VIEW mavm_rd_lg_grp(
lg_grp_cd,
lg_grp_nm,
base_lg_grp_nm,
loc_flg,
wg_cd,
ship_slip_flg,
pick_list_flg,
ship_inst_flg,
ship_slip_act_flg,
cal_cd,
site_co_cd,
gi_minus_stk_chk_flg,
ship_loc_prio_flg,
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
SELECT	mavm_rd_lg_grp_mam_lg_grp_m.*
FROM	mat_da_lg_grp mavm_rd_lg_grp_mat_da_lg_grp_t, mam_lg_grp mavm_rd_lg_grp_mam_lg_grp_m
, (SELECT fcpa_context$f_get_login_seq() login_seq) mavm_rd_lg_grp_fct_context_t
WHERE	0 = 0
AND	mavm_rd_lg_grp_mat_da_lg_grp_t.lg_grp_cd = mavm_rd_lg_grp_mam_lg_grp_m.lg_grp_cd 
AND	mavm_rd_lg_grp_mat_da_lg_grp_t.login_seq = mavm_rd_lg_grp_fct_context_t.login_seq
AND	mavm_rd_lg_grp_mat_da_lg_grp_t.rd_flg = '1' 
UNION ALL
SELECT	mavm_rd_lg_grp_mam_lg_grp_m2.*
FROM	mam_lg_grp mavm_rd_lg_grp_mam_lg_grp_m2,
	(
	SELECT	mavm_rd_lg_grp_mam_usr_x.full_da_flg
	FROM	mam_usr mavm_rd_lg_grp_mam_usr_x, (SELECT fcpa_context$f_get_userid() user_id) mavm_rd_lg_grp_fct_context_t2
	WHERE	0=0
	AND	mavm_rd_lg_grp_fct_context_t2.user_id = mavm_rd_lg_grp_mam_usr_x.usr_cd
	) mavm_rd_lg_grp_mam_usr_w
WHERE	0=0
AND	mavm_rd_lg_grp_mam_usr_w.full_da_flg = '1'
;;

