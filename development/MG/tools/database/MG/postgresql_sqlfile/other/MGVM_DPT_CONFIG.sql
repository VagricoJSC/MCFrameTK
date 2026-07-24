\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_dpt_config(
par_dpt_cd,
dpt_cd,
loc_cd,
oper_cd,
oper_null_flg
)
AS
SELECT	mgvm_dpt_config_mavm_dpt_config_m1.par_dpt_cd,
	mgvm_dpt_config_mavm_dpt_config_m1.dpt_cd,
	mgvm_dpt_config_mavm_dpt_config_m1.loc_cd,
	mgvm_dpt_config_mavm_dpt_config_m1.oper_cd,
	mgvm_dpt_config_mavm_dpt_config_m1.oper_null_flg
FROM	mgw_arg mgvm_dpt_config_mgw_arg_w1, mavm_dpt_config mgvm_dpt_config_mavm_dpt_config_m1
WHERE	0=0
AND	mgvm_dpt_config_mgw_arg_w1.term = mgvm_dpt_config_mavm_dpt_config_m1.term
;;

