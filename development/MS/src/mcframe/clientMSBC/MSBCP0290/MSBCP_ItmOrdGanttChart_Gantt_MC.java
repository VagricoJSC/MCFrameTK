package mcframe.clientMSBC.MSBCP0290;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.SwingUtilities;

import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Window;
import mcframe.clientCore.fxgantt.design.MCXAGDesignCalendarManager;
import mcframe.clientCore.fxgantt.design.MCXAGDesignMainControl;
import mcframe.clientCore.fxgantt.design.MCXAGDesignNode;
import mcframe.clientCore.fxgantt.design.MCXAGDesignPalette;
import mcframe.clientCore.fxgantt.design.MCXAGDesignVector;
import mcframe.clientCore.fxgantt.design.MCXAG_DBLabelRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBNodeRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBPropertyRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBTextRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBVectorRow;
import mcframe.clientCore.fxgantt.design.MCXAG_DBVectorSegmentsRow;
import mcframe.clientCore.fxgantt.design.MCXAGDesignMainTable;
import mcframe.clientCore.fxgantt.dialog.MCXAGDesignDetailNode;
import mcframe.clientCore.fxgantt.dialog.MCXAGDesignSettings;
import mcframe.clientCore.fxgantt.gantt.MCXAGGanttMainControl;
import mcframe.clientCore.fxgantt.graph.MCXAGDesignGraph;
import mcframe.clientCore.fxgantt.label.MCXAGDateLabel;
import mcframe.clientCore.fxgantt.label.MCXAGDateLabelColumn;
import mcframe.clientCore.fxgantt.label.MCXAGDesignVerticalTable;
import mcframe.clientCore.fxgantt.label.MCXAGVerticalLabel;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonMS.constant.MSC_ITM_ORD_LD_STS_TYP;
import mcframe.clientMSBC.MSBCP0290.RsltDispR;
import mcframe.clientMSBC.MSBCP0290.LocR;
import mcframe.clientMSBC.MSBCP0290.CalR;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


public class MSBCP_ItmOrdGanttChart_Gantt_MC extends MCXAGGanttMainControl {

	// オーダ
	protected MCList<RsltDispR> rsltList;

	// カレンダ
	protected MCList<CalR> calList;

	// 線分リスト
	protected MCList<AllocPlnR> allocPlnList;

	// 親画面
	protected MSBCP_ItmOrdGanttChart panel;

	// ガントのfivider位置を制御
	protected boolean initDividerPositions = false;
	protected double dividerPositions = 0.5;

	// コンストラクタ
	public MSBCP_ItmOrdGanttChart_Gantt_MC(MSBCP_ItmOrdGanttChart aPanel) {
		super();
		panel = aPanel;
		initColor();
		initUserMessages();
	}

	// デザイン種別
	// サブクラスで定義
	@Override
	public int getDesignType() {
		return 1; // ガント固定
	}

	// 国際化用のラベルの設定。
	public void initUserMessages() {
	}

	// PopUpMenu用メニュー定義
	public List<LabelValue>getMenuItemListForPopup() {
		List<LabelValue> list = new ArrayList<LabelValue>();
		list.add(new LabelValue(panel.getDispString("gantt.MainControl_doDetailMenu"),"doDetailMenu"));
		list.add(new LabelValue(panel.getDispString("gantt.MainControl_doCopyText"),"doCopyText"));
		list.add(new LabelValue(panel.getDispString("gantt.MainControl_doSettingsMenu"),"doSettingsMenu"));
		list.add(new LabelValue("",""));
		list.add(new LabelValue(panel.getDispString("gantt.MainControl_doExcel"),"doExcel"));
		list.add(new LabelValue("",""));
		list.add(new LabelValue(panel.getDispString("gantt.MainControl_doUndo"),"doUndo"));
		return list;
	}

	/**
	 *  環境設定画面
	 */
	@Override
	public MCXAGDesignSettings getSettings() {
		return new MSBCP_ItmOrdGanttChart_Settings(panel);
	}

	/**
	 *  ノードが移動できる縦ラベルを返す。
	 * @param selectedNodeSet
	 * @param columnIndex
	 * @return
	 */
	public HashSet<MCXAGVerticalLabel>getVerticalLabelNamesForNode(HashSet<MCXAGDesignNode> selectedNodeSet,int columnIndex) {
		HashSet<MCXAGVerticalLabel> result = new HashSet<MCXAGVerticalLabel>();

		// 移動可能場所計算
		for(MCXAGDesignNode node : selectedNodeSet) {
			String locationCD = getLocationCD(node);
			List<MCXAGVerticalLabel> vList = getList(locationCD,columnIndex);
			result.addAll(vList);
		}
		return result;
	}

	/**
	 * RsltDispRを返す。
	 * @param aNode
	 * @return
	 */
	public RsltDispR getRsltDispR(MCXAGDesignNode aNode) {
		MSBCP_ItmOrdGanttChart_Gantt manControl = (MSBCP_ItmOrdGanttChart_Gantt)aNode.getMainControl();
		String record_id = aNode.getPropertyValue("record_id");
		if (!isNull(record_id)) {
			for(RsltDispR r : manControl.rsltList) {
				if(isSame(r.record_id(), record_id)) {
					return r;
				}
			}
		}
		return null;
	}


	// nodeから場所CDに変換
	public String getLocationCD(MCXAGDesignNode aNode) {
		RsltDispR r = getRsltDispR(aNode);
		if(r == null) {
			return "";
		}
		return r.mfg_loc_cd();
	}

	// nodeから場所名に変換
	public String getLocationName(MCXAGDesignNode aNode) {
		RsltDispR r = getRsltDispR(aNode);
		if(r == null) {
			return "";
		}
		return r.mfg_loc_nm();
	}

	protected List<MCXAGVerticalLabel>getList(String aLabel,int columnIndex) {
		List<MCXAGVerticalLabel>list = new ArrayList<MCXAGVerticalLabel>();
		if(aLabel != null) {
			// ラベル名で判定する。
			if(columnIndex == 1) {
				int idx=0;
				for(MCXAGVerticalLabel lbl : verticalLabelList1) {
					if(lbl.getLabelText().startsWith(aLabel)) {
						list.add(verticalLabelList1.get(idx));
					}
					idx++;
				}
			}
			else if(columnIndex == 2) {
				int idx=0;
				for(MCXAGVerticalLabel lbl : verticalLabelList2) {
					if(lbl.getLabelText().startsWith(aLabel)) {
						list.add(verticalLabelList2.get(idx));
					}
					idx++;
				}
			}
			else if(columnIndex == 3) {
				int idx=0;
				for(MCXAGVerticalLabel lbl : verticalLabelList3) {
					if(lbl.getLabelText().startsWith(aLabel)) {
						list.add(verticalLabelList3.get(idx));
					}
					idx++;
				}
			}
		}

		return list;
	}

	// 製造場所の名前とコードの対応
	protected HashMap<String,String>locMap = new HashMap<String,String>();

	protected Color _simFillColor;
	protected Color _prcdFillColor;

	protected Color _opnFillColor;
	protected Color _savFillColor;
	protected Color _fixFillColor;
	protected Color _instFillColor;
	protected Color _cmplFillColor;
	protected Color _delFillColor;

	protected Color _sim_opnFillColor;
	protected Color _sim_savFillColor;
	protected Color _sim_fixFillColor;
	protected Color _sim_instFillColor;
	protected Color _sim_cmplFillColor;

