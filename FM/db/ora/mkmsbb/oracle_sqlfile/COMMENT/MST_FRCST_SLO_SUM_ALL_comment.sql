
COMMENT ON TABLE MST_FRCST_SLO_SUM_ALL IS '顧客期間内示・受注集計 // Sales forecast/sales order aggregated';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.SPLN_ITM_CD IS '計画品目ＣＤ // #MA.SPLN_ITM_CD // Plan item cd.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.SLS_ITM_GRP_CD IS '品目体系ＣＤ // #MA.SLS_ITM_GRP_CD // Item system cd.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.BASE_UNIT_SLO_QTY IS '基準単位本受注数量 // #MA.QTY // Base unit official sales order qty.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.TRD_CUR_SLO_AMT IS '取引通貨本受注金額 // #MA.MONEY // Official sales amount (Transaction currency)';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.SLO_COST_AMT IS '本受注原価金額 // #MA.MONEY // Official sales order cost amount';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.BASE_UNIT_PRE_SLO_QTY IS '基準単位仮受注数量 // #MA.QTY // Base unit temporary sales order qty.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.TRD_CUR_PRE_SLO_AMT IS '取引通貨仮受注金額 // #MA.MONEY // Temporary sales order amount (Transaction currency)';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.PRE_SLO_COST_AMT IS '仮受注原価金額 // #MA.MONEY // Temporary sales order cost amount';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.CST_FRCST_QTY IS '基準単位顧客期間内示数量 // #MA.QTY // Base unit customer period forecast qty.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.TRD_CUR_CST_FRCST_AMT IS '取引通貨顧客期間内示金額 // #MA.MONEY // Customer period forecast amount (Transaction currency)';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.USR_CST_CD IS '得意先ＣＤ（入力） // #MA.BP_CD // Customer cd. (Input)';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.USR_WRK_NO IS '案件ＮＯ（入力） // #MA.WRK_NO // Sales project No. (Input)';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.SUM_CST_CD IS '得意先ＣＤ（集計） // #MA.BP_CD // Customer cd. (Aggregation)';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.SUM_WRK_NO IS '案件ＮＯ（集計） // #MA.WRK_NO // Sales project No. (Aggregated)';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_FRCST_SLO_SUM_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

