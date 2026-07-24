
COMMENT ON TABLE MSVT_MES_IF IS 'ＳＣＭ実績受信ＩＦ // SCM result import IF';


COMMENT ON COLUMN MSVT_MES_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MSVT_MES_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MSVT_MES_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MSVT_MES_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MSVT_MES_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_DATA_NO IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_DATA_LNO IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN MSVT_MES_IF.DATA_MAKE_DT IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN MSVT_MES_IF.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MSVT_MES_IF.RECV_DT IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MSVT_MES_IF.IF_PROC_TYP IS 'ＩＦ処理区分 // #MA.IF_PROC_TYP // IF process type';


COMMENT ON COLUMN MSVT_MES_IF.ACT_TM IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN MSVT_MES_IF.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MSVT_MES_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MSVT_MES_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MSVT_MES_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MSVT_MES_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MSVT_MES_IF.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MSVT_MES_IF.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MSVT_MES_IF.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MSVT_MES_IF.IF_ITM_NM IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN MSVT_MES_IF.MFG_ITM_CD IS '製造品目ＣＤ // #MA.ITM_CD // Mfg. item cd.';


COMMENT ON COLUMN MSVT_MES_IF.MFG_ITM_SUB1 IS '製造枝番１ // #MA.ITM_SUB1 // Mfg. branch No. 1';


COMMENT ON COLUMN MSVT_MES_IF.MFG_ITM_SUB2 IS '製造枝番２ // #MA.ITM_SUB2 // Mfg. branch No. 2';


COMMENT ON COLUMN MSVT_MES_IF.MFG_ITM_SUB3 IS '製造枝番３ // #MA.ITM_SUB3 // Mfg. branch No. 3';


COMMENT ON COLUMN MSVT_MES_IF.IF_MFG_ITM_CD IS 'ＩＦ製造品目ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. item cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_MFG_ITM_SUB1 IS 'ＩＦ製造枝番１ // #MA.ITM_SUB1 // IF mfg. branch No. 1';


COMMENT ON COLUMN MSVT_MES_IF.IF_MFG_ITM_SUB2 IS 'ＩＦ製造枝番２ // #MA.ITM_SUB2 // IF mfg. branch No. 2';


COMMENT ON COLUMN MSVT_MES_IF.IF_MFG_ITM_SUB3 IS 'ＩＦ製造枝番３ // #MA.ITM_SUB3 // IF mfg. branch No. 3';


COMMENT ON COLUMN MSVT_MES_IF.IF_MFG_ITM_NM IS 'ＩＦ製造品名 // #MA.IF_EXT_SYS_NM // IF mfg. item name';


COMMENT ON COLUMN MSVT_MES_IF.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MSVT_MES_IF.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MSVT_MES_IF.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MSVT_MES_IF.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MSVT_MES_IF.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MSVT_MES_IF.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MSVT_MES_IF.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_TRD_UNIT_CD IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_TRD_UNIT_NM IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN MSVT_MES_IF.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MSVT_MES_IF.ENT_UNIT_CD IS '入力単位ＣＤ // #MA.UNIT_CD // Input unit cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ENT_UNIT_CD IS 'ＩＦ入力単位ＣＤ // #MA.IF_EXT_SYS_CD // IF input unit cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ENT_UNIT_NM IS 'ＩＦ入力単位名 // #MA.IF_EXT_SYS_NM // IF input unit name';


COMMENT ON COLUMN MSVT_MES_IF.ENT_UNIT_QTY IS '入力単位数量 // #MA.QTY // Input unit qty.';


COMMENT ON COLUMN MSVT_MES_IF.BASE_UNIT_INPT_QTY IS '基準単位投入数量 // #MA.QTY // Base unit input qty.';


COMMENT ON COLUMN MSVT_MES_IF.CONT_QTY IS '有効成分（投入数量） // #MA.QTY // Active ingredient (Input qty.)';


