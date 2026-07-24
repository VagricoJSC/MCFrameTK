\encoding UTF-8

CREATE OR REPLACE VIEW msvm_mrp_lg_ctl(
fr_lg_grp_cd,
to_lg_grp_cd,
ship_term_cd,
xfr_lt
)
AS
SELECT
	msvm_mrp_lg_ctl_mam_lg_ctl_t1.fr_lg_grp_cd,
	msvm_mrp_lg_ctl_mam_lg_ctl_t1.to_lg_grp_cd,
	msvm_mrp_lg_ctl_mam_lg_ctl_t1.ship_term_cd,
	msvm_mrp_lg_ctl_mam_lg_ctl_t1.xfr_lt
FROM mam_lg_ctl msvm_mrp_lg_ctl_mam_lg_ctl_t1
WHERE 0=0
AND msvm_mrp_lg_ctl_mam_lg_ctl_t1.del_flg = '0'
;;

