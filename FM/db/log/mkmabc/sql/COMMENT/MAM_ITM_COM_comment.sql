
COMMENT ON TABLE MAM_ITM_COM IS '品目マスタ（会社） // Item master (Company)';


COMMENT ON COLUMN MAM_ITM_COM.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_ITM_COM.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_ITM_COM.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_ITM_COM.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_ITM_COM.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_ITM_COM.ITM_TYP IS '品目区分 // #MA.ITM_TYP // Item type';


COMMENT ON COLUMN MAM_ITM_COM.ITM_TYP_D_CD IS '品目区分詳細ＣＤ // #MA.ITM_TYP_D_CD // Item type details cd.';


COMMENT ON COLUMN MAM_ITM_COM.ITM_JNL_CD IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN MAM_ITM_COM.AC_ITM_GRP_CD IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN MAM_ITM_COM.MINUS_STK_FLG IS 'マイナス在庫許可ＦＬＧ // #MA.FLG // Allow negative inventory flg.';


COMMENT ON COLUMN MAM_ITM_COM.NOT_NEW_LOT_FLG IS '新規ロット入力不可ＦＬＧ // #MA.FLG // Do not allow new lot input flg.';


COMMENT ON COLUMN MAM_ITM_COM.GI_ALLOC_FLG IS '出庫引当確認ＦＬＧ // #MA.FLG // GI allocation check flg.';


COMMENT ON COLUMN MAM_ITM_COM.SLS_TAX_CD IS '売上税ＣＤ // #MA.TAX_CD // Sales tax cd.';


COMMENT ON COLUMN MAM_ITM_COM.PURC_TAX_CD IS '仕入税ＣＤ // #MA.TAX_CD // Purchase tax cd.';


COMMENT ON COLUMN MAM_ITM_COM.PROV_TAX_CD IS '支給税ＣＤ // #MA.TAX_CD // Supply tax cd.';


COMMENT ON COLUMN MAM_ITM_COM.WTAX_RATE IS '源泉税率 // #MA.TAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MAM_ITM_COM.SHIP_UNIT_CD IS '出荷単位ＣＤ // #MA.UNIT_CD // Shipping unit cd.';


COMMENT ON COLUMN MAM_ITM_COM.MFG_UNIT_CD IS '製造単位ＣＤ // #MA.UNIT_CD // Mfg. unit cd.';


COMMENT ON COLUMN MAM_ITM_COM.PURC_UNIT_CD IS '発注単位ＣＤ // #MA.UNIT_CD // PO unit cd.';


COMMENT ON COLUMN MAM_ITM_COM.PCKG_UNIT_CD IS '梱包単位ＣＤ // #MA.UNIT_CD // Packing unit cd.';


COMMENT ON COLUMN MAM_ITM_COM.PACK_ALLOC_FLG IS '荷姿引当ＦＬＧ // #MA.FLG // SKU allocation flg.';


COMMENT ON COLUMN MAM_ITM_COM.LOT_MNG_TYP IS 'ロット管理区分 // #MA.LOT_MNG_TYP // Lot management type';


COMMENT ON COLUMN MAM_ITM_COM.LOT_NO_TYP IS 'ロットＮＯ発番区分 // #MA.LOT_NO_TYP // Lot No. numbering type';


COMMENT ON COLUMN MAM_ITM_COM.LOT_NO_PTN_CD IS 'ロットＮＯ発番パタンＣＤ // #MA.NUM_PTN_CD // Lot No. numbering pattern cd.';


COMMENT ON COLUMN MAM_ITM_COM.SUBLOT_MNG_TYP IS 'サブロット管理区分 // #MA.SUBLOT_MNG_TYP // Sublot management type';


COMMENT ON COLUMN MAM_ITM_COM.SUBLOT_NO_TYP IS 'サブロットＮＯ発番区分 // #MA.LOT_NO_TYP // Sublot No. numbering type';


COMMENT ON COLUMN MAM_ITM_COM.SUBLOT_NO_PTN_CD IS 'サブロットＮＯ発番パタンＣＤ // #MA.NUM_PTN_CD // Sublot No. numbering pattern cd.';


COMMENT ON COLUMN MAM_ITM_COM.BP_LOT_FLG IS '業者ロットＮＯ必須ＦＬＧ // #MA.FLG // Vendor Lot No. required flg.';


COMMENT ON COLUMN MAM_ITM_COM.INSP_BIND_TYP IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN MAM_ITM_COM.SKIP_CHK_SHIP_FLG IS '出荷時構成チェック不要ＦＬＧ // #MA.FLG // Component check not required at shipping flg.';


