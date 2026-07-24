package mcframe.clientMSBG.MSBGP0070;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMSUB.MSUBP0010.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
 * 画面"MSBGP_RcvSchdSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBGP_RcvSchdSrch_MC extends MSBGP_RcvSchdSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvSchdSrch_MC() {
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
	public MSBGP_RcvSchdSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBGL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0070_Srch01Caller<P extends MSBGP_RcvSchdSrch, B extends MS_MSBGL0070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBGL0070_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setDLMode();
		}

		@Override
		protected void setMode() {
			super.setMode();

			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setSRCHStatus();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		/**
		 * 検索条件項目のクライアントチェック処理（チェックボックス、日付項目）
		 * 
		 * @param msgList メッセージ
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_schd_act_rcv_dt_fr, Cnd_schd_act_rcv_dt_to));
			msgList.addAll(checkAtLeastOne(RcvSchdAdjstPanel));
		}
	}

	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBGL0070_Srch01().execDL();
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBGL0070_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBGP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0080(MCEventInfo info) {

		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0080");	
		aso.putCnd(crtOpenMSBGP0080CndR(aso, r));	
		aso.putSearchAction();	
		aso.show();	
	}

	/**
	 * 遷移先[MSBGP0080]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0080.CndR crtOpenMSBGP0080CndR(MAUCP_AppScreenOpener aso, RsltR r) {

		mcframe.clientMSBG.MSBGP0080.CndR to = mcframe.clientMSBG.MSBGP0080.CndR.create();

		to.bill_no(r.bill_no());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBGP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0140(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();

		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MCRow bind = MCRow.create();
		bind.addStringColumn("rcst_cd", r.rcst_cd());
		bind.addStringColumn("bcst_cd", r.bcst_cd());
		bind.addStringColumn("bill_dpt_cd", r.bill_dpt_cd());
		bind.addStringColumn("trd_cur_cd", r.trd_cur_cd());
		bind.addNumberColumn("rcv_amt", r.rcv_schd_amt());
		bind.addStringColumn("rcv_mtd_cd", r.rcv_mtd_cd());
		bind.addDateColumn("rcv_schd_dt", r.schd_act_rcv_dt());

		openPanel("MS", "MSBGP0140", T1, bind);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBGP0210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0210(MCEventInfo info) {

		RsltR r = RsltTable.getSelectedMCRow();

		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MCRow bind = MCRow.create();
		bind.addDateColumn("rcv_dt", r.schd_act_rcv_dt());
		bind.addStringColumn("rcst_cd", r.rcst_cd());
		bind.addStringColumn("bcst_cd", r.bcst_cd());
		bind.addStringColumn("bill_dpt_cd", r.bill_dpt_cd());
		bind.addStringColumn("trd_cur_cd", r.trd_cur_cd());
		bind.addNumberColumn("rcv_amt", r.rcv_schd_amt());
		bind.addStringColumn("ar_sttl_cd1", r.rcv_mtd_cd());
		bind.addStringColumn("ar_sttl_typ1", r.rcv_typ());

		openPanel("MS", "MSBGP0210", T2, bind);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBGP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBGP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBGP0120");	
		aso.putCnd(crtOpenMSBGP0120CndR(aso, r));
		aso.putSearchAction();
		aso.show();	
	}

	/**
	 * 遷移先[MSBGP0120]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBG.MSBGP0120.CndR crtOpenMSBGP0120CndR(MAUCP_AppScreenOpener aso, RsltR r) {

		mcframe.clientMSBG.MSBGP0120.CndR to = mcframe.clientMSBG.MSBGP0120.CndR.create();

		to.bill_no(r.bill_no());
		to.iv_no(r.iv_no());
		to.wrk_no(r.wrk_no());

		return to;
	}

	// --------------------画面起動時イベント START--------------------
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_bcst_grp_p_PPanel.setRelateBeans(Cnd_bcst_grp_p_PPanel);
		Rslt_rcv_schd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_rcv_act_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
		Rslt_not_appl_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_amt_dec_place);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_rfrnc_dt, getToday());
		setValueEx(Cnd_dtl_flg, true);
		setValueEx(Cnd_not_adjst_flg, true);
		setValueEx(Cnd_adjst_flg, true);
	}

	@Override
	protected void tableInit() {

		super.tableInit();
		RsltTable.setSortable(false);
		RsltTable.setStatusColumnVisible(false);
	}

	// --------------------画面起動時イベント END----------------------
	// --------------------セルコンフィグSTART--------------------------	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	/**
	 * セル設定クラス
	 */
	public class RsltCellConfig extends MAUDP_CellConfig {

		protected Color _HDR = getPgmSettingColor(
				MSBGP_RcvSchdSrch.class, "color.cell.hdr.bg");
		protected Color _BDY = getPgmSettingColor(
				MSBGP_RcvSchdSrch.class, "color.cell.bdy.bg");
		protected Color _EMP = getPgmSettingColor(
				MSBGP_RcvSchdSrch.class, "color.cell.emp.bg");

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {

			RsltR r = getRsltL().get(index);

			if (isNull(r.schd_act_rcv_dt()) && !isNull(r.not_appl_bal())) {
				return _HDR;
			}
			else  if (!isNull(r.bill_mng_no())) {
				return _BDY;
			}
			else if(isNull(r.bill_mng_no())){
				return _EMP;
			}

			return super.getPriorBG(index, column, table, mode);
		}

		@Override
		public Color getPriorFG(int index, MCColumnConfig column, MCTable table, MCMode mode) {

			RsltR r = getRsltL().get(index);

			if (!getCndR().key_flg()) {
				if (!isNull(r.bill_mng_no())) {
					if (column == columnRslt_bill_dpt_cd ||
							column == columnRslt_bill_dpt_nm ||
							column == columnRslt_wg_cd ||
							column == columnRslt_wg_nm ||
							column == columnRslt_bcst_cd ||
							column == columnRslt_bcst_nm ||
							column == columnRslt_bill_ym ||
							column == columnRslt_bill_cl_day ||
							column == columnRslt_bill_dt ||
							column == columnRslt_trd_cur_cd ||
							column == columnRslt_trd_cur_nm ||
							column == columnRslt_bill_no ||
							column == columnRslt_iv_no ||
							column == columnRslt_wrk_no ||
							column == columnRslt_wrk_nm ||
							column == columnRslt_rcst_cd ||
							column == columnRslt_rcst_nm

							) {
						return _BDY;
					}
				}
			}

			return super.getPriorFG(index, column, table, mode);
		}

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if(!getCndR().key_flg() && !isNull(r.bill_mng_no())){
				if (getInvisibleColumnConfigs().contains(column.getBaseRowColumnName())) {
					return true;
				}
			}
			return null;
		}

		protected ArrayList<String> _invisibleColumnConfigs = new ArrayList<String>();
		protected ArrayList<String> getInvisibleColumnConfigs() {
			if (_invisibleColumnConfigs.isEmpty()) {
				_invisibleColumnConfigs.add(columnRslt_bill_dpt_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bill_dpt_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_wg_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_wg_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bcst_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bcst_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bill_ym.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bill_cl_day.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bill_dt.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_trd_cur_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_trd_cur_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bill_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_bill_dt.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_iv_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_wrk_no.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_wrk_nm.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_rcst_cd.getBaseRowColumnName());
				_invisibleColumnConfigs.add(columnRslt_rcst_nm.getBaseRowColumnName());
			}
			return _invisibleColumnConfigs;
		}
	}

	// --------------------セルコンフィグEND----------------------------	
	// --------------------画面ステータス処理START------------------------
	@Override
	public void setREFStatus() {
		super.setREFStatus();

		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	// --------------------画面ステータス処理END--------------------------
	// --------------------ボタン制御START------------------------
	@Override
	public void doRslt_NC(MCEventInfo info){
		super.doRslt_NC(info);
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isNull(r)) {
			if (!isNull(r.not_appl_bal())) {	
				if (!isNull(r.schd_act_rcv_dt()) && !isNull(r.rcv_schd_amt()) && r.rcv_schd_amt().isPositive()) {
	
					if(MAC_AR_STTL_TYP.isWTAX(r.rcv_typ()) || MAC_AR_STTL_TYP.isSETOFF_DR(r.rcv_typ())){
						Btn_open_MSBGP0140.setMode(MCMode.DISABLE);
					}
					else{
						if (MAC_RCV_REG_TYP.isREQ(r.rcv_reg_typ()) || MAC_RCV_REG_TYP.isARB(r.rcv_reg_typ())) {
							Btn_open_MSBGP0140.setMode(MCMode.ENABLE);
						}
						else {
							Btn_open_MSBGP0140.setMode(MCMode.DISABLE);
						}
					}
					if (isNull(r.rcv_reg_typ()) || MAC_RCV_REG_TYP.isNON(r.rcv_reg_typ()) || MAC_RCV_REG_TYP.isARB(r.rcv_reg_typ())) {
						Btn_open_MSBGP0210.setMode(MCMode.ENABLE);
					}
					else {
						Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
					}
				}
				else {
					Btn_open_MSBGP0140.setMode(MCMode.DISABLE);
					Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
				}
	
				if(!isNullOrNullVal(r.bill_no())){
					Btn_open_MSBGP0080.setMode(MCMode.ENABLE);
				}
				else
				{
					Btn_open_MSBGP0080.setMode(MCMode.DISABLE);
				}
				
				Btn_open_MSBGP0120.setMode(MCMode.ENABLE);
			}
			else {
				Btn_open_MSBGP0140.setMode(MCMode.DISABLE);
				Btn_open_MSBGP0210.setMode(MCMode.DISABLE);
				Btn_open_MSBGP0080.setMode(MCMode.DISABLE);
				Btn_open_MSBGP0120.setMode(MCMode.DISABLE);
			}
		}
	}
	// --------------------ボタン制御END--------------------------

}