COMMENT ON COLUMN MSVT_MES_IF.ACXFR_QTY IS '他勘定振替数量 // #MA.QTY // Other accounting transfer qty.';


COMMENT ON COLUMN MSVT_MES_IF.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MSVT_MES_IF.SITE_CO_CD IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_SITE_CO_CD IS 'ＩＦ倉庫事業者ＣＤ // #MA.IF_EXT_SYS_CD // IF warehousing business cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_SITE_CO_NM IS 'ＩＦ倉庫事業者名 // #MA.IF_EXT_SYS_NM // IF warehousing business name';


COMMENT ON COLUMN MSVT_MES_IF.GI_LG_GRP_CD IS '出庫物流グループＣＤ // #MA.LG_GRP_CD // GI distribution group cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GI_LG_GRP_CD IS 'ＩＦ出庫物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF GI distribution group cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GI_LG_GRP_NM IS 'ＩＦ出庫物流グループ名 // #MA.IF_EXT_SYS_NM // IF GI distribution group name';


COMMENT ON COLUMN MSVT_MES_IF.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GI_LOC_CD IS 'ＩＦ出庫場所ＣＤ // #MA.IF_EXT_SYS_CD // IF GI location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GI_LOC_NM IS 'ＩＦ出庫場所名 // #MA.IF_EXT_SYS_NM // IF GI location name';


COMMENT ON COLUMN MSVT_MES_IF.GI_STR_LN_CD IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GI_STR_LN_CD IS 'ＩＦ出庫棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF GI rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GI_STR_LN_NM IS 'ＩＦ出庫棚・ライン名 // #MA.IF_EXT_SYS_NM // IF GI rack/line name';


COMMENT ON COLUMN MSVT_MES_IF.GR_LG_GRP_CD IS '入庫物流グループＣＤ // #MA.LG_GRP_CD // GR distribution group cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GR_LG_GRP_CD IS 'ＩＦ入庫物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF GR distribution group cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GR_LG_GRP_NM IS 'ＩＦ入庫物流グループ名 // #MA.IF_EXT_SYS_NM // IF GR distribution group name';


COMMENT ON COLUMN MSVT_MES_IF.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GR_LOC_CD IS 'ＩＦ入庫場所ＣＤ // #MA.IF_EXT_SYS_CD // IF GR location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GR_LOC_NM IS 'ＩＦ入庫場所名 // #MA.IF_EXT_SYS_NM // IF GR location name';


COMMENT ON COLUMN MSVT_MES_IF.GR_STR_LN_CD IS '入庫棚・ラインＣＤ // #MA.STR_LN_CD // GR rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GR_STR_LN_CD IS 'ＩＦ入庫棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF GR rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GR_STR_LN_NM IS 'ＩＦ入庫棚・ライン名 // #MA.IF_EXT_SYS_NM // IF GR rack/line name';


COMMENT ON COLUMN MSVT_MES_IF.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_MFG_LOC_CD IS 'ＩＦ製造場所ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_MFG_LOC_NM IS 'ＩＦ製造場所名 // #MA.IF_EXT_SYS_NM // IF mfg. location name';


COMMENT ON COLUMN MSVT_MES_IF.STRG_LOC_CD IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_STRG_LOC_CD IS 'ＩＦ格納場所ＣＤ // #MA.IF_EXT_SYS_CD // IF storage location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_STRG_LOC_NM IS 'ＩＦ格納場所名 // #MA.IF_EXT_SYS_NM // IF storage location name';


COMMENT ON COLUMN MSVT_MES_IF.STRG_STR_LN_CD IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_STRG_STR_LN_CD IS 'ＩＦ格納棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF storage rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_STRG_STR_LN_NM IS 'ＩＦ格納棚・ライン名 // #MA.IF_EXT_SYS_NM // IF storage rack/line name';


