\encoding UTF-8

CREATE OR REPLACE VIEW mavm_biz_rsn_if_all(
co_cd,
biz_rsn_cd,
biz_rsn_nm,
biz_rsn_nm_lcl1,
biz_rsn_nm_lcl2,
biz_rsn_nm_lcl3,
biz_rsn_nm_lcl4,
biz_rsn_nm_lcl5,
ac_rsn_cd,
ac_rsn_nm,
ac_rsn_nm_lcl1,
ac_rsn_nm_lcl2,
ac_rsn_nm_lcl3,
ac_rsn_nm_lcl4,
ac_rsn_nm_lcl5,
purc_flg,
purc_rtn_flg,
xpns_purc_flg,
slo_xpns_purc_flg,
purc_dscnt_flg,
purc_dscnt_loc_mng_typ,
sls_flg,
sls_rtn_flg,
sls_acxfr_flg,
sls_dscnt_flg,
acxfr_gr_flg,
acxfr_gi_flg,
disp_flg,
stk_xfr_flg,
xfr_flg,
yield_flg,
yield_typ,
not_stk_flg,
loss_flg,
fxd_loss_flg,
not_lot_trace_flg,
dfct_flg,
inpt_flg,
memo1,
memo2,
memo3
)
AS
WITH mavm_ac_rsn_mst_w AS (
	SELECT * FROM mavm_ac_rsn_mst
)
SELECT
	--会社ＣＤ
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.co_cd,
	--業務理由ＣＤ
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.biz_rsn_cd,
	--業務理由名
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.biz_rsn_nm,
	--業務理由名（ロケール１）
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.biz_rsn_nm_lcl1,
	--業務理由名（ロケール２） 
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.biz_rsn_nm_lcl2,
	--業務理由名（ロケール３） 
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.biz_rsn_nm_lcl3,	
	--業務理由名（ロケール４） 
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.biz_rsn_nm_lcl4,	
	--業務理由名（ロケール５） 
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.biz_rsn_nm_lcl5,
	--会計理由ＣＤ
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.ac_rsn_cd,
	--会計理由名
	(SELECT mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_nm
		FROM mavm_ac_rsn_mst_w mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t
		WHERE 0 =0
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_cd = mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.ac_rsn_cd
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.co_cd = mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.co_cd
	)	ac_rsn_nm,
	--会計理由名（ロケール１）
	(SELECT mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_nm_lcl1
		FROM mavm_ac_rsn_mst_w mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t
		WHERE 0 =0
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_cd = mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.ac_rsn_cd
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.co_cd =  mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.co_cd
	)	ac_rsn_nm_lcl1,
	--会計理由名（ロケール２）
	(SELECT mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_nm_lcl2
		FROM mavm_ac_rsn_mst_w mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t
		WHERE 0 =0
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_cd = mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.ac_rsn_cd
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.co_cd =  mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.co_cd
	)	ac_rsn_nm_lcl2,
	--会計理由名（ロケール３）
	(SELECT mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_nm_lcl3
		FROM mavm_ac_rsn_mst_w mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t
		WHERE 0 =0
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_cd = mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.ac_rsn_cd
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.co_cd =  mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.co_cd
	)	ac_rsn_nm_lcl3,
	--会計理由名（ロケール４）
	(SELECT mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_nm_lcl4
		FROM mavm_ac_rsn_mst_w mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t
		WHERE 0 =0
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_cd = mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.ac_rsn_cd
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.co_cd =  mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.co_cd
	)	ac_rsn_nm_lcl4,
	--会計理由名（ロケール５）
	(SELECT mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_nm_lcl5
		FROM mavm_ac_rsn_mst_w mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t
		WHERE 0 =0
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.ac_rsn_cd = mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.ac_rsn_cd
		AND mavm_biz_rsn_if_all_mavm_ac_rsn_mst_w_t.co_cd =  mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.co_cd
	)	ac_rsn_nm_lcl5,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.purc_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.purc_rtn_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.xpns_purc_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.slo_xpns_purc_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.purc_dscnt_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.purc_dscnt_loc_mng_typ,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.sls_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.sls_rtn_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.sls_acxfr_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.sls_dscnt_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.acxfr_gr_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.acxfr_gi_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.disp_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.stk_xfr_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.xfr_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.yield_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.yield_typ,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.not_stk_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.loss_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.fxd_loss_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.not_lot_trace_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.dfct_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.inpt_flg,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.memo1,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.memo2,
	mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1.memo3
FROM mavm_biz_rsn_mst mavm_biz_rsn_if_all_mavm_biz_rsn_mst_t1 
;;

