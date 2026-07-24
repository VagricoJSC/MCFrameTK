CREATE OR REPLACE PACKAGE FCPA_MESSAGE_QUEUE
IS
	-- ===============================================================================
	-- 指定されたメッセージキューIDのパラメータ情報を文字列化する
	-- ===============================================================================
	FUNCTION F_GET_PARAMSTR(
		I_MESSAGE_QUEUE_ID IN VARCHAR2
	)
	RETURN VARCHAR2 ;
END;
/
