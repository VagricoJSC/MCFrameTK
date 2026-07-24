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
;
