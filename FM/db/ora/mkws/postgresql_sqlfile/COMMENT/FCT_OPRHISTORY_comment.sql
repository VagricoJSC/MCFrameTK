\encoding UTF-8

COMMENT ON TABLE fct_oprhistory IS '操作履歴 // Operation history';


COMMENT ON COLUMN fct_oprhistory.screen_id IS '画面ＩＤ // #FC.HST_SCREEN_ID // Screen ID';


COMMENT ON COLUMN fct_oprhistory.screen_name IS '画面名 // #FC.SCREEN_NAME // Screen name';


COMMENT ON COLUMN fct_oprhistory.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_oprhistory.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_oprhistory.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_oprhistory.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_oprhistory.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_oprhistory.operation_cd IS 'オペレーション区分 // #FC.OPERATION_CD // Operation type';


COMMENT ON COLUMN fct_oprhistory.button_name IS 'ボタン名 // #FC.BUTTON_NAME // Button name';


COMMENT ON COLUMN fct_oprhistory.button_label IS 'ボタン表示名称 // #FC.BUTTON_LABEL // Button display name';


COMMENT ON COLUMN fct_oprhistory.access_ts IS 'アクセス日時 // #FC.DT // Access date and time';


COMMENT ON COLUMN fct_oprhistory.action_id IS 'アクションＩＤ // #FC.ACTION_ID // Action ID';


COMMENT ON COLUMN fct_oprhistory.machine IS 'マシン名 // #FC.MACHINE // Machine name';


COMMENT ON COLUMN fct_oprhistory.note IS '備考 // #FC.HST_NOTE // Remarks';

