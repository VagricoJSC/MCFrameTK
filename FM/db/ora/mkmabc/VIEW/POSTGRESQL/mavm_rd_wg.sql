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
;
