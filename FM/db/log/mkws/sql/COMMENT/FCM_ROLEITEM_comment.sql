
COMMENT ON TABLE FCM_ROLEITEM IS 'ロール項目マスタ // Role target master';


COMMENT ON COLUMN FCM_ROLEITEM.IID IS '内部ロール項目ＩＤ // #FC.ROW_ID // Internal role target ID';


COMMENT ON COLUMN FCM_ROLEITEM.RID IS '内部ロールＩＤ // #FC.ROLE_ID // Internal role ID';


COMMENT ON COLUMN FCM_ROLEITEM.TYPE_CD IS '権限種類 // #FC.AC_TYP // Authority type';


COMMENT ON COLUMN FCM_ROLEITEM.ACTYPE IS '権限 // #FC.AC // Authority';


COMMENT ON COLUMN FCM_ROLEITEM.CHK_PW IS 'パスワードチェック // #FC.FLG // Password check';


COMMENT ON COLUMN FCM_ROLEITEM.CHK_ID IS 'ユーザＩＤチェック // #FC.FLG // User ID check';


COMMENT ON COLUMN FCM_ROLEITEM.INS_USR_ID IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN FCM_ROLEITEM.INS_USR_NM IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN FCM_ROLEITEM.INS_TS IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN FCM_ROLEITEM.INS_FUNC_ID IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN FCM_ROLEITEM.UPD_CNTR IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN FCM_ROLEITEM.UPD_USR_ID IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN FCM_ROLEITEM.UPD_USR_NM IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN FCM_ROLEITEM.UPD_TS IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN FCM_ROLEITEM.UPD_FUNC_ID IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN FCM_ROLEITEM.UPD_SRV_REQ_NO IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

