\encoding UTF-8

COMMENT ON TABLE fct_pw_mod IS 'パスワード変更履歴 // Password change history';


COMMENT ON COLUMN fct_pw_mod.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_pw_mod.user_pw IS 'パスワード（変更後） // #FC.USR_PW // Password (After change)';


COMMENT ON COLUMN fct_pw_mod.pw_mod_dt IS 'パスワード変更日 // #FC.DT // Password change date';

