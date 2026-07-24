\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_loc(
loc_cd,
sppl_cd,
repurc_obli_flg
)
AS
SELECT	mgvm_loc_mam_loc_m.loc_cd,
	mgvm_loc_mam_loc_m.sppl_cd,
	COALESCE(mgvm_loc_mam_bp_$s_m1.repurc_obli_flg, '0') repurc_obli_flg
FROM	mam_loc mgvm_loc_mam_loc_m
	LEFT OUTER JOIN mam_bp_$s mgvm_loc_mam_bp_$s_m1 ON (mgvm_loc_mam_loc_m.sppl_cd = mgvm_loc_mam_bp_$s_m1.bp_cd)
WHERE	0=0
;;