COMMENT ON COLUMN MAM_ITM_COM.MRKT_JUDG_FLG IS '市場出荷判定対象ＦＬＧ // #MA.FLG // For market release decision flg.';


COMMENT ON COLUMN MAM_ITM_COM.MRKT_JUDG_ROLE_CD IS '市場出荷判定承認役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision approval role cd.';


COMMENT ON COLUMN MAM_ITM_COM.MRKT_JUDG_UPD_ROLE_CD IS '市場出荷判定更新役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision update role cd.';


COMMENT ON COLUMN MAM_ITM_COM.LMT_CTL_FLG IS '期限管理対象ＦＬＧ // #MA.FLG // For expiration management flg.';


COMMENT ON COLUMN MAM_ITM_COM.LMT_CTL_CATEG IS '期限管理種別 // #MA.LMT_CTL_CATEG // Expiration management type';


COMMENT ON COLUMN MAM_ITM_COM.CONT_FCTR_FLG IS '有効成分対象ＦＬＧ // #MA.FLG // For active ingredient flg.';


COMMENT ON COLUMN MAM_ITM_COM.STD_CONT_FCTR IS '標準有効成分係数 // #MA.STD_CONT_FCTR // Standard active ingredient coefficient';


COMMENT ON COLUMN MAM_ITM_COM.CONT_FCTR_UNIT_CD IS '有効成分単位ＣＤ // #MA.UNIT_CD // Active ingredient unit cd.';


COMMENT ON COLUMN MAM_ITM_COM.CONT_FCTR_RND_TYP IS '有効成分換算端数処理区分 // #MA.RND_TYP // Rounding type (Active ingredient conversion)';


COMMENT ON COLUMN MAM_ITM_COM.CONT_FCTR_DEC_PLACE IS '有効成分小数部有効桁数 // #MA.DEC_PLACE // Active ingredient number of decimal places';


COMMENT ON COLUMN MAM_ITM_COM.SNO1_MNG_TYP IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN MAM_ITM_COM.SLO_SNO1_FLG IS '受注手配ＮＯ１必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 1 required flg.';


COMMENT ON COLUMN MAM_ITM_COM.RQMT_SNO1_FLG IS '所要手配ＮＯ１必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 1 required flg.';


COMMENT ON COLUMN MAM_ITM_COM.SNO1_NUM_TYP IS '手配ＮＯ１発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 1 numbering type';


COMMENT ON COLUMN MAM_ITM_COM.SNO1_PTN_CD IS '手配ＮＯ１発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 1 numbering pattern cd.';


COMMENT ON COLUMN MAM_ITM_COM.SNO2_MNG_TYP IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN MAM_ITM_COM.SLO_SNO2_FLG IS '受注手配ＮＯ２必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 2 required flg.';


COMMENT ON COLUMN MAM_ITM_COM.RQMT_SNO2_FLG IS '所要手配ＮＯ２必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 2 required flg.';


COMMENT ON COLUMN MAM_ITM_COM.SNO2_NUM_TYP IS '手配ＮＯ２発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 2 numbering type';


COMMENT ON COLUMN MAM_ITM_COM.SNO2_PTN_CD IS '手配ＮＯ２発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 2 numbering pattern cd.';


COMMENT ON COLUMN MAM_ITM_COM.SNO3_MNG_TYP IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN MAM_ITM_COM.SLO_SNO3_FLG IS '受注手配ＮＯ３必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 3 required flg.';


COMMENT ON COLUMN MAM_ITM_COM.RQMT_SNO3_FLG IS '所要手配ＮＯ３必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 3 required flg.';


COMMENT ON COLUMN MAM_ITM_COM.SNO3_NUM_TYP IS '手配ＮＯ３発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 3 numbering type';


COMMENT ON COLUMN MAM_ITM_COM.SNO3_PTN_CD IS '手配ＮＯ３発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 3 numbering pattern cd.';


COMMENT ON COLUMN MAM_ITM_COM.SNO4_MNG_TYP IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN MAM_ITM_COM.SLO_SNO4_FLG IS '受注手配ＮＯ４必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 4 required flg.';


COMMENT ON COLUMN MAM_ITM_COM.RQMT_SNO4_FLG IS '所要手配ＮＯ４必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 4 required flg.';


COMMENT ON COLUMN MAM_ITM_COM.SNO4_NUM_TYP IS '手配ＮＯ４発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 4 numbering type';


COMMENT ON COLUMN MAM_ITM_COM.SNO4_PTN_CD IS '手配ＮＯ４発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 4 numbering pattern cd.';


