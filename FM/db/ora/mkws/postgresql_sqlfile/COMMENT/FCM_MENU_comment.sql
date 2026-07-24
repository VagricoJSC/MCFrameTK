\encoding UTF-8

COMMENT ON TABLE fcm_menu IS 'メニュー構成 // Menu structure';


COMMENT ON COLUMN fcm_menu.parent_menu_id IS '親メニューＩＤ // #FC.PARENT_MENU_ID // Parent menu ID';


COMMENT ON COLUMN fcm_menu.menu_id IS 'メニューＩＤ // #FC.MENU_ID // Menu ID';


COMMENT ON COLUMN fcm_menu.menu_order IS '並び順 // #FC.INT // Order';


COMMENT ON COLUMN fcm_menu.menu_type IS 'メニュー種別 // #FC.MENU_TYPE // Menu type';


COMMENT ON COLUMN fcm_menu.menu_title IS 'メニュータイトル // #FC.MENU_TITLE // Menu title';


COMMENT ON COLUMN fcm_menu.module_id IS 'モジュールＩＤ // #FC.MODULE_ID // Module ID';


COMMENT ON COLUMN fcm_menu.screen_id IS '画面ＩＤ // #FC.SCREEN_ID // Screen ID';


COMMENT ON COLUMN fcm_menu.screen_mode IS '画面モード // #FC.SCREEN_MODE // Screen mode';


COMMENT ON COLUMN fcm_menu.frame_type IS 'フレーム種別 // #FC.FRAME_TYPE // Frame type';


COMMENT ON COLUMN fcm_menu.per_grp_id IS 'パーソナライズグループＩＤ // #FC.RES_KEY // Personalization group ID';


COMMENT ON COLUMN fcm_menu.menu_class_id IS 'クラスＩＤ // #FC.MENU_CLASS_ID // Class ID';


COMMENT ON COLUMN fcm_menu.menu_classname IS 'クラス名 // #FC.MENU_CLASSNAME // Class name';


COMMENT ON COLUMN fcm_menu.menu_method IS 'メソッド名 // #FC.MENU_METHOD // Method name';


COMMENT ON COLUMN fcm_menu.accesskey IS 'アクセスキー // #FC.ACCESSKEY // Access key';


COMMENT ON COLUMN fcm_menu.shortcutkey IS 'ショートカットキー // #FC.SHORTCUTKEY // Shortcut key';


COMMENT ON COLUMN fcm_menu.maskkey IS 'マスクキー // #FC.MASKKEY // Mask key';


COMMENT ON COLUMN fcm_menu.ac IS 'アクセスコントロール // #FC.AC // Access control';


COMMENT ON COLUMN fcm_menu.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fcm_menu.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fcm_menu.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fcm_menu.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fcm_menu.menu_visible IS '表示有無 // #FC.FLG // Display/hide';


COMMENT ON COLUMN fcm_menu.core_menu IS 'コアメニューＦＬＧ // #FC.FLG // Core menu flg.';


COMMENT ON COLUMN fcm_menu.menu_image IS 'メニューイメージ // #FC.BIN // Menu image';


COMMENT ON COLUMN fcm_menu.menu_index IS 'メニューＩＮＤＥＸ // #FC.NUM_STR // Menu INDEX';


COMMENT ON COLUMN fcm_menu.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_menu.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_menu.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_menu.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_menu.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_menu.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_menu.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_menu.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_menu.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_menu.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

