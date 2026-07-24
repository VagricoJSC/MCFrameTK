CREATE OR REPLACE PACKAGE BODY FCPA_MESSAGE_QUEUE
IS
	-- ===============================================================================
	-- 指定されたメッセージキューIDのパラメータ情報を文字列化する
	-- ===============================================================================
	FUNCTION F_GET_PARAMSTR(
		I_MESSAGE_QUEUE_ID IN VARCHAR2
	)
	RETURN VARCHAR2
	IS
		RTN VARCHAR2(4000);
		CURSOR C IS
			SELECT T.PARAM_KEY || '=' || T.PARAM_VAL S FROM FCT_MESSAGE_QUEUE_PARAM T WHERE T.MESSAGE_QUEUE_ID = I_MESSAGE_QUEUE_ID;
	BEGIN
		RTN := NULL;
  		FOR VAR_REC IN C
  		LOOP
  			IF RTN IS NULL THEN
  				RTN := VAR_REC.S;
  			ELSE
  				RTN := RTN || CHR(13) || CHR(10) || VAR_REC.S;
  			END IF;
  		END LOOP;
  		RETURN RTN;
	END;
END;
/
