package mcframe.clientMAUC.MAUCP0140;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.commonFXUC.FXUCC0170.FXUCC_ValidaterUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_DateUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_DateUtil_MC extends MAUCP_DateUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static MAUCP_DateUtil _dateUtil = new MAUCP_DateUtil();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_DateUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 対象年月の属する開始日を取得します。
	 *
	 * @param ym 対象年月
	 * @param ac_cl_day 会計締日
	 * @param ac_cl_mon_base 会計月度基準
	 * @return 開始日付
	 */
	public static MCDate getYmStDt(MCDate ym, MCNumber ac_cl_day, MCNumber ac_cl_mon_base) {
		return _dateUtil._getYmStDt(ym, ac_cl_day, ac_cl_mon_base);
	}
	 
	protected MCDate _getYmStDt(MCDate ym, MCNumber ac_cl_day, MCNumber ac_cl_mon_base) {
		if (isNull(ym)) {
			return null;
		}

		MCNumber tmpDay = ac_cl_day;
		MCNumber clMonbase = ac_cl_mon_base;
		
		MCDate baseYm = ym.startOfMonth();
		if (clMonbase.eq(MCNumber.ZERO)) {
			baseYm = baseYm.addMonth(-1);
		}

		int clDay;
		int lastDay = baseYm.endOfMonth().getDay();
		if (tmpDay.gt(lastDay)) {
			clDay = lastDay;
		}
		else {
			clDay = tmpDay.intValue();
		}

		if (tmpDay.eq(99)) {
			return baseYm.addMonth(1);
		}
		else {
			return baseYm.addDay(clDay);
		}
	}

	/**
	 * 対象年月の終了日を取得します。
	 *
	 * @param ym 対象年月
	 * @param ac_cl_day 会計締日
	 * @param ac_cl_mon_base 会計月度基準
	 * @return 終了日付
	 */
	public static MCDate getYmEndDt(MCDate ym, MCNumber ac_cl_day, MCNumber ac_cl_mon_base) {
		return _dateUtil._getYmEndDt(ym, ac_cl_day, ac_cl_mon_base);
	}
	
	protected MCDate _getYmEndDt(MCDate ym, MCNumber ac_cl_day, MCNumber ac_cl_mon_base) {
		if (isNull(ym)) {
			return null;
		}

		MCNumber clMonbase = ac_cl_mon_base;

		MCDate baseYm = ym;
		if (clMonbase.eq(MCNumber.ZERO)) {
			baseYm = baseYm.addMonth(-1);
		}

		MCNumber tmpDay = ac_cl_day;
		int clDay = tmpDay.intValue();

		int lastDay = baseYm.endOfMonth().getDay();
		if (clDay > lastDay) {
			clDay = lastDay;
		}

		if (tmpDay.eq(99)) {
			return baseYm.addMonth(1).endOfMonth();
		}
		else {
			if (clDay > baseYm.addMonth(1).endOfMonth().getDay()) {
				return baseYm.addMonth(1).endOfMonth();
			}
			else {
				return baseYm.endOfMonth().addDay(tmpDay.intValue());
			}
		}
	}

	/**
	 * 対象日付の属する期間の開始日を取得します。
	 *
	 * @param dt 対象日付
	 * @param period_typ 期間区分
	 * @param cl_day 会計締日
	 * @return 終了日付
	 */
	public static MCDate getPeriodStDt(MCDate dt, String period_typ, MCNumber cl_day) {
		return _dateUtil._getPeriodStDt(dt, period_typ, cl_day);
	}
	
	protected MCDate _getPeriodStDt(MCDate dt, String period_typ, MCNumber cl_day) {

		if (isNull(dt) || isNull(period_typ) || isNull(cl_day)) {
			return null;
		}

		// 日次
		if (MAC_PERIOD_TYP.isDAILY(period_typ)) {
			return dt;
		}
		// 月次
		else if (MAC_PERIOD_TYP.isMONTHLY(period_typ)) {
			MCDate baseYm = dt.startOfMonth();
			baseYm = baseYm.addMonth(-1);

			int clDay;
			int lastDay = baseYm.endOfMonth().getDay();
			if (cl_day.gt(lastDay)) {
				clDay = lastDay;
			}
			else {
				clDay = cl_day.intValue();
			}

			MCDate clDtFr = baseYm.addDay(clDay);
			MCDate clDtTo = null;
			boolean lastDayFlg = false;
			if (cl_day.eq(99)) {
				lastDayFlg = true;
				clDtTo = baseYm.addMonth(1).endOfMonth();
			}
			else {
				if (cl_day.intValue() > baseYm.addMonth(1).endOfMonth().getDay()) {
					lastDayFlg = true;
					clDtTo = baseYm.addMonth(1).endOfMonth();
				}
				else {
					clDtTo = baseYm.endOfMonth().addDay(cl_day.intValue());
				}
			}

			int find = 0;
			while (find == 0) {
				if (dt.gteDate(clDtFr) && dt.lteDate(clDtTo)) {
					find = 1;
				}
				else {
					clDtFr = clDtTo.addDay(1);
					if (lastDayFlg) {
						clDtTo = clDtTo.addMonth(1).endOfMonth();
					}
					else {
						clDtTo = clDtTo.addMonth(1);
					}
				}
			}
			return clDtFr;
		}
		// 週次
		else if (MAC_PERIOD_TYP.isWEEKLY(period_typ)) {
			if (dt.getDayOfWeek() == MCDate.SUNDAY) {
				return dt;
			}
			else {
				MCDate dtTmp = dt;
				MCDate weekDtFr = null;
				while(isNull(weekDtFr)) {
					dtTmp = dtTmp.addDay(-1);
					if(dtTmp.getDayOfWeek() == MCDate.SUNDAY){
						weekDtFr = dtTmp;
					}
				}
				return weekDtFr;
			}
		}
		// 旬次
		else if (MAC_PERIOD_TYP.isTENDAYS(period_typ)) {
			MCDate baseYm = dt.startOfMonth();
			baseYm = baseYm.addMonth(-1);

			int clDay;
			int lastDay = baseYm.endOfMonth().getDay();
			if (cl_day.gt(lastDay)) {
				clDay = lastDay;
			}
			else {
				clDay = cl_day.intValue();
			}

			MCDate clDtFr = baseYm.addDay(clDay);
			MCDate clDtTo = null;
			boolean lastDayFlg = false;
			if (cl_day.eq(99)) {
				lastDayFlg = true;
				clDtTo = baseYm.addMonth(1).endOfMonth();
			}
			else {
				if (cl_day.intValue() > baseYm.addMonth(1).endOfMonth().getDay()) {
					lastDayFlg = true;
					clDtTo = baseYm.addMonth(1).endOfMonth();
				}
				else {
					clDtTo = baseYm.endOfMonth().addDay(cl_day.intValue());
				}
			}

			int find = 0;
			while (find == 0) {
				if (dt.gteDate(clDtFr) && dt.lteDate(clDtTo)) {
					find = 1;
				}
				else {
					clDtFr = clDtTo.addDay(1);
					if (lastDayFlg) {
						clDtTo = clDtTo.addMonth(1).endOfMonth();
					}
					else {
						clDtTo = clDtTo.addMonth(1);
					}
				}
			}

			int i = 1;
			MCDate tenDtFr = clDtFr;
			MCDate tenDtTo = clDtFr.addDay(9);
			while (i <= 3) {
				if (dt.lt(tenDtFr) || dt.gt(tenDtTo)) {
					tenDtFr = tenDtTo.addDay(1);
					if (i == 1) {
						tenDtTo = tenDtFr.addDay(9);
					}
					else {
						tenDtTo = clDtTo;
					}
					i++;
				}
				else {
					break;
				}
			}
			return tenDtFr;
		}

		return null;
	}

	/**
	 * 対象日付の属する期間の終了日を取得します。
	 *
	 * @param dt 対象日付
	 * @param period_typ 期間区分
	 * @param cl_day 会計締日
	 * @return 終了日付
	 */
	public static MCDate getPeriodEndDt(MCDate dt, String period_typ, MCNumber cl_day) {
		return _dateUtil._getPeriodEndDt(dt, period_typ, cl_day);
	}
	
	protected MCDate _getPeriodEndDt(MCDate dt,	String period_typ, MCNumber cl_day) {

		if (isNull(dt) || isNull(period_typ) || isNull(cl_day)) {
			return null;
		}

		// 日次
		if (MAC_PERIOD_TYP.isDAILY(period_typ)) {
			return dt;
		}
		// 月次
		else if (MAC_PERIOD_TYP.isMONTHLY(period_typ)) {
			MCDate baseYm = dt.startOfMonth();
			baseYm = baseYm.addMonth(-1);

			int clDay;
			int lastDay = baseYm.endOfMonth().getDay();
			if (cl_day.gt(lastDay)) {
				clDay = lastDay;
			}
			else {
				clDay = cl_day.intValue();
			}

			MCDate clDtFr = baseYm.addDay(clDay);
			MCDate clDtTo = null;
			boolean lastDayFlg = false;
			if (cl_day.eq(99)) {
				lastDayFlg = true;
				clDtTo = baseYm.addMonth(1).endOfMonth();
			}
			else {
				if (cl_day.intValue() > baseYm.addMonth(1).endOfMonth().getDay()) {
					lastDayFlg = true;
					clDtTo = baseYm.addMonth(1).endOfMonth();
				}
				else {
					clDtTo = baseYm.endOfMonth().addDay(cl_day.intValue());
				}
			}

			int find = 0;
			while (find == 0) {
				if (dt.gteDate(clDtFr) && dt.lteDate(clDtTo)) {
					find = 1;
				}
				else {
					clDtFr = clDtTo.addDay(1);
					if (lastDayFlg) {
						clDtTo = clDtTo.addMonth(1).endOfMonth();
					}
					else {
						clDtTo = clDtTo.addMonth(1);
					}
				}
			}
			return clDtTo;
		}
		// 週次
		else if (MAC_PERIOD_TYP.isWEEKLY(period_typ)) {
			if (dt.getDayOfWeek() == MCDate.SATURDAY) {
				return dt;
			}
			else {
				MCDate dtTmp = dt;
				MCDate weekDtTo = null;
				while(isNull(weekDtTo)) {
					dtTmp = dtTmp.addDay(+1);
					if(dtTmp.getDayOfWeek() == MCDate.SATURDAY){
						weekDtTo = dtTmp;
					}
				}
				return weekDtTo;
			}
		}
		// 旬次
		else if (MAC_PERIOD_TYP.isTENDAYS(period_typ)) {
			MCDate baseYm = dt.startOfMonth();
			baseYm = baseYm.addMonth(-1);

			int clDay;
			int lastDay = baseYm.endOfMonth().getDay();
			if (cl_day.gt(lastDay)) {
				clDay = lastDay;
			}
			else {
				clDay = cl_day.intValue();
			}

			MCDate clDtFr = baseYm.addDay(clDay);
			MCDate clDtTo = null;
			boolean lastDayFlg = false;
			if (cl_day.eq(99)) {
				lastDayFlg = true;
				clDtTo = baseYm.addMonth(1).endOfMonth();
			}
			else {
				if (cl_day.intValue() > baseYm.addMonth(1).endOfMonth().getDay()) {
					lastDayFlg = true;
					clDtTo = baseYm.addMonth(1).endOfMonth();
				}
				else {
					clDtTo = baseYm.endOfMonth().addDay(cl_day.intValue());
				}
			}

			int find = 0;
			while (find == 0) {
				if (dt.gteDate(clDtFr) && dt.lteDate(clDtTo)) {
					find = 1;
				}
				else {
					clDtFr = clDtTo.addDay(1);
					if (lastDayFlg) {
						clDtTo = clDtTo.addMonth(1).endOfMonth();
					}
					else {
						clDtTo = clDtTo.addMonth(1);
					}
				}
			}

			int i = 1;
			MCDate tenDtFr = clDtFr;
			MCDate tenDtTo = clDtFr.addDay(9);
			while (i <= 3) {
				if (dt.lt(tenDtFr) || dt.gt(tenDtTo)) {
					tenDtFr = tenDtTo.addDay(1);
					if (i == 1) {
						tenDtTo = tenDtFr.addDay(9);
					}
					else {
						tenDtTo = clDtTo;
					}
					i++;
				}
				else {
					break;
				}
			}
			return tenDtTo;
		}

		return null;
	}

	/**
	 * 期間の開始日に、加算期間数を追加した開始日を取得します。
	 * 会計締日は、自社マスタの値を使用します。
	 * 
	 * @param dt 対象日付
	 * @param period_typ 期間区分
	 * @param add 加算期間
	 * @param ac_cl_day 会計締日
	 * @return 開始日付
	 */
	public static MCDate addPeriodStDt(MCDate dt, String period_typ, int add, MCNumber ac_cl_day) {
		return _dateUtil._addPeriodStDt(dt, period_typ, add, ac_cl_day);
	}
	 	
	protected MCDate _addPeriodStDt(MCDate stDt, String periodTyp, int add, MCNumber ac_cl_day) {

		if (isNull(stDt) || isNull(periodTyp) || isNull(add)) {
			return null;
		}

		// 日次
		if (MAC_PERIOD_TYP.isDAILY(periodTyp)) {
			return stDt.addDay(add);
		}
		// 月次
		else if (MAC_PERIOD_TYP.isMONTHLY(periodTyp)) {
			MCDate dtFr = getPeriodStDt(stDt, periodTyp, ac_cl_day);
			return dtFr.addMonth(add);
		}
		// 週次
		else if (MAC_PERIOD_TYP.isWEEKLY(periodTyp)) {
			MCDate dt = stDt.addDay(add * 7);
			return getPeriodStDt(dt, periodTyp, ac_cl_day);
		}
		// 旬次
		else if (MAC_PERIOD_TYP.isTENDAYS(periodTyp)) {
			int i = 0;
			MCDate dt = stDt;
			MCDate tenDtFr = null;
			MCDate tenDtTo = null;
			if (add >= 0) {
				while (i <= add) {
					tenDtFr = getPeriodStDt(dt, periodTyp, ac_cl_day);
					tenDtTo = getPeriodEndDt(dt, periodTyp, ac_cl_day);
					dt = tenDtTo.addDay(1);
					i++;
				}
			}
			else {
				while (i >= add) {
					tenDtFr = getPeriodStDt(dt, periodTyp, ac_cl_day);
					dt = tenDtFr.addDay(-1);
					i--;
				}
			}
			return tenDtFr;
		}

		return null;
	}

	/**
	 * 日付と時刻から、日時を生成します。
	 * @param list 日付と時刻を項目として保持するリストコンテナ
	 * @param colYmd 日付のカラム名
	 * @param colHm 時刻のカラム名
	 */
	public static void setYmdHm(MCList<? extends MCRow> list, String colYmd, String colHm) {
		_dateUtil._setYmdHm(list, colYmd, colHm);
	}

	/**
	 * 日付と時刻から、日時を生成します。
	 * @param list 日付と時刻を項目として保持するリストコンテナ
	 * @param colYmd 日付のカラム名
	 * @param colHm 時刻のカラム名
	 */
	protected void _setYmdHm(MCList<? extends MCRow> list, String colYmd, String colHm) {
		if (list == null || list.size() == 0) {
			return;
		}

		for (MCRow row : list) {
			_setYmdHm(row, colYmd, colHm);
		}
	}

	/**
	 * 日付と時刻から、日時を生成します。
	 * @param row 日付と時刻を項目として保持するロウコンテナ
	 * @param colYmd 日付のカラム名
	 * @param colHm 時刻のカラム名
	 */
	public static void setYmdHm(MCRow row, String colYmd, String colHm) {
		_dateUtil._setYmdHm(row, colYmd, colHm);
	}

	/**
	 * 日付と時刻から、日時を生成します。
	 * @param row 日付と時刻を項目として保持するロウコンテナ
	 * @param colYmd 日付のカラム名
	 * @param colHm 時刻のカラム名
	 */
	protected void _setYmdHm(MCRow row, String colYmd, String colHm) {
		if (row == null) {
			return;
		}

		if (colYmd == null || isNull(row.getDate(colYmd)) ||
			colHm  == null) {
			return;
		}

		MCDate ymd = row.getDate(colYmd).startTimeOfDay();
		MCDate hm = row.getDate(colHm);
		if (isNull(hm)) {
			hm = ymd;
		}
		row.setDate(colYmd, ymd.addHour(hm.getHour()).addMinute(hm.getMinute()));
	}

	/**
	 * 日時比較、対象日時のどちらかの時刻が00:00ならば、日付で比較。
	 * @param dt1 本来小さい日時
	 * @param dt2 本来大きい日時
	 * @return メッセージリスト
	 */
	public static MCMessageList chkBeforeAfter(MCRowBeans dt1, MCRowBeans dt2) {
		return _dateUtil._chkBeforeAfter(dt1, dt2);
	}

	protected MCMessageList _chkBeforeAfter(MCRowBeans dt1, MCRowBeans dt2) {
		MCMessageList msgList = new MCMessageList();

		if (dt1 == null || dt2 == null) {
			return msgList;
		}

		MCDate c1 = (MCDate)dt1.getRowValue();
		MCDate c2 = (MCDate)dt2.getRowValue();

		if (c1 == null || c2 == null) {
			return msgList;
		}

		if (c1.eqTime(c1.trunc(MCDateFieldType.DAY)) ||
			c2.eqTime(c2.trunc(MCDateFieldType.DAY))) {
			c1 = c1.trunc(MCDateFieldType.DAY);
			c2 = c2.trunc(MCDateFieldType.DAY);
		}
				
		if (c2.lt(c1)) {
			msgList.add(FXUCC_ValidaterUtil.msgNotBefore(
				dt1.getMessageByLocale(), 
				dt2.getMessageByLocale(),
				true));
		}
		
		return msgList;
	}

}