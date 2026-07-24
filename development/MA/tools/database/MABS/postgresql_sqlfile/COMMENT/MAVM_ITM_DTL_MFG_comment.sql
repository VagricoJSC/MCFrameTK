\encoding UTF-8

COMMENT ON VIEW mavm_itm_dtl_mfg IS '品目詳細マスタ（製造）ビュー // Item details master (Mfg.) view';


COMMENT ON COLUMN mavm_itm_dtl_mfg.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mavm_itm_dtl_mfg.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mavm_itm_dtl_mfg.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mavm_itm_dtl_mfg.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.rqst_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mavm_itm_dtl_mfg.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mavm_itm_dtl_mfg.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mavm_itm_dtl_mfg.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mavm_itm_dtl_mfg.mfg_lt IS '製造ＬＴ // #MA.LT // Mfg. LT';


COMMENT ON COLUMN mavm_itm_dtl_mfg.mfg_lt_add_qty IS '製造ＬＴ加算基準数量 // #MA.QTY // Mfg. LT adds base qty.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.purc_lt IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN mavm_itm_dtl_mfg.purc_lt_add_qty IS '購入ＬＴ加算基準数量 // #MA.QTY // Purchase LT adds standard qty.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.purc_basis_typ IS '仕入計上区分 // #MA.PURC_BASIS_TYP // Purchase recording type';


COMMENT ON COLUMN mavm_itm_dtl_mfg.accpt_insp_lt IS '検収ＬＴ // #MA.LT // Acceptance LT';


COMMENT ON COLUMN mavm_itm_dtl_mfg.buf_lt IS '安全ＬＴ // #MA.LT // Safety LT';


COMMENT ON COLUMN mavm_itm_dtl_mfg.ord_fix_pd IS 'オーダ自動確定期間（日） // #MA.ORD_FIX_PD // Order auto-firming period (Date)';


COMMENT ON COLUMN mavm_itm_dtl_mfg.sz_day_week_typ IS '曜日まとめ区分 // #MA.DAY_WEEK_TYP // Aggregation (by day of week) type';


COMMENT ON COLUMN mavm_itm_dtl_mfg.sz_week IS '曜日まとめ期間（週） // #MA.SZ_WEEK // Aggregation (by day of week) period (Week)';


COMMENT ON COLUMN mavm_itm_dtl_mfg.lot_sz_pd IS 'ロットまとめ期間（日） // #MA.LOT_SZ_PD // Lot sizing period (Days)';


COMMENT ON COLUMN mavm_itm_dtl_mfg.min_lot_qty IS '最小ロット数量 // #MA.QTY // Min. lot qty.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.batch_lot_qty IS '刻みロット数量 // #MA.QTY // Increments lot qty.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.max_lot_qty IS '最大ロット数量 // #MA.QTY // Max. lot qty.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.max_order IS '最大オーダ件数 // #MA.INT // Number of max. order';


COMMENT ON COLUMN mavm_itm_dtl_mfg.prio IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN mavm_itm_dtl_mfg.order_ratio IS 'オーダ比率 // #MA.ORDER_RATIO // Order ratio';


COMMENT ON COLUMN mavm_itm_dtl_mfg.yield_schd_qty IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.mfg_inst_qty IS '製造指図数量 // #MA.QTY // Mfg. order qty.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.fxd_rqmt_qty IS '固定必要数量 // #MA.QTY // Fixed required qty.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.lot_issue_typ IS 'ロット発番タイミング区分 // #MA.LOT_ISSUE_TYP // Lot numbering timing type';


COMMENT ON COLUMN mavm_itm_dtl_mfg.bkf_flg IS 'バックフラッシュ許可ＦＬＧ // #MA.FLG // Allow backflush flg.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.ln_stk_flg IS '棚・ライン格納ＦＬＧ // #MA.FLG // Rack/Line store flg.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.pre_po_tgt_flg IS '先行手配対象ＦＬＧ // #MA.FLG // For long LT flg.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.inst_rec_issue_flg IS '製造指図時記録書発行ＦＬＧ // #MA.FLG // Issue record sheet at mfg. order flg.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.no_mfg_aprv_flg IS '製造承認対象外ＦＬＧ // #MA.FLG // Not for mfg. approval flg.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.itm_lower_yield IS '品目下限収率 // #MA.YIELD // Item min. yield';


COMMENT ON COLUMN mavm_itm_dtl_mfg.itm_std_yield IS '品目標準収率 // #MA.YIELD // Item standard yield';


COMMENT ON COLUMN mavm_itm_dtl_mfg.itm_upper_yield IS '品目上限収率 // #MA.YIELD // Item max. yield';


COMMENT ON COLUMN mavm_itm_dtl_mfg.purc_id_typ IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN mavm_itm_dtl_mfg.rqst_wg_cd IS '購買依頼先ワーキンググループＣＤ // #MA.WG_CD // Purchase request destination WG cd.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.po_batch_flg IS '発注バッチＦＬＧ // #MA.FLG // PO batch flg.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.rsrc_std_qty1 IS '資源標準値１ // #MA.QTY // Resource standard value 1';


COMMENT ON COLUMN mavm_itm_dtl_mfg.rsrc_unit_qty1 IS '資源単位数量１ // #MA.QTY // Resource unit qty. 1';


COMMENT ON COLUMN mavm_itm_dtl_mfg.rsrc_std_qty2 IS '資源標準値２ // #MA.QTY // Resource standard value 2';


COMMENT ON COLUMN mavm_itm_dtl_mfg.rsrc_unit_qty2 IS '資源単位数量２ // #MA.QTY // Resource unit qty. 2';


COMMENT ON COLUMN mavm_itm_dtl_mfg.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mavm_itm_dtl_mfg.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mavm_itm_dtl_mfg.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mavm_itm_dtl_mfg.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mavm_itm_dtl_mfg.not_mrp_flg IS 'ＭＲＰ対象外ＦＬＧ // #MA.FLG // Not for MRP flg.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.cost_ratio IS '原価比率 // #MA.COST_RATIO // Cost ratio';


COMMENT ON COLUMN mavm_itm_dtl_mfg.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_itm_dtl_mfg.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_itm_dtl_mfg.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_itm_dtl_mfg.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_itm_dtl_mfg.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_itm_dtl_mfg.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_itm_dtl_mfg.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_itm_dtl_mfg.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_itm_dtl_mfg.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_itm_dtl_mfg.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_itm_dtl_mfg.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_itm_dtl_mfg.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_itm_dtl_mfg.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_itm_dtl_mfg.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_itm_dtl_mfg.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_itm_dtl_mfg.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_itm_dtl_mfg.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

