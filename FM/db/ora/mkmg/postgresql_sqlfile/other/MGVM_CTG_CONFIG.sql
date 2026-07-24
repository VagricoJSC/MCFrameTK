\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_ctg_config(
par_ctg_cd,
ctg_cd,
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3
)
AS
SELECT	mgvm_ctg_config_mavm_ctg_config_m1.par_ctg_cd,
	mgvm_ctg_config_mavm_ctg_config_m1.ctg_cd,
	mgvm_ctg_config_mavm_ctg_config_m1.itm_cd,
	mgvm_ctg_config_mavm_ctg_config_m1.itm_sub1,
	mgvm_ctg_config_mavm_ctg_config_m1.itm_sub2,
	mgvm_ctg_config_mavm_ctg_config_m1.itm_sub3
FROM	mgw_arg mgvm_ctg_config_mgw_arg_w1, mavm_ctg_config mgvm_ctg_config_mavm_ctg_config_m1
WHERE	0=0
AND	mgvm_ctg_config_mgw_arg_w1.term = mgvm_ctg_config_mavm_ctg_config_m1.term
AND	(
	mgvm_ctg_config_mavm_ctg_config_m1.itm_cd IS NULL
	OR
	EXISTS (
		SELECT	'X'
		FROM	mgt_calc_itm mgvm_ctg_config_mgt_calc_itm_x
		WHERE	0=0
		AND	mgvm_ctg_config_mgt_calc_itm_x.calc_no = mgvm_ctg_config_mgw_arg_w1.calc_no
		AND	mgvm_ctg_config_mgt_calc_itm_x.calc_grp_cd = mgvm_ctg_config_mgw_arg_w1.calc_grp_cd
		AND	mgvm_ctg_config_mgt_calc_itm_x.itm_cd = mgvm_ctg_config_mavm_ctg_config_m1.itm_cd
		AND	mgvm_ctg_config_mgt_calc_itm_x.itm_sub1 = mgvm_ctg_config_mavm_ctg_config_m1.itm_sub1
		AND	mgvm_ctg_config_mgt_calc_itm_x.itm_sub2 = mgvm_ctg_config_mavm_ctg_config_m1.itm_sub2
		AND	mgvm_ctg_config_mgt_calc_itm_x.itm_sub3 = mgvm_ctg_config_mavm_ctg_config_m1.itm_sub3
		)
	)
;;

