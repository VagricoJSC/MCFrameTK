package mcframe.clientMSBC.MSBCP0290;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.SwingUtilities;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import mcframe.clientCore.fxgantt.design.MCXAGDesignNode;
import mcframe.clientCore.fxgantt.gantt.MCXAGGanttMainControl;
import mcframe.clientCore.fxgantt.gantt.MCXAGGanttNode;
import mcframe.clientCore.fxgantt.scrap.MCXAGDesignChange;
import mcframe.clientCore.fxgantt.scrap.MCXAGDesignUndoManager;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.lang.*;

import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.commonMA.constant.*;

public class MSBCP_ItmOrdGanttChart_Node_MC extends MCXAGGanttNode {

	// 移動リサイズを行った場合はtrueになる。
	protected boolean _isChanged = false;
	// 移動リサイズする前の終了日
	protected Date _endDate2 = null;

	/**
	 * オーダの移動リサイズを行った場合はtrueになる。
	 * 7.0.1
	 * @return _isChanged
	 */
	public boolean isChanged() {
		return _isChanged;
	}

	/**
	 * オーダの移動リサイズを行った場合はtrueになる。
	 * 7.0.1
	 * @param _isChanged boolean
	 */
	public void setChanged(boolean _isChanged) {
		this._isChanged = _isChanged;
	}

	/**
	 * ノードの移動後に呼ばれる処理をここに実装
	 */
	// updateLeaadTime==trueで画面座標からリードタイム再計算
	@Deprecated
	@Override
	public void afterMoveNode(boolean updateIndex, boolean updateWidth, boolean updateLeaadTime) {
		afterMoveNode(updateIndex, updateWidth, updateLeaadTime, false);
	}

	// 横ラベル側に編集可能範囲を設定する。
	// スクロールは可能にする。
	// オーダ配置後に判定して移動できないようにする。
	protected Date getLimitStartDate() {
		return ((MSBCP_ItmOrdGanttChart_Gantt)_mainControl).getLimitStartDate();
	}

	protected Date getLimitEndDate() {
		return ((MSBCP_ItmOrdGanttChart_Gantt)_mainControl).getLimitEndDate();
	}

	public void mousePress(MouseEvent event) {

		// Undoできるようにするため退避
		for (MCXAGDesignNode node : _mainControl.getNodeList()) {
			MSBCP_ItmOrdGanttChart_Node ganttNode = (MSBCP_ItmOrdGanttChart_Node)node;
			ganttNode.setSaveStartDate(ganttNode.getStartDate());
			ganttNode.setSaveEndDate(ganttNode.getEndDate());
			ganttNode.setSaveLeadTime(ganttNode.getLeadTime());
		}

		super.mousePress(event);
	}

	// 旧メソッド 7.0.1で廃止される可能性あり。引数変更版あり。
	@Deprecated
	public void afterMoveNode(boolean updateIndex, boolean updateWidth, boolean updateLeaadTime, boolean isDragging) {
		afterMoveNode(updateIndex, updateWidth, updateLeaadTime, isDragging, false);
	}

