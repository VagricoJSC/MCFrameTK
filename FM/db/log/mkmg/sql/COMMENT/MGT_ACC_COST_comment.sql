
COMMENT ON TABLE MGT_ACC_COST IS '原価展開情報（原価計算結果） // Cost explosion info. (Calculation result)';


COMMENT ON COLUMN MGT_ACC_COST.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_ACC_COST.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_ACC_COST.INPT_REC_NO IS '投入レコードＮＯ // #MG.INPT_REC_NO // Input record No.';


COMMENT ON COLUMN MGT_ACC_COST.WK_REC_NO IS '工数レコードＮＯ // #MG.WK_REC_NO // Man-hour record No.';


COMMENT ON COLUMN MGT_ACC_COST.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGT_ACC_COST.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_ACC_COST.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGT_ACC_COST.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_ACC_COST.ACT_COST IS '実際原価 // #MA.MONEY // Actual cost';


COMMENT ON COLUMN MGT_ACC_COST.STD_COST IS '標準原価 // #MA.MONEY // Standard cost';


COMMENT ON COLUMN MGT_ACC_COST.SML_INPT_REC_NO IS '集計用投入レコードＮＯ // #MG.INPT_REC_NO // Input record No. for aggregation';


COMMENT ON COLUMN MGT_ACC_COST.TOP_REC_NO IS '最上位レコードＮＯ // #MG.TOP_REC_NO // Top record No.';


COMMENT ON COLUMN MGT_ACC_COST.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_ACC_COST.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGT_ACC_COST.OPER_COST_FLG IS '工程原価ＦＬＧ // #MA.FLG // Operation cost flg.';


COMMENT ON COLUMN MGT_ACC_COST.EXPNS_TYP IS '費目区分 // #MA.EXPNS_TYP // Cost element type';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_QTY IS '数量差異 // #MA.MONEY // Quantity variance';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_WK IS '工数差異 // #MA.MONEY // Time variance';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_UP IS '価格差異 // #MA.MONEY // Price variance';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_RT IS '配賦率差異 // #MA.MONEY // Allocation rate variance';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_STD IS '標準調整差異 // #MA.MONEY // Standard adjustment variance';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_A IS '差異１ // #MA.MONEY // Variance 1';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_B IS '差異２ // #MA.MONEY // Variance 2';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_C IS '差異３ // #MA.MONEY // Variance 3';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_D IS '差異４ // #MA.MONEY // Variance 4';


COMMENT ON COLUMN MGT_ACC_COST.DIFF_E IS '差異５ // #MA.MONEY // Variance 5';


COMMENT ON COLUMN MGT_ACC_COST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ACC_COST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ACC_COST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ACC_COST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ACC_COST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ACC_COST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ACC_COST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ACC_COST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ACC_COST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ACC_COST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

