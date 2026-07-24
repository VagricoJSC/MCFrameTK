
COMMENT ON TABLE MST_ACXFR_ACT_RECV_IF IS '他勘定振替実績受信ＩＦ // Other accounting transfer result import IF';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.EXT_DATA_NO IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.EXT_DATA_LNO IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.DATA_MAKE_DT IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.RECV_DT IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.EXT_ACXFR_ACT_NO IS '外部他勘定振替実績ＮＯ // #MA.EXT_ACXFR_ACT_NO // External other accounting transfer result No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_TRD_CD IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_TRD_NM IS 'ＩＦ取引名 // #MA.IF_EXT_SYS_NM // IF transaction name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.LG_GRP_CD IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_LG_GRP_CD IS 'ＩＦ物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF distribution group cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_LG_GRP_NM IS 'ＩＦ物流グループ名 // #MA.IF_EXT_SYS_NM // IF distribution group name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SITE_CO_CD IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_SITE_CO_CD IS 'ＩＦ倉庫事業者ＣＤ // #MA.IF_EXT_SYS_CD // IF warehousing business cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_SITE_CO_NM IS 'ＩＦ倉庫事業者名 // #MA.IF_EXT_SYS_NM // IF warehousing business name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_LOC_CD IS 'ＩＦ場所ＣＤ // #MA.IF_EXT_SYS_CD // IF location cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_LOC_NM IS 'ＩＦ場所名 // #MA.IF_EXT_SYS_NM // IF location name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ACXFR_INST_NO IS '他勘定振替指図ＮＯ // #MA.ACXFR_INST_NO // Other accounting transfer order No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ACXFR_INST_D_NO IS '他勘定振替指図明細ＮＯ // #MA.ACXFR_INST_D_NO // Other accounting transfer order details No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ACXFR_ACT_TM IS '他勘定振替実績日時 // #MA.TM // Actual other accounting transfer date and time';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ACT_DPT_CD IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ACT_DPT_CD IS 'ＩＦ実施部門ＣＤ // #MA.IF_EXT_SYS_CD // IF implementation dept.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ACT_DPT_NM IS 'ＩＦ実施部門名 // #MA.IF_EXT_SYS_NM // IF implementation dept. name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ACT_USR_CD IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ACT_USR_CD IS 'ＩＦ実施担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF PIC of implement cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ACT_USR_NM IS 'ＩＦ実施担当者名 // #MA.IF_EXT_SYS_NM // IF PIC of implement name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_ITM_NM IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_TRD_UNIT_CD IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_TRD_UNIT_NM IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_STR_LN_CD IS 'ＩＦ棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF rack/line cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_STR_LN_NM IS 'ＩＦ棚・ライン名 // #MA.IF_EXT_SYS_NM // IF rack/line name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_STK_ARRV_BP_CD IS 'ＩＦ在庫着荷先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_STK_ARRV_BP_NM IS 'ＩＦ在庫着荷先名 // #MA.IF_EXT_SYS_NM // IF inventory arriving point name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_GD_CD IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_GD_NM IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_STK_BP_CD IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_STK_BP_NM IS 'ＩＦ在庫取引先名 // #MA.IF_EXT_SYS_NM // IF inventory BP name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.FIX_NO_TYP IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.FIX_NO IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_RSN_CD IS 'ＩＦ理由ＣＤ // #MA.IF_EXT_SYS_CD // IF reason cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_RSN_NM IS 'ＩＦ理由名 // #MA.IF_EXT_SYS_NM // IF reason name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_DPT_CD IS 'ＩＦ負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF charged dept. cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_DPT_NM IS 'ＩＦ負担部門名 // #MA.IF_EXT_SYS_NM // IF charged dept. name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_LOC_CD IS 'ＩＦ負担場所ＣＤ // #MA.IF_EXT_SYS_CD // IF charged location cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_LOC_NM IS 'ＩＦ負担場所名 // #MA.IF_EXT_SYS_NM // IF charged location name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_CTG_CD IS 'ＩＦ負担品群ＣＤ // #MA.IF_EXT_SYS_CD // IF charged item category cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_CTG_NM IS 'ＩＦ負担品群名 // #MA.IF_EXT_SYS_NM // IF charged item category name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_OPER_CD IS 'ＩＦ負担工程ＣＤ // #MA.IF_EXT_SYS_CD // IF charged operation cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_OPER_NM IS 'ＩＦ負担工程名 // #MA.IF_EXT_SYS_NM // IF charged operation name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_BP_CD IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_BP_CD IS 'ＩＦ負担取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF charged BP cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_BP_NM IS 'ＩＦ負担取引先名 // #MA.IF_EXT_SYS_NM // IF charged BP name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_ITM_CD IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_ITM_SUB1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_ITM_SUB2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_ITM_SUB3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_ITM_CD IS 'ＩＦ負担品目ＣＤ // #MA.IF_EXT_SYS_CD // IF charged item cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_ITM_SUB1 IS 'ＩＦ負担枝番１ // #MA.ITM_SUB1 // IF charged branch No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_ITM_SUB2 IS 'ＩＦ負担枝番２ // #MA.ITM_SUB2 // IF charged branch No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_ITM_SUB3 IS 'ＩＦ負担枝番３ // #MA.ITM_SUB3 // IF charged branch No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_BD_ITM_NM IS 'ＩＦ負担品目名 // #MA.IF_EXT_SYS_NM // IF charged item name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.INTR_D_RMRKS IS '内部明細備考 // #MS.ACXFR_ACT_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.IF_CO_NM IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.REQ_NO IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ACXFR_ACT_RECV_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