	// ⑤タスクの日単位の移動制御
	// isUndoを追加 戻すボタンに対応させる。
	// updateIndex boolean 縦位置指定
	// updateWidth boolean 休日を考慮した見た目を補正する。
	// updateLeaadTime boolean リサイズ後のリードタイム再計算
	// isDragging boolean ドラッグ処理中かどうか
	// isUndo boolean UNDO処理かどうか
	@Override
	public void afterMoveNode(boolean updateIndex, boolean updateWidth, boolean updateLeaadTime, boolean isDragging,
			boolean isUndo) {
		// Drag中は更新しない。
		if (isDragging == true) {
			if (updateIndex) {
				_mainTable.updateNodeIndex(this, updateLeaadTime); // インデックス更新
				if (updateWidth == true) {
					_mainTable.updateWidth(this); // リードタイム補正によるノードの幅を再計算
				}
			}
			_mainTable.setUpMatrix(); // 重なり処理

			// 選択したノード全部を処理する。
			List<MSBCP_ItmOrdGanttChart_Node> list = new ArrayList<MSBCP_ItmOrdGanttChart_Node>();
			for (MCXAGDesignNode node : _mainControl.getNodeList()) {
				if (node.isSelected()) {
					list.add((MSBCP_ItmOrdGanttChart_Node) node);
				}
			}

			for (MSBCP_ItmOrdGanttChart_Node node : list) {
				// 日付の時分秒を00:00:00に変更する。
				Date startDate = node.getStartDate(); // 製造開始予定日
				startDate = _mainControl.getDateFor(startDate); // 時分秒をカットする。
				Date endDate = node.getEndDate(startDate); // 製造終了予定日
				endDate = _mainControl.getDateFor(endDate); // 時分秒をカットする。

				// 場外チェックはマウスリリースでのみ行う。
				node.setStartDate(startDate);
				node.setEndDate(endDate);
				if(isUndo == false) {
					node.setChanged(true); // 変更ありをセット。
				} else {
					node.setChanged(false); // 変更ありをセット。
				}
			}

			// Graph更新
			_mainControl.updateGraph3();

			// Tooltop更新
			for (MCXAGDesignNode node : _mainControl.getNodeList()) {
				if (node.isSelected()) {
					node.updateTooltip();
				}
			}

			return;
		}

		// 選択したノード全部を処理する。
		List<MSBCP_ItmOrdGanttChart_Node> list = new ArrayList<MSBCP_ItmOrdGanttChart_Node>();
		for (MCXAGDesignNode node : _mainControl.getNodeList()) {
			if (node.isSelected()) {
				list.add((MSBCP_ItmOrdGanttChart_Node) node);
			}
		}

		// 移動できないものをもとの位置に戻す。
		for (MSBCP_ItmOrdGanttChart_Node node : list) {
			MSBCP_ItmOrdGanttChart_Node ganttNode = (MSBCP_ItmOrdGanttChart_Node) node;
			int mx = ganttNode.getStartIndex();
			int my = ganttNode.verticalIndex();

			if (_mainControl.canMoveNodeForApp(node, mx, my) == false) {
				if (ganttNode.getSaveEndDate() != null) {
					ganttNode.setStartDate(ganttNode.getSaveStartDate());
					ganttNode.setEndDate(ganttNode.getSaveEndDate());
					ganttNode.setLeadTime2(ganttNode.getSaveLeadTime());
				}
			}
		}

		for (MSBCP_ItmOrdGanttChart_Node node : list) {
			int mx = node.getStartIndex();
			int my = node.verticalIndex();

			if(isUndo == false) {
				node.setChanged(true); // 変更ありをセット。
			} else {
				node.setChanged(false); // 変更ありをセット。
			}

			// 壁の中で止まるためチェックはしない。
			if (_mainControl.canMoveNodeForApp(node, mx, my) == true) {

				// 場所移動した場合
				if (updateIndex) {
					_mainTable.updateNodeIndex(node, updateLeaadTime); // インデックス更新
					if (updateWidth == true) {
						_mainTable.updateWidth(node); // リードタイム補正によるノードの幅を再計算
					}
				}

				if (isUndo == false) { // 元の開始日終了日に戻す場合はチェックしない。 7.0.1

					// 日付の時分秒を00:00:00に変更する。
					Date startDate = node.getStartDate(); // 製造開始予定日
					startDate = _mainControl.getDateFor(startDate); // 時分秒をカットする。
					Date endDate = node.getEndDate(startDate); // 製造終了予定日
					endDate = _mainControl.getDateFor(endDate); // 時分秒をカットする。
					if (updateLeaadTime) {
						// リサイズによって開始日または終了日を固定する。
						if (startDate.equals(saveStartDate)) {
							startDate = saveStartDate;
						} else {
							endDate = saveEndDate;
						}
					}

					// 開始日が休日にならないようにずらす。
					startDate = checkWorkingDate(node, startDate, true);

					// 日付の範囲外チェック
					Date limitStartDate = node.getLimitStartDate();
					Date limitEndDate = node.getLimitEndDate();

					// 開始日チェック
					if (limitStartDate != null && startDate.compareTo(limitStartDate) < 0) {
						startDate = limitStartDate; // 製造開始予定日
						endDate = node.getEndDate(startDate); // 製造終了予定日
					}

					// 開始日が休日にならないようにずらす。
					startDate = checkWorkingDate(node, startDate, true);
					if (updateLeaadTime == false) {
						boolean changeEndDate = false; // 終了日を前にずらしたときtrueになる。
						// 終了日チェック
						if (limitEndDate != null && endDate.compareTo(limitEndDate) > 0) {
							// 配置可能まで開始日をずらす。
							long n = startDate.getTime();
							long s = 24 * 60 * 60 * 1000;
							for (long i = n; i >= limitStartDate.getTime(); i -= s) {
								Date startDate2 = new Date(i);
								if (limitStartDate != null && startDate2.compareTo(limitStartDate) < 0) {
									startDate = limitStartDate; // 製造開始予定日
									endDate = node.getEndDate(startDate); // 製造終了予定日
									break;
								}
								startDate = startDate2;
								endDate = node.getEndDate(startDate); // 製造終了予定日
								if (endDate.compareTo(limitEndDate) <= 0) {
									break;
								}
								changeEndDate = true;
							}
						}

						if (changeEndDate) {
							// 開始日が休日にならないように前日側にずらす。
							startDate = checkWorkingDate(node, startDate, false); // 製造開始予定日
							endDate = node.getEndDate(startDate); // 製造終了予定日
						} else {
							// 開始日が休日にならないようにずらす。
							startDate = checkWorkingDate(node, startDate, true); // 製造開始予定日
							endDate = node.getEndDate(startDate); // 製造終了予定日
						}
						node.setStartDate(startDate);
						node.setEndDate(endDate);

					} else {
						node.setStartDate(startDate);
						node.setLeadTime2(node.getLeadTime3()); // リサイズ時のLTを再計算
						endDate = node.getEndDate(startDate); // LTから製造終了予定日を計算
						node.setEndDate(endDate);
					}
				}
			}

			// 見た目の書き換え
			node.updateNodePosition(true, true, true, true);
			node.updateSkinBase(node.pane, node.getPrefWidth(), node.getPrefHeight());
			node.updateSelectionFrame3();
			node.updateLayout();
		}

		for (MSBCP_ItmOrdGanttChart_Node node : list) {
			int mx = thisNode.getStartIndex();
			int my = thisNode.verticalIndex();
			if (_mainControl.canMoveNodeForApp(node, mx, my) == true) {
				// Rowのステータスをmodifyにする。
				// ⑥タスクの移動時に、紐付くRowのステータス変更 （日付変更と同様）
				RsltDispR r = node.getRsltDispR();
				if (r != null) {
					if (r.isStatusNone()) {
						//戻すにした場合
						if (isUndo) {
							r.setStatus(Status.NONE);
						} else {
							r.setStatus(Status.MODIFY);
						}
					}
				}
			}
		}

		// 重なり処理とグラフ値再計算
		_mainTable.setUpMatrix(); // 重なり処理
		_mainTable.updateNodeHeight(); // 重なる部分のNodeを位置調整
		// Graph更新
		_mainControl.updateGraph3();

		// Tooltop更新
		for (MCXAGDesignNode node : list) {
			node.updateTooltip();
		}

		// ノード移動による線分の書き換え
		_mainTable.updateLayoutForVector();
	}