	protected Color _prcd_opnFillColor;
	protected Color _prcd_savFillColor;
	protected Color _prcd_fixFillColor;
	protected Color _prcd_instFillColor;
	protected Color _prcd_cmplFillColor;

	protected Color _border_color_defColor;
	protected Color _border_color_updColor;
	protected Color _border_color_delColor;

	protected Double _border_width_def;
	protected Double _border_width_upd;
	protected Double _border_width_del;

	protected Double _border_dash_def;
	protected Double _border_dash_upd;
	protected Double _border_dash_del;

	protected Color _cal_FillColor; // カレンダ
	protected Color _cal_LineColor; // カレンダ線
	protected Color _cal_Line2Color; // カレンダ線(中間線)

	protected Color _cal_todayFillColor; // 本日
	protected Color _cal_satFillColor; // 土曜日
	protected Color _cal_sunFillColor; // 日曜日

	protected Color _cal_holidayFillColor; // 祝日
	protected Color _cal_workingFillColor; // 稼働日
	protected Color _cal_non_workingFillColor; // 非稼働日
	protected Color _cal_outOfRaggeFillColor; // 範囲外
	protected Color _cal_over_defFillColor; //  負荷超過なし
	protected Color _cal_over_1FillColor; //  負荷超過あり(確定済)
	protected Color _cal_over_2FillColor; //  負荷超過あり(確定済)

	protected Color _vector_line_color; //  関連矢印の色
	protected Double _vector_line_width; //  関連矢印の太さ
	protected Integer _font_node_size;

	protected Color _hilight_line_color; //  ハイライト時の線の色
	protected Double _hilight_line_width; //  ハイライト時の線の太さ


	protected void initColor() {
		_simFillColor = getColor("color.node.fill_color.sim", 146,205,205);
		_prcdFillColor = getColor("color.node.fill_color.prcd", 250,191,143);

		_opnFillColor = getColor("color.node.fill_color.opn", 235,241,222);
		_savFillColor = getColor("color.node.fill_color.sav", 196,215,155);
		_fixFillColor = getColor("color.node.fill_color.fix", 118,147,60);
		_instFillColor = getColor("color.node.fill_color.inst", 118,147,60);
		_cmplFillColor =  getColor("color.node.fill_color.cmpl", 118,147,60);
		_delFillColor =  getColor("color.node.fill_color.del", 128,128,128);

		_border_color_defColor = getColor("color.node.border_color.def", 0, 0, 0);
		_border_color_updColor = getColor("color.node.border_color.upd", 255, 255, 0);
		_border_color_delColor = getColor("color.node.border_color.del", 80, 80, 80);

		_border_width_def = getDouble("color.node.border_width.def", 1.0);
		_border_width_upd = getDouble("color.node.border_width.upd", 2.0);
		_border_width_del = getDouble("color.node.border_width.del", 1.0);

		_border_dash_def = getDouble("color.node.border_dash.def", null);
		_border_dash_upd = getDouble("color.node.border_dash.upd", null);
		_border_dash_del = getDouble("color.node.border_dash.del", 10.0);

		_cal_todayFillColor = getColor("color.cal.fill_color.today", 216,224,246);
		_cal_FillColor = getColor("color.cal.fill_color", 255, 255, 255); // カレンダ
		_cal_LineColor = getColor("color.cal.line_color", 191,191,191); // カレンダ線
		_cal_Line2Color = getColor("color.cal.line2_color", 241,241,241); // カレンダ線 縦罫線境界の色

		_cal_satFillColor = getColor("color.cal.fill_color.sat", 197,217,241); // 土曜日
		_cal_sunFillColor = getColor("color.cal.fill_color.sun", 242,220,219); // 日曜日

		_cal_holidayFillColor = getColor("color.cal.fill_color.holiday", 242,220,219); // 祝日
		_cal_workingFillColor = getColor("color.cal.fill_color.working", 255, 255, 255); // 稼働日
		_cal_non_workingFillColor = getColor("color.cal.fill_color.non_working", 217,217,217); // 非稼働日
		_cal_outOfRaggeFillColor = getColor("color.cal.fill_color.out_of_range", 83,83,83); // 範囲外
		_cal_over_defFillColor = getColor("cal.fill_color.loc_def", 255,255,255); //  負荷超過なし
		_cal_over_1FillColor = getColor("color.cal.fill_color.over_1", 242,220,219); //  負荷超過あり(確定済)
		_cal_over_2FillColor = getColor("color.cal.fill_color.over_2", 255,255,204); //  負荷超過あり(確定済)

		_vector_line_color = getColor("color.vector.line_color", 128,128,128); // 関連矢印の色
		_vector_line_width = getDouble("color.vector.line_width", 1.0); // 関連矢印の太さ

		_font_node_size = getInteger("font.node.size", 10);

		_hilight_line_color = getColor("color.node.hilight_line_color", 242,220,219); //  ハイライト時の線の色
		_hilight_line_width = getDouble("color.node.hilight_line_width", 2.0); //  ハイライト時の線の太さ
	}

	protected Color getColor(String key, int red, int green, int blue) {
		String val = panel.getPgmSettingStringNE(panel, null, key);
		if (!isNull(val)) {
			String[] col = val.split(",");
			red = Integer.parseInt(col[0].trim());
			green = Integer.parseInt(col[1].trim());
			blue = Integer.parseInt(col[2].trim());
			return Color.rgb(red, green, blue);
		}

		return Color.rgb(red, green, blue);
	}

	protected Double getDouble(String key, Double def ) {
		MCNumber val = panel.getPgmSettingNumberNE(panel, null, key);
		if (!isNull(val)) {
			return val.doubleValue();
		}

		return def;
	}

	protected Integer getInteger(String key, Integer def ) {
		MCNumber val = panel.getPgmSettingNumberNE(panel, null, key);
		if (!isNull(val)) {
			return val.intValue();
		}

		return def;
	}

	// ノードの色
	protected Color getNodeColor(RsltDispR r) {
		return getNodeFillColor(r);
	}

	/**
	 * ノードの背景色を取得する
	 */
	protected Color getNodeFillColor(RsltDispR r) {
		String state = r.itm_ord_ld_sts_typ();

		// 削除データ
		if(r.isStatusDelete()) {
			return _delFillColor;
		}

		// 先行手配
		if (MSC_ITM_ORD_LD_STS_TYP.isSIM(state)) {
			return _simFillColor;
		}
		// シミュレーション
		if (MSC_ITM_ORD_LD_STS_TYP.isPRCD(state)) {
			return _prcdFillColor;
		}

		// 未確定
		if (MSC_ITM_ORD_LD_STS_TYP.isOPN(state)) {
			return _opnFillColor;
		}
		// 保存
		if (MSC_ITM_ORD_LD_STS_TYP.isSAV(state)) {
			return _savFillColor;
		}
		// 確定
		if (MSC_ITM_ORD_LD_STS_TYP.isFIX(state)) {
			return _fixFillColor;
		}
		// 指図済
		if (MSC_ITM_ORD_LD_STS_TYP.isINST(state)) {
			return _instFillColor;
		}
		// 完了
		if (MSC_ITM_ORD_LD_STS_TYP.isCMPL(state)) {
			return _cmplFillColor;
		}

		return Color.WHITE;
	}

	// ノードの枠の色を返す
	protected Color getNodeBorderColor(RsltDispR r) {
		if(r.isStatusModify()) {
			return _border_color_updColor;
		}
		if(r.isStatusDelete()) {
			return _border_color_delColor;
		}
		return _border_color_defColor;
	}

