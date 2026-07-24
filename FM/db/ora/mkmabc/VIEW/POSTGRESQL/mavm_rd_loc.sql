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
;
