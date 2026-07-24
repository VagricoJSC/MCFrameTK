package mcframe.clientMSBC.MSBCP0290;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.time.LocalDate;

import mcframe.clientCore.date.MCCoTodayAgent;
import mcframe.clientCore.fxgantt.design.MCXAGDesignPalette;
import mcframe.commonCore.lang.MCDate;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;


public class MSBCP_ItmOrdGanttChart_Palette_MC extends MCXAGDesignPalette {

	@Override
	protected List<ModeItem> getToolButtons() {
		List<ModeItem> list = new ArrayList<ModeItem>();
		return list;
	}

	/**
	 * 日付指定追加
	 */
	@Override
	protected void createDatePicker() {
		MSBCP_ItmOrdGanttChart_Gantt gantt = (MSBCP_ItmOrdGanttChart_Gantt)mainControl;
		MSBCP_ItmOrdGanttChart panel = gantt.panel;
		MCDate today = panel.getToday();	// 運用日付
		Date formatDate = today.toDate();
		_createDatePicker(formatDate);
	}

	/**
	 * パレットの日付を再設定
	 */
	protected void setDate (MCDate date) {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.setTime(date.toDate());

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		LocalDate localDate = LocalDate.of(year, month, day);

		datePicker.setValue(localDate);
	}
}
