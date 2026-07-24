\encoding UTF-8

COMMENT ON TABLE fct_pw_dna IS 'パスワード不一致履歴 // Password failure history';


COMMENT ON COLUMN fct_pw_dna.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_pw_dna.dna_cnt IS '不一致回数 //  // Mismatch count';


COMMENT ON COLUMN fct_pw_dna.dna_tm IS '不一致時刻 // #FC.DT // Mismatched time';

