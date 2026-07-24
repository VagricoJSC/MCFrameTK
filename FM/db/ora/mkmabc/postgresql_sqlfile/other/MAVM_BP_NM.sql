\encoding UTF-8

CREATE OR REPLACE VIEW mavm_bp_nm(
bp_cd,
bp_nm
)
AS
SELECT	mavm_bp_nm_mam_bp_lcl_m.bp_cd,
	mavm_bp_nm_mam_bp_lcl_m.bp_nm
FROM	mam_bp_lcl mavm_bp_nm_mam_bp_lcl_m
WHERE	0 = 0
AND	fcpa_context$f_get_locale() = mavm_bp_nm_mam_bp_lcl_m.lcl_cd
;;