COMMENT ON COLUMN MSVT_MES_IF.INPT_LOC_CD IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_INPT_LOC_CD IS 'ＩＦ投入場所ＣＤ // #MA.IF_EXT_SYS_CD // IF input location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_INPT_LOC_NM IS 'ＩＦ投入場所名 // #MA.IF_EXT_SYS_NM // IF input location name';


COMMENT ON COLUMN MSVT_MES_IF.INPT_STR_LN_CD IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_INPT_STR_LN_CD IS 'ＩＦ投入棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF input rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_INPT_STR_LN_NM IS 'ＩＦ投入棚・ライン名 // #MA.IF_EXT_SYS_NM // IF input rack/line name';


COMMENT ON COLUMN MSVT_MES_IF.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_OPER_CD IS 'ＩＦ工程ＣＤ // #MA.IF_EXT_SYS_CD // IF operation cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_OPER_NM IS 'ＩＦ工程名 // #MA.IF_EXT_SYS_NM // IF operation name';


COMMENT ON COLUMN MSVT_MES_IF.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MSVT_MES_IF.ACT_DPT_CD IS '実績部門ＣＤ // #MA.DPT_CD // Result dept. cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACT_DPT_CD IS 'ＩＦ実績部門ＣＤ // #MA.IF_EXT_SYS_CD // IF result dept. cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACT_DPT_NM IS 'ＩＦ実績部門名 // #MA.IF_EXT_SYS_NM // IF result dept. name';


COMMENT ON COLUMN MSVT_MES_IF.ACT_USR_CD IS '実績担当者ＣＤ // #MA.USR_CD // Result PIC cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACT_USR_CD IS 'ＩＦ実績担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF PIC of result cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACT_USR_NM IS 'ＩＦ実績担当者名 // #MA.IF_EXT_SYS_NM // IF PIC of result name';


COMMENT ON COLUMN MSVT_MES_IF.WK_DAY_CD IS '勤務種類ＣＤ // #MA.WK_DAY_CD // Work type cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_WK_DAY_CD IS 'ＩＦ勤務種類ＣＤ // #MA.IF_EXT_SYS_CD // IF work classification cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_WK_DAY_NM IS 'ＩＦ勤務種類名 // #MA.IF_EXT_SYS_NM // IF work classification type name';


COMMENT ON COLUMN MSVT_MES_IF.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GD_CD IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_GD_NM IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN MSVT_MES_IF.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MSVT_MES_IF.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MSVT_MES_IF.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MSVT_MES_IF.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_STK_BP_CD IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_STK_BP_NM IS 'ＩＦ在庫取引先名 // #MA.IF_EXT_SYS_NM // IF inventory BP name';


COMMENT ON COLUMN MSVT_MES_IF.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_STK_ARRV_BP_CD IS 'ＩＦ在庫着荷先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_STK_ARRV_BP_NM IS 'ＩＦ在庫着荷先名 // #MA.IF_EXT_SYS_NM // IF inventory arriving point name';


COMMENT ON COLUMN MSVT_MES_IF.YIELD_RSN_CD IS '出来高理由ＣＤ // #MA.BIZ_RSN_CD // Output reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_YIELD_RSN_CD IS 'ＩＦ出来高理由ＣＤ // #MA.IF_EXT_SYS_CD // IF output reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_YIELD_RSN_NM IS 'ＩＦ出来高理由名 // #MA.IF_EXT_SYS_NM // IF output reason name';


COMMENT ON COLUMN MSVT_MES_IF.ACXFR_RSN_CD IS '他勘定振替理由ＣＤ // #MA.BIZ_RSN_CD // Other accounting transfer reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_RSN_CD IS 'ＩＦ他勘定振替理由ＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_RSN_NM IS 'ＩＦ他勘定振替理由名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer reason name';


COMMENT ON COLUMN MSVT_MES_IF.INPT_RSN_CD IS '投入理由ＣＤ // #MA.BIZ_RSN_CD // Input reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_INPT_RSN_CD IS 'ＩＦ投入理由ＣＤ // #MA.IF_EXT_SYS_CD // IF input reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_INPT_RSN_NM IS 'ＩＦ投入理由名 // #MA.IF_EXT_SYS_NM // IF input reason name';