	// nodeの場所と日付が稼働日かどうかをしらべ最初の稼働日を返す
	// plus=trueで未来側にずらす。
	protected Date checkWorkingDate(MCXAGGanttNode node, Date date, boolean plus) {
		Date startDate = date;

		// 開始日が休日にならないようにずらす。
		long n1 = date.getTime();
		long s1 = 24 * 60 * 60 * 1000;
		while(true) {
			Date startDate2 = new Date(n1);
			boolean b = node.isWorkingDay(startDate2, node.verticalIndex());
			if (b == true) {
				startDate = startDate2;
				break;
			}
			startDate = startDate2;
			if (plus) {
				n1 += s1;
			} else {
				n1 -= s1;
			}
		}
		return startDate;
	}

	/**
	 * リサイズ可能かどうか
	 */
	@Override
	public boolean canResize() {
		// 移動できないオーダはリサイズも不可にする。
		int mx = getStartIndex();
		int my = verticalIndex();

		if (_mainControl.canMoveNodeForApp(this,mx,my) == false) {
			return false;
		}

		// ゼロリードタイムの日変更も可能にする。
		return true;
	}


	/**
	 * ノード配置後に呼ばれる処理をここに実装
	 */
	@Override
	public void afterNewNode() {
		super.afterNewNode();
	}

