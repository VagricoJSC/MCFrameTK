package mcframe.clientMSBC.MSBCP0290;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import mcframe.clientCore.fxgantt.design.MCXAGDesignMainControl.PropertyType;
import mcframe.clientCore.fxgantt.gantt.MCXAGGanttDetailNode;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;

import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;

import mcframe.clientCore.beans.MCRootPanel;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.commonMA.constant.*;

public class MSBCP_ItmOrdGanttChart_DetailNode_MC extends MCXAGGanttDetailNode {

	/**
	 * コンストラクタ
	 */
	public MSBCP_ItmOrdGanttChart_DetailNode_MC() {
		super();
		labelWidth = MSBCP_ItmOrdGanttChart.getPgmSettingIntNE(MSBCP_ItmOrdGanttChart.class, 150, "detail.label_width");
		textWidth = MSBCP_ItmOrdGanttChart.getPgmSettingIntNE(MSBCP_ItmOrdGanttChart.class, 400, "detail.value_width");
	}

	@Override
	public void setWindowSize() {
		window_width = labelWidth + textWidth + 50;
		if (hasPropertyTable == true) {
			window_width += 300;
		}

		window_height = MSBCP_ItmOrdGanttChart.getPgmSettingIntNE(MSBCP_ItmOrdGanttChart.class, 0, "detail.window_height");
		if (window_height <= 0) {
			String items = MSBCP_ItmOrdGanttChart.getPgmSettingStringNE(MSBCP_ItmOrdGanttChart.class, null, "detail.items");
			if (!isNull(items)) {
				String[] strs = items.split(";");
				window_height = 40 * strs.length;
			}
			if (window_height <= 0) {
				window_height = 100;
			}
		}
	}