	// ノードの枠の太さを返す
	protected Double getNodeBorderWidth(RsltDispR r) {
		if(r.isStatusModify()) {
			return _border_width_upd;
		}
		if(r.isStatusDelete()) {
			return _border_width_del;
		}
		return _border_width_def;
	}

	// ノードの枠の破線パターンを返す
	protected Double getNodeBorderDash(RsltDispR r) {
		if(r.isStatusModify()) {
			return _border_dash_upd;
		}
		if(r.isStatusDelete()) {
			return _border_dash_del;
		}
		return _border_dash_def;
	}

	// 場所からYインデックスを得る。
	protected int getFindIndexY(String aCode1) {
		int idx = 0;
		for (MCXAGVerticalLabel label1 : verticalLabelList1) {
			if (label1.getLabelID().equals(aCode1)) {
				return idx;
			}
			idx++;
		}
		// -1の場合は場所が見つからないオーダである。
		return -1;
	}

	// リードタイム計算
	// 単位は秒で返す。
	protected long getLeadTime(RsltDispR r, int yIndex) {
		long m = 0;
		// MCNumber num = r.mfg_lt();
		MCNumber num = r.gantt_lt();
		if (num == null) {
			m = 0;
		} else {
			// m = r.mfg_lt().intValue();
			m = r.gantt_lt().intValue();
		}
		long step1 = 60 * 60 * 24;
		return m * step1;
	}

	// RsltDispRをガントのノードに変換しガントを初期化する。
	protected void initGanttList(
			MCList<RsltDispR> rsltList
			, MCList<LocR> locList
			, MCList<CalR> calList
			, MCList<AllocPlnR> allocPlnList
			, String vLabelString1
	) {

		// スクロール位置をリセット
		this.verticalOffsetY = 0;

		// 品目オーダ情報
		this.rsltList = rsltList;

		// 稼働日情報
		this.calList = calList;

		// 線分リスト
		this.allocPlnList = allocPlnList;

		MCXAGDesignMainTable mTable = mainTable;

		// ノードデータ
		List<MCXAG_DBNodeRow> list1 = new ArrayList<MCXAG_DBNodeRow>();
		// 線分データ
		List<MCXAG_DBVectorRow> list2 = new ArrayList<MCXAG_DBVectorRow>();
		// 付箋データ
		List<MCXAG_DBTextRow> list3 = new ArrayList<MCXAG_DBTextRow>();

		// カレンダは別途用意するため不要
		List<MCXAG_DBLabelRow> list4_0 = new ArrayList<MCXAG_DBLabelRow>();
		List<MCXAG_DBLabelRow> list4_1 = new ArrayList<MCXAG_DBLabelRow>();
		List<MCXAG_DBLabelRow> list4_2 = new ArrayList<MCXAG_DBLabelRow>();

		// 縦ラベルデータ
		List<MCXAG_DBLabelRow> list5_0 = new ArrayList<MCXAG_DBLabelRow>();
		List<MCXAG_DBLabelRow> list5_1 = new ArrayList<MCXAG_DBLabelRow>();
		List<MCXAG_DBLabelRow> list5_2 = new ArrayList<MCXAG_DBLabelRow>();

		locMap = new HashMap<String, String>();

		int idx = 0;
		for (mcframe.clientMSBC.MSBCP0290.LocR r : locList) {
			MCXAG_DBLabelRow dbRow = new MCXAG_DBLabelRow();

			dbRow.setDesign_no(designNo);
			dbRow.setLabel_id(1); // 縦ラベルは1
			dbRow.setLevel_id(0); // 横idx
			dbRow.setLabel_idx(idx); // 縦idx

			dbRow.setLabelText(r.mfg_loc_cd());
			dbRow.setDescriptionText(r.mfg_loc_nm());

			dbRow.setHorizontalIndex(0);
			dbRow.setVerticalIndex(idx);

			dbRow.setFontSize(dVerticalLabelFontSize1);

			Color labelColor = Color.BLACK;
			Color fillColor = Color.WHITE;

			String hex1 = String.format("#%08x", labelColor.hashCode());
			String hex2 = String.format("#%08x", fillColor.hashCode());

			// With # prefix.
			dbRow.setLabelColor(hex1);
			dbRow.setFillColor(hex2);

			List<MCXAG_DBPropertyRow> propertyList = new ArrayList<MCXAG_DBPropertyRow>();

			// 縦ラベルから画面遷移する場合に使用する。
			MCXAG_DBPropertyRow property1 = new MCXAG_DBPropertyRow("screenID", "");
			propertyList.add(property1);
			MCXAG_DBPropertyRow property2 = new MCXAG_DBPropertyRow("designID", "");
			propertyList.add(property2);
			MCXAG_DBPropertyRow property3 = new MCXAG_DBPropertyRow("command", "");
			propertyList.add(property3);

			// ユーザ定義

			// 縦ラベルの行の高さを保持する。
			if (idx == 0) {
				MCXAG_DBPropertyRow property4 = new MCXAG_DBPropertyRow("gridHeight",
						new Double(getGridStepY()).toString());
				propertyList.add(property4);
			}

			// カレンダCDを保持
			MCXAG_DBPropertyRow property5 = new MCXAG_DBPropertyRow("cal_cd", r.cal_cd());
			propertyList.add(property5);

			dbRow.setPropertyList(propertyList);

			list5_0.add(dbRow);
			idx++;

			// コードと名前変換テーブル
			locMap.put(r.mfg_loc_cd(), r.mfg_loc_nm());
		}

		verticalLabelColumnNameList = new ArrayList<String>();
		verticalLabelColumnNameList.add(vLabelString1);
		double w = dVerticalLabelWidth1;
		if (w > 0) {
			leftLabelWidth = w;
		}

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		int node_id = 0;
		for (RsltDispR r : rsltList) {
			MCXAG_DBNodeRow dbRow = new MCXAG_DBNodeRow();

			dbRow.setDesign_no(designNo);
			dbRow.setNode_id(node_id);

			String labelText = r.itm_cd();
			String descriptionText = "";
			MCXAGDesignMainControl.NodeType type = MCXAGDesignMainControl.NodeType.Rectangle;
			Color nodeColor = getNodeColor(r);
			Color lineColor = getNodeBorderColor(r);
			Color fontColor = Color.BLACK;

			Double lineWidth = getNodeBorderWidth(r);
			Double lineDash = getNodeBorderDash(r);

			int yIndex = 0;
			for (MCXAG_DBLabelRow r2 : list5_0) {
				if (r2.getLabelText().equals(r.mfg_loc_cd())) {
					yIndex = r2.getLabel_idx();
					break;
				}
			}

			// 開始日終了日から休みを引いた分を実リードタイムにする。
			// 製造LTではない。
			long leadTime = getLeadTime(r, yIndex);
			java.util.Date startDate = r.mfg_st_dt().toDate();
			java.util.Date endDate = r.mfg_end_dt().toDate();
			boolean isZeroLeadTime = (leadTime == 0);

			dbRow.setLabel(labelText);
			dbRow.setDescriptionText(descriptionText);
			dbRow.setIs_changed(false);

			dbRow.setLayoutX(0);
			dbRow.setLayoutY(0);
			dbRow.setLayoutWidth(0);
			dbRow.setLayoutHeight(0);
			dbRow.setNodeType(type.getValue());

			// With # prefix.
			String hex1 = String.format("#%08x", nodeColor.hashCode());
			String hex2 = String.format("#%08x", lineColor.hashCode());
			String hex3 = String.format("#%08x", fontColor.hashCode());
			dbRow.setFillColor(hex1);
			dbRow.setLineColor(hex2);
			dbRow.setFontColor(hex3);

			dbRow.setFontSize(_font_node_size);
			dbRow.setLineWidth(lineWidth);

			dbRow.setVerticalIndex(yIndex);
			dbRow.setVerticalSubIndex(0);

			dbRow.setStartDate(startDate);
			dbRow.setLeadTime(leadTime);
			if (isZeroLeadTime) {
				dbRow.setIsZeroLeadTime(1);
			} else {
				dbRow.setIsZeroLeadTime(0);
			}

			List<MCXAG_DBPropertyRow> propertyList = new ArrayList<MCXAG_DBPropertyRow>();
			propertyList.add(new MCXAG_DBPropertyRow("command", ""));
			propertyList.add(new MCXAG_DBPropertyRow("screenID", ""));
			propertyList.add(new MCXAG_DBPropertyRow("designID", ""));
			propertyList.add(new MCXAG_DBPropertyRow("webURL", ""));
			propertyList.add(new MCXAG_DBPropertyRow("customClass", ""));
			propertyList.add(new MCXAG_DBPropertyRow("customClassArg1", ""));
			propertyList.add(new MCXAG_DBPropertyRow("customClassArg2", ""));
			propertyList.add(new MCXAG_DBPropertyRow("customClassArg3", ""));
			propertyList.add(new MCXAG_DBPropertyRow("customClassArg4", ""));

			// 破線情報はプロパティで拡張
			if (lineDash != null) {
				propertyList.add(new MCXAG_DBPropertyRow("lineDash", lineDash.toString()));
			} else {
				propertyList.add(new MCXAG_DBPropertyRow("lineDash", ""));
			}

			// レコードIDでRowと紐づけ
			propertyList.add(new MCXAG_DBPropertyRow("record_id", r.record_id().toString()));

			// 終了日必須
			String DATE_PATTERN = panel.getDispString("gantt.MainControl_DATE_PATTERN");
			DateFormat format = new SimpleDateFormat(DATE_PATTERN);
			String endDateStr = format.format(endDate);
			propertyList.add(new MCXAG_DBPropertyRow("endDate", endDateStr));

			dbRow.setPropertyList(propertyList);

			map.put(r.itm_ord_no(), node_id);

			list1.add(dbRow);
			node_id++;
		}

		// 線分データ生成
		int vectorIndex = 0;
		for (AllocPlnR r : allocPlnList) {
			MCXAG_DBVectorRow dbRow = new MCXAG_DBVectorRow();

			if (map.containsKey(r.io_schd_pr_no()) && map.containsKey(r.itm_ord_no())) {

				dbRow.setDesign_no(designNo);
				dbRow.setVector_id(vectorIndex);

				int from_node_id = map.get(r.io_schd_pr_no());
				int to_node_id = map.get(r.itm_ord_no());

				dbRow.setFrom_node_id(from_node_id);
				dbRow.setTo_node_id(to_node_id);

				dbRow.setLabel("");
				dbRow.setDescriptionText("");
				dbRow.setFromLabel("");
				dbRow.setToLabel("");

				String hex1 = String.format("#%08x", _vector_line_color.hashCode());
				String hex2 = String.format("#%08x", fontColor.hashCode());
				dbRow.setLineColor(hex1);
				dbRow.setFontColor(hex2);

				dbRow.setFontSize(fontSize);
				dbRow.setLineWidth(_vector_line_width);

				dbRow.setFromPlacement(0);
				dbRow.setToPlacement(0);
				dbRow.setFromDirection(0);
				dbRow.setToDirection(0);
				dbRow.setFromArrowType(0);
				dbRow.setToArrowType(1);

				dbRow.setLineStyle(0);

				dbRow.setSaveFromNodeX(0);
				dbRow.setSaveFromNodeY(0);
				dbRow.setSaveToNodeX(0);
				dbRow.setSaveToNodeY(0);

				List<MCXAG_DBVectorSegmentsRow> dbSegments = new ArrayList<MCXAG_DBVectorSegmentsRow>();
				dbRow.setSegments(dbSegments);

				// プロパティ情報を保存
				List<MCXAG_DBPropertyRow> propertyList = new ArrayList<MCXAG_DBPropertyRow>();
				dbRow.setPropertyList(propertyList);

				list2.add(dbRow);
				vectorIndex++;
			}
		}

		// インフラ改善
		verticalOffsetY = 0; // 縦スクロール位置をリセット
		if (verticalTable != null) {
			verticalTable.setNeedsDisplay();
			((MSBCP_ItmOrdGanttChart_VerticalTable) verticalTable).resetOffsetCell();
		}

		doLoadFromList(mTable, list1, list2, list3, list4_0, list4_1, list4_2, list5_0, list5_1, list5_2, true);

		// ⑧負荷グラフ：負荷値、標準値の渡し方
		// グラフタイトル設定
		String graphTitle = panel.getDispString("gantt.graphTitle");
		setDesignGraphTitle(0, graphTitle + "\n" + panel.getDispString("gantt.graph1"));
		setDesignGraphTitle(1, graphTitle + "\n" + panel.getDispString("gantt.graph2"));

		// SplitPaneの位置がおかしい場合はここを修正
		if (initDividerPositions == false) {
			initDividerPositions = true;
			DoubleProperty prop = splitTopBottomPane.getDividers().get(0).positionProperty();
			prop.addListener(new ChangeListener<Object>() {
				@Override
				public void changed(ObservableValue<?> observable, Object oldValue, Object newValue) {
					dividerPositions = ((Double) newValue).doubleValue();
				}
			});
			dividerPositions = 0.5;

			splitTopBottomPane.setDividerPositions(dividerPositions);

		} else {
			splitTopBottomPane.setDividerPositions(dividerPositions);

		}

		// 負荷を計算し、調整が必要な場所を色付けする
		if (!isNull(panel.getLocL())) {
			for (LocR r : panel.getLocL()) {
				panel.calcRsrcLoc(r.mfg_loc_cd());
			}
		}
	}

