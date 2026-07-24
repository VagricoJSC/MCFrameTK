create or replace PACKAGE BODY FCPA_ERR
-- ==============================================================================
-- 機能      アプリケーションのエラー処理機能
-- 作成者    H.KATAYAMA
-- 作成日付  2007-07-27
-- 改版履歴  2007-07-27 H.KATAYAMA 初版作成
--           2007-11-06 H.KATAYAMA IS_ERRなどのメッセージレベル判定のファンクションを修正
--           2009-10-14 H.KATAYAMA バインド値の桁数を1000に統一
--           2010-06-03 H.KATAYAMA ログ処理のパッケージを変更
--           2013-02-26 H.KATAYAMA 旧仕様のログパッケージを削除
--
-- バージョン:6.3.1
-- ==============================================================================
IS
	-- ===============================================================================
	-- エラー情報のクリア
	-- ===============================================================================
	PROCEDURE CLEAR_ERR
	IS
	BEGIN
		V_ERR_BIND := FCPA_ERR.MSG_BINDER('');
	END;

	-- ===============================================================================
	-- アプリケーションエラーを RAISE する
	-- ===============================================================================
	PROCEDURE RAISE_APP_ERR (
		E_ID	IN VARCHAR2,
		E_BIND	IN MSG_BINDER DEFAULT NULL
	)
	IS
	BEGIN
		-- エラーバインドのクリア
		CLEAR_ERR();

		V_ERR_BIND := E_BIND;


--TODO アプリ相談
--		BEGIN
--			FCP_DEV_LOGB(E_ID, E_BIND);
--		EXCEPTION
--			WHEN OTHERS THEN
--				DBMS_OUTPUT.PUT_LINE(SQLERRM);
--		END;

		RAISE_APPLICATION_ERROR(-20000, E_ID, FALSE);

	END;

--TODO アプリ相談 DBでログ出さないので、javaから取得するかもしれない。
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
	)
	IS
	BEGIN
		IF V_ERR_BIND IS NOT NULL THEN
			IF V_ERR_BIND.LAST > 0 THEN
				ERR01 := SUBSTRB(V_ERR_BIND(1), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 1 THEN
				ERR02 := SUBSTRB(V_ERR_BIND(2), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 2 THEN
				ERR03 := SUBSTRB(V_ERR_BIND(3), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 3 THEN
				ERR04 := SUBSTRB(V_ERR_BIND(4), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 4 THEN
				ERR05 := SUBSTRB(V_ERR_BIND(5), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 5 THEN
				ERR06 := SUBSTRB(V_ERR_BIND(6), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 6 THEN
				ERR07 := SUBSTRB(V_ERR_BIND(7), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 7 THEN
				ERR08 := SUBSTRB(V_ERR_BIND(8), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 8 THEN
				ERR09 := SUBSTRB(V_ERR_BIND(9), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 9 THEN
				ERR10 := SUBSTRB(V_ERR_BIND(10), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 10 THEN
				ERR11 := SUBSTRB(V_ERR_BIND(11), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 11 THEN
				ERR12 := SUBSTRB(V_ERR_BIND(12), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 12 THEN
				ERR13 := SUBSTRB(V_ERR_BIND(13), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 13 THEN
				ERR14 := SUBSTRB(V_ERR_BIND(14), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 14 THEN
				ERR15 := SUBSTRB(V_ERR_BIND(15), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 15 THEN
				ERR16 := SUBSTRB(V_ERR_BIND(16), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 16 THEN
				ERR17 := SUBSTRB(V_ERR_BIND(17), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 17 THEN
				ERR18 := SUBSTRB(V_ERR_BIND(18), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 18 THEN
				ERR19 := SUBSTRB(V_ERR_BIND(19), 1, 1000);
			END IF;
			IF V_ERR_BIND.LAST > 19 THEN
				ERR20 := SUBSTRB(V_ERR_BIND(20), 1, 1000);
			END IF;

		END IF;

	END;

-- ===============================================================================
-- パッケージ初期化処理
-- ===============================================================================
BEGIN

	LOG_VER := FCPA_CONST.F_GETNUMVAL('LOG', 'LogVer', 2);


END;
/