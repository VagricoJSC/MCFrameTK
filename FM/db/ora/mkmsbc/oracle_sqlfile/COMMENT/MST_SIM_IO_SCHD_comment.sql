
COMMENT ON TABLE MST_SIM_IO_SCHD IS 'シミュレーション受払予定情報 // Simulation GR/GI schedule info.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SLIP_SCHD_NO IS '受払予定伝票ＮＯ // #MA.SLIP_SCHD_NO // GR/GI schedule slip No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_TYP IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_TYP IS '入出庫区分 // #MS.IO_TYP // GR/GI type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_STS_TYP IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_NO IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SEQ IS '受払予定連番 // #MA.INT3 // GR/GI schedule sequence number';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_TYP1 IS '受払予定予備区分１ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 1';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_NO1 IS '受払予定予備ＮＯ１ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 1';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_SEQ1 IS '受払予定予備連番１ // #MA.INT3 // GR/GI schedule spare sequence No. 1';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_TYP2 IS '受払予定予備区分２ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 2';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_NO2 IS '受払予定予備ＮＯ２ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 2';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_SEQ2 IS '受払予定予備連番２ // #MA.INT3 // GR/GI schedule spare sequence No. 2';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_TYP3 IS '受払予定予備区分３ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 3';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_NO3 IS '受払予定予備ＮＯ３ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 3';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_SEQ3 IS '受払予定予備連番３ // #MA.INT3 // GR/GI schedule spare sequence No. 3';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_TYP4 IS '受払予定予備区分４ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 4';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_NO4 IS '受払予定予備ＮＯ４ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 4';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_SUB_SEQ4 IS '受払予定予備連番４ // #MA.INT3 // GR/GI schedule spare sequence No. 4';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SCHD_DT IS '予定日付 // #MA.DT // Scheduled date';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MST_SIM_IO_SCHD.AVL_SCHD_DT IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_SIM_IO_SCHD.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALT_GRP_SEQ IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN MST_SIM_IO_SCHD.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.OPER_ORD_NO IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALT_QTY IS '代替元数量 // #MA.QTY // Alternative source qty.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALT_ALLOC_PRIO IS '代替品目引当優先順 // #MA.INT // Alternative item allocation order of priority';


COMMENT ON COLUMN MST_SIM_IO_SCHD.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SNO1_NULL_FLG IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SNO2_NULL_FLG IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SNO3_NULL_FLG IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SNO4_NULL_FLG IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.EX_SNO1 IS 'オーダ生成用手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1 for order generation';


COMMENT ON COLUMN MST_SIM_IO_SCHD.EX_SNO2 IS 'オーダ生成用手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2 for order generation';


COMMENT ON COLUMN MST_SIM_IO_SCHD.EX_SNO3 IS 'オーダ生成用手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3 for order generation';


COMMENT ON COLUMN MST_SIM_IO_SCHD.EX_SNO4 IS 'オーダ生成用手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4 for order generation';


COMMENT ON COLUMN MST_SIM_IO_SCHD.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.IN_XFR_TYP IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALLOC_TGT_FLG IS '引当対象ＦＬＧ // #MA.FLG // To allocate flg.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALLOC_SCOPE_TYP IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALLOC_FLG IS '場所引当ＦＬＧ // #MA.FLG // Location allocation flg.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ALLOC_WAIT_FLG IS '引当保留ＦＬＧ // #MA.FLG // Allocation pending flg.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.VLD_DT_FR IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN MST_SIM_IO_SCHD.VLD_DT_TO IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN MST_SIM_IO_SCHD.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MST_SIM_IO_SCHD.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.ORG_WG_CD IS '元ワーキンググループＣＤ // #MA.WG_CD // Original WG cd.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SIM_MRP_NO IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MS.IO_SCHD_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MS.IO_SCHD_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MS.IO_SCHD_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MS.IO_SCHD_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MS.IO_SCHD_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MS.IO_SCHD_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MS.IO_SCHD_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MS.IO_SCHD_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_SIM_IO_SCHD.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_SIM_IO_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SIM_IO_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SIM_IO_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SIM_IO_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SIM_IO_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SIM_IO_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SIM_IO_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SIM_IO_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SIM_IO_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SIM_IO_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

