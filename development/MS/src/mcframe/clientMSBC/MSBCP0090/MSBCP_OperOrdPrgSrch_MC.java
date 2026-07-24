package mcframe.clientMSBC.MSBCP0090;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0020.*;
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

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_OperOrdPrgSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_OperOrdPrgSrch_MC extends MSBCP_OperOrdPrgSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_OperOrdPrgSrch_MC() {
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
	public MSBCP_OperOrdPrgSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0090_Srch01Caller<P extends MSBCP_OperOrdPrgSrch, B extends MS_MSBCL0090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0090_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setDLMode();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(OperOrdStsPanel));
			msgList.addAll(checkAtLeastOne(OrdRcvPanel));
			msgList.addAll(checkAtLeastOne(OrdSndPanel));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_st_schd_dt_fr, Cnd_mfg_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_end_schd_dt_fr, Cnd_mfg_end_schd_dt_to));
		}

		@Override
		protected void clear() {
			super.clear();
			panel.clearHiddenList();
		}

		@Override
		protected void setMode() {
			super.setMode();
			showItmOrd();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			panel.setHiddenList(bridge.down0());
		}

	}

	// ボタン押下の処理（ここから）
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0090_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0090_Srch01().execDL();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0080(MCEventInfo info) {
		//品目オーダ進捗一覧照会画面
		openMsbcp0080();
	}
	
	//DCと画面遷移ボタンで共有
	protected void openMsbcp0080() {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0080ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	
	/** 遷移先(品目オーダ進捗一覧照会画面)の設定 */
	protected MAUCP_AppScreenOpener getMsbcp0080ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0080");
		mcframe.clientMSBC.MSBCP0080.CndR cnd = mcframe.clientMSBC.MSBCP0080.CndR.create();
		
		cnd.itm_ord_no(r.itm_ord_no());
		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();
		
		return so;
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			openMsbcp0080();
		}
	}

	// ボタン押下の処理（ここまで）

	// 画面起動処理（ここから）
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_opn_flg, true);
		setValueEx(Cnd_sav_flg, true);
		setValueEx(Cnd_fix_flg, true);
		setValueEx(Cnd_part_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_cmpl_flg, true);
		setValueEx(Cnd_no_problem_flg, true);
		setValueEx(Cnd_oper_qty_red_flg, true);
		setValueEx(Cnd_st_dt_red_flg, true);
		setValueEx(Cnd_end_dt_red_flg, true);
		setValueEx(Cnd_ord_rcv_tgt_flg, true);
		setValueEx(Cnd_not_ord_rcv_tgt_flg, true);
		setValueEx(Cnd_ord_snd_tgt_flg, true);
		setValueEx(Cnd_not_ord_snd_tgt_flg, true);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_oper_schd_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_dec_place);
		Rslt_oper_int_schd_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_dec_place);
		Rslt_oper_act_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd, columnRslt_dec_place);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	// 画面起動処理（ここまで）

	// 画面ステータス及びフォーカス（ここから）
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		OperOrdStsPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	// 画面ステータス及びフォーカス（ここまで）

	// イベント処理（ここから）	
	@Override
	public void doCnd_no_problem_flg_NC(MCEventInfo info) {
		super.doCnd_no_problem_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_st_dt_red_flg_NC(MCEventInfo info) {
		super.doCnd_st_dt_red_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_end_dt_red_flg_NC(MCEventInfo info) {
		super.doCnd_end_dt_red_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_oper_qty_red_flg_NC(MCEventInfo info) {
		super.doCnd_oper_qty_red_flg_NC(info);
		showItmOrd();
	}

	// イベント処理（ここまで）

	// 裏リスト関連（ここから）	
	/**
	 * 工程オーダ一覧の検索結果を保持
	 */
	protected MCList<RsltR> _operOrdList;

	protected void clearHiddenList() {
		_operOrdList = null;
	}

	protected void setHiddenList(MCList<RsltR> itm) {
		_operOrdList = itm;
	}

	protected void showItmOrd() {
		MCList<RsltR> list = MCList.create(RsltR.class);
		List<String> tarCol = getDispTarCol();

		RsltTable.clear();

		if (_operOrdList == null) {
			return;
		}
		for (RsltR r : _operOrdList) {
			boolean isDisp = false;
			for (String col : tarCol) {
				if (r.getBoolean(col)) {
					isDisp = true;
					break;
				}
			}
			if (isDisp) {
				list.add(r);
			}
		}
		getRsltL().setAll(list);
		sort(RsltTable);
	}

	protected List<String> getDispTarCol() {
		List<String> tarCol = new ArrayList<String>();
		if (getCndR().no_problem_flg()) {
			tarCol.add(RsltR.$no_problem_flg);
		}
		if (getCndR().oper_qty_red_flg()) {
			tarCol.add(RsltR.$oper_qty_red_flg);
		}
		if (getCndR().st_dt_red_flg()) {
			tarCol.add(RsltR.$st_dt_red_flg);
		}
		if (getCndR().end_dt_red_flg()) {
			tarCol.add(RsltR.$end_dt_red_flg);
		}
		return tarCol;
	}
		// ツールバーより画面クリアを行ったときに、裏リストもクリアする。
		@Override
		public void screenClearBody() {
			super.screenClearBody();
			clearHiddenList();
		}
	// 裏リスト関連（ここまで）

	// セルコンフィグ（ここから）
	/** 異常の色 */
	protected Color _RED_BG_COLOR = getPgmSettingColor(
			MSBCP_OperOrdPrgSrch.class, "color.red");

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			RsltR row = getRsltL().get(index);
			if (columnRslt_st_schd_dt == column || columnRslt_st_schd_hm == column) {
				if (row.st_dt_red_flg()) {
					return _RED_BG_COLOR;
				}
			}
			else if (columnRslt_end_schd_dt == column || columnRslt_end_schd_hm == column) {
				if (row.end_dt_red_flg()) {
					return _RED_BG_COLOR;
				}
			}
			else if (columnRslt_oper_act_qty == column) {
				if (row.oper_qty_red_flg()) {
					return _RED_BG_COLOR;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}
	// セルコンフィグ（ここまで）

}