COMMENT ON COLUMN MSVT_MES_IF.LOSS_RSN_CD IS 'ロス理由ＣＤ // #MA.BIZ_RSN_CD // Loss reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_LOSS_RSN_CD IS 'ＩＦロス理由ＣＤ // #MA.IF_EXT_SYS_CD // IF loss reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_LOSS_RSN_NM IS 'ＩＦロス理由名 // #MA.IF_EXT_SYS_NM // IF loss reason name';


COMMENT ON COLUMN MSVT_MES_IF.OLD_LOSS_RSN_CD IS '変更前ロス理由ＣＤ // #MA.BIZ_RSN_CD // Loss reason cd. before change';


COMMENT ON COLUMN MSVT_MES_IF.IF_OLD_LOSS_RSN_CD IS 'ＩＦ変更前ロス理由ＣＤ // #MA.IF_EXT_SYS_CD // IF loss reason before change cd.';


COMMENT ON COLUMN MSVT_MES_IF.WK_RSN_CD IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_WK_RSN_CD IS 'ＩＦ工数理由ＣＤ // #MA.IF_EXT_SYS_CD // IF man-hour reason cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_WK_RSN_NM IS 'ＩＦ工数理由名 // #MA.IF_EXT_SYS_NM // IF man-hour reason name';


COMMENT ON COLUMN MSVT_MES_IF.ACXFR_BD_DPT_CD IS '他勘定振替負担部門ＣＤ // #MA.DPT_CD // Other accounting transfer charged dept. cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_BD_DPT_CD IS 'ＩＦ他勘定振替負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer charged dept. cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_BD_DPT_NM IS 'ＩＦ他勘定振替負担部門名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer charged dept. name';


COMMENT ON COLUMN MSVT_MES_IF.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MSVT_MES_IF.BP_DLV_SLIP_NO IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN MSVT_MES_IF.BP_DLV_SLIP_D_NO IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN MSVT_MES_IF.SHIP_FR_VALID_DT IS '出荷元期限 // #MA.DT // Shipping point deadline';


COMMENT ON COLUMN MSVT_MES_IF.WK_COST_CD IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_WK_COST_CD IS 'ＩＦ工数管理ＣＤ // #MA.IF_EXT_SYS_CD // IF work element cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_WK_COST_NM IS 'ＩＦ工数管理名 // #MA.IF_EXT_SYS_NM // IF work element name';


COMMENT ON COLUMN MSVT_MES_IF.ST_ACT_TM IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN MSVT_MES_IF.END_ACT_TM IS '終了実績日時 // #MA.TM // Actual end date and time';


COMMENT ON COLUMN MSVT_MES_IF.OPER_UNIT_QTY IS '工程単位実績数量 // #MA.QTY // Operation unit result qty.';


COMMENT ON COLUMN MSVT_MES_IF.BKF_CTL_FLG IS 'バックフラッシュ更新許可ＦＬＧ // #MA.FLG // Allow backflush update flg.';


COMMENT ON COLUMN MSVT_MES_IF.WK_COST_CALC_CTL_FLG IS '自動工数計算更新許可ＦＬＧ // #MA.FLG // Auto man-hour calculation update permission flg.';


COMMENT ON COLUMN MSVT_MES_IF.OPER_YIELD IS '工程実際収率 // #MA.YIELD // Operation actual yield';


COMMENT ON COLUMN MSVT_MES_IF.NOT_CMPL_FLG IS '未完了ＦＬＧ // #MA.FLG // Uncompleted flg.';


COMMENT ON COLUMN MSVT_MES_IF.YIELD_TYP IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN MSVT_MES_IF.YIELD_RATE IS '出来高進捗度 // #MA.RATE // Output progress';