	/**
	 * Excel出力時のラベル
	 *
	 * @return
	 */
	@Override
	public String getExcelLabel() {
		return super.getExcelLabel();
	}

	// インスタンス変数のコピー
	protected MCXAGDesignNode copyInstVars(MSBCP_ItmOrdGanttChart_Node cloneNode, boolean isFull) {
		super.copyInstVars(cloneNode, isFull);
		return cloneNode;
	}

	/**
	 * copy paste undoを行うためのdeepCopyメソッド
	 */
	@Override
	public MCXAGDesignNode deepCopy(boolean isFull) {
		return copyInstVars(new MSBCP_ItmOrdGanttChart_Node(), isFull);
	}

	/**
	 * 稼働日を考慮した場合のリードタイムを返す。
	 */
	@Override
	public long getLeadTime2() {
		if (getStartDate() == null) {
			return getLeadTime();
		}

		// 移動リサイズを行う前は稼働日計算はしない
		if (isChanged() == false) {
			return getLeadTime4();
		}

		return super.getLeadTime2();
	}

	/**
	 * 非稼働日を除いたリードタイムを返す。
	 */
	public long getLeadTime3() {
		if (getStartDate() == null) {
			return getLeadTime();
		}

		long step1 = 60 * 60 * 24;
		long step2 = 1000 * step1;

		long start = getStartDate().getTime();
		long leadTime = getLeadTime() * 1000;

		long result = 0;
		long start2 = start;

		boolean useWorkingDay = ((MCXAGGanttMainControl)_mainControl).isUseWorkingDay();

		if (useWorkingDay == false) {
			return getLeadTime();
		}

		// 開始日を平日にずらす。
		boolean f = true;
		while (f == true) {
			if (isWorkingDay(start2) == false) {
				f = true;
				if (hasTime(new Date(start2))) {
					long m = new Date(start2).getTime() - getDateFor(new Date(start2)).getTime();
					start2 += (step2 - m);
				} else {
					start2 += step2;
				}
			} else {
				f = false;
			}
		}

		// ずらし分をリードタイムに加算
		result += start2 - start;

		// 開始日の端数計算
		long m1 = new Date(start2).getTime() - getDateFor(new Date(start2)).getTime();
		if (hasTime(new Date(start2))) {
			result += step2 - m1;
			start2 += step2 - m1;
			leadTime -= step2 - m1;
		}

		long leadTime3 = leadTime;

		long n = 0;
		// 稼働日を考慮して終了日をずらす
		while (leadTime3 >= step2) {
			if (isWorkingDay(start2 + n) == false) {
				result += step2;
				n += step2;
			} else {
				n += step2;
				leadTime3 -= step2;
				result += step2;
			}
		}

		// 終了日加算
		if (leadTime3 >= 0) {
			result += leadTime3;
			// 平日までずらす。
			boolean f2 = true;
			while (f2 == true) {
				if (isWorkingDay(start + result) == false) {
					f2 = true;
					result += step2;
				} else {
					f2 = false;
				}
			}
		}

		// 開始日が休日にずれてしまう。
		long result2 = result;
		Date limitEndDate = getLimitEndDate();
		for(long n1 = 0; n1 <= result; n1 += step2) {
			if (isWorkingDay(start2 + n1) == false) {
				result2 -= step2;
			}
			else if (start2 + n1 > limitEndDate.getTime()) {
				result2 -= step2;
			}
		}

		// 壁の中はすべて非稼働日にする。

		return result2 / 1000;
	}

	/**
	 * 移動リサイズを行う前のリードタイムを返す。
	 * 単位は時間
	 * 終了日-開始日+1になる。
	 * 7.0.1
	 */
	protected long getLeadTime4() {
		if (getStartDate() == null) {
			return getLeadTime();
		}
		if (getEndDate2() == null) {
			return getLeadTime();
		}

		long step1 = 60 * 60 * 24;
		long step2 = 1000 * step1;

		long start = getStartDate().getTime();
		long end = getEndDate2().getTime();

		long result = (end - start) / step2 * step1 + step1;
		return result;
	}

	/**
	 * 製造終了予定日を返す。
	 * リードタイム稼働日などを考慮しない場合の終了日。
	 */
	protected Date getEndDate2() {
		return _endDate;
	}

