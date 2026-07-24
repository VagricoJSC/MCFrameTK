
COMMENT ON TABLE MGT_ST_STK_DIFF_ALL IS '月初在庫改定差異 // Beginning inventory revaluation variance';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.ST_STK_KEY IS '月初在庫キー // #MG.ROW_NO // Beginning inventory key';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.DIFF_AMT IS '改定差異 // #MA.MONEY // Revised variance';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.BF_AMT IS '改定前金額 // #MA.MONEY // Amount before revised';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.AF_AMT IS '改定後金額 // #MA.MONEY // Revised amount';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ST_STK_DIFF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