COMMENT ON COLUMN MSVT_MES_IF.ITM_YIELD IS '品目実際収率 // #MA.YIELD // Item actual yield';


COMMENT ON COLUMN MSVT_MES_IF.ALL_OPER_ACT_REG_FLG IS '全工程実績作成ＦＬＧ // #MA.FLG // All operation results creation flg.';


COMMENT ON COLUMN MSVT_MES_IF.SAME_LOT_FLG IS '同一ロットＦＬＧ // #MA.FLG // Same lot flg.';


COMMENT ON COLUMN MSVT_MES_IF.NOT_PD_CHK_FLG IS '期限チェックしないＦＬＧ // #MA.FLG // No expiration check flg.';


COMMENT ON COLUMN MSVT_MES_IF.IF_INPT_TYP IS 'ＩＦ投入区分 // #MS.IF_INPT_TYP // IF input type';


COMMENT ON COLUMN MSVT_MES_IF.WK_COST IS '工数 // #MA.WK_COST_QTY // Man-hour';


COMMENT ON COLUMN MSVT_MES_IF.ST_HM IS '着手時刻 // #MA.TM // Start time';


COMMENT ON COLUMN MSVT_MES_IF.END_HM IS '終了時刻 // #MA.TM // End time';


COMMENT ON COLUMN MSVT_MES_IF.BRK_PD IS '中断時間 // #MA.INT4 // Downtime';


COMMENT ON COLUMN MSVT_MES_IF.WK_COST_CALC_UPD_FLG IS '自動工数計算更新許可ＦＬＧ // #MA.FLG // Auto man-hour calculation update permission flg.';


COMMENT ON COLUMN MSVT_MES_IF.ARR_CNT_RMRKS IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN MSVT_MES_IF.INSP_CNT_RMRKS IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN MSVT_MES_IF.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MSVT_MES_IF.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MSVT_MES_IF.INTR_RMRKS IS '内部備考 // #MS.IF_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MSVT_MES_IF.INTR_D_RMRKS IS '内部明細備考 // #MS.IF_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN MSVT_MES_IF.MFG_ACT_INTR_RMRKS IS '内部備考（製造） // #MS.MFG_ACT_INTR_RMRKS // Internal remarks (Mfg.)';


COMMENT ON COLUMN MSVT_MES_IF.RPT_RMRKS IS '記録書備考 // #MS.IF_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN MSVT_MES_IF.MFG_ACT_RPT_RMRKS IS '記録書備考（製造） // #MS.MFG_ACT_RPT_RMRKS // Record sheet remarks (Mfg.)';


COMMENT ON COLUMN MSVT_MES_IF.SHIP_INST_NO IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN MSVT_MES_IF.SHIP_INST_D_NO IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN MSVT_MES_IF.SHIP_ALLOC_STS_NO IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN MSVT_MES_IF.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MSVT_MES_IF.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MSVT_MES_IF.ARR_SCHD_NO IS '入荷予定ＮＯ // #MA.ARR_SCHD_NO // Receipt schedule No.';


COMMENT ON COLUMN MSVT_MES_IF.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MSVT_MES_IF.PRMS_RCPT_D_NO IS '納期回答受領明細ＮＯ // #MA.PRMS_RCPT_D_NO // Order promising result received details No.';


COMMENT ON COLUMN MSVT_MES_IF.DLV_INST_D_NO IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN MSVT_MES_IF.SLS_RET_SCHD_D_NO IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN MSVT_MES_IF.IV_D_NO IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN MSVT_MES_IF.XFR_INST_NO IS '移動指図ＮＯ // #MA.XFR_INST_NO // Movement order No.';


COMMENT ON COLUMN MSVT_MES_IF.XFR_ALLOC_STS_NO IS '移動引当状況ＮＯ // #MA.XFR_ALLOC_STS_NO // Movement allocation status No.';


COMMENT ON COLUMN MSVT_MES_IF.YIELD_SCHD_NO IS '出来高予定ＮＯ // #MA.YIELD_INST_NO // Output schedule No.';


