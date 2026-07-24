
COMMENT ON TABLE MSW_FRCST_SLO_SUM IS '顧客期間内示・受注集計ワーク // Sales forecast/sales order aggregation work';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.SPLN_ITM_CD IS '計画品目ＣＤ // #MA.SPLN_ITM_CD // Plan item cd.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.SLS_ITM_GRP_CD IS '品目体系ＣＤ // #MA.SLS_ITM_GRP_CD // Item system cd.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.BASE_UNIT_SLO_QTY IS '基準単位本受注数量 // #MA.QTY // Base unit official sales order qty.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.TRD_CUR_SLO_AMT IS '取引通貨本受注金額 // #MA.MONEY // Official sales amount (Transaction currency)';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.SLO_COST_AMT IS '本受注原価金額 // #MA.MONEY // Official sales order cost amount';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.BASE_UNIT_PRE_SLO_QTY IS '基準単位仮受注数量 // #MA.QTY // Base unit temporary sales order qty.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.TRD_CUR_PRE_SLO_AMT IS '取引通貨仮受注金額 // #MA.MONEY // Temporary sales order amount (Transaction currency)';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.PRE_SLO_COST_AMT IS '仮受注原価金額 // #MA.MONEY // Temporary sales order cost amount';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.CST_FRCST_QTY IS '基準単位顧客期間内示数量 // #MA.QTY // Base unit customer period forecast qty.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.TRD_CUR_CST_FRCST_AMT IS '取引通貨顧客期間内示金額 // #MA.MONEY // Customer period forecast amount (Transaction currency)';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.USR_CST_CD IS '得意先ＣＤ（入力） // #MA.BP_CD // Customer cd. (Input)';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.USR_WRK_NO IS '案件ＮＯ（入力） // #MA.WRK_NO // Sales project No. (Input)';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.SUM_CST_CD IS '得意先ＣＤ（集計） // #MA.BP_CD // Customer cd. (Aggregation)';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.SUM_WRK_NO IS '案件ＮＯ（集計） // #MA.WRK_NO // Sales project No. (Aggregated)';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.DT IS '日付 // #MA.DT // Date';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.UPRI_UNIT_CD IS '単価単位ＣＤ // #MA.UNIT_CD // Unit price unit cd.';


COMMENT ON COLUMN MSW_FRCST_SLO_SUM.LOT_QTY IS '単価ロット数量 // #MA.QTY // Unit price lot qty.';

