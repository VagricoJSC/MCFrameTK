
COMMENT ON TABLE MST_STD_INSP_INST_ALL IS '規格検査指図 // Specific inspection order';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.STD_INSP_INST_NO IS '規格検査指図ＮＯ // #MA.STD_INSP_INST_NO // Specific inspection order No.';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INSP_TYP IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INSP_NO IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INSP_FREQ IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INSP_SEQ IS '検査順序 // #MA.INSP_SEQ // Inspection sequence';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INSP_POINT_CD IS '検査項目ＣＤ // #MA.INSP_POINT_CD // Inspection checkpoint cd.';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INSP_QLQN_TYP IS '定性定量区分 // #MA.INSP_QLQN_TYP // Qualitative/quantitative type';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.QN_OUT_MIN IS '外規格下限値 // #MA.QN_INSP_VAL // Lower limit of external specification';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.QN_OUT_MAX IS '外規格上限値 // #MA.QN_INSP_VAL // Upper limit of external specification';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.SIGN_OUT_MIN_TYP IS '外規格下限符号区分 // #MA.SIGN_TYP // Sign type (Lower limit of external specification)';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.SIGN_OUT_MAX_TYP IS '外規格上限符号区分 // #MA.SIGN_TYP // Sign type (Upper limit of external specification)';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.QN_IN_MIN IS '内規格下限値 // #MA.QN_INSP_VAL // Lower limit of internal specification';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.QN_IN_MAX IS '内規格上限値 // #MA.QN_INSP_VAL // Upper limit of internal specification';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.SIGN_IN_MIN_TYP IS '内規格下限符号区分 // #MA.SIGN_TYP // Sign type (Lower limit of internal specification)';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.SIGN_IN_MAX_TYP IS '内規格上限符号区分 // #MA.SIGN_TYP // Sign type (Upper limit of internal specification)';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.QN_INT_DIGIT IS '定量値整数部桁数 // #MA.INT_DIGIT // Quantitative integer digits';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.QN_INT_FRAC IS '定量値小数部桁数 // #MA.DEC_PLACE // Quantitative decimal digits';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.QL_STD_VAL IS '定性規格値 // #MA.QL_STD_VAL // Qualitative specific value';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.ADD_POINT_FLG IS '追加項目ＦＬＧ // #MA.FLG // Additional column flg.';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INTR_RMRKS IS '内部備考 // #MS.STD_INSP_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.SUB_CHAR1 IS '予備１ // #MS.STD_INSP_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.SUB_CHAR2 IS '予備２ // #MS.STD_INSP_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.SUB_CHAR3 IS '予備３ // #MS.STD_INSP_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_STD_INSP_INST_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

