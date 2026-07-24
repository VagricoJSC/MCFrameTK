
COMMENT ON TABLE MGT_ST_WIP_EXPNS IS '月初仕掛費目別原価 // Beginning cost by WIP cost element';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.ST_WIP_KEY IS '月初仕掛キー // #MG.ROW_NO // Beginning WIP key';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.WIP_AMT IS '自レベル金額 // #MA.MONEY // Own level amount';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.INPT_AMT IS '下位レベル金額 // #MA.MONEY // Lower level amount';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ST_WIP_EXPNS.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

