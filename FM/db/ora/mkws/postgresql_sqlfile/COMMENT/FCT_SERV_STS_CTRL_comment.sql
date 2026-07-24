\encoding UTF-8

COMMENT ON TABLE fct_serv_sts_ctrl IS 'サーバステータス制御 // Server status control';


COMMENT ON COLUMN fct_serv_sts_ctrl.tid IS 'サロゲートキー // #FC.ROW_ID // Surrogate key';


COMMENT ON COLUMN fct_serv_sts_ctrl.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_serv_sts_ctrl.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_serv_sts_ctrl.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_serv_sts_ctrl.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_serv_sts_ctrl.sid IS 'サーバステータスサロゲートキー // #FC.ROW_ID // Server status surrogate key';


COMMENT ON COLUMN fct_serv_sts_ctrl.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_serv_sts_ctrl.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_serv_sts_ctrl.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_serv_sts_ctrl.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_serv_sts_ctrl.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_serv_sts_ctrl.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_serv_sts_ctrl.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_serv_sts_ctrl.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_serv_sts_ctrl.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_serv_sts_ctrl.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

