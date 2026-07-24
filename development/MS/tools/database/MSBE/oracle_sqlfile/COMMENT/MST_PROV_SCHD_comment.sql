
COMMENT ON TABLE MST_PROV_SCHD IS '支給予定 // Supply schedule';


COMMENT ON COLUMN MST_PROV_SCHD.PROV_SCHD_NO IS '支給予定ＮＯ // #MA.PROV_SCHD_NO // Supply schedule No.';


COMMENT ON COLUMN MST_PROV_SCHD.PROV_SRC_SCHD_TYP IS '支給元予定区分 // #MS.PROV_SRC_SCHD_TYP // Supply-from schedule type';


COMMENT ON COLUMN MST_PROV_SCHD.PROV_SRC_SCHD_NO1 IS '支給元予定ＮＯ１ // #MA.PROV_SRC_SCHD_NO // Supply-from schedule No. 1';


COMMENT ON COLUMN MST_PROV_SCHD.PROV_SRC_SCHD_NO2 IS '支給元予定ＮＯ２ // #MA.PROV_SRC_SCHD_NO // Supply-from schedule No. 2';


COMMENT ON COLUMN MST_PROV_SCHD.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_PROV_SCHD.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_PROV_SCHD.XFR_RSN_CD IS '移送理由ＣＤ // #MA.BIZ_RSN_CD // Transport reason cd.';


COMMENT ON COLUMN MST_PROV_SCHD.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_PROV_SCHD.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_PROV_SCHD.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MST_PROV_SCHD.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_PROV_SCHD.PRSPPL_CD IS '支給先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN MST_PROV_SCHD.PROV_TYP IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN MST_PROV_SCHD.PROV_BASIS_TYP IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN MST_PROV_SCHD.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_PROV_SCHD.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_PROV_SCHD.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_PROV_SCHD.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_PROV_SCHD.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_PROV_SCHD.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_PROV_SCHD.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_PROV_SCHD.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_PROV_SCHD.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PROV_SCHD.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PROV_SCHD.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_PROV_SCHD.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_PROV_SCHD.INTR_RMRKS IS '内部備考 // #MS.PROV_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PROV_SCHD.SUB_CHAR1 IS '予備１ // #MS.PROV_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PROV_SCHD.SUB_CHAR2 IS '予備２ // #MS.PROV_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PROV_SCHD.SUB_CHAR3 IS '予備３ // #MS.PROV_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PROV_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PROV_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PROV_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PROV_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PROV_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PROV_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PROV_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PROV_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PROV_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PROV_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

