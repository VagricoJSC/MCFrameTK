package mcframe.commonMA.constant;

import mcframe.commonCore.lang.MCDate;
import static mcframe.commonFXUC.FXUCC0010.FXUCC_DataUtil.*;

abstract class MAC_DAY_WEEK_TYP_MC extends MAC_DAY_WEEK_TYP_MC_A {

	/**
	 * 日付をMAC_DAY_WEEK_TYPに変換します<p>
	 * dateがnullの場合はnullを返します。
	 * valueだけが必要な場合は{@link toDayWeekTypValue(MCDate date)}を使用してください。
	 * 
	 * @param date
	 * @return
	 */
	public static MAC_DAY_WEEK_TYP toDayWeekTyp(MCDate date) {
		if (isNull(date)) {
			return null;
		}
		// 曜日の取得
		int week = date.getDayOfWeek();

		// MAC_DAY_WEEK_TYPへの変換
		if (week == MCDate.SUNDAY) {
			return MAC_DAY_WEEK_TYP.SUN;
		}
		else if (week == MCDate.MONDAY) {
			return MAC_DAY_WEEK_TYP.MON;
		}
		else if (week == MCDate.TUESDAY) {
			return MAC_DAY_WEEK_TYP.TUE;
		}
		else if (week == MCDate.WEDNESDAY) {
			return MAC_DAY_WEEK_TYP.WED;
		}
		else if (week == MCDate.THURSDAY) {
			return MAC_DAY_WEEK_TYP.THU;
		}
		else if (week == MCDate.FRIDAY) {
			return MAC_DAY_WEEK_TYP.FRI;
		}
		else if (week == MCDate.SATURDAY) {
			return MAC_DAY_WEEK_TYP.SAT;
		}

		return null;
	}

	/**
	 * 日付をMAC_DAY_WEEK_TYPのvalueに変換します<p>
	 * dateがnullの場合はnullを返します。
	 * {@link toDayWeekTyp(MCDate date)}で取得したMAC_DAY_WEEK_TYPのvalueを返します。
	 * @param date
	 * @return
	 */
	public static String toDayWeekTypValue(MCDate date) {
		MAC_DAY_WEEK_TYP typ = toDayWeekTyp(date);
		if (typ == null) {
			return null;
		}
		else {
			return typ.value();
		}
	}

}