	/**
	 * 対応するRsltDispRを返す。
	 */
	protected RsltDispR getRsltDispR() {
		MSBCP_ItmOrdGanttChart_Gantt gantt = (MSBCP_ItmOrdGanttChart_Gantt)_mainControl;
		return gantt.getRsltDispR(this);
	}

	/**
	 * Tooltipに表示する内容を返す。
	 */
	@Override
	public List<MCXAGToolTipText> getTooltipList() {
		List<MCXAGToolTipText> list = new ArrayList<MCXAGToolTipText>();

		String record_id = getPropertyValue("record_id");

		if (!isVisible() || isNull(record_id)) {
			list.add(new MCXAGToolTipText("", labelText, 0, 100, 12));
		}

		RsltDispR findR = getRsltDispR();
		if (findR != null) {

			MSBCP_ItmOrdGanttChart panel = (MSBCP_ItmOrdGanttChart) ((MSBCP_ItmOrdGanttChart_Gantt) _mainControl).panel;
			int fontSize = panel.getPgmSettingIntNE(panel, 12, "tooltip.font_size");
			int labelWidth = panel.getPgmSettingIntNE(panel, 150, "tooltip.label_width");
			int valueWidth = panel.getPgmSettingIntNE(panel, 200, "tooltip.value_width");

			String items = panel.getPgmSettingStringNE(panel, null, "tooltip.items");
			if (!isNull(items)) {
				for (String item : items.split(";")) {
					if (!isNull(item)) {
						StringBuilder label = new StringBuilder();
						StringBuilder val = new StringBuilder();
						for (String col : item.split(",")) {
							String rCol = findR.getRealColumnPath(col);
							MCColumnConfig conf = getColumnConfig(rCol);
							if (conf == null) {
								label.append(col);
								val.append(col);
							}
							else {
								label.append(conf.getLabelByLocale());
								Comparable<?> x = findR.getValue(conf.getBaseRowColumnName());
								if (!isNull(x)) {
									if (x instanceof String) {
										val.append(x);
									}
									else if (x instanceof MCNumber) {
										val.append((MCNumber)x);
									}
									else if (x instanceof MCDate) {
										val.append(toYMDString((MCDate)x));
									}
									else if (x instanceof Boolean) {
										if ((Boolean)x) {
											val.append(MAC_STR.PRNT_CHK_TRUE.value());
										}
										else {
											val.append(MAC_STR.PRNT_CHK_FALSE.value());
										}
									}
								}
							}
						}
						list.add(new MCXAGToolTipText(label.toString(), val.toString(), labelWidth, valueWidth, fontSize));
					}
				}
			}
		}

		return list;
	}

	protected MCColumnConfig getColumnConfig(String baseRowColumnName) {
		MSBCP_ItmOrdGanttChart panel = (MSBCP_ItmOrdGanttChart)((MSBCP_ItmOrdGanttChart_Gantt) _mainControl).panel;
		return panel.getColumnConfig(panel.RsltDispTable, baseRowColumnName);
	}

	/**
	 * 製造開始予定日
	 *
	 * @return Date
	 */
	@Override
	public Date getStartDate() {
		return _startDate;
	}