	// 横ラベル側に編集可能範囲を設定する。
	// スクロールは可能にする。
	// オーダ配置後に判定して移動できないようにする。

	protected Date getLimitStartDate() {
		CndR r = panel._srchCndR;
		if (r == null || isNull(r.dt_fr())) {
			return null;
		}
		else {
			return r.dt_fr().toDate();
		}
	}

	protected Date getLimitEndDate() {
		CndR r = panel._srchCndR;
		if (r == null || isNull(r.dt_to())) {
			return null;
		}
		else {
			return r.dt_to().toDate();
		}
	}

	/**
	 *  nodeを返す。
	 */
	@Override
	public MCXAGDesignNode getNewNode() {
		return new MSBCP_ItmOrdGanttChart_Node();
	}

	/**
	 *  vectorを返す。
	 */
	@Override
	public MCXAGDesignVector getNewVector() {
		return new MSBCP_ItmOrdGanttChart_Vector();
	}

	/**
	 * パレット部品
	 * @return MCXAGDesignPalette
	 */
	@Override
	public MCXAGDesignPalette getPalette() {
		return new MSBCP_ItmOrdGanttChart_Palette();
	}

	// パレット部の高さ
	@Override
	public double getPaletteHeight() {
		// パレットの高さをここで設定

		return palette_height2;
	}

	/**
	 * 稼働日かどうか
	 * @param date
	 * @param verticalIndex
	 * @return
	 */
	@Override
	public boolean isWorkingDay(Date date, int verticalIndex) {
		if (getWorkingDay(date, verticalIndex) == 0) {
			return false;
		}

		return true;
	}