COMMENT ON COLUMN MSVT_MES_IF.INPT_SCHD_NO IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN MSVT_MES_IF.WK_SCHD_NO IS '工数予定ＮＯ // #MA.WK_SCHD_NO // Man-hour schedule No.';


COMMENT ON COLUMN MSVT_MES_IF.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MSVT_MES_IF.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MSVT_MES_IF.MFG_INST_REV IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN MSVT_MES_IF.EXT_SHIP_ACT_NO IS '外部出荷実績ＮＯ // #MA.EXT_SHIP_ACT_NO // External shipping result No.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_ARR_ACT_NO IS '外部入荷実績ＮＯ // #MA.EXT_ARR_ACT_NO // External receipt result No.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_XFR_ACT_NO IS '外部移動実績ＮＯ // #MA.EXT_XFR_ACT_NO // External movement result No.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_OPER_ACT_NO IS '外部工程実績ＮＯ // #MA.EXT_OPER_ACT_NO // External operation result No.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_YIELD_ACT_NO IS '外部出来高実績ＮＯ // #MA.EXT_YIELD_ACT_NO // External output result No.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_INPT_ACT_NO IS '外部投入実績ＮＯ // #MA.EXT_INPT_ACT_NO // External input result No.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_WK_ACT_NO IS '外部工数実績ＮＯ // #MA.EXT_WK_ACT_NO // External man-hour result No.';


COMMENT ON COLUMN MSVT_MES_IF.REQ_NO IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MSVT_MES_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MSVT_MES_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MSVT_MES_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MSVT_MES_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MSVT_MES_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MSVT_MES_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MSVT_MES_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MSVT_MES_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MSVT_MES_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MSVT_MES_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MSVT_MES_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MSVT_MES_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MSVT_MES_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MSVT_MES_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MSVT_MES_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MSVT_MES_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MSVT_MES_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MSVT_MES_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MSVT_MES_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MSVT_MES_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MSVT_MES_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MSVT_MES_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MSVT_MES_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MSVT_MES_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MSVT_MES_IF.ACXFR_LG_GRP_CD IS '他勘定振替物流グループＣＤ // #MA.LG_GRP_CD // Other accounting transfer distribution group cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_LG_GRP_CD IS 'ＩＦ他勘定振替物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer distribution group cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_LG_GRP_NM IS 'ＩＦ他勘定振替物流グループ名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer distribution group name';


COMMENT ON COLUMN MSVT_MES_IF.ACXFR_LOC_CD IS '他勘定振替場所ＣＤ // #MA.LOC_CD // Other accounting transfer location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_LOC_CD IS 'ＩＦ他勘定振替場所ＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer location cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_LOC_NM IS 'ＩＦ他勘定振替場所名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer location name';


COMMENT ON COLUMN MSVT_MES_IF.ACXFR_STR_LN_CD IS '他勘定振替棚・ラインＣＤ // #MA.STR_LN_CD // Other accounting transfer rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_STR_LN_CD IS 'ＩＦ他勘定振替棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer rack/line cd.';


COMMENT ON COLUMN MSVT_MES_IF.IF_ACXFR_STR_LN_NM IS 'ＩＦ他勘定振替棚・ライン名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer rack/line name';


COMMENT ON COLUMN MSVT_MES_IF.ACXFR_INST_NO IS '他勘定振替指図ＮＯ // #MA.ACXFR_INST_NO // Other accounting transfer order No.';


COMMENT ON COLUMN MSVT_MES_IF.ACXFR_INST_D_NO IS '他勘定振替指図明細ＮＯ // #MA.ACXFR_INST_D_NO // Other accounting transfer order details No.';


COMMENT ON COLUMN MSVT_MES_IF.EXT_ACXFR_ACT_NO IS '外部他勘定振替実績ＮＯ // #MA.EXT_ACXFR_ACT_NO // External other accounting transfer result No.';

