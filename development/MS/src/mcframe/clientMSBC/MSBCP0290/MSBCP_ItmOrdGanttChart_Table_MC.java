package mcframe.clientMSBC.MSBCP0290;

import java.util.Date;

import javax.swing.SwingUtilities;

import javafx.scene.canvas.GraphicsContext;
import mcframe.clientCore.fxgantt.design.MCXAGDesignMainControl;
import mcframe.clientCore.fxgantt.design.MCXAGDesignNode;
import mcframe.clientCore.fxgantt.gantt.MCXAGGanttMainControl;
import mcframe.clientCore.fxgantt.gantt.MCXAGGanttMainTable;
import mcframe.commonCore.lang.MCNumber;
import java.util.Calendar;

public class MSBCP_ItmOrdGanttChart_Table_MC extends MCXAGGanttMainTable {
	public MSBCP_ItmOrdGanttChart_Table_MC(MCXAGDesignMainControl main, double w, double h, boolean b) {
		super(main, w, h, b);
	}

	public String getDefaultNodeLabelTypeFor(MCXAGDesignMainControl.NodeType aCurrentMode) {
		// モード定数
		switch (aCurrentMode) {
		case Rectangle:
			return "";
		case Ellipse:
			return "";
		case Rhombus:
			return "";
		default:
			return "";
		}
	}

	// 画面位置からリードタイムを計算する。
	@Override
	protected void updateLeadTime(MCXAGDesignNode node) {

		long leadTime = (long) (node.getPrefWidth() * mainControl.getHorizontalStep() * 3600 / mainControl.getGridStepX());


		// ここで休日を排除する。

		long step1 = 60 * 60 * 24;
		long step2 = 1000 * step1;

		long start = node.getStartDate().getTime();
		long end = start + leadTime * 1000;

		// startとendの間に含まれる休日数を計算
		int p = 0;

		boolean	 useWorkingDay = ((MCXAGGanttMainControl)mainControl).isUseWorkingDay();

		if (useWorkingDay == true) {
			long i = start;
			while (i < end) {
				long j = mainControl.getDateFor(new Date(i)).getTime(); // 時分秒切り捨て
				Date date = new Date(j);
				if (isWorkingDay(date, node.verticalIndex()) == false) {
					p++;
				}
				i += step2;
			}
		}
		if (p > 0) {
			leadTime -= step1 * p;
		}

		// 時分以下を切り捨てる。 7.0.1
		leadTime = (long) (leadTime / (60*60*24));
		leadTime = leadTime * (60*60*24);

		node.setLeadTime2((long) leadTime);

		final long _leadTime = leadTime / step1;

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RsltDispR r = ((MSBCP_ItmOrdGanttChart_Node)node).getRsltDispR();
				if(r != null) {
					r.gantt_lt(MCNumber.valueOf(_leadTime));
				}
			}
		});
	}

	/**
	 * リードタイム補正によるノードの幅を再計算
	 */
	@Override
	public void updateWidth(MCXAGDesignNode node) {

		// 休日計算が含まれたリードタイム（秒数）
		long leadTime = node.getLeadTime2();

		// 1ドットあたりの秒数
		long n = (long) (mainControl.getHorizontalStep() * 3600 / mainControl.getGridStepX());
		double w = leadTime / n;
		node.setFrame(node.getFrame().getMinX(), node.getFrame().getMinY(), w, node.getFrame().getHeight());
		node.updateSelectionFrame2();
	}


	@Override
	public void displayTodayLine(GraphicsContext gc) {
	}

	/**
	 * index設定
	 */
	@Override
	public void updateNodeIndex(MCXAGDesignNode node, boolean updateLeadTime) {

		if (updateLeadTime == true) {
			// ノードの幅からリードタイムを変更する。
			updateLeadTime(node);
		}
	}
	@Override
	public void updateNodeStartDate(MCXAGDesignNode node) {
		if (mainControl.getHorizontalTable() != null) {
			Date date = mainControl.getHorizontalTable().getStartDate(); // この日付を基準
			double x = node.getLayoutX() / frameScaleX;
			Calendar cal = Calendar.getInstance();
			cal.clear();
			cal.setTime(date);
			cal.add(Calendar.SECOND, (int) (x * mainControl.getHorizontalStep() * 3600 / mainControl.getGridStepX()));

			// 時分秒が不要なためカット処理を入れる。
			node.setStartDate(mainControl.getDateFor(cal.getTime()));
		}
	}

}
