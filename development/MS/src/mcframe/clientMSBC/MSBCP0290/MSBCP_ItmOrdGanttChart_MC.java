package mcframe.clientMSBC.MSBCP0290;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMSUB.MSUBP5020.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

import java.util.HashSet;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import mcframe.clientCore.fxgantt.design.MCXAGDesignNode;
import mcframe.clientCore.fxgantt.icon.MCXAGDesignIconManager;
import javax.swing.SwingUtilities;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_ItmOrdGanttChart"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_ItmOrdGanttChart_MC extends MSBCP_ItmOrdGanttChart_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected CndR _srchCndR;

	// ガント関連項目
	public int loadDesignNo = 0;

	public MSBCP_ItmOrdGanttChart_Gantt mainControl;

	// JavaFXのパネル追加
	protected JFXPanel fxPanel = null;

	// 背景色を指定
	protected Color mainControl_backgroundColor = new Color(0.9, 1.0, 0.9, 1.0);

	// グリッドの幅高さを指定する。
	protected final double mainControl_gridStepX = 100.0;
	protected final double mainControl_gridStepY = 100.0;

	protected String vLabelString1 = getDispString("gantt.vertical_label");

	protected String graphTitle = getDispString("gantt.graphTitle"); // "負荷グラフ"
	protected String legend1 = getDispString("gantt.legend1"); //  "実際値"
	protected String legend2 = getDispString("gantt.legend2"); // "基準値"
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_ItmOrdGanttChart_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_ItmOrdGanttChart_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[LPnl]のボタン[move_prev_day]の押下時の処理
	 */
	@Override
	public void doLPnl_move_prev_day(MCEventInfo info) {
		// 選択されたオーダを前日に移動する。
		moveNode(-1);
	}
	/**
	 * Panel[LPnl]のボタン[move_next_day]の押下時の処理
	 */
	@Override
	public void doLPnl_move_next_day(MCEventInfo info) {
		// 選択されたオーダを翌日に移動する。
		moveNode(1);
	}

	// 選択されたオーダを日数分移動する。
	protected void moveNode(int offsetDay) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				ArrayList<MSBCP_ItmOrdGanttChart_Node> nodeList = new ArrayList<>();
				// Undoできるように現状値を退避
				for (MCXAGDesignNode node : mainControl.getNodeList()) {
					if (canMoveNode(node) == true) {
						if (node.isSelected()) {
							MSBCP_ItmOrdGanttChart_Node ganttNode = (MSBCP_ItmOrdGanttChart_Node) node;
							ganttNode.setSaveStartDate(ganttNode.getStartDate());
							ganttNode.setSaveEndDate(ganttNode.getEndDate());
							ganttNode.setSaveLeadTime(ganttNode.getLeadTime());
							nodeList.add(ganttNode);
						}
					}
				}

				long n = offsetDay;
				long s = 24 * 60 * 60 * 1000;
				for (MSBCP_ItmOrdGanttChart_Node node : nodeList) {
					java.util.Date startDate = node.getStartDate();
					long n1 = startDate.getTime() + (n*s);
					startDate = new java.util.Date(n1);

					while (true) {
						// 開始日が非稼働日の場合は更にずらす。
						boolean b = ((MSBCP_ItmOrdGanttChart_Node) node).isWorkingDay(startDate, node.verticalIndex());
						if (b == true) {
							break;
						}
						n1 = startDate.getTime() + (n * s);
						startDate = new java.util.Date(n1);
					}
					if (node.getStartDate().equals(startDate) == false) {
						node.setStartDate(startDate);
					}
				}
				// afterMoveNodeでまとめて移動後処理が計算されるため最後のノードのみ処理すればよい。
				if(nodeList.size() > 0) {
					nodeList.get(nodeList.size()-1).afterMoveNode(false, true, false, false, false);
				}
			}
		});
	}

	/**
	 * Panel[LPnl]のボタン[select]の押下時の処理
	 */
	@Override
	public void doLPnl_select(MCEventInfo info) {
		// 選択期間の指定に応じてガントを選択する
		if (isNull(getLPnlR().select_dt_fr()) && isNull(getLPnlR().select_dt_to())) {
			MCList<RsltDispR> tarL = getRsltL();
			selectNode(tarL);
		}
		else if (!isNull(getLPnlR().select_dt_fr()) && isNull(getLPnlR().select_dt_to())) {
			MCList<RsltDispR> tarL = getRsltL().subList(r->r.mfg_st_dt().gteDate(getLPnlR().select_dt_fr()));
			selectNode(tarL);
		}
		else if (isNull(getLPnlR().select_dt_fr()) && !isNull(getLPnlR().select_dt_to())) {
			MCList<RsltDispR> tarL = getRsltL().subList(r->r.mfg_end_dt().lteDate(getLPnlR().select_dt_to()));
			selectNode(tarL);
		}
		else {
			MCList<RsltDispR> tarL = getRsltL().subList(r->
			(r.mfg_st_dt().gteDate(getLPnlR().select_dt_fr()) && r.mfg_end_dt().lteDate(getLPnlR().select_dt_to())));
			selectNode(tarL);
		}
	}

	/**
	 * Panel[LPnl]のボタン[select_by_alloc_pln]の押下時の処理
	 */
	@Override
	public void doLPnl_select_by_alloc_pln(MCEventInfo info) {
		MCList<RsltDispR> selectL = getRsltDispL();

		// レコードのグループに目印を設定する
		for (RsltDispR r : selectL) {
			if (!isNull(r.record_id()) && isNull(r.record_grp_id())) {
				visit(r.record_id(), r);
			}
		}

		// 目印を元に、レコードのグループを取得する
		HashSet<String> grpSet = new HashSet<>();
		for (RsltDispR r : selectL) {
			grpSet.add(r.record_grp_id());
		}

		MCList<RsltDispR> connectL = getRsltL().subList(r->grpSet.contains(r.record_grp_id()));
		selectNode(connectL);
	}

	protected void visit(String grpId, RsltDispR r) {
		r.record_grp_id(grpId);
		for (RsltDispR x : getAdjacent(r)) {
			if (isNull(x.record_grp_id())) {
				visit(grpId, x);
			}
		}
	}
	protected MCList<RsltDispR> getAdjacent(RsltDispR r) {
		MCList<RsltDispR> l = MCList.create(RsltDispR.class);
		if (!isNull(r.itm_ord_no())) {
			HashSet<String> itmOrdNoSet = new HashSet<>();
			for (AllocPlnR a : getAllocPlnL()) {
				if (isSame(r.itm_ord_no(), a.itm_ord_no())) {
					// 子品目：引当している
					itmOrdNoSet.add(a.io_schd_pr_no());
				}
				else if (isSame(r.itm_ord_no(), a.io_schd_pr_no())) {
					// 親品目：引当されている
					itmOrdNoSet.add(a.itm_ord_no());
				}
			}
			for (RsltDispR x : getRsltL()) {
				if (itmOrdNoSet.contains(x.itm_ord_no())) {
					l.add(x);
				}
			}
		}
		return l;
	}


	protected void selectNode(MCList<RsltDispR> l) {
		// ガントとMCTableの相互で選択が起きるためガントのノード選択だけ行う。
		ArrayList<MCXAGDesignNode> nodeL = new ArrayList<>();
		for(MCXAGDesignNode node : mainControl.getNodeList()) {
			String record_id = node.getPropertyValue("record_id");
			for (RsltDispR r : l) {
				if (!isNull(record_id) && isSame(record_id, r.record_id())) {
					nodeL.add(node);
				}
			}
		}
		selectNode(nodeL.toArray(new MCXAGDesignNode[0]));
	}
	/**
	 * ガントの特定ノードだけを選択状態にする。
	 * 画面に見えないものは何も起きない。
	 */
	protected void selectNode(MCXAGDesignNode... selectedNodes) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				for(MCXAGDesignNode node : mainControl.getNodeList()) {
					boolean boo = false;
					for (MCXAGDesignNode selectedNode : selectedNodes) {
						if(node == selectedNode) {
							boo = true;
							break;
						}
					}
					node.setSelected(boo);
					mainControl.doSelectedNodeChanged(); // この処理で選択されたノードに対応するデータが下部のテーブルに表示される
				}
			}
		});
	}

	/**
	 * Panel[LPnl]のボタン[sts_opn]の押下時の処理
	 */
	@Override
	public void doLPnl_sts_opn(MCEventInfo info) {
		updateSts(MSC_ITM_ORD_LD_STS_TYP.OPN);
	}
	/**
	 * Panel[LPnl]のボタン[sts_sav]の押下時の処理
	 */
	@Override
	public void doLPnl_sts_sav(MCEventInfo info) {
		updateSts(MSC_ITM_ORD_LD_STS_TYP.SAV);
	}

	protected void updateSts(MSC_ITM_ORD_LD_STS_TYP newTyp) {
		boolean f = false;
		for (RsltDispR r :getRsltDispL()) {
			if (canMove(r)) {
				setValueEx(columnRsltDisp_itm_ord_ld_sts_typ, r.getGUIIndex(), newTyp.value());
				f = true;
			}
		}
		if(f) {
			updateGanttNode();
		}
	}


	/**
	 * ガント画面側の表示を更新する。
	 */
	protected void updateGanttNode() {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					mainControl.updateGanttNode();
				}
				catch (Throwable ex) {
					ex.printStackTrace();
					// (FCBAC0440) イベントディスパッチスレッドではありません。を回避させる。
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							MCBeansUtil.handle(GanttPanel, ex);
						}
					});
				}
			}
		});
	}


	/**
	 * Panel[LPnl]のボタン[undo]の押下時の処理
	 */
	@Override
	public void doLPnl_undo(MCEventInfo info) {
		for (RsltDispR r :getRsltDispL()) {
			if (canMove(r)) {
				r.itm_ord_ld_sts_typ(r.old_itm_ord_ld_sts_typ());
				r.itm_ord_ld_sts_typ_nm(r.old_itm_ord_ld_sts_typ_nm());
				r.mfg_st_dt(r.old_mfg_st_dt()); // 7.0.1 開始日を戻す
				r.mfg_end_dt(r.old_mfg_end_dt()); // 7.0.1 終了日を戻す
				setGanttLt(r); // 7.0.1 gantt_ltを戻す。
				r.setStatus(Status.NONE);
			}
		}
		updateGanttNodeUndo();
	}

	/**
	 * Panel[LPnl]のボタン[undo]の押下時の処理<br>
	 * ガント画面側の表示を更新する。
	 */
	protected void updateGanttNodeUndo() {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					for (MCXAGDesignNode node : mainControl.getNodeList()) {
						if(canMoveNode(node) == true) {
							if (node.isSelected()) {
								MSBCP_ItmOrdGanttChart_Node appNode = (MSBCP_ItmOrdGanttChart_Node)node;
								RsltDispR tarR = appNode.getRsltDispR();
								// 7.0.1
//								java.util.Date startDate = tarR.old_mfg_st_dt().toDate();
//								java.util.Date endDate = tarR.old_mfg_end_dt().toDate();
								java.util.Date startDate = tarR.mfg_st_dt().toDate();
								java.util.Date endDate = tarR.mfg_end_dt().toDate();
								appNode.setStartDate(startDate);
								appNode.setEndDate(endDate);

								// 7.0.1 内部計算の_leadTimeを戻す。
								long leadTime = mainControl.getLeadTime(tarR, appNode.verticalIndex());
								appNode.setLeadTime1(leadTime);

								// 7.0.1 afterMoveNodeで処理するため不要
								// appNode.updateNodePosition(true, true, true, true);
								// appNode.updateSkinBase(node.getPane(), node.getPrefWidth(), node.getPrefHeight());
								// appNode.updateSelectionFrame3();
								// appNode.updateLayout();
								// 7.0.1 UNDO対応afterMoveNode 第5引数にtrueを指定
								appNode.afterMoveNode(false, false, false, false, true);
							}
						}
					}
				}
				catch (Throwable ex) {
//					ex.printStackTrace();
//					MCBeansUtil.handle(GanttPanel, ex);
					// 7.0.1 (FCBAC0440) イベントディスパッチスレッドではありません。を回避させる。
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							MCBeansUtil.handle(GanttPanel, ex);
						}
					});
				}
			}
		});
	}

	/**
	 * Panel[LPnl]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLPnl_rdel(MCEventInfo info) {
		boolean f = false;
		for (RsltDispR r :getRsltDispL()) {
			if (canMove(r)) {
				r.setStatus(Status.DELETE);
				f = true;
			}
		}
		if(f) {
			updateGanttNode();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0290_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL0290_Upd01();
	}

	/**
	 * [MS_MSBCL0290_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0290_Srch01Caller<P extends MSBCP_ItmOrdGanttChart, B extends MS_MSBCL0290_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0290_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			setScreenAsync(false);
			addDownContainer(getRsltDispL());
			if (Cnd_alloc_pln_r_view_NRML.isSelected()) {
				getCndR().alloc_pln_mrp_typ(MSC_MRP_TYP.MRP.value());
			}
			else if (Cnd_alloc_pln_r_view_PRCD.isSelected()) {
				getCndR().alloc_pln_mrp_typ(MSC_MRP_TYP.PRCD.value());
			}
			else if (Cnd_alloc_pln_r_view_SIM.isSelected()) {
				getCndR().alloc_pln_mrp_typ(MSC_MRP_TYP.SIM.value());
			}
			else {
				getCndR().alloc_pln_mrp_typ(null);
			}
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_dt_fr, Cnd_dt_to));
			msgList.addAll(checkAtLeastOne(Cnd_opn_flg, Cnd_sav_flg, Cnd_fix_flg,
					Cnd_inst_flg, Cnd_cmpl_flg, Cnd_prcd_flg, Cnd_sim_flg));
		}

		@Override
		protected void show() {
			super.show();
			showSub();
			showGantt();
		}

		protected void showSub() {
			int n = 1;
			for(RsltDispR r : getRsltL()) {
				// ガントチャート表示用の編集
				r.disp_itm_cd(toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), panel));
				r.disp_sno(toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4(), panel));

				// 元に戻す操作のため、変更前の値を退避する
				saveOldval(r);

				// record_idを初期化
				r.record_id(String.valueOf(n));
				n++;
			}

			// ガントチャート用のリードタイム設定
			setGanttLt();

			// 検索条件の保持
			_srchCndR = getCndR().clone();

		}

		protected void saveOldval(RsltDispR r ) {
			r.old_mfg_st_dt(r.mfg_st_dt());
			r.old_mfg_end_dt(r.mfg_end_dt());
			r.old_itm_ord_ld_sts_typ(r.itm_ord_ld_sts_typ());
			r.old_itm_ord_ld_sts_typ_nm(r.itm_ord_ld_sts_typ_nm());
		}

		protected void showGantt() {
			// ガントチャート表示、グラフ表示
			// JFXPanelを生成するためjavafx用のスレッドを生成する。
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					try {
						mainControl.initGanttList(getRsltL(), getLocL(), getCalL(),
								getAllocPlnL(), vLabelString1);
						((MSBCP_ItmOrdGanttChart_Palette)mainControl.getDesignPalette()).setDate(_srchCndR.dt_fr());
					}
					catch (Throwable ex) {
						ex.printStackTrace();
						MCBeansUtil.handle(GanttPanel, ex);
					}
				}
			});
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUPDStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		@Override
		protected void resultNoDataFound() {
			super.resultNoDataFound();
			initGantt();
		}
	}

	/**
	 * [MS_MSBCL0290_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0290_Upd01Caller<P extends MSBCP_ItmOrdGanttChart, B extends MS_MSBCL0290_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0290_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			setupUpParamSub();
		}

		protected void setupUpParamSub() {
			bridge.up0().clear();
			for (RsltDispR r : getRsltL()) {
				if (r.isStatusModify() || r.isStatusDelete()) {
					bridge.up0().add(r);
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}
	}

	public boolean canMove(RsltDispR r) {

		if (!isUPDStatus(getStatus())) {
			return false;
		}

		// 検索範囲外のノードは操作不可
		if (r.mfg_st_dt().gteDate(_srchCndR.dt_fr()) && r.mfg_end_dt().lteDate(_srchCndR.dt_to())) {
			if (MSC_ITM_ORD_LD_STS_TYP.isOPN(r.old_itm_ord_ld_sts_typ())
					|| MSC_ITM_ORD_LD_STS_TYP.isSAV(r.old_itm_ord_ld_sts_typ())) {
				return true;
			}
		}
		return false;
	}
	// 同期をとらずに開始日を計算する。
	public boolean canMove(RsltDispR r, MCXAGDesignNode node) {

		if (!isUPDStatus(getStatus())) {
			return false;
		}

		// rからとらずにガント側から直接取得
		MCDate mfg_st_dt = MCDate.valueOf(node.getStartDate());
		MCDate mfg_end_dt = MCDate.valueOf(node.getEndDate());

		// 検索範囲外のノードは操作不可
		if (mfg_st_dt.gteDate(_srchCndR.dt_fr()) && mfg_end_dt.lteDate(_srchCndR.dt_to())) {
			if (MSC_ITM_ORD_LD_STS_TYP.isOPN(r.old_itm_ord_ld_sts_typ())
					|| MSC_ITM_ORD_LD_STS_TYP.isSAV(r.old_itm_ord_ld_sts_typ())) {
				return true;
			}
		}
		return false;
	}

	protected CndR getSrchCndR() {
		if (_srchCndR == null) {
			_srchCndR = getCndR().clone();
		}
		return _srchCndR;
	}
	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		RsltDisp_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);

		RsltDisp_inst_qty_p_PPanel.setRelateBeans(columnRsltDisp_unit_cd, columnRsltDisp_dec_place);
		RsltDisp_rsrc_act_qty1_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm1, columnRsltDisp_rsrc_dec_place1);
		RsltDisp_rsrc_act_qty2_p_PPanel.setRelateBeans(columnRsltDisp_rsrc_unit_nm2, columnRsltDisp_rsrc_dec_place2);

		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_rsrc_act_qty1_p_PPanel.setRelateBeans(columnRslt_rsrc_unit_nm1, columnRslt_rsrc_dec_place1);
		Rslt_rsrc_act_qty2_p_PPanel.setRelateBeans(columnRslt_rsrc_unit_nm2, columnRslt_rsrc_dec_place2);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		RsltTable.setMode(MCMode.INVISIBLE);
	}

	@SuppressWarnings("unchecked")
	@Override
	public MCList getRsltDisp_itm_ord_ld_sts_typ(MCRow row, MCEventInfo info) {
		MCList l = super.getRsltDisp_itm_ord_ld_sts_typ(row, info);

		// この画面では未確定・保存にしか変更できないため、リストの結果を間引く
		MCList rl = l.createInstance();
		for (Object obj : l) {
			MCRow x = (MCRow)obj;
			if (MSC_ITM_ORD_LD_STS_TYP.isOPN(x.getString(ItmOrdLdStsTypCols.$o_itm_ord_ld_sts_typ))
					|| MSC_ITM_ORD_LD_STS_TYP.isSAV(x.getString(ItmOrdLdStsTypCols.$o_itm_ord_ld_sts_typ))) {
				rl.add(x);
			}
		}
		return rl;
	}
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub(){
		// Cnd
		setValueEx(Cnd_opn_flg, true);
		setValueEx(Cnd_sav_flg, true);
		setValueEx(Cnd_fix_flg, true);
		setValueEx(Cnd_inst_flg, true);

		MCDate dtFr = getToday();
		MCDate dtTo = null;
		if (!isNull(dtFr)) {
			dtTo = dtFr.addDay(getPgmSettingIntNE(this, 14, "init.term")-1);
		}
		getCndR().dt_fr(dtFr);
		getCndR().dt_to(dtTo);

	}

	// -----------------------------------------------
	// status
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setCndMode();

		RsltDispTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);

		//編集モードをdisableにする。
		mainControl.enableDesignMode(true);
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setCndMode();

		//編集モードをdisableにする。
		mainControl.setDesignMode(false);
		mainControl.enableDesignMode(false);

		CndPanel.focusFirstComponent();
	}

	protected void setCndMode() {
		// 先行工手配
		if (getCndR().prcd_flg()) {
			Cnd_alloc_pln_r_view_PRCD.setMode(MCMode.ENABLE);
		}
		else {
			if (Cnd_alloc_pln_r_view_PRCD.isSelected()) {
				Cnd_alloc_pln_r_view_Group.setValue(Cnd_alloc_pln_r_view_NRML.getActionCommand());
			}
			Cnd_alloc_pln_r_view_PRCD.setMode(MCMode.READ_ONLY);
		}
		// シミュレーション
		if (getCndR().sim_flg()) {
			setDefaultMode(Cnd_sim_mrp_no);
			Cnd_alloc_pln_r_view_SIM.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_sim_mrp_no.setMode(MCMode.READ_ONLY);
			if (Cnd_alloc_pln_r_view_SIM.isSelected()) {
				Cnd_alloc_pln_r_view_Group.setValue(Cnd_alloc_pln_r_view_NRML.getActionCommand());
			}
			Cnd_alloc_pln_r_view_SIM.setMode(MCMode.READ_ONLY);
		}
	}

	protected boolean isEnableBtn_open_dtl(RsltDispR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MSBCP0320(RsltDispR r) {
		if (isSame(getStatus(), UPD) || isSame(getStatus(), FIX_U)) {
			return true;
		}
		return false;
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_prcd_flg_NC(MCEventInfo info) {
		super.doCnd_prcd_flg_NC(info);
		setCndMode();
	}

	@Override
	public void doCnd_sim_flg_NC(MCEventInfo info) {
		super.doCnd_sim_flg_NC(info);
		setCndMode();
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltDispTable) {
			RsltDispR r = getRsltL().get(info.getEventIndex());
			MCDate stDt = r.mfg_st_dt();
			if (!isNull(stDt)) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						mainControl.setStartDate(stDt.toDate());
					}
				});
			}
		}
	}


	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltDispTable.setCellConfig(crtRsltCellConfig());
	}
	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}
	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isUpdStatus()) {
				RsltDispR r = (RsltDispR) table.getBaseTable().getRow(index);

				if (!canMove(r)) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	// -----------------------------------------------
	// ここからガント関連のメソッド

	public MCColumnConfig getColumnConfig(MCTable table, String baseRowColumnName) {
		if (isNull(baseRowColumnName)) {
			return null;
		}

		for (MCColumnConfig column : table.getColumnConfigs()) {
			if (baseRowColumnName.equals(column.getBaseRowColumnName())) {
				return column;
			}
		}
		return null;
	}

	public void accept(RsltDispR r, MCColumnConfig col, Comparable<?> val) {
		if (r == null || col == null) {
			return ;
		}
		if (!canMove(r)) {
			return ;
		}

		if (col == columnRsltDisp_mfg_st_dt) {
			if (!isNull(val)) {
				r.mfg_st_dt((MCDate)val);
			}
		}
		else if (col == columnRsltDisp_mfg_end_dt) {
			MCDate dt = (MCDate)val;
			if (!isNull(dt) && r.mfg_st_dt().lteDate(dt)) {
				r.mfg_end_dt(dt);
			}
			else {
				// 休日
				r.mfg_end_dt(r.mfg_st_dt().addDay(nvl(r.mfg_lt(), MCNumber.ZERO)));
			}
		}
		else if (col == columnRsltDisp_itm_ord_ld_sts_typ) {
			String str = (String)val;
			MSC_ITM_ORD_LD_STS_TYP typ = MSC_ITM_ORD_LD_STS_TYP.getNE(str);
			r.itm_ord_ld_sts_typ(typ.value());
			r.itm_ord_ld_sts_typ_nm(typ.name());
		}
		else if (col == columnRsltDisp_inst_po_cnt_rmrks) {
			r.inst_po_cnt_rmrks((String)val);
		}
		else if (col == columnRsltDisp_intr_rmrks) {
			r.intr_rmrks((String)val);
		}
		else if (col == columnRsltDisp_sub_char1) {
			r.sub_char1((String)val);
		}
		else if (col == columnRsltDisp_sub_char2) {
			r.sub_char2((String)val);
		}
		else if (col == columnRsltDisp_sub_char3) {
			r.sub_char3((String)val);
		}
		else {
			return ;
		}

		if (r.isStatusNone()) {
			r.setStatus(MCRow.MODIFY);
		}

	}

	/**
	 * 縦ラベル名を返す。
	 */
	public List<String> getVerticalLabelList() {
		List<String>list = new ArrayList<String>();
		list.add(vLabelString1);
		return list;
	}

	/**
	 * [Gantt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitGantt(MSBCP_ItmOrdGanttChart p) {
		MSBCP_ItmOrdGanttChart_MC_A.jbInitGantt(p);

		// GanttTableを使用しないため非表示にする。
		// 空いた場所にfxのガントを埋め込み。
		p.GanttScrollPane.setVisible(false);
		p.GanttTable.setVisible(false);
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		getSplitPane(RsltDispPanel).setDividerLocation(490);
		getSplitPane(RsltDispPanel).setResizeWeight(1.0);
	}

	// beforeOpenでjfxPanelを生成しListPaneに埋め込む。
	@SuppressWarnings("deprecation")
	@Override
	public boolean beforeOpen() {
		super.beforeOpen();
		initDesignControl();

		return true;
	}

	// 閉じる前にJFXPanelを削除
	public boolean beforeClose() {
		if (mainControl != null) {
			mainControl.releaseFXPanel();
		}
		if (fxPanel != null) {
			GanttPanel.remove(fxPanel);
			fxPanel = null;
		}

		return true;
	}

	/**
	 * JavaFXパネルを生成
	 */
	public void initDesignControl() {

		if(GanttPanel == null) {
			return;
		}

		fxPanel = new JFXPanel(); // この行をJavafxの機能を使う前に一番最初に実行されるように実装する。

		// 以下はウインドウが閉じたときにXAが終了しない様にするために必須
		Platform.setImplicitExit(false);

		// JFXPanelを生成するためjavafx用のスレッドを生成する。
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					AnchorPane rootPane = new AnchorPane();

					double w = GanttPanel.getWidth();
					double h = GanttPanel.getHeight();

					// ちらつきが起きるため初期サイズを指定する。
					rootPane.setPrefSize(w, h);
					Scene scene = new Scene(rootPane, w, h);

					// sceneをfxPanelに追加
					fxPanel.setScene(scene);

					// fxPanelをLispPanelへ追加
					GanttPanel.add(fxPanel);

					createTaskGantt(rootPane);

				}
				catch (Throwable ex) {
					ex.printStackTrace();
					MCBeansUtil.handle(GanttPanel, ex);
				}

			}
		});
	}

	// ガントインスタンス生成
	protected void createTaskGantt(Pane rootPane) {
		mainControl = new MSBCP_ItmOrdGanttChart_Gantt((MSBCP_ItmOrdGanttChart)this);

		mainControl.setPrefSize(rootPane.getPrefWidth(),rootPane.getPrefHeight());
		mainControl.setDesignCodeTitle(getScreenID(),getScreenName());

		mainControl.isDesignMode(false);

		mainControl.setHasButtonTool(false);
		mainControl.setHasAlignTool(false);
		mainControl.setHasHorizontalLabel(true);
		mainControl.setHasVerticalLabel(true);
		mainControl.setHasTitle(true);
		mainControl.setHasDesignGraph(true);
		mainControl.setDesignGraphSize(2); // 下部グラフ個数
		mainControl.setHasTimeStepCombo(true);
		mainControl.setHasDatePicker(true);

		mainControl.setHasThresholdLine(false); // 内部グラフにしきい値線を表示
		mainControl.setGraphThreshold(0.8); // 下部グラフしきい値
		mainControl.setGraphLoadThreshold(0.8); // 内部グラフしきい値

		// 縦ラベルの横幅
		mainControl.setDefaultLeftLabelWidth(140.0);
		// 縦ラベルのカラム名
		mainControl.setVerticalLabelColumnNameList(new ArrayList<String>());
		mainControl.getVerticalLabelColumnNameList().addAll(getVerticalLabelList());

		// 個数初期化
		mainControl.setHorizontalSize(0); // 自動計算のため0で初期化
		mainControl.setVerticalSize(0); // 自動計算のため0で初期化
		mainControl.setGridStepX(mainControl_gridStepX); // セルの幅
		mainControl.setGridStepY(mainControl_gridStepY); // セルの高さ

		mainControl.setDefaultGridStepX(mainControl_gridStepX); // セルの幅
		mainControl.setDefaultGridStepY(mainControl_gridStepY); // セルの高さ

		mainControl.setUsedGridX(true); // 24時間固定でXは常にグリッドに合わせる
		mainControl.setUsedGridY(true); // ガントの場合はY側は常にグリッドに合わせる。

		// 罫線表示
		mainControl.setShowRuledLine(true);

		// 背景色
		mainControl_backgroundColor = mainControl.getColor("color.mainControl_backgroundColor", 229, 255, 229);
		mainControl.setBackgroundColor(mainControl_backgroundColor);

		// スクロールバー不要
		mainControl.setHasHorizontalScrollBar(false);
		mainControl.setHasVerticalScrollBar(false);

		// 線分を直角にするかどうか
		mainControl.setUseMultiSegments(true);

		// ノード生成時に上下に隙間をつける場合の値
		mainControl.setBorderBottom(2);
		mainControl.setBorderTop(1);
		// ノード生成時に左右に隙間をつける場合の値
		mainControl.setBorderLeft(2);
		mainControl.setBorderRight(2);

		// IconManagerを設定
		mainControl.setIconManager(new MCXAGDesignIconManager());

		// 実績バーの有無
		mainControl.setHasNodeProgressBar(false);

		// 縦ラベルの高さを可変にする。
		mainControl.setUseGridHeights(true);

		// Swingに埋め込む場合に必須
		mainControl.setParentJPanel(getRootPanel());

		// ノードのフォントサイズ
		mainControl.setFontSize(14);

		// 場所間移動許可
		mainControl.setCanMoveVertical(false);

		// help不要
		mainControl.setHasHelpButton(false);

		// 時間刻み変更不可
		mainControl.setHasTimeStepCombo(false);

		// 色パレット不要
		mainControl.setHasColorPane(false);

		// フォントパレット不要
		mainControl.setHasFontPane(false);

		// グラフの凡例
		mainControl.setDesignGraphTitle(new ArrayList<String>());
		mainControl.setDesignGraphLegend(new ArrayList<List<String>>());

		List<String>legend = new ArrayList<String>();
		legend.add(legend1);
		legend.add(legend2);
		// 上段グラフ
		mainControl.getDesignGraphLegend().add(legend);
		mainControl.getDesignGraphTitle().add(graphTitle);
		// 下段グラフ
		mainControl.getDesignGraphLegend().add(legend);
		mainControl.getDesignGraphTitle().add(graphTitle);

		// 画面の端に張り付く
		AnchorPane.setTopAnchor(mainControl,0.0);
		AnchorPane.setBottomAnchor(mainControl,0.0);
		AnchorPane.setLeftAnchor(mainControl,0.0);
		AnchorPane.setRightAnchor(mainControl,0.0);

		// 画面部品生成
		mainControl.addAllChildren();

		// 全データを設定後に以下の文を実行
		rootPane.getChildren().add(mainControl);

	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		initGantt();
	}
	/**
	 * 指定した場所の資源の実際値を集計しなおす
	 *
	 * @param locCd 計算対象の場所ＣＤ
	 */
	protected void calcRsrcLoc(String locCd) {
		if (isNull(locCd)) {
			return;
		}
		MCList<RsltDispR> subRsltL = getRsltL().subList(r -> isSame(r.mfg_loc_cd(), locCd) && !r.isStatusDelete());

		LocR locR = getLocL().getFirst(LocR.$mfg_loc_cd, locCd);
		MCList<RsrcLocR> subRsrcLocL = getRsrcLocL().subList(RsrcLocR.$mfg_loc_cd, locCd);
		// 初期化
		for (RsrcLocR r :subRsrcLocL) {
			r.sum_act_qty(MCNumber.ZERO);
			r.sum_act_qty(r.act_qty());
			r.alert_flg(false);
			r.fix_flg(true);
		}
		MCIndexKey calIdx = getCalL().createIndex(CalR.$cal_cd, CalR.$off_dt);
		MCIndexKey rsrcLocIdx = subRsrcLocL.createIndex(RsrcLocR.$mfg_loc_cd, RsrcLocR.$rsrc_cd, RsrcLocR.$dt);
		for (RsltDispR r :subRsltL) {
			// 1バケットの場合
			if (r.mfg_st_dt().eqDate(r.mfg_end_dt())) {
				RsrcLocR s = subRsrcLocL.getFirst(rsrcLocIdx, locR.mfg_loc_cd(), locR.rsrc_cd1(), r.mfg_end_dt());
				if (s != null) {
					s.sum_act_qty(MCNumber.sum(s.sum_act_qty(), r.rsrc_act_qty1()));
					setAlertFlg(r, s);
				}
				RsrcLocR t = subRsrcLocL.getFirst(rsrcLocIdx, locR.mfg_loc_cd(), locR.rsrc_cd2(), r.mfg_end_dt());
				if (t != null) {
					t.sum_act_qty(MCNumber.sum(t.sum_act_qty(), r.rsrc_act_qty2()));
					setAlertFlg(r, t);
				}

			}
			// 複数バケットにまたがる場合
			else {
				// 初期化
				MCList<RsrcLocR> divL1 = MCList.create(RsrcLocR.class);
				divL1.addNumberColumn("prop");
				divL1.addNumberColumn("tmp_act_qty");
				MCList<RsrcLocR> divL2 = MCList.create(RsrcLocR.class);
				divL2.addNumberColumn("prop");
				divL2.addNumberColumn("tmp_act_qty");
				MCDate dt = r.mfg_st_dt();
				while (dt.lte(r.mfg_end_dt())) {
					// 非稼働日でない場合
					if (isNull(getCalL().getFirst(calIdx, locR.cal_cd(), dt))) {
						RsrcLocR s = subRsrcLocL.getFirst(rsrcLocIdx, locR.mfg_loc_cd(), locR.rsrc_cd1(), dt);
						if (s != null) {
							s.setNumberNE("prop", MCNumber.ONE);
							divL1.add(s);
						}
						RsrcLocR t = subRsrcLocL.getFirst(rsrcLocIdx, locR.mfg_loc_cd(), locR.rsrc_cd2(), dt);
						if (t != null) {
							t.setNumberNE("prop", MCNumber.ONE);
							divL2.add(t);
						}
					}
					dt = dt.addDay(1);
				}

				// 稼働日がない場合は最終日につむ
				if (isNull(divL1)) {
					RsrcLocR s = subRsrcLocL.getFirst(rsrcLocIdx, locR.mfg_loc_cd(), locR.rsrc_cd1(), r.mfg_end_dt());
					if(!isNull(s)) {
						s.sum_act_qty(MCNumber.sum(s.sum_act_qty(), r.rsrc_act_qty1()));
						setAlertFlg(r, s);
					}
					RsrcLocR t = subRsrcLocL.getFirst(rsrcLocIdx, locR.mfg_loc_cd(), locR.rsrc_cd2(), r.mfg_end_dt());
					if(!isNull(t)) {
						t.sum_act_qty(MCNumber.sum(t.sum_act_qty(), r.rsrc_act_qty2()));
						setAlertFlg(r, t);
					}

				}
				// 稼働日がある場合は稼働日の日数で按分
				else {
					if (!isNull(locR.rsrc_cd1())) {
						divL1.sort(RsrcLocR.$dt);
						mcframe.commonFXUC.FXUCC0030.FXUCC_Divide.propNE(divL1, r.rsrc_act_qty1(), locR.rsrc_dec_place1().intValue(), "prop", "tmp_act_qty");
						for (RsrcLocR u :divL1) {
							u.sum_act_qty(MCNumber.sum(u.sum_act_qty(), u.getNumberNE("tmp_act_qty")));

							setAlertFlg(r, u);
						}
					}
					if (!isNull(locR.rsrc_cd2())) {
						divL2.sort(RsrcLocR.$dt);
						mcframe.commonFXUC.FXUCC0030.FXUCC_Divide.propNE(divL2, r.rsrc_act_qty2(), locR.rsrc_dec_place2().intValue(), "prop", "tmp_act_qty");
						for (RsrcLocR u :divL2) {
							u.sum_act_qty(MCNumber.sum(u.sum_act_qty(), u.getNumberNE("tmp_act_qty")));

							setAlertFlg(r, u);
						}
					}
				}
			}
		}
		// 検索範囲外の値はクリア
		for (RsrcLocR r :subRsrcLocL) {
			if (_srchCndR.dt_fr().gtDate(r.dt()) || _srchCndR.dt_to().ltDate(r.dt())) {
				r.sum_act_qty(0);
				r.base_qty(0);
			}
		}
		mainControl.setVerticalLabelColor(subRsrcLocL);
	}

	// gantt_ltを計算
	protected void setGanttLt() {
		MCIndexKey locIdx = getLocL().createIndex(LocR.$mfg_loc_cd);
		MCIndexKey calIdx = getCalL().createIndex(CalR.$cal_cd, CalR.$off_dt);
		MCList<RsltDispR>[] grpL = getRsltL().groupList(RsltDispR.$mfg_loc_cd);
		for (MCList<RsltDispR> subList :grpL) {
			LocR locR = getLocL().getFirst(locIdx, subList.get(0).mfg_loc_cd());
			for (RsltDispR r :subList) {
				int lt = 0;
				MCDate cnt_dt = r.mfg_st_dt();
				MCDate end_dt = r.mfg_end_dt();
				while (cnt_dt.ltDate(end_dt)) {
					// 休日でなければltを加算
					if (getCalL().getFirst(calIdx, locR.cal_cd(), cnt_dt) == null) {
						lt++;
					}
					cnt_dt = cnt_dt.addDay(1);
				}
				r.gantt_lt(lt);
			}
		}
	}

	// RsltDispRのgantt_ltを計算
	protected void setGanttLt(RsltDispR r) {
		MCIndexKey locIdx = getLocL().createIndex(LocR.$mfg_loc_cd);
		MCIndexKey calIdx = getCalL().createIndex(CalR.$cal_cd, CalR.$off_dt);
		MCList<RsltDispR>[] grpL = getRsltL().groupList(RsltDispR.$mfg_loc_cd);
		for (MCList<RsltDispR> subList :grpL) {
			for (RsltDispR r1 :subList) {
				if(r == r1) {
					LocR locR = getLocL().getFirst(locIdx, subList.get(0).mfg_loc_cd());
					int lt = 0;
					MCDate cnt_dt = r.mfg_st_dt();
					MCDate end_dt = r.mfg_end_dt();
					while (cnt_dt.ltDate(end_dt)) {
						// 休日でなければltを加算
						if (getCalL().getFirst(calIdx, locR.cal_cd(), cnt_dt) == null) {
							lt++;
						}
						cnt_dt = cnt_dt.addDay(1);
					}
					r.gantt_lt(lt);
					break;
				}
			}
		}
	}

	protected void setAlertFlg(RsltDispR ordR, RsrcLocR rsrcLocR) {
		if (_srchCndR.dt_fr().gtDate(rsrcLocR.dt()) || _srchCndR.dt_to().ltDate(rsrcLocR.dt())) {
			return;
		}
		if (rsrcLocR.sum_act_qty().gt(rsrcLocR.base_qty())) {
			rsrcLocR.alert_flg(true);
		}
		// 確定未満のオーダを含む場合はfix_flgをfalseにする
		if (MSC_ITM_ORD_LD_STS_TYP.is_sim(ordR.itm_ord_ld_sts_typ())
				|| MSC_ITM_ORD_LD_STS_TYP.isOPN(ordR.itm_ord_ld_sts_typ())
				|| MSC_ITM_ORD_LD_STS_TYP.isSAV(ordR.itm_ord_ld_sts_typ())
				) {
			rsrcLocR.fix_flg(false);
		}
	}

	// ノードがグリッドのx,yに移動できるかどうか
	// 移動できる場合はtrue
	public boolean canMoveNodeForApp(MCXAGDesignNode node, int x, int y) {
		return canMoveNode(node);
	}

	// ノードが移動できるかどうか
	public boolean canMoveNode(MCXAGDesignNode node) {

		RsltDispR r = ((MSBCP_ItmOrdGanttChart_Node)node).getRsltDispR();
		if(r == null) {
			return false;
		}

		return canMove(r, node);
	}
	//ガントのオーダ初期化
	protected void initGantt() {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					mainControl.doClear();
				}
				catch (Throwable ex) {
					// (FCBAC0440) イベントディスパッチスレッドではありません。を回避させる。
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							MCBeansUtil.handle(GanttPanel, ex);
						}
					});
				}
			}
		});
	}

}