	/**
	 * 製造開始予定日を更新
	 *
	 * @param date
	 */
	@Override
	public void setStartDate(Date date) {
		if (date == null) {
			// startDateはガントで必須
			return;
		}

		// 日付が変化したときのみrow更新処理をする。
		if(_startDate != null && _startDate.equals(date)) {
			return;
		}
		_startDate = date;

		RsltDispR findR = getRsltDispR();
		if (findR != null) {
			// ここで下部の一覧が書き換わる
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					MCDate mdate = MCDate.valueOf(date);
					if (mdate.equals(findR.mfg_st_dt()) == false) {
						findR.mfg_st_dt(mdate);
					}
				}
			});
		}
	}

	/**
	 * 製造終了予定日を更新
	 * mfg_end_dtをdateで書き換える。
	 */
	@Override
	public void setEndDate(Date date) {
		// 日付が変化したときのみrow更新処理をする。
		if(_endDate != null && _endDate.equals(date)) {
			return;
		}
		_endDate = date;
		// 7.0.1
		RsltDispR findR = getRsltDispR();
		if (findR != null) {
			// ここで下部の一覧が書き換わる
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					MCDate d = MCDate.valueOf(date);
					if (findR.mfg_end_dt() == null || findR.mfg_end_dt().equals(d) == false) {
						findR.mfg_end_dt(d);
					}
				}
			});
		}
	}

	/**
	 * 初期化完了後の後処理
	 */
	@Override
	public void afterInit() {

		// ハイライトの線の外観指定
		this.hiliteLineWidthOffset = 2;
	}

	/**
	 * 内部で保持リードタイム
	 * 単純に終了日-開始日
	 * 製造LTではない。
	 */
	@Override
	public long getLeadTime() {
		return _leadTime;
	}

	/**
	 * リードタイム書き換え
	 * 初期設定で呼ばれる
	 */
	@Override
	public void setLeadTime1(long n) {
		_leadTime = n;
	}

	/**
	 * リードタイム書き換え
	 * ノードのリサイズで呼ばれる
	 */
	@Override
	public void setLeadTime2(long n) {
		_leadTime = n;
	}

	/**
	 * EventHandler初期化
	 */
	@Override
	public void initEventHandler() {
		super.initEventHandler();
	}

	/**
	 * 時間刻みを変更した場合に水平方向を移動リサイズする。
	 */
	@Override
	public void updateNodePosition(boolean resizeX, boolean resizeY, boolean updateIndex, boolean updateVector) {
		_updateNodePosition(resizeX, resizeY, updateIndex, updateVector);

		RsltDispR r = getRsltDispR();
		if (r != null) {
			Color nodeColor = ((MSBCP_ItmOrdGanttChart_Gantt) _mainControl).getNodeColor(r);
			Color lineColor = ((MSBCP_ItmOrdGanttChart_Gantt) _mainControl).getNodeBorderColor(r);

			Double borderWidth = ((MSBCP_ItmOrdGanttChart_Gantt) _mainControl).getNodeBorderWidth(r);
			Double borderDash = ((MSBCP_ItmOrdGanttChart_Gantt) _mainControl).getNodeBorderDash(r);

			// 色も変更
			setFillColor(nodeColor);
			setLineColor(lineColor);

			setLineWidth(borderWidth);
			setBorderDash(borderDash);
		}
	}

	// 選択可能かどうか
	@Override
	public boolean canSelectNode() {
		// 選択はすべて可
		return true;
	}

	@Override
	public void setHiliteColor(Color col) {
		// ハイライト時のノードの色をアプリで設定できるようあとでインフラを修正する
		Double myLineWidth = ((MSBCP_ItmOrdGanttChart_Gantt)_mainControl)._hilight_line_width;
		Color myLineColor = ((MSBCP_ItmOrdGanttChart_Gantt)_mainControl)._hilight_line_color;
		if (customNode != null) {
			customNode.setHiliteColor(col);
		}

		if (col == null) {
			if (rect != null) {
				rect.setStrokeWidth(lineWidth);
				rect.setStroke(lineColor);
			}
			if (ellipse != null) {
				ellipse.setStrokeWidth(lineWidth);
				ellipse.setStroke(lineColor);
			}
			if (polygon != null) {
				polygon.setStrokeWidth(lineWidth);
				polygon.setStroke(lineColor);
			}
		} else {
			if (rect != null) {
				rect.setStrokeWidth(myLineWidth);
				rect.setStroke(myLineColor);
			}
			if (ellipse != null) {
				ellipse.setStrokeWidth(myLineWidth);
				ellipse.setStroke(myLineColor);
			}
			if (polygon != null) {
				polygon.setStrokeWidth(myLineWidth);
				polygon.setStroke(myLineColor);
			}
		}

	}

	// ドラッグ時に範囲チェックするかどうか
	@Override
	public boolean dragCheck() {
		return false;
	}

	@Override
	public void mouseRelease(MouseEvent event) {

		switch (_mainControl.getCurrentMode()) {
		case Rectangle:
		case Ellipse:
		case Rhombus:
		case Custom:
			break;
		default:
			break;
		}

		if (_mainControl.isDesignMode()) {
			if (_doDrag == true || _doResize == true) {

				double ptx1 = thisNode.getLayoutX();
				double pty1 = thisNode.getLayoutY();

				// マウスリリース時にグリッド合わせする。
				double scaleX = _mainTable.getFrameScaleX();
				double scaleY = _mainTable.getFrameScaleY();

				double stepX = _mainControl.getGridStepX() * scaleX;
				double stepY = _mainControl.getGridStepY() * scaleY;

				int stepX2 = (int) 0;
				int stepY2 = (int) 0;
				if (_mainControl.isUsedGridX() == true) {
					ptx1 = Math.floor((ptx1 - stepX2) / stepX) * stepX;
				}
				if (_mainControl.isUsedGridY() == true) {
					if (_mainControl.getVerticalTable() != null) {
						// グリッドが合わない場合はここをチェック
						double offset = _mainControl.verticalOffsetY();
						pty1 = _mainControl.getVerticalTable().getGridPointY(pty1 / scaleY - offset - stepY2) * scaleY;
						pty1 = pty1 + offset * scaleY;
					} else {
						pty1 = Math.floor((pty1 - stepY2) / stepY) * stepY;
					}
				}

				// 移動可能範囲
				Point2D pt2 = checkPosition(new Point2D(ptx1, pty1));
				double ptx2 = pt2.getX();
				double pty2 = pt2.getY();

				boolean canMove = true;
				if (_mainControl.getVerticalTable() != null) {
					if (_mainControl.isUsedGridY() == true) {
						int mx3 = (int) (ptx2 / stepX);
						double offsetY = _mainControl.verticalOffsetY();
						int my3 = _mainControl.getVerticalTable().getCellY(pty2 / scaleY - offsetY);
						if (_mainControl.canMoveNodeForApp(thisNode, mx3, my3) == false) {
							canMove = false;
						}
					} else {
						double offsetY = _mainControl.verticalOffsetY();
						int mx3 = (int) (ptx2 / stepX);
						int my3 = (int) ((pty2 + offsetY * scaleY) / stepY);
						if (_mainControl.canMoveNodeForApp(thisNode, mx3, my3) == false) {
							canMove = false;
						}
					}
				} else {
					int mx3 = (int) (ptx2);
					int my3 = (int) (pty2 / stepY);
					if (_mainControl.canMoveNodeForApp(thisNode, mx3, my3) == false) {
						canMove = false;
					}
				}

				// 移動可能チェック
				if (canMove == false) {
					ptx2 = thisNode.secondMouseX();
					pty2 = thisNode.secondMouseY();
				}

				thisNode.setFramePos(ptx2, pty2);
				_mainTable.updateLayoutForNode(thisNode);
				_mainTable.updateNodeStartDate(thisNode);

				// 移動が行われた後処理。
				hideResizeLabel();
				if (_doResize == true) {
					thisNode.afterMoveNode(true, true, true, false, false); // 引数追加 7.0.1
				} else {
					thisNode.afterMoveNode(true, true,  false, false, false); // 引数追加 7.0.1
				}

				MCXAGDesignUndoManager.INSTANCE.addChange(MCXAGDesignUndoManager.dChangeTypeMove,
						MCXAGDesignUndoManager.dObjectTypeNode, thisNode,
						MCXAGDesignChange.cloneNode(thisNode),1);
			}

		}
	}

	// リサイズハンドル上であるか調べる
	// ガントの場合は水平方向のみリサイズする。
	@Override
	public int getHandlePosition(double x, double y) {

		double w = getPrefWidth();
		double h = getPrefHeight();

		Rectangle2D r1 = new Rectangle2D(0, 0, dHandleSize, dHandleSize);
		if (r1.contains(x, y)) {
			return dResize_left;
		}

		Rectangle2D r2 = new Rectangle2D(w - dHandleSize, 0, dHandleSize, dHandleSize);
		if (r2.contains(x, y)) {
			return dResize_right;
		}

		Rectangle2D r3 = new Rectangle2D(0, h - dHandleSize, dHandleSize, dHandleSize);
		if (r3.contains(x, y)) {
			return dResize_left;
		}

		Rectangle2D r4 = new Rectangle2D(w - dHandleSize, h - dHandleSize, dHandleSize, dHandleSize);
		if (r4.contains(x, y)) {
			return dResize_right;
		}

		// 右サイド
		Rectangle2D r5 = new Rectangle2D(w - dHandleSize, 0, dHandleSize, h);
		if (r5.contains(x, y)) {
			return dResize_right;
		}

		// 左サイド
		Rectangle2D r6 = new Rectangle2D(0, 0, dHandleSize, h);
		if (r6.contains(x, y)) {
			return dResize_left;
		}

		return dResize_none;
	}
}