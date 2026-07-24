package mcframe.clientMGBG.MGBGP0050;

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
import mcframe.clientMAUB.MAUBP0240.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5160.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBGP_AlcAmtPaSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBGP_AlcAmtPaSrch_MC extends MGBGP_AlcAmtPaSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_AlcAmtPaSrch_MC() {
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
	public MGBGP_AlcAmtPaSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBGL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0050_Srch01Caller<P extends MGBGP_AlcAmtPaSrch, B extends MG_MGBGL0050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBGL0050_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			if (Cnd_pre_alc_typ_BEFORE.isSelected()) {
				getCndR().not_my_wg_flg(true);
				getCndR().not_pre_alc_fin_flg(false);	
			}
			else {
				getCndR().not_my_wg_flg(false);
				getCndR().not_pre_alc_fin_flg(true);				
			}
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkSmallLarge(Cnd_y_fr, Cnd_y_to));
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
		
		@Override
		protected void show() {
			showRslt(bridge.down0());
			super.show();
		}

		protected void showRslt(MCList<RsltR> list) {
			if (getCndR().sum_row()) {
				// 合計行を追加
				displaySumRow(list, getCndR().sum_row());
			}
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBGL0050_Srch01();
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if(getCndR().sum_row()) {
			return sortWithoutBottom(table, policy);
		}
		return super.sort(table, policy);
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_pln_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		Rslt_act_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		Rslt_diff_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_cur_cd, getBaseCur().cur_cd());
		setValueEx(Cnd_amt_dec_place, getBaseCur().amt_dec_place());

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_term_fr, term.term());
			setValueEx(Cnd_term_to, term.term());
		}

		setValueEx(Cnd_calc_ctg_flg, true);
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_term_flg, true);
		setValueEx(Cnd_y_flg, true);
		setValueEx(Cnd_m_flg, true);
		setValueEx(Cnd_alc_ac_flg, true);
		setValueEx(Cnd_dpt_flg, true);

		displayColumn();
	}
	
	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		displayColumn();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		displayColumn();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
//		displayColumn();
		setFocus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
//		displayColumn();
		setFocus();
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public boolean doCnd_y_fr_VC(MCEventInfo info) {
		if (!super.doCnd_y_fr_VC(info)) {
			return false;
		}
		return checkYear((MCNumber)info.getNewValue());
	}
	@Override
	public boolean doCnd_y_to_VC(MCEventInfo info) {
		if (!super.doCnd_y_to_VC(info)) {
			return false;
		}
		return checkYear((MCNumber)info.getNewValue());
	}

	/**
	 * 年を表す数値として妥当かどうかを判断する。
	 * nullの場合はtrueを返す。
	 *
	 * @param year
	 * @return
	 */
	protected boolean checkYear(MCNumber year) {
		if (year == null) {
			return true;
		}
		if (year.lt(1900)) {
			return false;
		}
		if (year.gt(3000)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean doCnd_m_fr_VC(MCEventInfo info) {
		if (!super.doCnd_m_fr_VC(info)) {
			return false;
		}
		return checkMonth((MCNumber)info.getNewValue());
	}
	@Override
	public boolean doCnd_m_to_VC(MCEventInfo info) {
		if (!super.doCnd_m_to_VC(info)) {
			return false;
		}
		return checkMonth((MCNumber)info.getNewValue());
	}

	/**
	 * 月を表す数値として妥当かどうかを判断する。
	 * nullの場合はtrueを返す。
	 *
	 * @param mon
	 * @return
	 */
	protected boolean checkMonth(MCNumber mon) {
		if (mon == null) {
			return true;
		}
		if (mon.lt(1)) {
			return false;
		}
		if (mon.gt(12)) {
			return false;
		}
		return true;
	}

	@Override
	public void doCnd_pre_alc_typ_NC(MCEventInfo info) {
		super.doCnd_pre_alc_typ_NC(info);
		// 操作種別変更時の処理
		clearContainers(getRsltL());
		setSrchStatus();
	}

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);

		if (!getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}
	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);

		if (getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
		}
	}

	// 合計行の表示・非表示
	@Override
	public void doCnd_sum_row_NC(MCEventInfo info) {
		super.doCnd_sum_row_NC(info);
		displaySumRow(getRsltL(), getCndR().sum_row());
	}

	protected void displaySumRow(MCList<RsltR> list, boolean boo) {
		if (list.size() > 0) {
			if (boo) {
				MCGroupByPolicy policy = new MCGroupByPolicy();
				policy.sum(getSumColNames());
				RsltR sumRow = list.groupBy(policy).get(0);
				for (String nm : getSumColNames()) {
					if(isNull(sumRow.getValueNE(nm))) {
						sumRow.setValue(nm, MCNumber.ZERO);
					}
				}
				list.add(sumRow);
			}
			else {
				list.remove(list.size() - 1);
			}
		}
	}

	protected String[] getSumColNames() {
		RsltR row = RsltR.create();
		return row.getKeys(RsltR.$$SUM_COL).toArray(new String[0]);
	}

	// -----------------------------------------------
	// CellConfig
	protected Color _vTtlColor = getVTtlColor(this);

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (getCndR().sum_row()) {
				if (isSame(index + 1, getRsltL().size())) {
					return _vTtlColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

}