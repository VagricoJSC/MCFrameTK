
COMMENT ON TABLE MAVM_ITM_DTL_MFG IS '品目詳細マスタ（製造）ビュー // Item details master (Mfg.) view';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.RQST_LOC_CD IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MFG_LT IS '製造ＬＴ // #MA.LT // Mfg. LT';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MFG_LT_ADD_QTY IS '製造ＬＴ加算基準数量 // #MA.QTY // Mfg. LT adds base qty.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.PURC_LT IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.PURC_LT_ADD_QTY IS '購入ＬＴ加算基準数量 // #MA.QTY // Purchase LT adds standard qty.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.PURC_BASIS_TYP IS '仕入計上区分 // #MA.PURC_BASIS_TYP // Purchase recording type';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ACCPT_INSP_LT IS '検収ＬＴ // #MA.LT // Acceptance LT';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.BUF_LT IS '安全ＬＴ // #MA.LT // Safety LT';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ORD_FIX_PD IS 'オーダ自動確定期間（日） // #MA.ORD_FIX_PD // Order auto-firming period (Date)';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.SZ_DAY_WEEK_TYP IS '曜日まとめ区分 // #MA.DAY_WEEK_TYP // Aggregation (by day of week) type';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.SZ_WEEK IS '曜日まとめ期間（週） // #MA.SZ_WEEK // Aggregation (by day of week) period (Week)';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.LOT_SZ_PD IS 'ロットまとめ期間（日） // #MA.LOT_SZ_PD // Lot sizing period (Days)';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MIN_LOT_QTY IS '最小ロット数量 // #MA.QTY // Min. lot qty.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.BATCH_LOT_QTY IS '刻みロット数量 // #MA.QTY // Increments lot qty.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MAX_LOT_QTY IS '最大ロット数量 // #MA.QTY // Max. lot qty.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MAX_ORDER IS '最大オーダ件数 // #MA.INT // Number of max. order';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.PRIO IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ORDER_RATIO IS 'オーダ比率 // #MA.ORDER_RATIO // Order ratio';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.YIELD_SCHD_QTY IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MFG_INST_QTY IS '製造指図数量 // #MA.QTY // Mfg. order qty.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.FXD_RQMT_QTY IS '固定必要数量 // #MA.QTY // Fixed required qty.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.LOT_ISSUE_TYP IS 'ロット発番タイミング区分 // #MA.LOT_ISSUE_TYP // Lot numbering timing type';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.BKF_FLG IS 'バックフラッシュ許可ＦＬＧ // #MA.FLG // Allow backflush flg.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.LN_STK_FLG IS '棚・ライン格納ＦＬＧ // #MA.FLG // Rack/Line store flg.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.PRE_PO_TGT_FLG IS '先行手配対象ＦＬＧ // #MA.FLG // For long LT flg.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.INST_REC_ISSUE_FLG IS '製造指図時記録書発行ＦＬＧ // #MA.FLG // Issue record sheet at mfg. order flg.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.NO_MFG_APRV_FLG IS '製造承認対象外ＦＬＧ // #MA.FLG // Not for mfg. approval flg.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ITM_LOWER_YIELD IS '品目下限収率 // #MA.YIELD // Item min. yield';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ITM_STD_YIELD IS '品目標準収率 // #MA.YIELD // Item standard yield';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.ITM_UPPER_YIELD IS '品目上限収率 // #MA.YIELD // Item max. yield';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.RQST_WG_CD IS '購買依頼先ワーキンググループＣＤ // #MA.WG_CD // Purchase request destination WG cd.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.PO_BATCH_FLG IS '発注バッチＦＬＧ // #MA.FLG // PO batch flg.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.RSRC_STD_QTY1 IS '資源標準値１ // #MA.QTY // Resource standard value 1';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.RSRC_UNIT_QTY1 IS '資源単位数量１ // #MA.QTY // Resource unit qty. 1';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.RSRC_STD_QTY2 IS '資源標準値２ // #MA.QTY // Resource standard value 2';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.RSRC_UNIT_QTY2 IS '資源単位数量２ // #MA.QTY // Resource unit qty. 2';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.NOT_MRP_FLG IS 'ＭＲＰ対象外ＦＬＧ // #MA.FLG // Not for MRP flg.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.COST_RATIO IS '原価比率 // #MA.COST_RATIO // Cost ratio';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAVM_ITM_DTL_MFG.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