COMMENT ON COLUMN MAM_ITM_COM.DEF_BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MAM_ITM_COM.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MAM_ITM_COM.MRP_PROC_TYP IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN MAM_ITM_COM.RQMT_TYP IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN MAM_ITM_COM.PROD_PLN_TYP IS '生産計画立案区分 // #MA.PROD_PLN_TYP // Production planning type';


COMMENT ON COLUMN MAM_ITM_COM.DMND_DATE_DIV_MONS IS '需要日ばらし月数 // #MA.MONS // Number of months for demand disaggregation by day';


COMMENT ON COLUMN MAM_ITM_COM.ALLOC_MARGIN_DAYS IS '引当余裕日数 // #MA.DAYS // Allocation extra days';


COMMENT ON COLUMN MAM_ITM_COM.MRP_ALLOC_MARGIN_DAYS IS 'ＭＲＰ引当余裕日数 // #MA.DAYS // MRP allocation extra days';


COMMENT ON COLUMN MAM_ITM_COM.MRP_OPN_XFR_DAYS IS 'ＭＲＰ未確定移送依頼考慮日数 // #MA.DAYS // Days to consider unfirm transport request in MRP';


COMMENT ON COLUMN MAM_ITM_COM.RQMT_RSTR_QTY IS '所要抑制量 // #MA.QTY // Requirements restricted qty.';


COMMENT ON COLUMN MAM_ITM_COM.INPT_ITM_ADD_FLG IS '投入品追加許可ＦＬＧ // #MA.FLG // Allow input item addition flg.';


COMMENT ON COLUMN MAM_ITM_COM.INPT_ITM_DEL_FLG IS '投入品削除許可ＦＬＧ // #MA.FLG // Allow input item deletion flg.';


COMMENT ON COLUMN MAM_ITM_COM.SCH_FLG IS 'スケジューラＦＬＧ // #MA.FLG // Scheduler flg.';


COMMENT ON COLUMN MAM_ITM_COM.CNTRY_ORG_CD IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN MAM_ITM_COM.COMP_SPEC_TYP IS '構成・仕様管理区分 // #MA.COMP_SPEC_TYP // Configuration/specification management type';


COMMENT ON COLUMN MAM_ITM_COM.COMP_REV_AT_SLO_FLG IS '受注時構成改訂許可ＦＬＧ // #MA.FLG // Allow sales order configuration rev. flg.';


COMMENT ON COLUMN MAM_ITM_COM.COMP_CORE_ITM_FLG IS '構成主品目ＦＬＧ // #MA.FLG // Configuration main item flg.';


COMMENT ON COLUMN MAM_ITM_COM.ITM_SPEC_GRP_CD IS '品目仕様分類ＣＤ // #MA.ITM_SPEC_GRP_CD // Item specification classification cd.';


COMMENT ON COLUMN MAM_ITM_COM.SLS_UPRI_GRP_CD IS '販売単価分類ＣＤ // #MA.SLS_UPRI_GRP_CD // Sales unit price classification cd.';


COMMENT ON COLUMN MAM_ITM_COM.BILL_CRRYOVR_TIMES IS '請求繰越回数 // #MA.CRRYOVR_TIMES // Billing carry-over count';


COMMENT ON COLUMN MAM_ITM_COM.PAY_CRRYOVR_TIMES IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN MAM_ITM_COM.SLO_PROC_FLG IS '受注手配品ＦＬＧ // #MA.FLG // Sales order procurement item flg.';


COMMENT ON COLUMN MAM_ITM_COM.SLO_PROC_TYP IS '受注手配区分 // #MA.SLO_PROC_TYP // Sales order procurement type';


COMMENT ON COLUMN MAM_ITM_COM.SHIP_INST_TYP IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN MAM_ITM_COM.SHIP_LOT_BACK_STOP_FLG IS '出荷ロット逆転禁止ＦＬＧ // #MA.FLG // Shipping lot reverse prohibit flg.';


COMMENT ON COLUMN MAM_ITM_COM.ITM_SHIP_GRP_CD IS '品目出荷グループＣＤ // #MA.ITM_SHIP_GRP_CD // Item shipping group cd.';


COMMENT ON COLUMN MAM_ITM_COM.SHIP_VALID_GRP_CD IS '出荷有効期限グループＣＤ // #MA.SHIP_VALID_GRP_CD // Shipping expiration date group cd.';


COMMENT ON COLUMN MAM_ITM_COM.ARR_SKIP_FLG IS '入荷不要ＦＬＧ // #MA.FLG // Not receipt flg.';


COMMENT ON COLUMN MAM_ITM_COM.PURC_DLV_SLIP_FLG IS '購買納品書対象ＦＬＧ // #MA.FLG // Purchase delivery note target flg.';


