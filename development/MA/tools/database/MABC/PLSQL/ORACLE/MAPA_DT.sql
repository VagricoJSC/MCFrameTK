CREATE OR REPLACE PACKAGE          MAPA_DT
/*********************************************************
<SYNOPSIS>
		日付関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	FUNCTION F_TO_DAY_WEEK_TYP (
		I_DT		IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DAY_WEEK_TYP%TYPE ;
	/*********************************************************
	<SYNOPSIS>
			日付を曜日区分に変換する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<RETURNVALUE>
			曜日区分
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PERIOD_ST_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PERIOD_END_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_ADD_PERIOD_ST_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_ADD IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日から加算期間先の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_ADD
			加算期間
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の開始日から加算期間先の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_ADD_PERIOD_END_DT_NE
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_ADD IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日から、対象日付の属する期間の開始日から加算期間先の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_ADD
			加算期間
	<IN>	I_CL_DAY
			会計締日
	<RETURNVALUE>
			対象日付の属する期間の終了日から加算期間先の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の月度の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の月度の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の月度の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の月度の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_ST_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_POS IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始位置の開始日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_POS
			開始位置
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始位置の開始日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_YM_END_DT_NE
	(
		I_YM IN MAPA_META.YM%TYPE,
		I_PERIOD_TYP IN MAPA_META.PERIOD_TYP%TYPE,
		I_POS IN INTEGER,
		I_CL_DAY IN MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE IN MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			会計締日と会計月度基準から、年月の属する期間の開始位置の終了日となる年月日を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_YM
			対象年月
	<IN>	I_PERIOD_TYP
			期間区分
	<IN>	I_POS
			開始位置
	<IN>	I_CL_DAY
			会計締日
	<IN>	I_CL_MON_BASE
			会計月度基準
	<RETURNVALUE>
			年月の属する期間の開始位置の終了日
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AC_YM
	(
		I_DT IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.YM%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付に対応する計上月度を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<RETURNVALUE>
			計上月度
	<HISTORY>
	**********************************************************/
	FUNCTION F_GET_AC_YM
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_CL_DAY MAPA_META.CL_DAY%TYPE,
		I_CL_MON_BASE MAPA_META.CL_MON_BASE%TYPE
	)
	RETURN MAPA_META.YM%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付に対応する計上月度を取得する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			対象日付
	<IN>	I_CL_DAY
			会社マスタの会計締日
	<IN>	I_CL_MON_BASE
			会社マスタの会計月度基準
	<RETURNVALUE>
			計上月度
	<HISTORY>
	**********************************************************/
	FUNCTION F_CAL_DAYS
	(
		I_FR_DT IN MAPA_META.DT%TYPE ,
		I_TO_DT IN MAPA_META.DT%TYPE ,
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN NUMBER;
	/*********************************************************
	<SYNOPSIS>
			指定期間に含まれるカレンダの稼働日の日数を求める。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_FR_DT
			指定期間の開始日付
	<IN>	I_TO_DT
			指定期間の終了日付
	<IN>	I_CAL_CD
			カレンダコード
	<RETURNVALUE>
			稼働日の日数
	<HISTORY>
	**********************************************************/

	FUNCTION F_CAL_DATE_LT
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			カレンダの休日を考慮してリードタイム計算を行う。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_CAL_CD
			カレンダコード
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_CAL_DATE
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_XFR_FLG IN MAPA_META.FLG%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			カレンダの休日を考慮してリードタイム計算を行う。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_CAL_CD
			カレンダコード
	<IN>	I_XFR_FLG
			移動用ＦＬＧ
			I_XFR_FLG='1'：休日をリードタイムに含めない（移動用）
			I_XFR_FLG='0'：休日をリードタイムに含める（製造用）
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_CAL_DATE_LOC
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_XFR_FLG IN MAPA_META.FLG%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			場所コードからカレンダを取得し、カレンダの休日を考慮してリードタイム計算を行う。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_LOC_CD
			場所コード
	<IN>	I_XFR_FLG
			移動用ＦＬＧ
			I_XFR_FLG='1'：休日をリードタイムに含めない（移動用）
			I_XFR_FLG='0'：休日をリードタイムに含める（製造用）
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_CAL_DATE_MOVE
	(
		I_BASE_DT IN MAPA_META.DT%TYPE ,
		I_LT IN MAPA_META.LT%TYPE ,
		I_FWD_FLG IN MAPA_META.FLG%TYPE DEFAULT '1',
		I_F_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_F_LOC_CD IN MAPA_META.LOC_CD%TYPE,
		I_T_CAL_CD IN MAPA_META.CAL_CD%TYPE,
		I_T_LOC_CD IN MAPA_META.LOC_CD%TYPE
	)
	RETURN MAPA_META.DT%TYPE;
	/*********************************************************
	<SYNOPSIS>
			移動のリードタイム計算を行う。基準日付に対して
			移動元カレンダ（もしくは移動元場所）の稼働日を移動元の日付として、
			リードタイム計算を行い格納予定日を求める。
	<REMARKS>
			移動専用のリードタイム計算となり、基準日付に対して移動元カレンダ（もしくは移動元場所）
			の稼働日を移動元の日付として、リードタイム計算を行い格納予定日を求める
	<ARGUMENTS>
	<IN>	I_BASE_DT
			計算元の基準日付
	<IN>	I_LT
			リードタイム日数
	<IN>	I_FWD_FLG
			リードタイムが０で基準日付が休日のとき、直後の稼働日を返すか、直前の稼働日を返すかのＦＬＧ
			I_FWD_FLG='1'：直後の稼働日
			I_FWD_FLG='0'：直前の稼働日
	<IN>	I_F_CAL_CD
			移動元カレンダコード（NULLの場合、移動元場所コードが必須）
	<IN>	I_F_LOC_CD
			移動元場所コード
	<IN>	I_T_CAL_CD
			移動先カレンダコード（NULLの場合、移動先場所コードが必須）
	<IN>	I_T_LOC_CD
			移動先場所コード
	<RETURNVALUE>
			リードタイム計算後の日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_YM(
		I_DATE IN DATE
	)
	RETURN MAPA_META.YM%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付の「日」以降を切り捨てて、年月を返します。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DATE
			日付
	<RETURNVALUE>
			年月
	<HISTORY>
	**********************************************************/

	FUNCTION F_TO_DATE (
		I_YM	IN MAPA_META.YM%TYPE,
		I_DAYS	IN NUMBER
	)
	RETURN DATE;
	/*********************************************************
	<SYNOPSIS>
			年月と日にちを合わせて日付にして返します。
	<REMARKS>
			引数の何れかがNULL、日にちが０以下、
			年月の最終日より大きい場合はNULLを返します。
	<ARGUMENTS>
	<IN>	I_YM
			年月
	<IN>	I_DAYS
			日にち
	<RETURNVALUE>
			日付
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_WRKDAY
	(
		I_DT IN MAPA_META.DT%TYPE,
		I_CAL_CD IN MAPA_META.CAL_CD%TYPE
	)
	RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日付とカレンダＣＤから稼働日かどうかを判断する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT
			日付
	<IN>	I_CAL_CD
			カレンダＣＤ
	<RETURNVALUE>
			'1'：稼働日、'0'：非稼動日（休日）
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_BEFORE_AFTER
	(
		I_DT1 IN MAPA_META.DT%TYPE,
		I_DT2 IN MAPA_META.DT%TYPE
	)
	RETURN MAPA_META.FLG%TYPE;
	/*********************************************************
	<SYNOPSIS>
			日時比較、対象日時のどちらかの時刻が00:00ならば、日付で比較。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DT1
			本来小さい日時
	<IN>	I_DT2
			本来大きい日時
	<RETURNVALUE>
			'1'：正常、'0'：異常
	<HISTORY>
	**********************************************************/

END;
/