	// 稼働日のマップ
	protected ConcurrentHashMap<String,ConcurrentHashMap<Date,Integer>> calCache;
	protected MCList<CalR> saveCalList = null;
	/**
	 * dateが非稼働日かどうか
	 *
	 * @param date 日付
	 * @param verticalIndex 縦ラベルのインデックス
	 * @return
	 */
	// 非稼働日の場合は0を返す。
	@Override
	public int getWorkingDay(Date date, int verticalIndex) {

		// 場所からカレンダを得る。

		if(calList == null) {
			return 1;
		}

		if(saveCalList != calList) {
			// calListが変わった場合のタイミングでキャッシュをクリアする。
			calCache = null;
			saveCalList = calList;
			// バラでキャッシュすると重くなるため初回は日付の可視範囲で全キャッシュする。
			for(int x = 0; x < horizontalTable.getList1().size(); x++) {
				for(int y = 0; y < verticalLabelList1.size(); y++) {
					getWorkingDay(horizontalTable.getList1().get(x).getDate(), y);
				}
			}
		}

		if(calCache == null) {
			calCache = new ConcurrentHashMap<>();
		}

		MCXAGVerticalLabel lbl = verticalLabelList1.get(verticalIndex);
		String cal_cd = lbl.getPropertyValue("cal_cd");

		ConcurrentHashMap<Date, Integer> map;
		if(calCache.containsKey(cal_cd) == false) {
			map = new ConcurrentHashMap<Date, Integer>();
			calCache.put(cal_cd,map);
		} else {
			map = calCache.get(cal_cd);
			if(map.containsKey(date)) {
				Integer n = map.get(date);
				return n;
			}
		}

		for(CalR r : calList) {
			if(r.cal_cd().equals(cal_cd)) {
				Date date2 = r.off_dt().toDate();
				if(date2.equals(date)) {
					if(calCache.containsKey(cal_cd) == false) {
						map = new ConcurrentHashMap<Date, Integer>();
						calCache.put(cal_cd,map);
					} else {
						map = calCache.get(cal_cd);
					}
					map.put(date,0);
					return 0;
				}
			}
		}

		if(calCache.containsKey(cal_cd) == false) {
			map = new ConcurrentHashMap<Date, Integer>();
			calCache.put(cal_cd,map);
		} else {
			map = calCache.get(cal_cd);
		}
		map.put(date,1);
		return 1;
	}

	// mainTableを返す。
	// サブクラスで定義
	@Override
	public MCXAGDesignMainTable getNewMainTable(MCXAGDesignMainControl aMainControl, double w, double h,
			boolean isInner) {
		MCXAGDesignMainTable mt =  new MSBCP_ItmOrdGanttChart_Table(aMainControl, w, h, isInner);

		AnchorPane.setLeftAnchor(mt, 0.0);
		AnchorPane.setRightAnchor(mt, 0.0);
		AnchorPane.setTopAnchor(mt, 0.0);
		AnchorPane.setBottomAnchor(mt, 0.0);

		return mt;
	}

	// node 詳細画面クラスのインスタンス
	@Override
	public MSBCP_ItmOrdGanttChart_DetailNode getDetailNode() {
		return new MSBCP_ItmOrdGanttChart_DetailNode();
	}

	/**
	 *  時間を加算
	 */
	public Date addDateFor(Date aDate,int aHour) {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.setTime(aDate);
		cal.add(Calendar.HOUR,aHour);
		return cal.getTime();
	}

	/**
	 *  ノードがグリッドのx,yに移動できるかどうか
	 *  移動できる場合はtrue
	 */
	@Override
	public boolean canMoveNode(MCXAGDesignNode node, int x, int y) {

		//  ステータスや品目オーダ負荷状況区分による制限はノードの選択可不可で制御するので、以下では実装を除く

		// 場所日付移動禁止ルールをここで実装する。
		int ySize = getVerticalSize4();
		if(y < 0 || y >= ySize) { // 縦方向はみ出しチェック(必須)
			return false;
		}

		boolean b = canMoveNodeForApp(node, x, y);
		if(b == false) {
			return false;
		}

		// タスクの移動可不可チェック
		// ②タスクの移動可否
		// ③タスクの縦方向（場所移動）の移動可否
		// ④タスクの横方向（日付移動）の移動可否

		// RsltDispRを取り出す。
		RsltDispR r = ((MSBCP_ItmOrdGanttChart_Node)node).getRsltDispR();

		// xの日時を取り出す。

		if(0 > x || horizontalTable.getList1().size() <= x) {
			return false;
		}

		// yの場所を取り出す。
		if(0 > y || getVerticalLabelList1().size() <= y) {
			return false;
		}


		String state = r.itm_ord_ld_sts_typ();

		// オーダ状況で移動可不可
		if (MSC_ITM_ORD_LD_STS_TYP.isOPN(state)) {
			return true; // 未確定
		}
		if (MSC_ITM_ORD_LD_STS_TYP.isSAV(state)) {
			return true; // 保存
		}
		if (MSC_ITM_ORD_LD_STS_TYP.isFIX(state)) {
			return false;
		}
		if (MSC_ITM_ORD_LD_STS_TYP.isINST(state)) {
			return false;
		}
		if (MSC_ITM_ORD_LD_STS_TYP.isCMPL(state)) {
			return false;
		}

		// デフォルトは移動不可
		return false;
	}

	// ノードが選択できるかどうか
	public boolean canSelectNode(MCXAGDesignNode node) {
		return true;
	}