COMMENT ON COLUMN MAM_ITM_COM.SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MAM_ITM_COM.EXIM_XPNS_TYP IS '輸出入諸掛区分 // #MA.EXIM_XPNS_TYP // Import/export charges type';


COMMENT ON COLUMN MAM_ITM_COM.STK_LST_FLG IS '現品票出力対象ＦＬＧ // #MA.FLG // For identification tag output flg.';


COMMENT ON COLUMN MAM_ITM_COM.VER_FLG IS '版管理対象ＦＬＧ // #MA.FLG // For version control flg.';


COMMENT ON COLUMN MAM_ITM_COM.SLS_UPRI_CNG_FLG IS '販売単価変更許可ＦＬＧ // #MA.FLG // Allow sales unit price change flg.';


COMMENT ON COLUMN MAM_ITM_COM.PURC_UPRI_CNG_FLG IS '購買単価変更許可ＦＬＧ // #MA.FLG // Allow purchasing unit price change flg.';


COMMENT ON COLUMN MAM_ITM_COM.PROV_UPRI_CNG_FLG IS '支給単価変更許可ＦＬＧ // #MA.FLG // Allow supply unit price change flg.';


COMMENT ON COLUMN MAM_ITM_COM.REF_ITM_CD IS '参照品目ＣＤ // #MA.ITM_CD // Reference item cd.';


COMMENT ON COLUMN MAM_ITM_COM.REF_ITM_SUB1 IS '参照枝番１ // #MA.ITM_SUB1 // Reference branch No. 1';


COMMENT ON COLUMN MAM_ITM_COM.REF_ITM_SUB2 IS '参照枝番２ // #MA.ITM_SUB2 // Reference branch No. 2';


COMMENT ON COLUMN MAM_ITM_COM.REF_ITM_SUB3 IS '参照枝番３ // #MA.ITM_SUB3 // Reference branch No. 3';


COMMENT ON COLUMN MAM_ITM_COM.EXT_SYS_NO_ITM IS '外部システムＮＯ // #MA.EXT_SYS_NO_ITM // External system No.';


COMMENT ON COLUMN MAM_ITM_COM.CHNG_NO IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN MAM_ITM_COM.CALC_PTN_CD IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';


COMMENT ON COLUMN MAM_ITM_COM.COST_STD_QTY IS '原価基準数量 // #MA.QTY // Cost base qty.';


COMMENT ON COLUMN MAM_ITM_COM.ITM_ALC_GRP IS '品目配賦グループ // #MA.ITM_ALC_GRP // Item allocation group';


COMMENT ON COLUMN MAM_ITM_COM.SLS_FLG IS '販売ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN MAM_ITM_COM.MFG_FLG IS '製造ＦＬＧ // #MA.FLG // Mfg. flg.';


COMMENT ON COLUMN MAM_ITM_COM.PURC_FLG IS '購買ＦＬＧ // #MA.FLG // Purchasing flg.';


COMMENT ON COLUMN MAM_ITM_COM.INSP_FLG IS '検査ＦＬＧ // #MA.FLG // Inspection flg.';


COMMENT ON COLUMN MAM_ITM_COM.SLS_INPUT_FLG IS '販売設定済ＦＬＧ // #MA.FLG // Sales configured flg.';


COMMENT ON COLUMN MAM_ITM_COM.MFG_INPUT_FLG IS '製造設定済ＦＬＧ // #MA.FLG // Mfg. configured flg.';


COMMENT ON COLUMN MAM_ITM_COM.PURC_INPUT_FLG IS '購買設定済ＦＬＧ // #MA.FLG // Purchase configured flg.';


COMMENT ON COLUMN MAM_ITM_COM.INSP_INPUT_FLG IS '検査設定済ＦＬＧ // #MA.FLG // Inspection configured flg.';


COMMENT ON COLUMN MAM_ITM_COM.RELEASE_FLG IS 'リリースＦＬＧ // #MA.FLG // Release flg.';


COMMENT ON COLUMN MAM_ITM_COM.RELEASE_USR_CD IS 'リリース担当者ＣＤ // #MA.USR_CD // Release PIC name cd.';


COMMENT ON COLUMN MAM_ITM_COM.RELEASE_TM IS 'リリース日時 // #MA.TM // Release date and time';


COMMENT ON COLUMN MAM_ITM_COM.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_ITM_COM.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_ITM_COM.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_ITM_COM.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_ITM_COM.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_ITM_COM.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_ITM_COM.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_ITM_COM.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_ITM_COM.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_ITM_COM.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_ITM_COM.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_ITM_COM.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_ITM_COM.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_ITM_COM.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_ITM_COM.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_ITM_COM.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_ITM_COM.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

