\encoding UTF-8

CREATE OR REPLACE VIEW mavm_rd_dpt(
dpt_cd
)
AS
SELECT	mavm_rd_dpt_mat_da_dpt_t.dpt_cd
FROM	mat_da_dpt mavm_rd_dpt_mat_da_dpt_t
, (SELECT fcpa_context$f_get_login_seq() login_seq) mavm_rd_dpt_fct_context_t
WHERE	0 = 0
AND	mavm_rd_dpt_mat_da_dpt_t.login_seq = mavm_rd_dpt_fct_context_t.login_seq
AND	mavm_rd_dpt_mat_da_dpt_t.rd_flg = '1' 
UNION ALL
SELECT	mavm_rd_dpt_mam_dpt_m2.dpt_cd
FROM	mam_dpt mavm_rd_dpt_mam_dpt_m2,
	(
	SELECT	mavm_rd_dpt_mam_usr_x.full_da_flg
	FROM	mam_usr mavm_rd_dpt_mam_usr_x, (SELECT fcpa_context$f_get_userid() user_id) mavm_rd_dpt_fct_context_t2
	WHERE	0=0
	AND	mavm_rd_dpt_fct_context_t2.user_id = mavm_rd_dpt_mam_usr_x.usr_cd
	) mavm_rd_dpt_mam_usr_w
WHERE	0=0
AND	mavm_rd_dpt_mam_dpt_m2.st_dt <= fcpa_date_util$f_get_today()
AND	mavm_rd_dpt_mam_dpt_m2.end_dt >= fcpa_date_util$f_get_today()
AND	mavm_rd_dpt_mam_usr_w.full_da_flg = '1'
;;

