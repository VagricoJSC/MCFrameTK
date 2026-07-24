\encoding UTF-8

CREATE OR REPLACE VIEW mavm_calc_grp_if_all(
co_cd,
calc_grp_cd,
calc_grp_nm,
calc_grp_nm_lcl1,
calc_grp_nm_lcl2,
calc_grp_nm_lcl3,
calc_grp_nm_lcl4,
calc_grp_nm_lcl5,
cost_calc_typ,
eval_typ,
max_mons,
calc_cnt,
sa_typ,
exp_calc_typ,
pre_alc_calc_typ,
alc_calc_typ,
memo1,
memo2,
memo3
)
AS
SELECT
	--会社ＣＤ
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.co_cd,
	--計算グループＣＤ
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.calc_grp_cd,
	--計算グループ名
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.calc_grp_nm,
	--計算グループ名（ロケール１）
	(SELECT mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_nm
		FROM mam_calc_grp_lcl_all mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.calc_grp_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.co_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.co_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.lcl_cd = 'ja_JP'
	)	calc_grp_nm_lcl1,
	--計算グループ名（ロケール２）
	(SELECT mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_nm
		FROM mam_calc_grp_lcl_all mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.calc_grp_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.co_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.co_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.lcl_cd = 'en_US'
	)	calc_grp_nm_lcl2,
	--計算グループ名（ロケール３）
	(SELECT mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_nm
		FROM mam_calc_grp_lcl_all mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.calc_grp_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.co_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.co_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.lcl_cd = 'TBD3'
	)	calc_grp_nm_lcl3,
	--計算グループ名（ロケール４）
	(SELECT mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_nm
		FROM mam_calc_grp_lcl_all mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.calc_grp_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.co_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.co_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.lcl_cd = 'TBD4'
	)	calc_grp_nm_lcl4,
	--計算グループ名（ロケール５）
	(SELECT mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_nm
		FROM mam_calc_grp_lcl_all mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t
		WHERE 0 = 0
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.calc_grp_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.calc_grp_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.co_cd = mavm_calc_grp_if_all_mam_calc_grp_all_t1.co_cd
		AND mavm_calc_grp_if_all_mam_calc_grp_lcl_all_t.lcl_cd = 'TBD5'
	)	calc_grp_nm_lcl5,
	--計算区分
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.cost_calc_typ,
	--金額評価区分
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.eval_typ,
	--最大計算月数
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.max_mons,
	--計算回数
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.calc_cnt,
	--予実区分
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.sa_typ,
	--展開計算区分
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.exp_calc_typ,
	--一次配賦計算区分
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.pre_alc_calc_typ,
	--配賦率計算区分
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.alc_calc_typ,
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.memo1,
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.memo2,
	mavm_calc_grp_if_all_mam_calc_grp_all_t1.memo3
FROM mam_calc_grp_all mavm_calc_grp_if_all_mam_calc_grp_all_t1
;;

