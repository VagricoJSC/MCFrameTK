
COMMENT ON TABLE MGVT_MST_SIM_ITM_ORDER IS 'シミュレーション品目オーダ情報ビュー // Simulation item order info. view';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ITM_ORD_TYP IS 'オーダ区分 //  // Order type';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ORD_GNRT_TYP IS 'オーダ生成区分 //  // Order generation type';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.STRG_LOC_CD IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MST_MFG_LOC_CD IS 'マスタ製造場所ＣＤ // #MA.LOC_CD // Master mfg. location cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.RQST_LOC_CD IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.RQST_WG_CD IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_QTY IS '指図予定数量 // #MA.QTY // Order scheduled qty.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.YIELD_SCHD_QTY IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.NOT_INST_QTY IS '未指図数量 // #MA.QTY // Unordered qty.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_YIELD_SCHD_QTY IS '出来高予定数量（指図・発注） // #MA.QTY // Output scheduled qty. (Order/PO)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.YIELD_ACT_QTY IS '出来高実績数量（入荷・出来高） // #MA.QTY // Output result qty. (Receipt/output)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.PURC_ACT_QTY IS '仕入実績数量 // #MA.QTY // Purchase result qty.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INSP_ACT_QTY IS '検査実績数量 // #MA.QTY // Inspection result qty.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.NMR_QTY IS '歩留分子 // #MA.QTY // Yield numerator';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.DNM_QTY IS '歩留分母 // #MA.QTY // Yield denominator';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.FXD_YIELD_QTY IS '固定歩留数量 // #MA.QTY // Constant yield qty.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ITM_ORD_STS_TYP IS '品目オーダ状況区分 //  // Item order status type';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.FIX_DT IS '確定日 // #MA.DT // Firm date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.BLK_FLG IS 'まとめＦＬＧ // #MA.FLG // Aggregation flg.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.PO_SCHD_DT IS '発注予定日 // #MA.DT // Scheduled PO date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_PO_SCHD_DT IS '発注予定日（ＭＲＰ） // #MA.DT // Scheduled PO date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.PO_DT IS '発注日 // #MA.DT // PO date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_PURC_LT IS '購入ＬＴ（ＭＲＰ） // #MA.LT // Purchase LT (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.PURC_LT IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ACT_PURC_LT IS '購入ＬＴ（実績） // #MA.LT // Purchase LT (Result)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MFG_ST_SCHD_DT IS '製造着手予定日 // #MA.DT // Scheduled mfg. start date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_MFG_ST_SCHD_DT IS '製造着手予定日（ＭＲＰ） // #MA.DT // Scheduled mfg. start date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_MFG_ST_SCHD_DT IS '製造着手予定日（指図） // #MA.DT // Scheduled mfg. start date (Order)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MFG_ST_ACT_DT IS '製造着手実績日 // #MA.DT // Actual mfg. start date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MFG_END_SCHD_DT IS '製造終了予定日 // #MA.DT // Scheduled mfg. end date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_MFG_END_SCHD_DT IS '製造終了予定日（ＭＲＰ） // #MA.DT // Scheduled mfg. end date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_MFG_END_SCHD_DT IS '製造終了予定日（指図） // #MA.DT // Scheduled mfg. end date (Order)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MFG_END_ACT_DT IS '製造終了実績日 // #MA.DT // Actual mfg. end date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_MFG_LT IS '製造ＬＴ（ＭＲＰ） // #MA.LT // Mfg. LT (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MFG_LT IS '製造ＬＴ // #MA.LT // Mfg. LT';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ACT_MFG_LT IS '製造ＬＴ（実績） // #MA.LT // Mfg. LT (Result)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.GI_SCHD_DT IS '出庫予定日 // #MA.DT // Scheduled GI date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_GI_SCHD_DT IS '出庫予定日（ＭＲＰ） // #MA.DT // Scheduled GI date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_GI_SCHD_DT IS '出庫予定日（指図） // #MA.DT // Scheduled GI date (Order)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.GI_ACT_DT IS '出庫実績日 // #MA.DT // Actual GI date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.STRG_SCHD_DT IS '格納完了予定日 // #MA.DT // Scheduled storage completion date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_STRG_SCHD_DT IS '格納完了予定日（ＭＲＰ） // #MA.DT // Scheduled storage completion date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_STRG_SCHD_DT IS '格納完了予定日（指図・発注） // #MA.DT // Scheduled storage completion date (Order/PO)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.STRG_ACT_DT IS '格納完了実績日 // #MA.DT // Actual storage completion date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.XFR_LT IS '移動ＬＴ // #MA.LT // Movement LT';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_ACCPT_SCHD_DT IS '検収予定日（ＭＲＰ） // #MA.DT // Scheduled acceptance date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_ACCPT_SCHD_DT IS '検収予定日（発注） // #MA.DT // Scheduled acceptance date (PO)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ACCPT_ACT_DT IS '検収実績日 // #MA.DT // Actual acceptance date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ACCPT_INSP_LT IS '検収ＬＴ // #MA.LT // Acceptance LT';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INSP_ST_SCHD_DT IS '検査着手予定日 // #MA.DT // Scheduled inspection start date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_INSP_ST_SCHD_DT IS '検査着手予定日（ＭＲＰ） // #MA.DT // Scheduled inspection start date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_INSP_ST_SCHD_DT IS '検査着手予定日（指図・発注） // #MA.DT // Scheduled inspection start date (Order/PO)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INSP_ST_ACT_DT IS '検査着手実績日 // #MA.DT // Actual inspection start date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INSP_END_SCHD_DT IS '検査終了予定日 // #MA.DT // Scheduled inspection end date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_INSP_END_SCHD_DT IS '検査終了予定日（ＭＲＰ） // #MA.DT // Scheduled inspection end date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_INSP_END_SCHD_DT IS '検査終了予定日（指図・発注） // #MA.DT // Scheduled inspection end date (Order/PO)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INSP_END_ACT_DT IS '検査終了実績日 // #MA.DT // Actual inspection end date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INSP_LT IS '検査ＬＴ // #MA.LT // Inspection LT';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INSP_OFFST IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MRP_AVL_SCHD_DT IS '使用可能予定日（ＭＲＰ） // #MA.DT // Available date (MRP)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.AVL_SCHD_DT IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.LMT_DT IS '期限切れ日 // #MA.DT // Expired date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.NOT_FIX_FLG IS '手配不許可ＦＬＧ // #MA.FLG // Disallow procurement flg.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.ORD_FIX_PD IS 'オーダ自動確定期間（日） // #MA.ORD_FIX_PD // Order auto-firming period (Date)';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.RQMT_NO IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INST_PO_CNT_RMRKS IS '指図・発注連絡備考 //  // Order/PO contact remarks';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SIM_MRP_NO IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INTR_RMRKS IS '内部備考 //  // Internal remarks';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SUB_CHAR1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SUB_CHAR2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.SUB_CHAR3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.EXP_DT IS '反映日 // #MA.DT // Applied date';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGVT_MST_SIM_ITM_ORDER.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

