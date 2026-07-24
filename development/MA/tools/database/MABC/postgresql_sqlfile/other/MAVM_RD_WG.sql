\encoding UTF-8

CREATE OR REPLACE VIEW mavm_rd_wg(
wg_cd,
wg_nm,
base_wg_nm,
sls_flg,
lg_flg,
mfg_flg,
purc_flg,
ar_flg,
ap_flg,
sd_flg,
mrp_prefix,
mfg_inst_unit_typ,
mrp_proc_typ,
alloc_margin_days,
not_xfr_flg,
mrp_alloc_margin_days,
mrp_opn_xfr_days,
rqmt_typ,
prod_pln_typ,
dmnd_date_div_mons,
plm_flg,
calc_seq,
cmn_upri_flg,
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
SELECT	mavm_rd_wg_mam_wg_m.*
FROM	mat_da_wg mavm_rd_wg_mat_da_wg_t, mam_wg mavm_rd_wg_mam_wg_m
, (SELECT fcpa_context$f_get_login_seq() login_seq) mavm_rd_wg_fct_context_t
WHERE	0 = 0
AND	mavm_rd_wg_mat_da_wg_t.wg_cd = mavm_rd_wg_mam_wg_m.wg_cd 
AND	mavm_rd_wg_mat_da_wg_t.login_seq = mavm_rd_wg_fct_context_t.login_seq
AND	mavm_rd_wg_mat_da_wg_t.rd_flg = '1' 
UNION ALL
SELECT	mavm_rd_wg_mam_wg_m2.*
FROM	mam_wg mavm_rd_wg_mam_wg_m2,
	(
	SELECT	mavm_rd_wg_mam_usr_x.full_da_flg
	FROM	mam_usr mavm_rd_wg_mam_usr_x, (SELECT fcpa_context$f_get_userid() user_id) mavm_rd_wg_fct_context_t2
	WHERE	0=0
	AND	mavm_rd_wg_fct_context_t2.user_id = mavm_rd_wg_mam_usr_x.usr_cd
	) mavm_rd_wg_mam_usr_w
WHERE	0=0
AND	mavm_rd_wg_mam_usr_w.full_da_flg = '1'
;;

