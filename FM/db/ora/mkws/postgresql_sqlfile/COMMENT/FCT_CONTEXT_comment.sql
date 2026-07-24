\encoding UTF-8

COMMENT ON TABLE fct_context IS 'ＤＢコンテキスト情報 // DB context info.';


COMMENT ON COLUMN fct_context.pid IS 'プロセス ID // #FC.POSTGRESQL_PID // PID';


COMMENT ON COLUMN fct_context.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_context.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_context.lcl_cd IS 'ロケールＣＤ // #FC.LOCALE_CD // Locale cd.';