	/**
	 * 詳細画面のボタン初期化
	 */
	@Override
	public HBox initButton() {
		// 値を変更しガントに反映させる場合はsuperクラスのメソッドを使用する。
		HBox hbox = new HBox();
		cancelButton = new Button(cancelButtonLabel);
		cancelButton.setStyle(String.format("-fx-font-size: %d", baseFontSize)); // 7.0.1 フォントサイズを固定
		hbox.getChildren().add(cancelButton);
		cancelButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				close();
			}
		});
		return hbox;
	}

	/**
	 *  プロパティ項目の定義
	 */
	@Override
	public List<PropertyItem> getPropertyItemList() {
		List<PropertyItem> list = new ArrayList<PropertyItem>();

		RsltDispR findR = getRsltDispR();
		if(findR == null) {
			return list;
		}

		MSBCP_ItmOrdGanttChart panel = (MSBCP_ItmOrdGanttChart) ((MSBCP_ItmOrdGanttChart_Gantt) targetNode.getMainControl()).panel;
		String items = panel.getPgmSettingStringNE(panel, null, "detail.items");
		if (!isNull(items)) {
			for (String item : items.split(";")) {
				StringBuilder sb = new StringBuilder();
				for (String col : item.split(",")) {
					String rCol = findR.getRealColumnPath(col);
					MCColumnConfig conf = getColumnConfig(rCol);
					if (conf != null) {
						sb.append(conf.getLabelByLocale());
					}
					else {
						sb.append(col);
					}
				}
				list.add(new PropertyItem(item, sb.toString(), PropertyType.String));
			}
		}
		return list;
	}

	protected MCColumnConfig getColumnConfig(String baseRowColumnName) {
		MSBCP_ItmOrdGanttChart panel = (MSBCP_ItmOrdGanttChart) ((MSBCP_ItmOrdGanttChart_Gantt) targetNode.getMainControl()).panel;
		return panel.getColumnConfig(panel.RsltDispTable, baseRowColumnName);
	}

	protected RsltDispR getRsltDispR() {
		MSBCP_ItmOrdGanttChart_Gantt manControl = (MSBCP_ItmOrdGanttChart_Gantt)targetNode.getMainControl();
		return manControl.getRsltDispR(targetNode);
	}

	/**
	 * TextFieldに設定される文字列
	 */
	@Override
	public String getPropertyText(String key) {

		RsltDispR r = getRsltDispR();
		if (r == null) {
			return "";
		}

		String str = "";
		for (String col : key.split(",")) {
			if (r.contains(col)) {
				key = col;
				break;
			}
		}
		// Propertyを使わずにRsltDispRから値を得る。 7.0.1
		RsltDispR findR = null;
		boolean b = false;

		switch (key) {
			// MCDate
			case "mfg_st_dt":
				findR = getRsltDispR();
				if (findR != null) {
					MCDate sdate = findR.mfg_st_dt();
					if (sdate != null) {
						str = toYMDString(sdate);
					}
					b = true;
				}
				break;
			case "mfg_end_dt":
				findR = getRsltDispR();
				if (findR != null) {
					MCDate edate = findR.mfg_end_dt();
					if (edate != null) {
						str = toYMDString(edate);
					}
					b = true;
				}
				break;
			// String
			case "itm_ord_ld_sts_typ":
				findR = getRsltDispR();
				if (findR != null) {
					str = findR.itm_ord_ld_sts_typ();
					b = true;
				}
				break;
			case "inst_po_cnt_rmrks":
				findR = getRsltDispR();
				if (findR != null) {
					str = findR.inst_po_cnt_rmrks();
					b = true;
				}
				break;
			case "intr_rmrks":
				findR = getRsltDispR();
				if (findR != null) {
					str = findR.intr_rmrks();
					b = true;
				}
				break;
			case "sub_char1":
				findR = getRsltDispR();
				if (findR != null) {
					str = findR.sub_char1();
					b = true;
				}
				break;
			case "sub_char2":
				findR = getRsltDispR();
				if (findR != null) {
					str = findR.sub_char2();
					b = true;
				}
				break;
			case "sub_char3":
				findR = getRsltDispR();
				if (findR != null) {
					str = findR.sub_char3();
					b = true;
				}
				break;
			default:
				b = false;
				break;
		}
		if(b == false) {
			if (r.contains(key)) {
				Comparable<?> x = r.getValue(key);
				if (x instanceof String) {
					str = x.toString();
				} else if (x instanceof MCNumber) {
					str = x.toString();
				} else if (x instanceof MCDate) {
					str = toYMDString((MCDate) x);
				} else if (x instanceof Boolean) {
					if ((Boolean) x) {
						str = MAC_STR.PRNT_CHK_TRUE.value();
					} else {
						str = MAC_STR.PRNT_CHK_FALSE.value();
					}
				}
			} else {
				str = super.getPropertyText(key);
			}
		}

		return str;
	}

	/**
	 * TextFieldにからプロパティに戻す
	 */
	@Override
	public void setPropertyText(String key, String str) {
		RsltDispR r = getRsltDispR();
		if (r == null) {
			return;
		}

		for (String col : key.split(",")) {
			if (r.contains(col)) {
				key = col;
				break;
			}
		}
		MSBCP_ItmOrdGanttChart panel = (MSBCP_ItmOrdGanttChart) ((MSBCP_ItmOrdGanttChart_Gantt) targetNode
				.getMainControl()).panel;
		RsltDispR findR = null;

		switch (key) {
			// MCDate
			case "mfg_st_dt":
				findR = getRsltDispR();
				if (findR != null) {
					MCDate date =  MCDate.valueOf(convertStringToDate(str, null));
					String rCol = findR.getRealColumnPath(key);
					MCColumnConfig conf = getColumnConfig(rCol);
					panel.accept(findR, conf, date);
				}
				targetNode.setStartDate(convertStringToDate(str, targetNode.getStartDate()));
				break;
			case "mfg_end_dt":
				findR = getRsltDispR();
				if (findR != null) {
					MCDate date =  MCDate.valueOf(convertStringToDate(str, null));
					String rCol = findR.getRealColumnPath(key);
					MCColumnConfig conf = getColumnConfig(rCol);
					panel.accept(findR, conf, date);
				}

				Date endDate = convertStringToDate(str, null);
				if(targetNode.getStartDate().compareTo(endDate) > 0) {

					// MCRootPanelを取得
					MCRootPanel rp = ((MSBCP_ItmOrdGanttChart_Gantt)targetNode.getMainControl()).panel;

					//メッセージ表示
					MCMessageList msgList  = new MCMessageList();
					MCMessage msg = new MCMessage(mcframe.commonFX.notice.FX_Msg.FXUDD9402,"Date Error");
					msgList.add(msg);
					rp.message(msgList);
				}
				targetNode.setEndDate(convertStringToDate(str, targetNode.getEndDate()));

				// LTをここで計算する。
				if (findR != null) {
					Date sdate =  findR.mfg_st_dt().toDate();
					Date edate =  findR.mfg_end_dt().toDate();
				    long dateTimeTo = edate.getTime();
				    long dateTimeFrom = sdate.getTime();
				    long n = dateTimeTo - dateTimeFrom;
				    n  = n / (60*60*24*1000); // 日に変換
					targetNode.setLeadTime2(n * 60*60*24);
//					findR.mfg_lt ((int)n); // 製造LT
					findR.gantt_lt ((int)n);
				}
				break;
			// String
			case "itm_ord_ld_sts_typ":
			case "inst_po_cnt_rmrks":
			case "intr_rmrks":
			case "sub_char1":
			case "sub_char2":
			case "sub_char3":
				findR = getRsltDispR();
				if (findR != null) {
					String rCol = findR.getRealColumnPath(key);
					MCColumnConfig conf = getColumnConfig(rCol);
					panel.accept(findR, conf, str);
				}
				break;
			default:
				super.setPropertyText(key, str);
				break;
		}
	}

	protected void setRowStatus(RsltDispR r) {
		if (r == null) {
			return ;
		}

		if (r.isStatusNone()) {
			r.setStatus(MCRow.MODIFY);
		}

	}

	protected MSBCP_ItmOrdGanttChart_DetailNode thisDetailNode = (MSBCP_ItmOrdGanttChart_DetailNode)this;

	public void applyLabelProperty() {
		// Swingスレッドにする。
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				thisDetailNode.applyLabelProperty2();
			}
		});
	}

	private boolean _hasError = false;
	private MCDate _startDate = null;
	private MCDate _endDate = null;

	protected void applyLabelProperty2() {
		// Swingスレッドにする。

		RsltDispR findR = getRsltDispR();
		if(findR != null) {
			_startDate = findR.mfg_st_dt();
			_endDate = findR.mfg_st_dt();
		} else {
			_startDate = null;
			_endDate = null;
		}

		_hasError = false;
		super.applyLabelProperty(); // Swing側データ更新
		if(_hasError) {
			// データの巻き戻し。
			findR.mfg_st_dt(_startDate);
			findR.mfg_end_dt(_endDate);
			// 一部巻き戻す
			return;
		}

		Platform.runLater(new Runnable() { //fxスレッド必須
			public void run() {
				doUpdateLayout2(); // fx側データ更新
				initPaneValues(); // 変えた値で取得しなおす。
			}
		});
	}

	/**
	 * ノードの見た目を更新する。
	 */
	@Override
	public void doUpdateLayout() {
		// doUpdateLayout2で処理
	}

	/**
	 * ノードの見た目を更新する。
	 */
	protected void doUpdateLayout2() {
		targetNode.updateNodePosition(true, true, true, true);
		targetNode.updateSkinBase(targetNode.getPane(), targetNode.getPrefWidth(), targetNode.getPrefHeight());
		targetNode.updateSelectionFrame3();
		targetNode.updateLayout();
		targetNode.afterMoveNode(false, true, false, false);
	}

	@Override
	protected void initPane() {
		super.initPane();
		for (javafx.scene.control.TextField t :textFieldList.values()) {
			t.setEditable(false);
		}
	}

}
