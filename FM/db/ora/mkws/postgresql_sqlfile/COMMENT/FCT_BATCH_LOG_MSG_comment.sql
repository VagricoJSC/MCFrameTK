\encoding UTF-8

COMMENT ON VIEW fct_batch_log_msg IS 'バッチログメッセージ // Batch log message';


COMMENT ON COLUMN fct_batch_log_msg.batch_log_no IS 'ログＮＯ //  // Log No.';


COMMENT ON COLUMN fct_batch_log_msg.seq IS '連番 //  // Sequence number';


COMMENT ON COLUMN fct_batch_log_msg.log_sub_key1 IS 'ログサブキー１ //  // Log sub key 1';


COMMENT ON COLUMN fct_batch_log_msg.log_sub_key2 IS 'ログサブキー２ //  // Log sub key 2';


COMMENT ON COLUMN fct_batch_log_msg.batch_log_typ IS 'バッチログ区分 //  // Batch log type';


COMMENT ON COLUMN fct_batch_log_msg.msg_id IS 'メッセージＩＤ // #FC.MSG_ID // Message ID';


COMMENT ON COLUMN fct_batch_log_msg.msg_lvl IS 'メッセージレベル // #FC.MSG_LVL // Message level';


COMMENT ON COLUMN fct_batch_log_msg.msg_txt IS 'メッセージ本文 // #FC.MSG // Message body';


COMMENT ON COLUMN fct_batch_log_msg.log_ts IS 'ログ出力日時 // #FC.TS // Log output date and time';


COMMENT ON COLUMN fct_batch_log_msg.prm01 IS 'パラメータ１ // #FC.LOG_PRM // Parameter 1';


COMMENT ON COLUMN fct_batch_log_msg.prm02 IS 'パラメータ２ // #FC.LOG_PRM // Parameter 2';


COMMENT ON COLUMN fct_batch_log_msg.prm03 IS 'パラメータ３ // #FC.LOG_PRM // Parameter 3';


COMMENT ON COLUMN fct_batch_log_msg.prm04 IS 'パラメータ４ // #FC.LOG_PRM // Parameter 4';


COMMENT ON COLUMN fct_batch_log_msg.prm05 IS 'パラメータ５ // #FC.LOG_PRM // Parameter 5';


COMMENT ON COLUMN fct_batch_log_msg.prm06 IS 'パラメータ６ // #FC.LOG_PRM // Parameter 6';


COMMENT ON COLUMN fct_batch_log_msg.prm07 IS 'パラメータ７ // #FC.LOG_PRM // Parameter 7';


COMMENT ON COLUMN fct_batch_log_msg.prm08 IS 'パラメータ８ // #FC.LOG_PRM // Parameter 8';


COMMENT ON COLUMN fct_batch_log_msg.prm09 IS 'パラメータ９ // #FC.LOG_PRM // Parameter 9';


COMMENT ON COLUMN fct_batch_log_msg.prm10 IS 'パラメータ１０ // #FC.LOG_PRM // Parameter 10';


COMMENT ON COLUMN fct_batch_log_msg.prm11 IS 'パラメータ１１ // #FC.LOG_PRM // Parameter 11';


COMMENT ON COLUMN fct_batch_log_msg.prm12 IS 'パラメータ１２ // #FC.LOG_PRM // Parameter 12';


COMMENT ON COLUMN fct_batch_log_msg.prm13 IS 'パラメータ１３ // #FC.LOG_PRM // Parameter 13';


COMMENT ON COLUMN fct_batch_log_msg.prm14 IS 'パラメータ１４ // #FC.LOG_PRM // Parameter 14';


COMMENT ON COLUMN fct_batch_log_msg.prm15 IS 'パラメータ１５ // #FC.LOG_PRM // Parameter 15';


COMMENT ON COLUMN fct_batch_log_msg.prm16 IS 'パラメータ１６ // #FC.LOG_PRM // Parameter 16';


COMMENT ON COLUMN fct_batch_log_msg.prm17 IS 'パラメータ１７ // #FC.LOG_PRM // Parameter 17';


COMMENT ON COLUMN fct_batch_log_msg.prm18 IS 'パラメータ１８ // #FC.LOG_PRM // Parameter 18';


COMMENT ON COLUMN fct_batch_log_msg.prm19 IS 'パラメータ１９ // #FC.LOG_PRM // Parameter 19';


COMMENT ON COLUMN fct_batch_log_msg.prm20 IS 'パラメータ２０ // #FC.LOG_PRM // Parameter 20';


COMMENT ON COLUMN fct_batch_log_msg.prm21 IS 'パラメータ２１ // #FC.LOG_PRM // Parameter 21';


COMMENT ON COLUMN fct_batch_log_msg.prm22 IS 'パラメータ２２ // #FC.LOG_PRM // Parameter 22';


COMMENT ON COLUMN fct_batch_log_msg.prm23 IS 'パラメータ２３ // #FC.LOG_PRM // Parameter 23';


COMMENT ON COLUMN fct_batch_log_msg.prm24 IS 'パラメータ２４ // #FC.LOG_PRM // Parameter 24';


COMMENT ON COLUMN fct_batch_log_msg.prm25 IS 'パラメータ２５ // #FC.LOG_PRM // Parameter 25';


COMMENT ON COLUMN fct_batch_log_msg.prm26 IS 'パラメータ２６ // #FC.LOG_PRM // Parameter 26';


COMMENT ON COLUMN fct_batch_log_msg.prm27 IS 'パラメータ２７ // #FC.LOG_PRM // Parameter 27';


COMMENT ON COLUMN fct_batch_log_msg.prm28 IS 'パラメータ２８ // #FC.LOG_PRM // Parameter 28';


COMMENT ON COLUMN fct_batch_log_msg.prm29 IS 'パラメータ２９ // #FC.LOG_PRM // Parameter 29';


COMMENT ON COLUMN fct_batch_log_msg.prm30 IS 'パラメータ３０ // #FC.LOG_PRM // Parameter 30';


COMMENT ON COLUMN fct_batch_log_msg.prm31 IS 'パラメータ３１ // #FC.LOG_PRM // Parameter 31';


COMMENT ON COLUMN fct_batch_log_msg.prm32 IS 'パラメータ３２ // #FC.LOG_PRM // Parameter 32';


COMMENT ON COLUMN fct_batch_log_msg.prm33 IS 'パラメータ３３ // #FC.LOG_PRM // Parameter 33';


COMMENT ON COLUMN fct_batch_log_msg.prm34 IS 'パラメータ３４ // #FC.LOG_PRM // Parameter 34';


COMMENT ON COLUMN fct_batch_log_msg.prm35 IS 'パラメータ３５ // #FC.LOG_PRM // Parameter 35';


COMMENT ON COLUMN fct_batch_log_msg.prm36 IS 'パラメータ３６ // #FC.LOG_PRM // Parameter 36';


COMMENT ON COLUMN fct_batch_log_msg.prm37 IS 'パラメータ３７ // #FC.LOG_PRM // Parameter 37';


COMMENT ON COLUMN fct_batch_log_msg.prm38 IS 'パラメータ３８ // #FC.LOG_PRM // Parameter 38';


COMMENT ON COLUMN fct_batch_log_msg.prm39 IS 'パラメータ３９ // #FC.LOG_PRM // Parameter 39';


COMMENT ON COLUMN fct_batch_log_msg.prm40 IS 'パラメータ４０ // #FC.LOG_PRM // Parameter 40';

