CREATE OR REPLACE PACKAGE FCPA_ERR
-- ==============================================================================
-- 機能      アプリケーションのエラー処理機能
-- 作成者    H.Katayama
-- 作成日付  2007-07-27
-- 改版履歴  2007-07-27 H.Katayama 初版作成
--           2007-11-06 H.Katayama IS_ERRなどのメッセージレベル判定のファンクションを修正
--
-- バージョン:6.00
-- ==============================================================================
IS
	-- ===============================================================================
	-- 定数/型
	-- ===============================================================================
	TYPE MSG_BINDER IS TABLE OF VARCHAR2(4000); --バインド変数の格納先
	V_ERR_BIND MSG_BINDER;
	APP_ERR EXCEPTION;                          --mcframeのエラー
	PRAGMA EXCEPTION_INIT(APP_ERR, -20000);     --設定
	LOG_VER NUMBER(1);                          --ログ出力のバージョン

	-- ===============================================================================
	-- エラー情報のクリア
	-- ===============================================================================
	PROCEDURE CLEAR_ERR;

	-- ===============================================================================
	-- アプリケーションエラーを RAISE する
	-- ===============================================================================
	PROCEDURE RAISE_APP_ERR (
		E_ID	IN VARCHAR2,
		E_BIND	IN MSG_BINDER DEFAULT NULL
	);

	-- ===============================================================================
	-- 前回に出力されたメッセージバインドを取得する
	-- ===============================================================================
	PROCEDURE GET_ERR_BIND(
		ERR01 OUT VARCHAR2,
		ERR02 OUT VARCHAR2,
		ERR03 OUT VARCHAR2,
		ERR04 OUT VARCHAR2,
		ERR05 OUT VARCHAR2,
		ERR06 OUT VARCHAR2,
		ERR07 OUT VARCHAR2,
		ERR08 OUT VARCHAR2,
		ERR09 OUT VARCHAR2,
		ERR10 OUT VARCHAR2,
		ERR11 OUT VARCHAR2,
		ERR12 OUT VARCHAR2,
		ERR13 OUT VARCHAR2,
		ERR14 OUT VARCHAR2,
		ERR15 OUT VARCHAR2,
		ERR16 OUT VARCHAR2,
		ERR17 OUT VARCHAR2,
		ERR18 OUT VARCHAR2,
		ERR19 OUT VARCHAR2,
		ERR20 OUT VARCHAR2
	);

END;
/