	/**
	 * ノードの選択が変更された場合に呼ばれる。
	 */
	@Override
	public boolean doSelectedNodeChanged() {

		boolean ret = super.doSelectedNodeChanged();

		HashSet<MCXAGDesignNode> selectedNodeSet = new HashSet<MCXAGDesignNode>();
		for (MCXAGDesignNode node : nodeList) {
			if (node.isSelected() == true) {
				selectedNodeSet.add(node);
			}
		}
		// ここで下部の一覧を絞り込む。
		MCList<RsltDispR>list = MCList.create(RsltDispR.class);

		if(selectedNodeSet.size() != 0) {
			for(MCXAGDesignNode n : selectedNodeSet) {
				RsltDispR r2 = getRsltDispR(n);
				if(r2 != null) {
					list.add(r2);
				}
			}
		} else {
			//
			for (MCXAGDesignNode n : nodeList) {
				RsltDispR r2 = getRsltDispR(n);
				if(r2 != null) {
					list.add(r2);
				}
			}
		}

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				panel.getRsltDispL().clear();
				if (list.size() > 0) {
					panel.getRsltDispL().addAll(list);
					panel.RsltDispTable.selectRow(0);
					panel.RsltDispTable.adjustWidth();
				}
			}
		});

		String oldSelectedLoc = selectedLoc;
		selectedLoc = "";
		selectedRsrc1 = "";
		selectedRsrc2 = "";

		String graphTitle = panel.getDispString("gantt.graphTitle");
		if(selectedNodeSet.size() > 0) {
			RsltDispR r2 = null;
			RsltDispR r3 = null;

			for(MCXAGDesignNode n : selectedNodeSet) {
				RsltDispR r1 = getRsltDispR(n);
				if(r1 != null) {
					// 複数選択時は、最初に選択した場所のグラフを表示する
					if (isSame(r1.mfg_loc_cd(), oldSelectedLoc)) {
						r2 = r1;
						break;
					}
					else {
						r3 = r1;
					}
				}
			}
			if (r2 == null) {
				r2 = r3;
			}
				if(r2 != null) {
					selectedLoc = r2.mfg_loc_cd();

					String nm1 = r2.rsrc_nm1();
					String cd1 = r2.rsrc_cd1();
					if(nm1 == null) {
						nm1 = "";
					}
					if(cd1 == null) {
						cd1 = "";
					}
					String nm2 = r2.rsrc_nm2();
					String cd2 = r2.rsrc_cd2();
					if(nm2 == null) {
						nm2 = "";
					}
					if(cd2 == null) {
						cd2 = "";
					}

					setDesignGraphTitle(0,graphTitle+"\n"+cd1+"\n"+nm1);
					setDesignGraphTitle(1,graphTitle+"\n"+cd2+"\n"+nm2);

					selectedRsrc1 = cd1;
					selectedRsrc2 = cd2;

				}

		} else {
			setDesignGraphTitle(0,graphTitle);
			setDesignGraphTitle(1,graphTitle);
		}

		// 下部のグラフを更新
		updateDesignGraph(true, false);

		return ret;
	}

	// 選択されている場所CD
	public String selectedLoc = "";
	public String selectedRsrc1 = "";
	public String selectedRsrc2 = "";


	// グラフで使用されるデータを計算
	// isLoadGraphでグラフで行単位計算にする。
	@Override
	// ⑧負荷グラフ：負荷値、標準値の渡し方
	public void updateGraphValue(MCXAGDesignGraph graph, boolean isLoadGraph) {
		if (graph == null) {
			return;
		}

		int graphVerticalIndex = graph.getVerticalIndex();
		int graphVerticalIndex2 = graph.getVerticalIndex2();

		int graphHorizontalSize = (int) Math.ceil(canvasWidth / frameScaleX / getGridStepX());

		// valuesにグラフの値をセットする。

		List<Double> values0 = new ArrayList<Double>(graphHorizontalSize);
		List<Double> values1 = new ArrayList<Double>(graphHorizontalSize);
		if (graphHorizontalSize > 0) {
			for (int x1 = 0; x1 <= graphHorizontalSize; x1++) {
				values0.add(0.0);
				values1.add(0.0);
			}
		}

		if (isLoadGraph == false) {

			panel.calcRsrcLoc(selectedLoc);
			MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR> list = panel.getRsrcLocL();

			String loc;
			if(graphVerticalIndex == 0) {
				 loc = selectedRsrc1;
			} else {
				 loc = selectedRsrc2;
			}

			int size = horizontalTable.getList1().size();

			for (RsrcLocR r1 : list) {
				if (r1.mfg_loc_cd().equals(selectedLoc)) {
					if (r1.rsrc_cd().equals(loc)) {
						Date rdate = r1.dt().toDate();
						for (int n = 0; n < size; n++) {
							MCXAGDateLabelColumn col = horizontalTable.getList1().get(n);
							Date date = col.getDate();
							if (date.equals(rdate)) {
								if(0 <= n && values0.size() > n) {
									double v = values0.get(n) + r1.base_qty().doubleValue();
									values0.set(n, v); // 基準値セット
								}

								if(0 <= n && values1.size() > n) {
									double v1 = values1.get(n) + r1.sum_act_qty().doubleValue();
									values1.set(n, v1); // 実際値
								}

								break;
							}
						}
					}
				}
			}

			for (MCXAGDesignNode node : nodeList) {
				RsltDispR r = getRsltDispR(node);
				if(r == null) {
					continue;
				}

				if (r.mfg_loc_cd().equals(selectedLoc) == false) {
					continue;
				}

				int x1 = node.getStartIndex();
				int x2 = node.getEndIndex() - 1;

				int n1 = 0;
				int n2 = horizontalTable.getList1().size() - 1;
				n1 = Math.max(n1,x1);
				n2 = Math.min(n2,x2);
				if(n1 > n2) {
					continue;
				}

				for (RsrcLocR r1 : list) {
					if (r1.mfg_loc_cd().equals(selectedLoc)) {
						if (r1.rsrc_cd().equals(loc)) {
							Date rdate = r1.dt().toDate();
							for (int n = x1; n <= x2; n++) {
								if(n >= 0 && n < size) {
									MCXAGDateLabelColumn col = horizontalTable.getList1().get(n);
									Date date = col.getDate();
									if (date.equals(rdate)) {
										if(0 <= n && n < values0.size()) { // 溢れチェック
											double v = r1.base_qty().doubleValue();
											values0.set(n, v); // 基準値セット
										}
										if(0 <= n && n < values1.size()) { // 溢れチェック
											double v1 = r1.sum_act_qty().doubleValue();
											values1.set(n, v1); // 実際値
										}
										break;
									}
								}
							}
						}
					}
				}
			}

		}
		else {

			MCXAGVerticalLabel lbl = verticalLabelList1.get(graphVerticalIndex);
			String loc_cd = lbl.getLabelText();

			panel.calcRsrcLoc(selectedLoc);
			MCList<mcframe.clientMSBC.MSBCP0290.RsrcLocR> list = panel.getRsrcLocL();

			// 実際値を計算
			int size = horizontalTable.getList1().size();
			for (RsrcLocR r1 : list) {
				if (r1.mfg_loc_cd().equals(loc_cd)) {
					Date rdate = r1.dt().toDate();
					for (int n = 0; n <= size; n++) {
						if(n >= 0 && n < size) {
							MCXAGDateLabelColumn col = horizontalTable.getList1().get(n);
							Date date = col.getDate();
							if (date.equals(rdate)) {
								double v1 = r1.sum_act_qty().doubleValue(); // 実際値
								values1.set(n, v1);
								break;
							}
						}
					}
				}
			}

			for (MCXAGDesignNode node : nodeList) {
				RsltDispR r = getRsltDispR(node);
				if(r == null) {
					continue;
				}

				if (r.mfg_loc_cd().equals(loc_cd) == false) {
					continue;
				}

				int x1 = node.getStartIndex();
				int x2 = node.getEndIndex() - 1;

				int n1 = 0;
				int n2 = horizontalTable.getList1().size() - 1;
				n1 = Math.max(n1,x1);
				n2 = Math.min(n2,x2);
				if(n1 > n2) {
					continue;
				}

				for (int n = x1; n <= x2; n++) {
					if(n >= 0 && n < size) {
						// 実際値セット
						// LTで按分
						double v1 = values1.get(n);
						double v2 = 0; // 実際値（オーダ）

						if(graphVerticalIndex2 == 0) {
							v2 = r.rsrc_act_qty1_p().qty().doubleValue(); // 実際値1（オーダ）
						}
						else if(graphVerticalIndex2 == 1) {
							v2 = r.rsrc_act_qty2_p().qty().doubleValue(); // 実際値2（オーダ）
						}
						values1.set(n, v1 + (v2 / Math.max(1,x2 - x1 + 1)));
					}
				}
			}
		}

		// 最大値を自動で計算
		if(isLoadGraph == true) {
			double maxValue = 120; // グラフの最大値指定
			graph.setMaxValue(maxValue);
		} else {
			double maxValue = 120; // グラフの最大値指定

			double maxValue0 = 0.0;
			double maxValue1 = 0.0;
			for (int x1 = 0; x1 <= graphHorizontalSize; x1++) {
				if(x1 < values0.size()) {
					double v = values0.get(x1);
					maxValue0 = Math.max(maxValue0, v);
				}
				if(x1 < values1.size()) {
					double v = values1.get(x1);
					maxValue1 = Math.max(maxValue1, v);
				}
			}
			maxValue = Math.max(maxValue0,maxValue1);
			// キリ番処理

			double p1 = Math.pow(10,(getDigit(maxValue) - 1));
			maxValue = Math.ceil(maxValue / p1) * p1;

			graph.setMaxValue(maxValue);
		}

		graph.setValuesForLine(0, values0); // 折れ線グラフデータ
		graph.setValuesForBar(0, values1); // 棒グラフデータ設定

		graph.setHorizontalSize(graphHorizontalSize);
		graph.setVerticalSize(1);
	}

	// 整数部の桁数計算
	protected int getDigit(double v) {
		double d = Math.abs(v);
		int digit = 0;
		while (d != 0) {
			d = Math.floor(d / 10);
			++digit;
		}
		return digit;
	}

	// ガント上の全ノードの表示を更新する。
	protected void updateGanttNode() {

		for(MCXAGDesignNode node : nodeList) {
			RsltDispR r = getRsltDispR(node);
			if(r != null) {
				Color nodeColor = getNodeColor(r);
				Color lineColor = getNodeBorderColor(r);

				Double borderWidth = getNodeBorderWidth(r);
				Double borderDash = getNodeBorderDash(r);

				//色も変更
				node.setFillColor(nodeColor);
				node.setLineColor(lineColor);

				node.setLineWidth(borderWidth);
				((MSBCP_ItmOrdGanttChart_Node)node).setBorderDash(borderDash);
			}

			node.updateSkinBase(node.getPane(), node.getPrefWidth(), node.getPrefHeight());
			node.updateLayout();
		}

		updateDesignGraph(true, true);

	}

	// rの詳細情報を表示
	protected void openDetailNode(RsltDispR r) {
		if (mainTable == null) {
			return;
		}
		Window w = getScene().getWindow();

		for(MCXAGDesignNode node : nodeList) {
			RsltDispR r2 = getRsltDispR(node);
			if(r2 == r) {
				MCXAGDesignDetailNode detailNode = getDetailNode();

				if (detailNode.getPropertyListName().length > 0) {
					detailNode.setHasPropertyTable(true);
				}

				detailNode.init(w, node);
				detailNode.showInView(this);
				return;
			}
		}
	}

	// ポップアップメニュー初期化
	public void initMenus() {
		if (mainTable == null) {
			return;
		}
		mainMenuControl2 = this;

		if (isDesignMode == true) {
			final ContextMenu contextMenu = new ContextMenu();

			List<LabelValue> itemList = getMenuItemListForPopup();

			for (int i = 0; i < itemList.size(); i++) {
				MenuItem item = new MenuItem(itemList.get(i).label());
				// 詳細メニューのitemを制御するために初期化
				if (itemList.get(i).value().equals("doDetailMenu")) {
					doDetailMenuItem = item;
				}
				if (itemList.get(i).value().equals("doCopyText")) {
					doCopyTextItem = item;
				}

				item.setUserData(itemList.get(i).value());
				if (itemList.get(i).label().length() == 0) {
					contextMenu.getItems().addAll(new SeparatorMenuItem());
				} else {
					item.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent e) {

							// メニュー
							MenuItem item = (MenuItem) e.getTarget();
							String methodName = (String) item.getUserData();
							if (methodName.length() > 0) {
								Method method;
								try {
									method = mainMenuControl2.getClass().getMethod(methodName,
											new Class[] { ActionEvent.class });
								} catch (SecurityException ex) {
									throw new RuntimeException(ex);
								} catch (NoSuchMethodException ex) {
									throw new RuntimeException(ex);
								}

								try {
									contextMenu.hide();
									method.invoke(mainMenuControl2, new Object[] { e });
								} catch (IllegalArgumentException ex) {
									throw new RuntimeException(ex);
								} catch (IllegalAccessException ex) {
									throw new RuntimeException(ex);
								} catch (InvocationTargetException ex) {
									// サービスで何らかのエラー
//									System.out.println(ex.getCause());
									throw new RuntimeException(ex);
								}
							}
						}
					});
					contextMenu.getItems().addAll(item);
				}
			}
			mainTable.setContextMenu(contextMenu);
		} else {
			final ContextMenu contextMenu = new ContextMenu();

			List<LabelValue> itemList = getMenuItemListForPopup2();

			for (int i = 0; i < itemList.size(); i++) {
				MenuItem item = new MenuItem(itemList.get(i).label());
				// 詳細メニューのitemを制御するために初期化
				if (itemList.get(i).value().equals("doDetailMenu")) {
					doDetailMenuItem = item;
				}
				if (itemList.get(i).value().equals("doCopyText")) {
					doCopyTextItem = item;
				}

				item.setUserData(itemList.get(i).value());
				if (itemList.get(i).label().length() == 0) {
					contextMenu.getItems().addAll(new SeparatorMenuItem());
				} else {
					item.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent e) {

							// メニュー
							MenuItem item = (MenuItem) e.getTarget();
							String methodName = (String) item.getUserData();
							if (methodName.length() > 0) {
								Method method;
								try {
									method = mainMenuControl2.getClass().getMethod(methodName,
											new Class[] { ActionEvent.class });
								} catch (SecurityException ex) {
									throw new RuntimeException(ex);
								} catch (NoSuchMethodException ex) {
									throw new RuntimeException(ex);
								}

								try {
									contextMenu.hide();
									method.invoke(mainMenuControl2, new Object[] { e });
								} catch (IllegalArgumentException ex) {
									throw new RuntimeException(ex);
								} catch (IllegalAccessException ex) {
									throw new RuntimeException(ex);
								} catch (InvocationTargetException ex) {
									throw new RuntimeException(ex);
								}
							}
						}
					});
					contextMenu.getItems().addAll(item);
				}
			}
			mainTable.setContextMenu(contextMenu);
		}
	}


	/**
	 *  PopUpMenu用メニュー定義
	 *  編集モードでない場合
	 */
	public List<LabelValue> getMenuItemListForPopup2() {
		final List<LabelValue> list = new ArrayList<LabelValue>();
		list.add(new LabelValue(panel.getDispString("gantt.MainControl_doDetailMenu"),"doDetailMenu"));
		list.add(new LabelValue(panel.getDispString("gantt.MainControl_doCopyText"),"doCopyText"));
		list.add(new LabelValue("", ""));
		list.add(new LabelValue(panel.getDispString("gantt.MainControl_doExcel"),"doExcel"));
		return list;
	}

	/**
	 *  背景色を計算する。
	 * @param horizontalIndex
	 * @param verticalIndex
	 * @return
	 */
	public Color getColor(int horizontalIndex, int verticalIndex) {
		Color col = _cal_FillColor;

		MCXAGDateLabelColumn lbl = horizontalTable.getList1().get(horizontalIndex);

		// 日付の範囲指定がある場合
		Date date = lbl.getDate();
		Date limitStartDate = getLimitStartDate();
		Date limitEndDate = getLimitEndDate();

		if(limitStartDate != null) {
			if(date.compareTo(limitStartDate) < 0) {
				return _cal_outOfRaggeFillColor;
			}
		}
		if(limitEndDate != null) {
			if(date.compareTo(limitEndDate) > 0) {
				return _cal_outOfRaggeFillColor;
			}
		}

		// 稼働日のみ
		if (getWorkingDay(lbl.getDate(), verticalIndex) == 0) {
			col = _cal_non_workingFillColor;
		}
		return col;
	}

	/**
	 *  dateが本日かどうか
	 * @param date
	 * @return
	 */
	@Override
	public boolean isToday(Date date) {
		return MCXAGDesignCalendarManager.isToday(date);
	}

	/**
	 *  dateが日曜かどうか
	 * @param date
	 * @return
	 */
	// サブクラスで定義
	public boolean isSunday(Date date) {
		return MCXAGDesignCalendarManager.isSunday(date);
	}

	/**
	 *  dateが土曜かどうか
	 * @param date
	 * @return
	 */
	// サブクラスで定義
	public boolean isSaturday(Date date) {
		return MCXAGDesignCalendarManager.isSaturday(date);
	}

	/**
	 *  dateが休日かどうか
	 * @param date
	 * @return
	 */
	// サブクラスで定義
	public boolean isHoliday(Date date) {
		return MCXAGDesignCalendarManager.isHoliday(date);
	}

	// タスクやRow等を書き換えたときにグラフ側にも値を反映されるためのメソッド
	// ⑨負荷グラフやタスクのリフレッシュのタイミング
	@Override
	public void updateDesignGraph(boolean isDisplay, boolean hasTooltip) {
		super.updateDesignGraph( isDisplay,  hasTooltip);
	}

	// ⑦タスクをつなぐ矢印の渡し方
	// 線を全て削除
	public void removeAllVectors() {
		super.removeAllVectors();
	}

	// ⑦タスクをつなぐ矢印の渡し方
	// 線を削除
	public void removeVector(MCXAGDesignVector vector) {
		super.removeVector(vector);
	}

	// ⑦タスクをつなぐ矢印の渡し方
	// 線を追加
	public void addVector(MCXAGDesignVector vector) {
		super.addVector(vector);
	}

	/**
	 *  縦横ラベル欄のインスタンスを生成
	 * @param w
	 * @param h
	 * @return
	 */
	// サブクラスで定義
	@Override
	public MCXAGDesignVerticalTable getNewVerticalTable(double w, double h) {
		// 縦横ラベルControlを生成
		MSBCP_ItmOrdGanttChart_VerticalTable table = new MSBCP_ItmOrdGanttChart_VerticalTable(w, h, panel);
		table.setMainControl(this);
		return table;
	}
	/**
	 *  倍率変更
	 * @param aScaleX
	 * @param aScaleY
	 */
	// 不具合暫定対応
	public void setFrameScale(double aScaleX, double aScaleY) {
		frameScaleX = aScaleX;
		frameScaleY = aScaleY;

//		updateAnchorPane();

		// mainTableがscaleされない不具合。
		if (mainTable != null) {
			mainTable.setFrameScale(aScaleX, aScaleY);

			// リサイズに伴うサイズ変更
			mainTable.setPrefWidth(canvasWidth * frameScaleX);
			mainTable.setPrefHeight(canvasHeight * frameScaleY);
		}

		super.setFrameScale( aScaleX,  aScaleY);
	}

	/**
	 *  横ラベル欄のインスタンスを生成
	 * @param w
	 * @param h
	 * @return
	 */
	// サブクラスで定義
	public MCXAGDateLabel getNewHorizontalTable(double w, double h) {
		// 縦横ラベルControlを生成
		MCXAGDateLabel dateLabel = new MCXAGDateLabel(horizontalTablePane, this, w, h, getGridStepX(),
				horizontalStep, false, false);
		initHorizontalLabel(dateLabel);
		return dateLabel;
	}

	// 横ラベル欄のインスタンスを生成
	@Override
	public MCXAGDateLabel getNewHorizontalLabel(double w, double h) {
		MCXAGDateLabel dateLabel = new MCXAGDateLabel(horizontalTablePane, this, w, h, getGridStepX(), horizontalStep
				, false, false);
		initHorizontalLabel(dateLabel);
		return dateLabel;
	}

	public void initHorizontalLabel(MCXAGDateLabel dateLabel) {

		// 罫線
		dateLabel.setdLineColorRed(_cal_LineColor.getRed());
		dateLabel.setdLineColorGreen(_cal_LineColor.getGreen());
		dateLabel.setdLineColorBlue(_cal_LineColor.getBlue());

		// 罫線
		dateLabel.setdLine2ColorRed(_cal_Line2Color.getRed());
		dateLabel.setdLine2ColorGreen(_cal_Line2Color.getGreen());
		dateLabel.setdLine2ColorBlue(_cal_Line2Color.getBlue());

		// 色テーブル初期化
		// 本日
		dateLabel.setdTodayColorRed(_cal_todayFillColor.getRed());
		dateLabel.setdTodayColorGreen(_cal_todayFillColor.getGreen());
		dateLabel.setdTodayColorBlue(_cal_todayFillColor.getBlue());
		dateLabel.setdTodayColorAlpha(1.0);

		// 日曜
		dateLabel.setdHolidayColorRed1(_cal_sunFillColor.getRed());
		dateLabel.setdHolidayColorGreen1(_cal_sunFillColor.getGreen());
		dateLabel.setdHolidayColorBlue1(_cal_sunFillColor.getBlue());
		dateLabel.setdHolidayColorAlpha1(1.0);

		// 土曜
		dateLabel.setdHolidayColorRed2(_cal_satFillColor.getRed());
		dateLabel.setdHolidayColorGreen2 (_cal_satFillColor.getGreen());
		dateLabel.setdHolidayColorBlue2 (_cal_satFillColor.getBlue());
		dateLabel.setdHolidayColorAlpha2(1.0);

		// 休日
		dateLabel.setdHolidayColorRed3(_cal_holidayFillColor.getRed());
		dateLabel.setdHolidayColorGreen3(_cal_holidayFillColor.getGreen());
		dateLabel.setdHolidayColorBlue3(_cal_holidayFillColor.getBlue());
		dateLabel.setdHolidayColorAlpha3(1.0);

		// 非稼働日
		dateLabel.setdHolidayColorRed4(_cal_non_workingFillColor.getRed());
		dateLabel.setdHolidayColorGreen4(_cal_non_workingFillColor.getGreen());
		dateLabel.setdHolidayColorBlue4(_cal_non_workingFillColor.getBlue());
		dateLabel.setdHolidayColorAlpha4(1.0);
	}

	// ノードがグリッドのx,yに移動できるかどうか
	// 移動できる場合はtrue
	public boolean canMoveNodeForApp(MCXAGDesignNode node, int x, int y) {
		return panel.canMoveNodeForApp(node,x,y);
	}

	/**
	 * 場所の色を負荷状況に合わせて設定する
	 *
	 * @param subRsrcLocL
	 */
	public void setVerticalLabelColor(MCList<RsrcLocR> subRsrcLocL) {
		if (subRsrcLocL.size() == 0) {
			return;
		}
		List<MCXAGVerticalLabel> lbl1L = getList(subRsrcLocL.get(0).mfg_loc_cd(), 1);
		for (MCXAGVerticalLabel lbl1 :lbl1L) {
			MCList<RsrcLocR> alertRsrcLocL = subRsrcLocL.subList(RsrcLocR.$alert_flg, true);
			if (!isNull(alertRsrcLocL)) {
				MCList<RsrcLocR> notFixRsrcLocL = alertRsrcLocL.subList(RsrcLocR.$fix_flg, false);
				if (!isNull(notFixRsrcLocL)) {
					lbl1.setFillColor(_cal_over_1FillColor);
				}
				else {
					lbl1.setFillColor(_cal_over_2FillColor);
				}
			}
			else {
				lbl1.setFillColor(_cal_over_defFillColor);

			}
			lbl1.updateLayout();
		}
	}
}
