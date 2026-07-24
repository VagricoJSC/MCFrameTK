\encoding UTF-8

CREATE OR REPLACE VIEW mavm_rd_loc(
loc_cd,
loc_nm,
base_loc_nm,
asst_dpt_cd,
sls_dpt_cd,
wg_cd,
site_cd,
lg_grp_cd,
lg_def_flg,
loc_grp_cd,
alloc_grp_cd,
sppl_cd,
maker_cd,
pre_outsrc_act_flg,
ddlv_prov_insp_flg,
cal_cd,
loc_mng_typ,
prnt_lcl_cd,
cntry_cd,
num_id,
stktk_tgt_flg,
stktk_tor_disp_flg,
stktk_tor_ex_zero_flg,
stktk_act_ex_zero_flg,
stktk_amt_flg,
str_ln_tgt_flg,
alloc_lmt_flg,
gi_pack_xfer_flg,
gi_vmi_flg,
rsrc_cd1,
rsrc_cd2,
ext_sys_loc_typ,
loc_alc_grp,
addr_flg,
zip_cd,
base_zip_cd,
addr1,
base_addr1,
addr2,
base_addr2,
addr3,
base_addr3,
addr4,
base_addr4,
tel,
base_tel,
fax,
base_fax,
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
SELECT	mavm_rd_loc_mam_loc_m.*
FROM	mat_da_loc mavm_rd_loc_mat_da_loc_t, mam_loc mavm_rd_loc_mam_loc_m
, (SELECT fcpa_context$f_get_login_seq() login_seq) mavm_rd_loc_fct_context_t
WHERE	0 = 0
AND	mavm_rd_loc_mat_da_loc_t.loc_cd = mavm_rd_loc_mam_loc_m.loc_cd 
AND	mavm_rd_loc_mat_da_loc_t.login_seq = mavm_rd_loc_fct_context_t.login_seq
AND	mavm_rd_loc_mat_da_loc_t.rd_flg = '1' 
UNION ALL
SELECT	mavm_rd_loc_mam_loc_m2.*
FROM	mam_loc mavm_rd_loc_mam_loc_m2,
	(
	SELECT	mavm_rd_loc_mam_usr_x.full_da_flg
	FROM	mam_usr mavm_rd_loc_mam_usr_x, (SELECT fcpa_context$f_get_userid() user_id) mavm_rd_loc_fct_context_t2
	WHERE	0=0
	AND	mavm_rd_loc_fct_context_t2.user_id = mavm_rd_loc_mam_usr_x.usr_cd
	) mavm_rd_loc_mam_usr_w
WHERE	0=0
AND	mavm_rd_loc_mam_usr_w.full_da_flg = '1'
;;

